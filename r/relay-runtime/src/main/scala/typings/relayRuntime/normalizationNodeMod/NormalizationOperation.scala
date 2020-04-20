package typings.relayRuntime.normalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationOperation extends NormalizationSelectableNode {
  val argumentDefinitions: js.Array[NormalizationLocalArgument]
  val kind: String
   // 'Operation';
  val name: String
  val selections: js.Array[NormalizationSelection]
}

object NormalizationOperation {
  @scala.inline
  def apply(
    argumentDefinitions: js.Array[NormalizationLocalArgument],
    kind: String,
    name: String,
    selections: js.Array[NormalizationSelection]
  ): NormalizationOperation = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationOperation]
  }
}

