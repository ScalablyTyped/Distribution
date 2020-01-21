package typings.relayCompiler

import typings.relayCompiler.graphQLIRMod.Argument
import typings.relayCompiler.graphQLIRMod.ClientExtension
import typings.relayCompiler.graphQLIRMod.Condition
import typings.relayCompiler.graphQLIRMod.Connection
import typings.relayCompiler.graphQLIRMod.ConnectionField
import typings.relayCompiler.graphQLIRMod.Defer
import typings.relayCompiler.graphQLIRMod.Directive
import typings.relayCompiler.graphQLIRMod.Fragment
import typings.relayCompiler.graphQLIRMod.FragmentSpread
import typings.relayCompiler.graphQLIRMod.InlineFragment
import typings.relayCompiler.graphQLIRMod.LinkedField
import typings.relayCompiler.graphQLIRMod.Literal
import typings.relayCompiler.graphQLIRMod.LocalArgumentDefinition
import typings.relayCompiler.graphQLIRMod.ModuleImport
import typings.relayCompiler.graphQLIRMod.Request
import typings.relayCompiler.graphQLIRMod.Root
import typings.relayCompiler.graphQLIRMod.RootArgumentDefinition
import typings.relayCompiler.graphQLIRMod.ScalarField
import typings.relayCompiler.graphQLIRMod.SplitOperation
import typings.relayCompiler.graphQLIRMod.Stream
import typings.relayCompiler.graphQLIRMod.Variable
import typings.relayCompiler.graphQLIRVisitorMod.VisitFn
import typings.relayCompiler.graphQLIRVisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgument extends js.Object {
  var Argument: js.UndefOr[VisitFn[typings.relayCompiler.graphQLIRMod.Argument]] = js.undefined
  var ClientExtension: js.UndefOr[VisitFn[typings.relayCompiler.graphQLIRMod.ClientExtension]] = js.undefined
  var Condition: js.UndefOr[VisitFn[typings.relayCompiler.graphQLIRMod.Condition]] = js.undefined
  var Connection: js.UndefOr[VisitFn[typings.relayCompiler.graphQLIRMod.Connection]] = js.undefined
  var ConnectionField: js.UndefOr[VisitFn[typings.relayCompiler.graphQLIRMod.ConnectionField]] = js.undefined
  var Defer: js.UndefOr[VisitFn[typings.relayCompiler.graphQLIRMod.Defer]] = js.undefined
  var Directive: js.UndefOr[VisitFn[typings.relayCompiler.graphQLIRMod.Directive]] = js.undefined
  var Fragment: js.UndefOr[VisitFn[typings.relayCompiler.graphQLIRMod.Fragment]] = js.undefined
  var FragmentSpread: js.UndefOr[VisitFn[typings.relayCompiler.graphQLIRMod.FragmentSpread]] = js.undefined
  var InlineFragment: js.UndefOr[VisitFn[typings.relayCompiler.graphQLIRMod.InlineFragment]] = js.undefined
  var LinkedField: js.UndefOr[VisitFn[typings.relayCompiler.graphQLIRMod.LinkedField]] = js.undefined
  var Literal: js.UndefOr[VisitFn[typings.relayCompiler.graphQLIRMod.Literal]] = js.undefined
  var LocalArgumentDefinition: js.UndefOr[VisitFn[typings.relayCompiler.graphQLIRMod.LocalArgumentDefinition]] = js.undefined
  var ModuleImport: js.UndefOr[VisitFn[typings.relayCompiler.graphQLIRMod.ModuleImport]] = js.undefined
  var Request: js.UndefOr[VisitFn[typings.relayCompiler.graphQLIRMod.Request]] = js.undefined
  var Root: js.UndefOr[VisitFn[typings.relayCompiler.graphQLIRMod.Root]] = js.undefined
  var RootArgumentDefinition: js.UndefOr[VisitFn[typings.relayCompiler.graphQLIRMod.RootArgumentDefinition]] = js.undefined
  var ScalarField: js.UndefOr[VisitFn[typings.relayCompiler.graphQLIRMod.ScalarField]] = js.undefined
  var SplitOperation: js.UndefOr[VisitFn[typings.relayCompiler.graphQLIRMod.SplitOperation]] = js.undefined
  var Stream: js.UndefOr[VisitFn[typings.relayCompiler.graphQLIRMod.Stream]] = js.undefined
  var Variable: js.UndefOr[VisitFn[typings.relayCompiler.graphQLIRMod.Variable]] = js.undefined
}

