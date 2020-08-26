package typings.reactMdDialog

import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdDialog.anon.DialogPropsPickDialogProp
import typings.reactMdDialog.anon.DialogPropsPickDialogPropAbout
import typings.reactMdDialog.anon.FixedDialogPropsPickFixed
import typings.reactMdDialog.anon.FixedDialogPropsPickFixedAbout
import typings.reactMdDialog.dialogContentMod.DialogContentProps
import typings.reactMdDialog.dialogFooterMod.DialogFooterProps
import typings.reactMdDialog.dialogHeaderMod.DialogHeaderProps
import typings.reactMdDialog.dialogTitleMod.DialogTitleProps
import typings.std.HTMLDivElement
import typings.std.HTMLHeadingElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/dialog", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val Dialog: ForwardRefExoticComponent[DialogPropsPickDialogProp | DialogPropsPickDialogPropAbout] = js.native
  /**
    * This component is used to render the main content within a dialog. There are
    * really only benefits when using the component alongside the `DialogHeader`
    * and/or `DialogFooter` since it is set up so only the content will scroll
    * while the header and footer will be "fixed".
    */
  val DialogContent: ForwardRefExoticComponent[DialogContentProps with RefAttributes[HTMLDivElement]] = js.native
  val DialogFooter: ForwardRefExoticComponent[DialogFooterProps with RefAttributes[HTMLDivElement]] = js.native
  /**
    * This component doesn't do anything to complex. It really just applies custom
    * styles so that when the `DialogContent` component is used, the header will be
    * "fixed" to the top of the dialog while the content scrolls. It also applies
    * some minimal padding.
    */
  val DialogHeader: ForwardRefExoticComponent[DialogHeaderProps with RefAttributes[HTMLDivElement]] = js.native
  /**
    * This component adds some base styles to an `<h2>` element for a title within
    * a `Dialog`.
    */
  val DialogTitle: ForwardRefExoticComponent[DialogTitleProps with RefAttributes[HTMLHeadingElement]] = js.native
  /**
    * The `FixedDialog` is a wrapper for the `Dialog` component that can be used to
    * be fix itself to another element. Another term for this component might be a
    * "Pop out Dialog".
    */
  val FixedDialog: ForwardRefExoticComponent[FixedDialogPropsPickFixed | FixedDialogPropsPickFixedAbout] = js.native
  val NestedDialogContextProvider: FC[js.Object] = js.native
}

