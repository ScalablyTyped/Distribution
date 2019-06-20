package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderCondition extends ReaderSelection {
  val condition: java.lang.String
  val kind: java.lang.String
   // 'Condition';
  val passingValue: scala.Boolean
  val selections: js.Array[ReaderSelection]
}

object ReaderCondition {
  @scala.inline
  def apply(
    condition: java.lang.String,
    kind: java.lang.String,
    passingValue: scala.Boolean,
    selections: js.Array[ReaderSelection]
  ): ReaderCondition = {
    val __obj = js.Dynamic.literal(condition = condition, kind = kind, passingValue = passingValue, selections = selections)
  
    __obj.asInstanceOf[ReaderCondition]
  }
}

