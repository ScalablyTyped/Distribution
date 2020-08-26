package typings.relayRuntime.readerNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReaderListValue extends ReaderArgument {
  val items: js.Array[ReaderArgument | Null] = js.native
  val kind: String = js.native
   // 'ListValue';
  val name: String = js.native
}

object ReaderListValue {
  @scala.inline
  def apply(items: js.Array[ReaderArgument | Null], kind: String, name: String): ReaderListValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderListValue]
  }
  @scala.inline
  implicit class ReaderListValueOps[Self <: ReaderListValue] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: (ReaderArgument | Null)*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[ReaderArgument | Null]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

