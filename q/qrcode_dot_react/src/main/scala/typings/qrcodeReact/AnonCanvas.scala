package typings.qrcodeReact

import typings.qrcodeReact.qrcodeReactStrings.canvas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCanvas extends js.Object {
  var renderAs: js.UndefOr[canvas] = js.undefined
}

object AnonCanvas {
  @scala.inline
  def apply(renderAs: canvas = null): AnonCanvas = {
    val __obj = js.Dynamic.literal()
    if (renderAs != null) __obj.updateDynamic("renderAs")(renderAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCanvas]
  }
}

