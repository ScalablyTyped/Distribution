package typings.relayRuntime.readerNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderInlineFragment extends ReaderSelection {
  val abstractKey: js.UndefOr[String | Null] = js.undefined
  val kind: String
   // 'InlineFragment';
  val selections: js.Array[ReaderSelection]
  val `type`: String
}

object ReaderInlineFragment {
  @scala.inline
  def apply(
    kind: String,
    selections: js.Array[ReaderSelection],
    `type`: String,
    abstractKey: js.UndefOr[Null | String] = js.undefined
  ): ReaderInlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(abstractKey)) __obj.updateDynamic("abstractKey")(abstractKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderInlineFragment]
  }
}

