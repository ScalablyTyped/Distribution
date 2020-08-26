package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseOperation[T /* <: OperationType */] extends js.Object {
  var source: js.UndefOr[String] = js.native
  var `type`: T = js.native
}

object BaseOperation {
  @scala.inline
  def apply[/* <: typings.stellarBase.mod.OperationType */ T](`type`: T): BaseOperation[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOperation[T]]
  }
  @scala.inline
  implicit class BaseOperationOps[Self <: BaseOperation[_], /* <: typings.stellarBase.mod.OperationType */ T] (val x: Self with BaseOperation[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

