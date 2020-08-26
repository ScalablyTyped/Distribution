package typings.relayCompiler.iRMod

import typings.relayCompiler.irvisitorMod.VisitNode
import typings.relayCompiler.schemaMod.InputTypeID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Argument
  extends IR
     with VisitNode {
  var kind: typings.relayCompiler.relayCompilerStrings.Argument = js.native
  var loc: Location = js.native
  var metadata: Metadata = js.native
  var name: String = js.native
  var `type`: js.UndefOr[InputTypeID] = js.native
  var value: ArgumentValue = js.native
}

object Argument {
  @scala.inline
  def apply(
    kind: typings.relayCompiler.relayCompilerStrings.Argument,
    loc: Location,
    name: String,
    value: ArgumentValue
  ): Argument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argument]
  }
  @scala.inline
  implicit class ArgumentOps[Self <: Argument] (val x: Self) extends AnyVal {
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
    def setKind(value: typings.relayCompiler.relayCompilerStrings.Argument): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: ArgumentValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setType(value: InputTypeID): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

