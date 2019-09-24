package typings.relayDashCompiler

import typings.relayDashCompiler.libCoreGraphQLIRMod.Argument
import typings.relayDashCompiler.libCoreGraphQLIRMod.ClientExtension
import typings.relayDashCompiler.libCoreGraphQLIRMod.Condition
import typings.relayDashCompiler.libCoreGraphQLIRMod.ConnectionField
import typings.relayDashCompiler.libCoreGraphQLIRMod.Defer
import typings.relayDashCompiler.libCoreGraphQLIRMod.Directive
import typings.relayDashCompiler.libCoreGraphQLIRMod.Fragment
import typings.relayDashCompiler.libCoreGraphQLIRMod.FragmentSpread
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
import typings.relayDashCompiler.libCoreGraphQLIRVisitorMod.VisitFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Argument extends js.Object {
  var Argument: js.UndefOr[VisitFn[typings.relayDashCompiler.libCoreGraphQLIRMod.Argument]] = js.undefined
  var ClientExtension: js.UndefOr[VisitFn[typings.relayDashCompiler.libCoreGraphQLIRMod.ClientExtension]] = js.undefined
  var Condition: js.UndefOr[VisitFn[typings.relayDashCompiler.libCoreGraphQLIRMod.Condition]] = js.undefined
  var ConnectionField: js.UndefOr[VisitFn[typings.relayDashCompiler.libCoreGraphQLIRMod.ConnectionField]] = js.undefined
  var Defer: js.UndefOr[VisitFn[typings.relayDashCompiler.libCoreGraphQLIRMod.Defer]] = js.undefined
  var Directive: js.UndefOr[VisitFn[typings.relayDashCompiler.libCoreGraphQLIRMod.Directive]] = js.undefined
  var Fragment: js.UndefOr[VisitFn[typings.relayDashCompiler.libCoreGraphQLIRMod.Fragment]] = js.undefined
  var FragmentSpread: js.UndefOr[VisitFn[typings.relayDashCompiler.libCoreGraphQLIRMod.FragmentSpread]] = js.undefined
  var InlineFragment: js.UndefOr[VisitFn[typings.relayDashCompiler.libCoreGraphQLIRMod.InlineFragment]] = js.undefined
  var LinkedField: js.UndefOr[VisitFn[typings.relayDashCompiler.libCoreGraphQLIRMod.LinkedField]] = js.undefined
  var Literal: js.UndefOr[VisitFn[typings.relayDashCompiler.libCoreGraphQLIRMod.Literal]] = js.undefined
  var LocalArgumentDefinition: js.UndefOr[VisitFn[typings.relayDashCompiler.libCoreGraphQLIRMod.LocalArgumentDefinition]] = js.undefined
  var ModuleImport: js.UndefOr[VisitFn[typings.relayDashCompiler.libCoreGraphQLIRMod.ModuleImport]] = js.undefined
  var Request: js.UndefOr[VisitFn[typings.relayDashCompiler.libCoreGraphQLIRMod.Request]] = js.undefined
  var Root: js.UndefOr[VisitFn[typings.relayDashCompiler.libCoreGraphQLIRMod.Root]] = js.undefined
  var RootArgumentDefinition: js.UndefOr[VisitFn[typings.relayDashCompiler.libCoreGraphQLIRMod.RootArgumentDefinition]] = js.undefined
  var ScalarField: js.UndefOr[VisitFn[typings.relayDashCompiler.libCoreGraphQLIRMod.ScalarField]] = js.undefined
  var SplitOperation: js.UndefOr[VisitFn[typings.relayDashCompiler.libCoreGraphQLIRMod.SplitOperation]] = js.undefined
  var Stream: js.UndefOr[VisitFn[typings.relayDashCompiler.libCoreGraphQLIRMod.Stream]] = js.undefined
  var Variable: js.UndefOr[VisitFn[typings.relayDashCompiler.libCoreGraphQLIRMod.Variable]] = js.undefined
}

object Anon_Argument {
  @scala.inline
  def apply(
    Argument: VisitFn[Argument] = null,
    ClientExtension: VisitFn[ClientExtension] = null,
    Condition: VisitFn[Condition] = null,
    ConnectionField: VisitFn[ConnectionField] = null,
    Defer: VisitFn[Defer] = null,
    Directive: VisitFn[Directive] = null,
    Fragment: VisitFn[Fragment] = null,
    FragmentSpread: VisitFn[FragmentSpread] = null,
    InlineFragment: VisitFn[InlineFragment] = null,
    LinkedField: VisitFn[LinkedField] = null,
    Literal: VisitFn[Literal] = null,
    LocalArgumentDefinition: VisitFn[LocalArgumentDefinition] = null,
    ModuleImport: VisitFn[ModuleImport] = null,
    Request: VisitFn[Request] = null,
    Root: VisitFn[Root] = null,
    RootArgumentDefinition: VisitFn[RootArgumentDefinition] = null,
    ScalarField: VisitFn[ScalarField] = null,
    SplitOperation: VisitFn[SplitOperation] = null,
    Stream: VisitFn[Stream] = null,
    Variable: VisitFn[Variable] = null
  ): Anon_Argument = {
    val __obj = js.Dynamic.literal()
    if (Argument != null) __obj.updateDynamic("Argument")(Argument)
    if (ClientExtension != null) __obj.updateDynamic("ClientExtension")(ClientExtension)
    if (Condition != null) __obj.updateDynamic("Condition")(Condition)
    if (ConnectionField != null) __obj.updateDynamic("ConnectionField")(ConnectionField)
    if (Defer != null) __obj.updateDynamic("Defer")(Defer)
    if (Directive != null) __obj.updateDynamic("Directive")(Directive)
    if (Fragment != null) __obj.updateDynamic("Fragment")(Fragment)
    if (FragmentSpread != null) __obj.updateDynamic("FragmentSpread")(FragmentSpread)
    if (InlineFragment != null) __obj.updateDynamic("InlineFragment")(InlineFragment)
    if (LinkedField != null) __obj.updateDynamic("LinkedField")(LinkedField)
    if (Literal != null) __obj.updateDynamic("Literal")(Literal)
    if (LocalArgumentDefinition != null) __obj.updateDynamic("LocalArgumentDefinition")(LocalArgumentDefinition)
    if (ModuleImport != null) __obj.updateDynamic("ModuleImport")(ModuleImport)
    if (Request != null) __obj.updateDynamic("Request")(Request)
    if (Root != null) __obj.updateDynamic("Root")(Root)
    if (RootArgumentDefinition != null) __obj.updateDynamic("RootArgumentDefinition")(RootArgumentDefinition)
    if (ScalarField != null) __obj.updateDynamic("ScalarField")(ScalarField)
    if (SplitOperation != null) __obj.updateDynamic("SplitOperation")(SplitOperation)
    if (Stream != null) __obj.updateDynamic("Stream")(Stream)
    if (Variable != null) __obj.updateDynamic("Variable")(Variable)
    __obj.asInstanceOf[Anon_Argument]
  }
}

