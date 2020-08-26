package typings.relayCompiler.iRMod

import typings.relayCompiler.irvisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream
  extends IR
     with Node
     with Selection
     with VisitNode {
  var `if`: ArgumentValue | Null = js.native
  var initialCount: ArgumentValue = js.native
  var kind: typings.relayCompiler.relayCompilerStrings.Stream = js.native
  var label: String = js.native
  var loc: Location = js.native
  var metadata: Metadata = js.native
  var selections: js.Array[Selection] = js.native
  var useCustomizedBatch: ArgumentValue | Null = js.native
}

object Stream {
  @scala.inline
  def apply(
    initialCount: ArgumentValue,
    kind: typings.relayCompiler.relayCompilerStrings.Stream,
    label: String,
    loc: Location,
    selections: js.Array[Selection]
  ): Stream = {
    val __obj = js.Dynamic.literal(initialCount = initialCount.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stream]
  }
  @scala.inline
  implicit class StreamOps[Self <: Stream] (val x: Self) extends AnyVal {
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
    def setInitialCount(value: ArgumentValue): Self = this.set("initialCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: typings.relayCompiler.relayCompilerStrings.Stream): Self = this.set("kind", value.asInstanceOf[js.Any])
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
    def setMetadata(value: Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setUseCustomizedBatch(value: ArgumentValue): Self = this.set("useCustomizedBatch", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseCustomizedBatchNull: Self = this.set("useCustomizedBatch", null)
  }
  
}

