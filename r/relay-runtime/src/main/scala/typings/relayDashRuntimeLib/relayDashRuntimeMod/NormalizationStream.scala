package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationStream extends NormalizationSelectableNode {
  val `if`: java.lang.String | scala.Null
  val kind: java.lang.String
   // 'Stream';
  val label: java.lang.String
  val metadata: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Null] = js.undefined
  val selections: js.Array[NormalizationSelection]
}

object NormalizationStream {
  @scala.inline
  def apply(
    kind: java.lang.String,
    label: java.lang.String,
    selections: js.Array[NormalizationSelection],
    `if`: java.lang.String = null,
    metadata: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): NormalizationStream = {
    val __obj = js.Dynamic.literal(kind = kind, label = label, selections = selections)
    if (`if` != null) __obj.updateDynamic("if")(`if`)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[NormalizationStream]
  }
}

