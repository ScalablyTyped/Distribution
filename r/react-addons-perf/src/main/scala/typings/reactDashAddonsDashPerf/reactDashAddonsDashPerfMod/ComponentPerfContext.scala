package typings.reactDashAddonsDashPerf.reactDashAddonsDashPerfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentPerfContext extends js.Object {
  var current: String
  var owner: String
}

object ComponentPerfContext {
  @scala.inline
  def apply(current: String, owner: String): ComponentPerfContext = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ComponentPerfContext]
  }
}

