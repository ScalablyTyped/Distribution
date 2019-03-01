package typings
package reactDashAddonsDashPerfLib.reactDashAddonsDashPerfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentPerfContext extends js.Object {
  var current: java.lang.String
  var owner: java.lang.String
}

object ComponentPerfContext {
  @scala.inline
  def apply(current: java.lang.String, owner: java.lang.String): ComponentPerfContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("current")(current)
    __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ComponentPerfContext]
  }
}

