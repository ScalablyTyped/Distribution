package typings.reactNoSsr

import typings.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnSSR extends js.Object {
  var onSSR: js.UndefOr[ReactChild] = js.undefined
}

object AnonOnSSR {
  @scala.inline
  def apply(onSSR: ReactChild = null): AnonOnSSR = {
    val __obj = js.Dynamic.literal()
    if (onSSR != null) __obj.updateDynamic("onSSR")(onSSR.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnSSR]
  }
}

