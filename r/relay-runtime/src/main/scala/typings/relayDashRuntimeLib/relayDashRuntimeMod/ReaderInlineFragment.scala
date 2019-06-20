package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderInlineFragment extends ReaderSelection {
  val kind: java.lang.String
   // 'InlineFragment';
  val selections: js.Array[ReaderSelection]
  val `type`: java.lang.String
}

object ReaderInlineFragment {
  @scala.inline
  def apply(kind: java.lang.String, selections: js.Array[ReaderSelection], `type`: java.lang.String): ReaderInlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind, selections = selections)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReaderInlineFragment]
  }
}

