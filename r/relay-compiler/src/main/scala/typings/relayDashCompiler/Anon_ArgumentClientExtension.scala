package typings.relayDashCompiler

import typings.relayDashCompiler.libCoreGraphQLIRMod.Argument
import typings.relayDashCompiler.libCoreGraphQLIRMod.ClientExtension
import typings.relayDashCompiler.libCoreGraphQLIRMod.Condition
import typings.relayDashCompiler.libCoreGraphQLIRMod.ConnectionField
import typings.relayDashCompiler.libCoreGraphQLIRMod.Defer
import typings.relayDashCompiler.libCoreGraphQLIRMod.Directive
import typings.relayDashCompiler.libCoreGraphQLIRMod.Fragment
import typings.relayDashCompiler.libCoreGraphQLIRMod.FragmentSpread
import typings.relayDashCompiler.libCoreGraphQLIRMod.InlineDataFragmentSpread
import typings.relayDashCompiler.libCoreGraphQLIRMod.InlineFragment
import typings.relayDashCompiler.libCoreGraphQLIRMod.LinkedField
import typings.relayDashCompiler.libCoreGraphQLIRMod.Literal
import typings.relayDashCompiler.libCoreGraphQLIRMod.LocalArgumentDefinition
import typings.relayDashCompiler.libCoreGraphQLIRMod.ModuleImport
import typings.relayDashCompiler.libCoreGraphQLIRMod.Request
import typings.relayDashCompiler.libCoreGraphQLIRMod.Root
import typings.relayDashCompiler.libCoreGraphQLIRMod.RootArgumentDefinition
import typings.relayDashCompiler.libCoreGraphQLIRMod.ScalarField
import typings.relayDashCompiler.libCoreGraphQLIRMod.SplitOperation
import typings.relayDashCompiler.libCoreGraphQLIRMod.Stream
import typings.relayDashCompiler.libCoreGraphQLIRMod.Variable
import typings.relayDashCompiler.libCoreGraphQLIRVisitorMod.NodeVisitorObject
import typings.relayDashCompiler.libCoreGraphQLIRVisitorMod.VisitFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgumentClientExtension extends js.Object {
  var Argument: js.UndefOr[NodeVisitorObject[typings.relayDashCompiler.libCoreGraphQLIRMod.Argument]] = js.undefined
  var ClientExtension: js.UndefOr[VisitFn[typings.relayDashCompiler.libCoreGraphQLIRMod.ClientExtension]] = js.undefined
  var Condition: js.UndefOr[NodeVisitorObject[typings.relayDashCompiler.libCoreGraphQLIRMod.Condition]] = js.undefined
  var ConnectionField: js.UndefOr[NodeVisitorObject[typings.relayDashCompiler.libCoreGraphQLIRMod.ConnectionField]] = js.undefined
  var Defer: js.UndefOr[NodeVisitorObject[typings.relayDashCompiler.libCoreGraphQLIRMod.Defer]] = js.undefined
  var Directive: js.UndefOr[NodeVisitorObject[typings.relayDashCompiler.libCoreGraphQLIRMod.Directive]] = js.undefined
  var Fragment: js.UndefOr[NodeVisitorObject[typings.relayDashCompiler.libCoreGraphQLIRMod.Fragment]] = js.undefined
  var FragmentSpread: js.UndefOr[NodeVisitorObject[typings.relayDashCompiler.libCoreGraphQLIRMod.FragmentSpread]] = js.undefined
  var InlineDataFragmentSpread: js.UndefOr[
    NodeVisitorObject[typings.relayDashCompiler.libCoreGraphQLIRMod.InlineDataFragmentSpread]
  ] = js.undefined
  var InlineFragment: js.UndefOr[NodeVisitorObject[typings.relayDashCompiler.libCoreGraphQLIRMod.InlineFragment]] = js.undefined
  var LinkedField: js.UndefOr[NodeVisitorObject[typings.relayDashCompiler.libCoreGraphQLIRMod.LinkedField]] = js.undefined
  var Literal: js.UndefOr[NodeVisitorObject[typings.relayDashCompiler.libCoreGraphQLIRMod.Literal]] = js.undefined
  var LocalArgumentDefinition: js.UndefOr[
    NodeVisitorObject[typings.relayDashCompiler.libCoreGraphQLIRMod.LocalArgumentDefinition]
  ] = js.undefined
  var ModuleImport: js.UndefOr[NodeVisitorObject[typings.relayDashCompiler.libCoreGraphQLIRMod.ModuleImport]] = js.undefined
  var Request: js.UndefOr[NodeVisitorObject[typings.relayDashCompiler.libCoreGraphQLIRMod.Request]] = js.undefined
  var Root: js.UndefOr[NodeVisitorObject[typings.relayDashCompiler.libCoreGraphQLIRMod.Root]] = js.undefined
  var RootArgumentDefinition: js.UndefOr[
    NodeVisitorObject[typings.relayDashCompiler.libCoreGraphQLIRMod.RootArgumentDefinition]
  ] = js.undefined
  var ScalarField: js.UndefOr[NodeVisitorObject[typings.relayDashCompiler.libCoreGraphQLIRMod.ScalarField]] = js.undefined
  var SplitOperation: js.UndefOr[NodeVisitorObject[typings.relayDashCompiler.libCoreGraphQLIRMod.SplitOperation]] = js.undefined
  var Stream: js.UndefOr[NodeVisitorObject[typings.relayDashCompiler.libCoreGraphQLIRMod.Stream]] = js.undefined
  var Variable: js.UndefOr[NodeVisitorObject[typings.relayDashCompiler.libCoreGraphQLIRMod.Variable]] = js.undefined
}

