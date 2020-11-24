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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/dialog", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Dialog: ForwardRefExoticComponent[PickBaseDialogPropshidden | PickBaseDialogPropshiddenAbout] = js.native
  
  val DialogContent: ForwardRefExoticComponent[DialogContentProps with RefAttributes[HTMLDivElement]] = js.native
  
  val DialogFooter: ForwardRefExoticComponent[DialogFooterProps with RefAttributes[HTMLDivElement]] = js.native
  
  val DialogHeader: ForwardRefExoticComponent[DialogHeaderProps with RefAttributes[HTMLDivElement]] = js.native
  
  val DialogTitle: ForwardRefExoticComponent[DialogTitleProps with RefAttributes[HTMLHeadingElement]] = js.native
  
  val FixedDialog: ForwardRefExoticComponent[PickBaseFixedDialogPropsh | PickBaseFixedDialogPropshAbout] = js.native
  
  def NestedDialogContextProvider(hasChildren: NestedDialogContextProviderProps): ReactElement = js.native
}
