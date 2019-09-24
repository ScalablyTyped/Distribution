package typings.relayDashRuntime.libUtilNormalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationCondition extends NormalizationSelection {
  val condition: String
  val kind: String
   // 'Condition';
  val passingValue: Boolean
  val selections: js.Array[NormalizationSelection]
}

object NormalizationCondition {
  @scala.inline
  def apply(
    condition: String,
    kind: String,
    passingValue: Boolean,
    selections: js.Array[NormalizationSelection]
  ): NormalizationCondition = {
    val __obj = js.Dynamic.literal(condition = condition, kind = kind, passingValue = passingValue, selections = selections)
  
    __obj.asInstanceOf[NormalizationCondition]
  }
}

