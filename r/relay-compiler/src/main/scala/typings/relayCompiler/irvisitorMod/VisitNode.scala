package typings.relayCompiler.irvisitorMod

import typings.relayCompiler.anon.FragmentTypeCondition
import typings.relayCompiler.iRMod.Argument
import typings.relayCompiler.iRMod.ArgumentDefinition
import typings.relayCompiler.iRMod.ArgumentValue
import typings.relayCompiler.iRMod.Directive
import typings.relayCompiler.iRMod.Fragment
import typings.relayCompiler.iRMod.Handle
import typings.relayCompiler.iRMod.Literal
import typings.relayCompiler.iRMod.LocalArgumentDefinition
import typings.relayCompiler.iRMod.Location
import typings.relayCompiler.iRMod.Metadata
import typings.relayCompiler.iRMod.Root
import typings.relayCompiler.iRMod.Selection
import typings.relayCompiler.iRMod.Variable
import typings.relayCompiler.relayCompilerStrings.mutation
import typings.relayCompiler.relayCompilerStrings.query
import typings.relayCompiler.relayCompilerStrings.subscription
import typings.relayCompiler.schemaMod.CompositeTypeID
import typings.relayCompiler.schemaMod.InputTypeID
import typings.relayCompiler.schemaMod.LinkedFieldTypeID
import typings.relayCompiler.schemaMod.ScalarFieldTypeID
import typings.relayCompiler.schemaMod.TypeID
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayCompiler.iRMod.Argument
  - typings.relayCompiler.iRMod.ClientExtension
  - typings.relayCompiler.iRMod.Condition
  - typings.relayCompiler.iRMod.Defer
  - typings.relayCompiler.iRMod.Directive
  - typings.relayCompiler.iRMod.Fragment
  - typings.relayCompiler.iRMod.FragmentSpread
  - typings.relayCompiler.iRMod.InlineDataFragmentSpread
  - typings.relayCompiler.iRMod.InlineFragment
  - typings.relayCompiler.iRMod.LinkedField
  - typings.relayCompiler.iRMod.Literal
  - typings.relayCompiler.iRMod.LocalArgumentDefinition
  - typings.relayCompiler.iRMod.ModuleImport
  - typings.relayCompiler.iRMod.Request
  - typings.relayCompiler.iRMod.Root
  - typings.relayCompiler.iRMod.RootArgumentDefinition
  - typings.relayCompiler.iRMod.ScalarField
  - typings.relayCompiler.iRMod.SplitOperation
  - typings.relayCompiler.iRMod.Stream
  - typings.relayCompiler.iRMod.Variable
*/
trait VisitNode extends js.Object

