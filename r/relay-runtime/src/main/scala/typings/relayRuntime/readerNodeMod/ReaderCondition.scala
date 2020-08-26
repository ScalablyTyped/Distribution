package typings.relayRuntime.readerNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReaderCondition extends ReaderSelection {
  val condition: String = js.native
  val kind: String = js.native
   // 'Condition';
  val passingValue: Boolean = js.native
  val selections: js.Array[ReaderSelection] = js.native
}

object ReaderCondition {
  @scala.inline
  def apply(condition: String, kind: String, passingValue: Boolean, selections: js.Array[ReaderSelection]): ReaderCondition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], passingValue = passingValue.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderCondition]
  }
  @scala.inline
  implicit class ReaderConditionOps[Self <: ReaderCondition] (val x: Self) extends AnyVal {
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
    def setCondition(value: String): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassingValue(value: Boolean): Self = this.set("passingValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionsVarargs(value: ReaderSelection*): Self = this.set("selections", js.Array(value :_*))
    @scala.inline
    def setSelections(value: js.Array[ReaderSelection]): Self = this.set("selections", value.asInstanceOf[js.Any])
  }
  
}

