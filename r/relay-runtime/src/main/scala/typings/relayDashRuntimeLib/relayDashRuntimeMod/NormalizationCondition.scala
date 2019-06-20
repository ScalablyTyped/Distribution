package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationCondition extends NormalizationSelection {
  val condition: java.lang.String
  val kind: java.lang.String
   // 'Condition';
  val passingValue: scala.Boolean
  val selections: js.Array[NormalizationSelection]
}

object NormalizationCondition {
  @scala.inline
  def apply(
    condition: java.lang.String,
    kind: java.lang.String,
    passingValue: scala.Boolean,
    selections: js.Array[NormalizationSelection]
  ): NormalizationCondition = {
    val __obj = js.Dynamic.literal(condition = condition, kind = kind, passingValue = passingValue, selections = selections)
  
    __obj.asInstanceOf[NormalizationCondition]
  }
}

