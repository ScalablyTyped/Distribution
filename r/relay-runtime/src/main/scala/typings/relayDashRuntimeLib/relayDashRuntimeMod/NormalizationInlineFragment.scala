package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationInlineFragment extends NormalizationSelection {
  val kind: java.lang.String
   // 'InlineFragment';
  val selections: js.Array[NormalizationSelection]
  val `type`: java.lang.String
}

object NormalizationInlineFragment {
  @scala.inline
  def apply(kind: java.lang.String, selections: js.Array[NormalizationSelection], `type`: java.lang.String): NormalizationInlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind, selections = selections)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NormalizationInlineFragment]
  }
}

