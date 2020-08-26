package typings.relayCompiler.iRMod

import typings.relayCompiler.anon.FragmentTypeCondition
import typings.relayCompiler.irvisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Defer
  extends IR
     with Node
     with Selection
     with VisitNode {
  var `if`: ArgumentValue | Null = js.native
  var kind: typings.relayCompiler.relayCompilerStrings.Defer = js.native
  var label: String = js.native
  var loc: Location = js.native
  var metadata: js.UndefOr[FragmentTypeCondition | Null] = js.native
  var selections: js.Array[Selection] = js.native
}

object Defer {
  @scala.inline
  def apply(
    kind: typings.relayCompiler.relayCompilerStrings.Defer,
    label: String,
    loc: Location,
    selections: js.Array[Selection]
  ): Defer = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Defer]
  }
  @scala.inline
  implicit class DeferOps[Self <: Defer] (val x: Self) extends AnyVal {
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
    def setKind(value: typings.relayCompiler.relayCompilerStrings.Defer): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionsVarargs(value: Selection*): Self = this.set("selections", js.Array(value :_*))
    @scala.inline
    def setSelections(value: js.Array[Selection]): Self = this.set("selections", value.asInstanceOf[js.Any])
    @scala.inline
    def setIf(value: ArgumentValue): Self = this.set("if", value.asInstanceOf[js.Any])
    @scala.inline
    def setIfNull: Self = this.set("if", null)
    @scala.inline
    def setMetadata(value: FragmentTypeCondition): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setMetadataNull: Self = this.set("metadata", null)
  }
  
}

