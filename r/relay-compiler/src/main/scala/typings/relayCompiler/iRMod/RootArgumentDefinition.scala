package typings.relayCompiler.iRMod

import typings.relayCompiler.irvisitorMod.VisitNode
import typings.relayCompiler.schemaMod.InputTypeID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RootArgumentDefinition
  extends ArgumentDefinition
     with IR
     with VisitNode {
  var kind: typings.relayCompiler.relayCompilerStrings.RootArgumentDefinition = js.native
  var loc: Location = js.native
  var name: String = js.native
  var `type`: InputTypeID = js.native
}

object RootArgumentDefinition {
  @scala.inline
  def apply(
    kind: typings.relayCompiler.relayCompilerStrings.RootArgumentDefinition,
    loc: Location,
    name: String,
    `type`: InputTypeID
  ): RootArgumentDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootArgumentDefinition]
  }
  @scala.inline
  implicit class RootArgumentDefinitionOps[Self <: RootArgumentDefinition] (val x: Self) extends AnyVal {
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
    def setKind(value: typings.relayCompiler.relayCompilerStrings.RootArgumentDefinition): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: InputTypeID): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

