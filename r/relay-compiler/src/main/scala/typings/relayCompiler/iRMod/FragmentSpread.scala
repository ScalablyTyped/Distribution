package typings.relayCompiler.iRMod

import typings.relayCompiler.irvisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FragmentSpread
  extends IR
     with Selection
     with VisitNode {
  var args: js.Array[Argument] = js.native
  var directives: js.Array[Directive] = js.native
  var kind: typings.relayCompiler.relayCompilerStrings.FragmentSpread = js.native
  var loc: Location = js.native
  var metadata: Metadata = js.native
  var name: String = js.native
}

object FragmentSpread {
  @scala.inline
  def apply(
    args: js.Array[Argument],
    directives: js.Array[Directive],
    kind: typings.relayCompiler.relayCompilerStrings.FragmentSpread,
    loc: Location,
    name: String
  ): FragmentSpread = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentSpread]
  }
  @scala.inline
  implicit class FragmentSpreadOps[Self <: FragmentSpread] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: Argument*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[Argument]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectivesVarargs(value: Directive*): Self = this.set("directives", js.Array(value :_*))
    @scala.inline
    def setDirectives(value: js.Array[Directive]): Self = this.set("directives", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: typings.relayCompiler.relayCompilerStrings.FragmentSpread): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}