object AnonArgument {
  @scala.inline
  def apply(
    Argument: (Argument, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    ClientExtension: (ClientExtension, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    Condition: (Condition, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    Connection: (Connection, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    ConnectionField: (ConnectionField, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    Defer: (Defer, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    Directive: (Directive, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    Fragment: (Fragment, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    FragmentSpread: (FragmentSpread, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    InlineFragment: (InlineFragment, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    LinkedField: (LinkedField, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    Literal: (Literal, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    LocalArgumentDefinition: (LocalArgumentDefinition, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    ModuleImport: (ModuleImport, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    Request: (Request, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    Root: (Root, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    RootArgumentDefinition: (RootArgumentDefinition, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    ScalarField: (ScalarField, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    SplitOperation: (SplitOperation, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    Stream: (Stream, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    Variable: (Variable, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null
  ): AnonArgument = {
    val __obj = js.Dynamic.literal()
    if (Argument != null) __obj.updateDynamic("Argument")(js.Any.fromFunction5(Argument))
    if (ClientExtension != null) __obj.updateDynamic("ClientExtension")(js.Any.fromFunction5(ClientExtension))
    if (Condition != null) __obj.updateDynamic("Condition")(js.Any.fromFunction5(Condition))
    if (Connection != null) __obj.updateDynamic("Connection")(js.Any.fromFunction5(Connection))
    if (ConnectionField != null) __obj.updateDynamic("ConnectionField")(js.Any.fromFunction5(ConnectionField))
    if (Defer != null) __obj.updateDynamic("Defer")(js.Any.fromFunction5(Defer))
    if (Directive != null) __obj.updateDynamic("Directive")(js.Any.fromFunction5(Directive))
    if (Fragment != null) __obj.updateDynamic("Fragment")(js.Any.fromFunction5(Fragment))
    if (FragmentSpread != null) __obj.updateDynamic("FragmentSpread")(js.Any.fromFunction5(FragmentSpread))
    if (InlineFragment != null) __obj.updateDynamic("InlineFragment")(js.Any.fromFunction5(InlineFragment))
    if (LinkedField != null) __obj.updateDynamic("LinkedField")(js.Any.fromFunction5(LinkedField))
    if (Literal != null) __obj.updateDynamic("Literal")(js.Any.fromFunction5(Literal))
    if (LocalArgumentDefinition != null) __obj.updateDynamic("LocalArgumentDefinition")(js.Any.fromFunction5(LocalArgumentDefinition))
    if (ModuleImport != null) __obj.updateDynamic("ModuleImport")(js.Any.fromFunction5(ModuleImport))
    if (Request != null) __obj.updateDynamic("Request")(js.Any.fromFunction5(Request))
    if (Root != null) __obj.updateDynamic("Root")(js.Any.fromFunction5(Root))
    if (RootArgumentDefinition != null) __obj.updateDynamic("RootArgumentDefinition")(js.Any.fromFunction5(RootArgumentDefinition))
    if (ScalarField != null) __obj.updateDynamic("ScalarField")(js.Any.fromFunction5(ScalarField))
    if (SplitOperation != null) __obj.updateDynamic("SplitOperation")(js.Any.fromFunction5(SplitOperation))
    if (Stream != null) __obj.updateDynamic("Stream")(js.Any.fromFunction5(Stream))
    if (Variable != null) __obj.updateDynamic("Variable")(js.Any.fromFunction5(Variable))
    __obj.asInstanceOf[AnonArgument]
  }
}

