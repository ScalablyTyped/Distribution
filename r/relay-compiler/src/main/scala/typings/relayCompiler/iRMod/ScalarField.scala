package typings.relayCompiler.iRMod

import typings.relayCompiler.irvisitorMod.VisitNode
import typings.relayCompiler.schemaMod.ScalarFieldTypeID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalarField
  extends Field
     with IR
     with Selection
     with VisitNode {
  var alias: String = js.native
  var args: js.Array[Argument] = js.native
  var directives: js.Array[Directive] = js.native
  var handles: js.UndefOr[js.Array[Handle]] = js.native
  var kind: typings.relayCompiler.relayCompilerStrings.ScalarField = js.native
  var loc: Location = js.native
  var metadata: Metadata = js.native
  var name: String = js.native
  var `type`: ScalarFieldTypeID = js.native
}

object ScalarField {
  @scala.inline
  def apply(
    alias: String,
    args: js.Array[Argument],
    directives: js.Array[Directive],
    kind: typings.relayCompiler.relayCompilerStrings.ScalarField,
    loc: Location,
    name: String,
    `type`: ScalarFieldTypeID
  ): ScalarField = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalarField]
  }
  @scala.inline
  implicit class ScalarFieldOps[Self <: ScalarField] (val x: Self) extends AnyVal {
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
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgsVarargs(value: Argument*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[Argument]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectivesVarargs(value: Directive*): Self = this.set("directives", js.Array(value :_*))
    @scala.inline
    def setDirectives(value: js.Array[Directive]): Self = this.set("directives", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: typings.relayCompiler.relayCompilerStrings.ScalarField): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ScalarFieldTypeID): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandlesVarargs(value: Handle*): Self = this.set("handles", js.Array(value :_*))
    @scala.inline
    def setHandles(value: js.Array[Handle]): Self = this.set("handles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandles: Self = this.set("handles", js.undefined)
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}

