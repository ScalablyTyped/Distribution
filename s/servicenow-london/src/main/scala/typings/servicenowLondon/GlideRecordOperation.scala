package typings.servicenowLondon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.servicenowLondon.servicenowLondonStrings.insert
  - typings.servicenowLondon.servicenowLondonStrings.update
  - typings.servicenowLondon.servicenowLondonStrings.delete
*/
trait GlideRecordOperation extends js.Object

object GlideRecordOperation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typings.servicenowLondon.servicenowLondonStrings.delete = this.cast("delete")
  @scala.inline
  def insert: typings.servicenowLondon.servicenowLondonStrings.insert = this.cast("insert")
  @scala.inline
  def update: typings.servicenowLondon.servicenowLondonStrings.update = this.cast("update")
}

