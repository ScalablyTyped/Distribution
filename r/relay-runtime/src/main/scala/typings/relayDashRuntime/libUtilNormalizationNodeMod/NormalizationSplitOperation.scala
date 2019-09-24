package typings.relayDashRuntime.libUtilNormalizationNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayDashRuntime.libUtilRelayConcreteNodeMod.GeneratedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationSplitOperation
  extends GeneratedNode
     with NormalizationSelectableNode {
  val kind: String
  val metadata: js.UndefOr[StringDictionary[js.Any] | Null] = js.undefined
   // 'SplitOperation';
  val name: String
  val selections: js.Array[NormalizationSelection]
}

object NormalizationSplitOperation {
  @scala.inline
  def apply(
    kind: String,
    name: String,
    selections: js.Array[NormalizationSelection],
    metadata: StringDictionary[js.Any] = null
  ): NormalizationSplitOperation = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, selections = selections)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[NormalizationSplitOperation]
  }
}

