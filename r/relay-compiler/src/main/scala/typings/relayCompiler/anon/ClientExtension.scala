package typings.relayCompiler.anon

import typings.relayCompiler.iRMod.Condition
import typings.relayCompiler.iRMod.Defer
import typings.relayCompiler.iRMod.Directive
import typings.relayCompiler.iRMod.Fragment
import typings.relayCompiler.iRMod.FragmentSpread
import typings.relayCompiler.iRMod.InlineDataFragmentSpread
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
import typings.relayCompiler.irvisitorMod.NodeVisitorObject
import typings.relayCompiler.irvisitorMod.VisitFn
import typings.relayCompiler.irvisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientExtension extends js.Object {
  var Argument: js.UndefOr[NodeVisitorObject[typings.relayCompiler.iRMod.Argument]] = js.native
  var ClientExtension: js.UndefOr[VisitFn[typings.relayCompiler.iRMod.ClientExtension]] = js.native
  var Condition: js.UndefOr[NodeVisitorObject[typings.relayCompiler.iRMod.Condition]] = js.native
  var Defer: js.UndefOr[NodeVisitorObject[typings.relayCompiler.iRMod.Defer]] = js.native
  var Directive: js.UndefOr[NodeVisitorObject[typings.relayCompiler.iRMod.Directive]] = js.native
  var Fragment: js.UndefOr[NodeVisitorObject[typings.relayCompiler.iRMod.Fragment]] = js.native
  var FragmentSpread: js.UndefOr[NodeVisitorObject[typings.relayCompiler.iRMod.FragmentSpread]] = js.native
  var InlineDataFragmentSpread: js.UndefOr[NodeVisitorObject[typings.relayCompiler.iRMod.InlineDataFragmentSpread]] = js.native
  var InlineFragment: js.UndefOr[NodeVisitorObject[typings.relayCompiler.iRMod.InlineFragment]] = js.native
  var LinkedField: js.UndefOr[NodeVisitorObject[typings.relayCompiler.iRMod.LinkedField]] = js.native
  var Literal: js.UndefOr[NodeVisitorObject[typings.relayCompiler.iRMod.Literal]] = js.native
  var LocalArgumentDefinition: js.UndefOr[NodeVisitorObject[typings.relayCompiler.iRMod.LocalArgumentDefinition]] = js.native
  var ModuleImport: js.UndefOr[NodeVisitorObject[typings.relayCompiler.iRMod.ModuleImport]] = js.native
  var Request: js.UndefOr[NodeVisitorObject[typings.relayCompiler.iRMod.Request]] = js.native
  var Root: js.UndefOr[NodeVisitorObject[typings.relayCompiler.iRMod.Root]] = js.native
  var RootArgumentDefinition: js.UndefOr[NodeVisitorObject[typings.relayCompiler.iRMod.RootArgumentDefinition]] = js.native
  var ScalarField: js.UndefOr[NodeVisitorObject[typings.relayCompiler.iRMod.ScalarField]] = js.native
  var SplitOperation: js.UndefOr[NodeVisitorObject[typings.relayCompiler.iRMod.SplitOperation]] = js.native
  var Stream: js.UndefOr[NodeVisitorObject[typings.relayCompiler.iRMod.Stream]] = js.native
  var Variable: js.UndefOr[NodeVisitorObject[typings.relayCompiler.iRMod.Variable]] = js.native
}

