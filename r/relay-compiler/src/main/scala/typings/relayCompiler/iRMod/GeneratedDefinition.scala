package typings.relayCompiler.iRMod

import typings.relayCompiler.schemaMod.CompositeTypeID
import typings.relayCompiler.schemaMod.TypeID
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayCompiler.iRMod.Fragment
  - typings.relayCompiler.iRMod.Request
  - typings.relayCompiler.iRMod.SplitOperation
*/
trait GeneratedDefinition extends js.Object

object GeneratedDefinition {
  @scala.inline
  def Fragment(
    argumentDefinitions: js.Array[ArgumentDefinition],
    directives: js.Array[Directive],
    kind: typings.relayCompiler.relayCompilerStrings.Fragment,
    loc: Location,
    name: String,
    selections: js.Array[Selection],
    `type`: CompositeTypeID
  ): GeneratedDefinition = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratedDefinition]
  }
  @scala.inline
  def Request(
    fragment: Fragment,
    kind: typings.relayCompiler.relayCompilerStrings.Request,
    loc: Location,
    name: String,
    root: Root
  ): GeneratedDefinition = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratedDefinition]
  }
  @scala.inline
  def SplitOperation(
    kind: typings.relayCompiler.relayCompilerStrings.SplitOperation,
    loc: Location,
    name: String,
    parentSources: Set[String],
    selections: js.Array[Selection],
    `type`: TypeID
  ): GeneratedDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentSources = parentSources.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratedDefinition]
  }
}

