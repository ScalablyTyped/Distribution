package typings.reduxOptimisticUi.mod

import typings.reduxOptimisticUi.anon.Optimistic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimisticAction extends js.Object {
  var meta: Optimistic
}

object OptimisticAction {
  @scala.inline
  def apply(meta: Optimistic): OptimisticAction = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimisticAction]
  }
}

