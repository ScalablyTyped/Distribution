package typings.qrcodeDotReact

import typings.qrcodeDotReact.qrcodeDotReactStrings.canvas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Canvas extends js.Object {
  var renderAs: js.UndefOr[canvas] = js.undefined
}

object Anon_Canvas {
  @scala.inline
  def apply(renderAs: canvas = null): Anon_Canvas = {
    val __obj = js.Dynamic.literal()
    if (renderAs != null) __obj.updateDynamic("renderAs")(renderAs)
    __obj.asInstanceOf[Anon_Canvas]
  }
}

