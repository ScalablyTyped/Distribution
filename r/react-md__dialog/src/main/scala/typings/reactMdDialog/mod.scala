package typings.reactMdDialog

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactMdDialog.anon.PickBaseDialogPropshidden
import typings.reactMdDialog.anon.PickBaseDialogPropshiddenAbout
import typings.reactMdDialog.anon.PickBaseFixedDialogPropsh
import typings.reactMdDialog.anon.PickBaseFixedDialogPropshAbout
import typings.reactMdDialog.dialogContentMod.DialogContentProps
import typings.reactMdDialog.dialogFooterMod.DialogFooterProps
import typings.reactMdDialog.dialogHeaderMod.DialogHeaderProps
import typings.reactMdDialog.dialogTitleMod.DialogTitleProps
import typings.reactMdDialog.nestedDialogContextMod.NestedDialogContextProviderProps
import typings.std.HTMLDivElement
import typings.std.HTMLHeadingElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/dialog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/dialog", "Dialog")
  @js.native
  val Dialog: ForwardRefExoticComponent[PickBaseDialogPropshidden | PickBaseDialogPropshiddenAbout] = js.native
  
  @JSImport("@react-md/dialog", "DialogContent")
  @js.native
  val DialogContent: ForwardRefExoticComponent[DialogContentProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/dialog", "DialogFooter")
  @js.native
  val DialogFooter: ForwardRefExoticComponent[DialogFooterProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/dialog", "DialogHeader")
  @js.native
  val DialogHeader: ForwardRefExoticComponent[DialogHeaderProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/dialog", "DialogTitle")
  @js.native
  val DialogTitle: ForwardRefExoticComponent[DialogTitleProps & RefAttributes[HTMLHeadingElement]] = js.native
  
  @JSImport("@react-md/dialog", "FixedDialog")
  @js.native
  val FixedDialog: ForwardRefExoticComponent[PickBaseFixedDialogPropsh | PickBaseFixedDialogPropshAbout] = js.native
  
  inline def NestedDialogContextProvider(hasChildren: NestedDialogContextProviderProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("NestedDialogContextProvider")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
}
