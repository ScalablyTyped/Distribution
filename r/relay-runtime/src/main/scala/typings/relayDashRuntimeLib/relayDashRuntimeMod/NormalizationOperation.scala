package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationOperation extends NormalizationSelectableNode {
  val argumentDefinitions: js.Array[NormalizationLocalArgument]
  val kind: java.lang.String
   // 'Operation';
  val name: java.lang.String
  val selections: js.Array[NormalizationSelection]
}

object NormalizationOperation {
  @scala.inline
  def apply(
    argumentDefinitions: js.Array[NormalizationLocalArgument],
    kind: java.lang.String,
    name: java.lang.String,
    selections: js.Array[NormalizationSelection]
  ): NormalizationOperation = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions, kind = kind, name = name, selections = selections)
  
    __obj.asInstanceOf[NormalizationOperation]
  }
}

