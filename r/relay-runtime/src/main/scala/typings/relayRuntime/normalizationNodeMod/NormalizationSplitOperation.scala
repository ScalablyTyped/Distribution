package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.relayConcreteNodeMod.GeneratedNode
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
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationSplitOperation]
  }
}

