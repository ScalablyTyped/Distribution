package typings.relayRuntime.readerNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReaderInlineFragment extends ReaderSelection {
  val abstractKey: js.UndefOr[String | Null] = js.native
  val kind: String = js.native
   // 'InlineFragment';
  val selections: js.Array[ReaderSelection] = js.native
  val `type`: String = js.native
}

object ReaderInlineFragment {
  @scala.inline
  def apply(kind: String, selections: js.Array[ReaderSelection], `type`: String): ReaderInlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderInlineFragment]
  }
  @scala.inline
  implicit class ReaderInlineFragmentOps[Self <: ReaderInlineFragment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionsVarargs(value: ReaderSelection*): Self = this.set("selections", js.Array(value :_*))
    @scala.inline
    def setSelections(value: js.Array[ReaderSelection]): Self = this.set("selections", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbstractKey(value: String): Self = this.set("abstractKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbstractKey: Self = this.set("abstractKey", js.undefined)
    @scala.inline
    def setAbstractKeyNull: Self = this.set("abstractKey", null)
  }
  
}

