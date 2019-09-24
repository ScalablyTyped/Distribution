package typings.relayDashRuntime.libUtilNormalizationNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayDashRuntime.relayDashRuntimeStrings.Defer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationDefer extends NormalizationSelectableNode {
  val `if`: String | Null
  val kind: Defer
  val label: String
  val metadata: js.UndefOr[StringDictionary[js.Any] | Null] = js.undefined
  val selections: js.Array[NormalizationSelection]
}

object NormalizationDefer {
  @scala.inline
  def apply(
    kind: Defer,
    label: String,
    selections: js.Array[NormalizationSelection],
    `if`: String = null,
    metadata: StringDictionary[js.Any] = null
  ): NormalizationDefer = {
    val __obj = js.Dynamic.literal(kind = kind, label = label, selections = selections)
    if (`if` != null) __obj.updateDynamic("if")(`if`)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[NormalizationDefer]
  }
}

