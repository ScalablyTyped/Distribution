package typings.relayRuntime.normalizationNodeMod

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
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], passingValue = passingValue.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationCondition]
  }
}