object ClientExtension {
  @scala.inline
  def apply(): ClientExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientExtension]
  }
  @scala.inline
  implicit class ClientExtensionOps[Self <: ClientExtension] (val x: Self) extends AnyVal {
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
    def setArgumentFunction5(
      value: (typings.relayCompiler.iRMod.Argument, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("Argument", js.Any.fromFunction5(value))
    @scala.inline
    def setArgument(value: NodeVisitorObject[typings.relayCompiler.iRMod.Argument]): Self = this.set("Argument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgument: Self = this.set("Argument", js.undefined)
    @scala.inline
    def setClientExtension(
      value: (typings.relayCompiler.iRMod.ClientExtension, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("ClientExtension", js.Any.fromFunction5(value))
    @scala.inline
    def deleteClientExtension: Self = this.set("ClientExtension", js.undefined)
    @scala.inline
    def setConditionFunction5(
      value: (Condition, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("Condition", js.Any.fromFunction5(value))
    @scala.inline
    def setCondition(value: NodeVisitorObject[Condition]): Self = this.set("Condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("Condition", js.undefined)
    @scala.inline
    def setDeferFunction5(
      value: (Defer, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("Defer", js.Any.fromFunction5(value))
    @scala.inline
    def setDefer(value: NodeVisitorObject[Defer]): Self = this.set("Defer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefer: Self = this.set("Defer", js.undefined)
    @scala.inline
    def setDirectiveFunction5(
      value: (Directive, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("Directive", js.Any.fromFunction5(value))
    @scala.inline
    def setDirective(value: NodeVisitorObject[Directive]): Self = this.set("Directive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirective: Self = this.set("Directive", js.undefined)
    @scala.inline
    def setFragmentFunction5(
      value: (Fragment, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("Fragment", js.Any.fromFunction5(value))
    @scala.inline
    def setFragment(value: NodeVisitorObject[Fragment]): Self = this.set("Fragment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragment: Self = this.set("Fragment", js.undefined)
    @scala.inline
    def setFragmentSpreadFunction5(
      value: (FragmentSpread, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("FragmentSpread", js.Any.fromFunction5(value))
    @scala.inline
    def setFragmentSpread(value: NodeVisitorObject[FragmentSpread]): Self = this.set("FragmentSpread", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragmentSpread: Self = this.set("FragmentSpread", js.undefined)
    @scala.inline
    def setInlineDataFragmentSpreadFunction5(
      value: (InlineDataFragmentSpread, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("InlineDataFragmentSpread", js.Any.fromFunction5(value))
    @scala.inline
    def setInlineDataFragmentSpread(value: NodeVisitorObject[InlineDataFragmentSpread]): Self = this.set("InlineDataFragmentSpread", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineDataFragmentSpread: Self = this.set("InlineDataFragmentSpread", js.undefined)
    @scala.inline
    def setInlineFragmentFunction5(
      value: (InlineFragment, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("InlineFragment", js.Any.fromFunction5(value))
    @scala.inline
    def setInlineFragment(value: NodeVisitorObject[InlineFragment]): Self = this.set("InlineFragment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineFragment: Self = this.set("InlineFragment", js.undefined)
    @scala.inline
    def setLinkedFieldFunction5(
      value: (LinkedField, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("LinkedField", js.Any.fromFunction5(value))
    @scala.inline
    def setLinkedField(value: NodeVisitorObject[LinkedField]): Self = this.set("LinkedField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkedField: Self = this.set("LinkedField", js.undefined)
    @scala.inline
    def setLiteralFunction5(
      value: (Literal, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("Literal", js.Any.fromFunction5(value))
    @scala.inline
    def setLiteral(value: NodeVisitorObject[Literal]): Self = this.set("Literal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiteral: Self = this.set("Literal", js.undefined)
    @scala.inline
    def setLocalArgumentDefinitionFunction5(
      value: (LocalArgumentDefinition, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("LocalArgumentDefinition", js.Any.fromFunction5(value))
    @scala.inline
    def setLocalArgumentDefinition(value: NodeVisitorObject[LocalArgumentDefinition]): Self = this.set("LocalArgumentDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalArgumentDefinition: Self = this.set("LocalArgumentDefinition", js.undefined)
    @scala.inline
    def setModuleImportFunction5(
      value: (ModuleImport, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("ModuleImport", js.Any.fromFunction5(value))
    @scala.inline
    def setModuleImport(value: NodeVisitorObject[ModuleImport]): Self = this.set("ModuleImport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModuleImport: Self = this.set("ModuleImport", js.undefined)
    @scala.inline
    def setRequestFunction5(
      value: (Request, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("Request", js.Any.fromFunction5(value))
    @scala.inline
    def setRequest(value: NodeVisitorObject[Request]): Self = this.set("Request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("Request", js.undefined)
    @scala.inline
    def setRootFunction5(
      value: (Root, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("Root", js.Any.fromFunction5(value))
    @scala.inline
    def setRoot(value: NodeVisitorObject[Root]): Self = this.set("Root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("Root", js.undefined)
    @scala.inline
    def setRootArgumentDefinitionFunction5(
      value: (RootArgumentDefinition, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("RootArgumentDefinition", js.Any.fromFunction5(value))
    @scala.inline
    def setRootArgumentDefinition(value: NodeVisitorObject[RootArgumentDefinition]): Self = this.set("RootArgumentDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootArgumentDefinition: Self = this.set("RootArgumentDefinition", js.undefined)
    @scala.inline
    def setScalarFieldFunction5(
      value: (ScalarField, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("ScalarField", js.Any.fromFunction5(value))
    @scala.inline
    def setScalarField(value: NodeVisitorObject[ScalarField]): Self = this.set("ScalarField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScalarField: Self = this.set("ScalarField", js.undefined)
    @scala.inline
    def setSplitOperationFunction5(
      value: (SplitOperation, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("SplitOperation", js.Any.fromFunction5(value))
    @scala.inline
    def setSplitOperation(value: NodeVisitorObject[SplitOperation]): Self = this.set("SplitOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitOperation: Self = this.set("SplitOperation", js.undefined)
    @scala.inline
    def setStreamFunction5(
      value: (Stream, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("Stream", js.Any.fromFunction5(value))
    @scala.inline
    def setStream(value: NodeVisitorObject[Stream]): Self = this.set("Stream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStream: Self = this.set("Stream", js.undefined)
    @scala.inline
    def setVariableFunction5(
      value: (Variable, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("Variable", js.Any.fromFunction5(value))
    @scala.inline
    def setVariable(value: NodeVisitorObject[Variable]): Self = this.set("Variable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariable: Self = this.set("Variable", js.undefined)
  }
  
}

