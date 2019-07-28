package typings.reactDashNoDashSsr

import typings.react.reactMod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnSSR extends js.Object {
  var onSSR: js.UndefOr[ReactChild] = js.undefined
}

object Anon_OnSSR {
  @scala.inline
  def apply(onSSR: ReactChild = null): Anon_OnSSR = {
    val __obj = js.Dynamic.literal()
    if (onSSR != null) __obj.updateDynamic("onSSR")(onSSR.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OnSSR]
  }
}

