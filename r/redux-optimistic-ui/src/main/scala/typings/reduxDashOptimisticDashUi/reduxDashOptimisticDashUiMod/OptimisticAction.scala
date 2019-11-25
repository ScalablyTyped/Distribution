package typings.reduxDashOptimisticDashUi.reduxDashOptimisticDashUiMod

import typings.reduxDashOptimisticDashUi.Anon_Optimistic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimisticAction extends js.Object {
  var meta: Anon_Optimistic
}

object OptimisticAction {
  @scala.inline
  def apply(meta: Anon_Optimistic): OptimisticAction = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OptimisticAction]
  }
}

