package typings.rest.interceptorJsonpMod

import typings.rest.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var callback: js.UndefOr[Anon_Name] = js.undefined
}

object Config {
  @scala.inline
  def apply(callback: Anon_Name = null): Config = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

