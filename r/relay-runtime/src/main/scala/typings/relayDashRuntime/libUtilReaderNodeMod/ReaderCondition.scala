package typings.relayDashRuntime.libUtilReaderNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderCondition extends ReaderSelection {
  val condition: String
  val kind: String
   // 'Condition';
  val passingValue: Boolean
  val selections: js.Array[ReaderSelection]
}

object ReaderCondition {
  @scala.inline
  def apply(condition: String, kind: String, passingValue: Boolean, selections: js.Array[ReaderSelection]): ReaderCondition = {
    val __obj = js.Dynamic.literal(condition = condition, kind = kind, passingValue = passingValue, selections = selections)
  
    __obj.asInstanceOf[ReaderCondition]
  }
}