object Anon_ArgumentClientExtension {
  @scala.inline
  def apply(
    Argument: NodeVisitorObject[Argument] = null,
    ClientExtension: VisitFn[ClientExtension] = null,
    Condition: NodeVisitorObject[Condition] = null,
    ConnectionField: NodeVisitorObject[ConnectionField] = null,
    Defer: NodeVisitorObject[Defer] = null,
    Directive: NodeVisitorObject[Directive] = null,
    Fragment: NodeVisitorObject[Fragment] = null,
    FragmentSpread: NodeVisitorObject[FragmentSpread] = null,
    InlineDataFragmentSpread: NodeVisitorObject[InlineDataFragmentSpread] = null,
    InlineFragment: NodeVisitorObject[InlineFragment] = null,
    LinkedField: NodeVisitorObject[LinkedField] = null,
    Literal: NodeVisitorObject[Literal] = null,
    LocalArgumentDefinition: NodeVisitorObject[LocalArgumentDefinition] = null,
    ModuleImport: NodeVisitorObject[ModuleImport] = null,
    Request: NodeVisitorObject[Request] = null,
    Root: NodeVisitorObject[Root] = null,
    RootArgumentDefinition: NodeVisitorObject[RootArgumentDefinition] = null,
    ScalarField: NodeVisitorObject[ScalarField] = null,
    SplitOperation: NodeVisitorObject[SplitOperation] = null,
    Stream: NodeVisitorObject[Stream] = null,
    Variable: NodeVisitorObject[Variable] = null
  ): Anon_ArgumentClientExtension = {
    val __obj = js.Dynamic.literal()
    if (Argument != null) __obj.updateDynamic("Argument")(Argument.asInstanceOf[js.Any])
    if (ClientExtension != null) __obj.updateDynamic("ClientExtension")(ClientExtension)
    if (Condition != null) __obj.updateDynamic("Condition")(Condition.asInstanceOf[js.Any])
    if (ConnectionField != null) __obj.updateDynamic("ConnectionField")(ConnectionField.asInstanceOf[js.Any])
    if (Defer != null) __obj.updateDynamic("Defer")(Defer.asInstanceOf[js.Any])
    if (Directive != null) __obj.updateDynamic("Directive")(Directive.asInstanceOf[js.Any])
    if (Fragment != null) __obj.updateDynamic("Fragment")(Fragment.asInstanceOf[js.Any])
    if (FragmentSpread != null) __obj.updateDynamic("FragmentSpread")(FragmentSpread.asInstanceOf[js.Any])
    if (InlineDataFragmentSpread != null) __obj.updateDynamic("InlineDataFragmentSpread")(InlineDataFragmentSpread.asInstanceOf[js.Any])
    if (InlineFragment != null) __obj.updateDynamic("InlineFragment")(InlineFragment.asInstanceOf[js.Any])
    if (LinkedField != null) __obj.updateDynamic("LinkedField")(LinkedField.asInstanceOf[js.Any])
    if (Literal != null) __obj.updateDynamic("Literal")(Literal.asInstanceOf[js.Any])
    if (LocalArgumentDefinition != null) __obj.updateDynamic("LocalArgumentDefinition")(LocalArgumentDefinition.asInstanceOf[js.Any])
    if (ModuleImport != null) __obj.updateDynamic("ModuleImport")(ModuleImport.asInstanceOf[js.Any])
    if (Request != null) __obj.updateDynamic("Request")(Request.asInstanceOf[js.Any])
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    if (RootArgumentDefinition != null) __obj.updateDynamic("RootArgumentDefinition")(RootArgumentDefinition.asInstanceOf[js.Any])
    if (ScalarField != null) __obj.updateDynamic("ScalarField")(ScalarField.asInstanceOf[js.Any])
    if (SplitOperation != null) __obj.updateDynamic("SplitOperation")(SplitOperation.asInstanceOf[js.Any])
    if (Stream != null) __obj.updateDynamic("Stream")(Stream.asInstanceOf[js.Any])
    if (Variable != null) __obj.updateDynamic("Variable")(Variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArgumentClientExtension]
  }
}

