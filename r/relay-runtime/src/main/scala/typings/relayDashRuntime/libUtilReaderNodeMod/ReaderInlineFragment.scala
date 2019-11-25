package typings.relayDashRuntime.libUtilReaderNodeMod

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
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderInlineFragment]
  }
}

