package typings.servicenow.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.servicenow.servicenowStrings.insert
  - typings.servicenow.servicenowStrings.update
  - typings.servicenow.servicenowStrings.delete
*/
trait GlideRecordOperation extends js.Object

object GlideRecordOperation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typings.servicenow.servicenowStrings.delete = this.cast("delete")
  @scala.inline
  def insert: typings.servicenow.servicenowStrings.insert = this.cast("insert")
  @scala.inline
  def update: typings.servicenow.servicenowStrings.update = this.cast("update")
}

