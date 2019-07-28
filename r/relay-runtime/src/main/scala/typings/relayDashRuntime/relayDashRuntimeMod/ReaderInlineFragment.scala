package typings.relayDashRuntime.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderInlineFragment extends ReaderSelection {
  val kind: String
   // 'InlineFragment';
  val selections: js.Array[ReaderSelection]
  val `type`: String
}

object ReaderInlineFragment {
  @scala.inline
  def apply(kind: String, selections: js.Array[ReaderSelection], `type`: String): ReaderInlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind, selections = selections)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReaderInlineFragment]
  }
}

