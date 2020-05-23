package typings.reactNoSsr.anon

import typings.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSSR extends js.Object {
  var onSSR: js.UndefOr[ReactChild] = js.undefined
}

object OnSSR {
  @scala.inline
  def apply(onSSR: ReactChild = null): OnSSR = {
    val __obj = js.Dynamic.literal()
    if (onSSR != null) __obj.updateDynamic("onSSR")(onSSR.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSSR]
  }
}