object VisitNode {
  @scala.inline
  def ModuleImport(
    documentName: String,
    id: String,
    kind: typings.relayCompiler.relayCompilerStrings.ModuleImport,
    loc: Location,
    module: String,
    name: String,
    selections: js.Array[Selection]
  ): VisitNode = {
    val __obj = js.Dynamic.literal(documentName = documentName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def InlineFragment(
    directives: js.Array[Directive],
    kind: typings.relayCompiler.relayCompilerStrings.InlineFragment,
    loc: Location,
    selections: js.Array[Selection],
    typeCondition: CompositeTypeID,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def LinkedField(
    alias: String,
    args: js.Array[Argument],
    connection: Boolean,
    directives: js.Array[Directive],
    kind: typings.relayCompiler.relayCompilerStrings.LinkedField,
    loc: Location,
    name: String,
    selections: js.Array[Selection],
    `type`: LinkedFieldTypeID,
    handles: js.Array[Handle] = null,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (handles != null) __obj.updateDynamic("handles")(handles.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def SplitOperation(
    kind: typings.relayCompiler.relayCompilerStrings.SplitOperation,
    loc: Location,
    name: String,
    parentSources: Set[String],
    selections: js.Array[Selection],
    `type`: TypeID,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentSources = parentSources.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def LocalArgumentDefinition(
    defaultValue: js.Any,
    kind: typings.relayCompiler.relayCompilerStrings.LocalArgumentDefinition,
    loc: Location,
    name: String,
    `type`: InputTypeID,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Request(
    fragment: Fragment,
    kind: typings.relayCompiler.relayCompilerStrings.Request,
    loc: Location,
    name: String,
    root: Root,
    id: String = null,
    metadata: Metadata = null,
    text: String = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Fragment(
    argumentDefinitions: js.Array[ArgumentDefinition],
    directives: js.Array[Directive],
    kind: typings.relayCompiler.relayCompilerStrings.Fragment,
    loc: Location,
    name: String,
    selections: js.Array[Selection],
    `type`: CompositeTypeID,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Root(
    argumentDefinitions: js.Array[LocalArgumentDefinition],
    directives: js.Array[Directive],
    kind: typings.relayCompiler.relayCompilerStrings.Root,
    loc: Location,
    name: String,
    operation: query | mutation | subscription,
    selections: Selection,
    `type`: CompositeTypeID,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def RootArgumentDefinition(
    kind: typings.relayCompiler.relayCompilerStrings.RootArgumentDefinition,
    loc: Location,
    name: String,
    `type`: InputTypeID
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Directive(
    args: js.Array[Argument],
    kind: typings.relayCompiler.relayCompilerStrings.Directive,
    loc: Location,
    name: String,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def ClientExtension(
    kind: typings.relayCompiler.relayCompilerStrings.ClientExtension,
    loc: Location,
    selections: js.Array[Selection],
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Defer(
    kind: typings.relayCompiler.relayCompilerStrings.Defer,
    label: String,
    loc: Location,
    selections: js.Array[Selection],
    `if`: ArgumentValue = null,
    metadata: js.UndefOr[Null | FragmentTypeCondition] = js.undefined
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
    if (!js.isUndefined(metadata)) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Variable(
    kind: typings.relayCompiler.relayCompilerStrings.Variable,
    loc: Location,
    variableName: String,
    `type`: TypeID = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Condition(
    condition: Literal | Variable,
    kind: typings.relayCompiler.relayCompilerStrings.Condition,
    loc: Location,
    passingValue: Boolean,
    selections: js.Array[Selection],
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], passingValue = passingValue.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def InlineDataFragmentSpread(
    kind: typings.relayCompiler.relayCompilerStrings.InlineDataFragmentSpread,
    loc: Location,
    name: String,
    selections: js.Array[Selection],
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Argument(
    kind: typings.relayCompiler.relayCompilerStrings.Argument,
    loc: Location,
    name: String,
    value: ArgumentValue,
    metadata: Metadata = null,
    `type`: InputTypeID = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Literal(kind: typings.relayCompiler.relayCompilerStrings.Literal, loc: Location, value: js.Any): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def FragmentSpread(
    args: js.Array[Argument],
    directives: js.Array[Directive],
    kind: typings.relayCompiler.relayCompilerStrings.FragmentSpread,
    loc: Location,
    name: String,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def ScalarField(
    alias: String,
    args: js.Array[Argument],
    directives: js.Array[Directive],
    kind: typings.relayCompiler.relayCompilerStrings.ScalarField,
    loc: Location,
    name: String,
    `type`: ScalarFieldTypeID,
    handles: js.Array[Handle] = null,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (handles != null) __obj.updateDynamic("handles")(handles.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Stream(
    initialCount: ArgumentValue,
    kind: typings.relayCompiler.relayCompilerStrings.Stream,
    label: String,
    loc: Location,
    selections: js.Array[Selection],
    `if`: ArgumentValue = null,
    metadata: Metadata = null,
    useCustomizedBatch: ArgumentValue = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(initialCount = initialCount.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], useCustomizedBatch = useCustomizedBatch.asInstanceOf[js.Any])
    __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
}

