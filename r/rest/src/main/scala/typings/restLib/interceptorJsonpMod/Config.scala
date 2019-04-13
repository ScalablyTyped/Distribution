package typings
package restLib.interceptorJsonpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var callback: js.UndefOr[restLib.Anon_Name] = js.undefined
}

object Config {
  @scala.inline
  def apply(callback: restLib.Anon_Name = null): Config = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    __obj.asInstanceOf[Config]
  }
}

