package typings.semanticUiReact.confirmConfirmMod

import typings.react.mod.ElementType
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.semanticUiReact.buttonButtonMod.ButtonProps
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.modalModalMod.StrictModalProps
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictConfirmProps extends StrictModalProps {
  
  /** The cancel button text. */
  var cancelButton: js.UndefOr[SemanticShorthandItem[ButtonProps]] = js.native
  
  /** The OK button text. */
  var confirmButton: js.UndefOr[SemanticShorthandItem[ButtonProps]] = js.native
  
  /**
    * Called when the Modal is closed without clicking confirm.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onCancel: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], 
      /* data */ ConfirmProps, 
      Unit
    ]
  ] = js.native
  
  /**
    * Called when the OK button is clicked.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onConfirm: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], 
      /* data */ ConfirmProps, 
      Unit
    ]
  ] = js.native
}
object StrictConfirmProps {
  
  @scala.inline
  def apply(): StrictConfirmProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictConfirmProps]
  }
  
  @scala.inline
  implicit class StrictConfirmPropsOps[Self <: StrictConfirmProps] (val x: Self) extends AnyVal {
    
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
    def setCancelButtonFunction3(
      value: (/* component */ ElementType[ButtonProps], ButtonProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("cancelButton", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCancelButton(value: SemanticShorthandItem[ButtonProps]): Self = this.set("cancelButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelButton: Self = this.set("cancelButton", js.undefined)
    
    @scala.inline
    def setConfirmButtonFunction3(
      value: (/* component */ ElementType[ButtonProps], ButtonProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("confirmButton", js.Any.fromFunction3(value))
    
    @scala.inline
    def setConfirmButton(value: SemanticShorthandItem[ButtonProps]): Self = this.set("confirmButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmButton: Self = this.set("confirmButton", js.undefined)
    
    @scala.inline
    def setOnCancel(
      value: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ ConfirmProps) => Unit
    ): Self = this.set("onCancel", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    
    @scala.inline
    def setOnConfirm(
      value: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ ConfirmProps) => Unit
    ): Self = this.set("onConfirm", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnConfirm: Self = this.set("onConfirm", js.undefined)
  }
}
