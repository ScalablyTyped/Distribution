package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationSplitOperation
  extends GeneratedNode
     with NormalizationSelectableNode {
  val kind: java.lang.String
  val metadata: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Null] = js.undefined
   // 'SplitOperation';
  val name: java.lang.String
  val selections: js.Array[NormalizationSelection]
}

object NormalizationSplitOperation {
  @scala.inline
  def apply(
    kind: java.lang.String,
    name: java.lang.String,
    selections: js.Array[NormalizationSelection],
    metadata: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): NormalizationSplitOperation = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, selections = selections)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[NormalizationSplitOperation]
  }
}

