package typings.relayCompiler

import typings.relayCompiler.iRMod.Argument
import typings.relayCompiler.iRMod.ClientExtension
import typings.relayCompiler.iRMod.Condition
import typings.relayCompiler.iRMod.Defer
import typings.relayCompiler.iRMod.Directive
import typings.relayCompiler.iRMod.Fragment
import typings.relayCompiler.iRMod.FragmentSpread
import typings.relayCompiler.iRMod.InlineFragment
import typings.relayCompiler.iRMod.LinkedField
import typings.relayCompiler.iRMod.Literal
import typings.relayCompiler.iRMod.LocalArgumentDefinition
import typings.relayCompiler.iRMod.ModuleImport
import typings.relayCompiler.iRMod.Request
import typings.relayCompiler.iRMod.Root
import typings.relayCompiler.iRMod.RootArgumentDefinition
import typings.relayCompiler.iRMod.ScalarField
import typings.relayCompiler.iRMod.SplitOperation
import typings.relayCompiler.iRMod.Stream
import typings.relayCompiler.iRMod.Variable
import typings.relayCompiler.irvisitorMod.VisitFn
import typings.relayCompiler.irvisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgument extends js.Object {
  var Argument: js.UndefOr[VisitFn[typings.relayCompiler.iRMod.Argument]] = js.undefined
  var ClientExtension: js.UndefOr[VisitFn[typings.relayCompiler.iRMod.ClientExtension]] = js.undefined
  var Condition: js.UndefOr[VisitFn[typings.relayCompiler.iRMod.Condition]] = js.undefined
  var Defer: js.UndefOr[VisitFn[typings.relayCompiler.iRMod.Defer]] = js.undefined
  var Directive: js.UndefOr[VisitFn[typings.relayCompiler.iRMod.Directive]] = js.undefined
  var Fragment: js.UndefOr[VisitFn[typings.relayCompiler.iRMod.Fragment]] = js.undefined
  var FragmentSpread: js.UndefOr[VisitFn[typings.relayCompiler.iRMod.FragmentSpread]] = js.undefined
  var InlineFragment: js.UndefOr[VisitFn[typings.relayCompiler.iRMod.InlineFragment]] = js.undefined
  var LinkedField: js.UndefOr[VisitFn[typings.relayCompiler.iRMod.LinkedField]] = js.undefined
  var Literal: js.UndefOr[VisitFn[typings.relayCompiler.iRMod.Literal]] = js.undefined
  var LocalArgumentDefinition: js.UndefOr[VisitFn[typings.relayCompiler.iRMod.LocalArgumentDefinition]] = js.undefined
  var ModuleImport: js.UndefOr[VisitFn[typings.relayCompiler.iRMod.ModuleImport]] = js.undefined
  var Request: js.UndefOr[VisitFn[typings.relayCompiler.iRMod.Request]] = js.undefined
  var Root: js.UndefOr[VisitFn[typings.relayCompiler.iRMod.Root]] = js.undefined
  var RootArgumentDefinition: js.UndefOr[VisitFn[typings.relayCompiler.iRMod.RootArgumentDefinition]] = js.undefined
  var ScalarField: js.UndefOr[VisitFn[typings.relayCompiler.iRMod.ScalarField]] = js.undefined
  var SplitOperation: js.UndefOr[VisitFn[typings.relayCompiler.iRMod.SplitOperation]] = js.undefined
  var Stream: js.UndefOr[VisitFn[typings.relayCompiler.iRMod.Stream]] = js.undefined
  var Variable: js.UndefOr[VisitFn[typings.relayCompiler.iRMod.Variable]] = js.undefined
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

