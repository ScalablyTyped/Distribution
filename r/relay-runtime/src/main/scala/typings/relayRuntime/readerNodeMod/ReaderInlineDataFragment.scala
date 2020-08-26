package typings.relayRuntime.readerNodeMod

import typings.relayRuntime.relayConcreteNodeMod.GeneratedNode
import typings.relayRuntime.relayRuntimeStrings.InlineDataFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReaderInlineDataFragment extends GeneratedNode {
  val kind: InlineDataFragment = js.native
  val name: String = js.native
}

object ReaderInlineDataFragment {
  @scala.inline
  def apply(kind: InlineDataFragment, name: String): ReaderInlineDataFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderInlineDataFragment]
  }
  @scala.inline
  implicit class ReaderInlineDataFragmentOps[Self <: ReaderInlineDataFragment] (val x: Self) extends AnyVal {
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
    def setKind(value: InlineDataFragment): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

