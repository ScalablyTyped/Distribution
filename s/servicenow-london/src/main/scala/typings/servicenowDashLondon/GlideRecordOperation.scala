package typings.servicenowDashLondon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.servicenowDashLondon.servicenowDashLondonStrings.insert
  - typings.servicenowDashLondon.servicenowDashLondonStrings.update
  - typings.servicenowDashLondon.servicenowDashLondonStrings.delete
*/
trait GlideRecordOperation extends js.Object

object GlideRecordOperation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typings.servicenowDashLondon.servicenowDashLondonStrings.delete = this.cast("delete")
  @scala.inline
  def insert: typings.servicenowDashLondon.servicenowDashLondonStrings.insert = this.cast("insert")
  @scala.inline
  def update: typings.servicenowDashLondon.servicenowDashLondonStrings.update = this.cast("update")
}

