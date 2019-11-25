package typings.relayDashRuntime.libUtilNormalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationInlineFragment extends NormalizationSelection {
  val kind: String
   // 'InlineFragment';
  val selections: js.Array[NormalizationSelection]
  val `type`: String
}

object NormalizationInlineFragment {
  @scala.inline
  def apply(kind: String, selections: js.Array[NormalizationSelection], `type`: String): NormalizationInlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationInlineFragment]
  }
}

