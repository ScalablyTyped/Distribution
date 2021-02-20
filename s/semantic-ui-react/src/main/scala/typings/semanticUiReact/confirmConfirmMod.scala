package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object confirmConfirmMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/addons/Confirm/Confirm", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[ConfirmProps, ComponentState, js.Any] {
    def this(props: ConfirmProps) = this()
    def this(props: ConfirmProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/addons/Confirm/Confirm", JSImport.Default)
  @js.native
  val default: ComponentClass[ConfirmProps, ComponentState] = js.native
  
  @js.native
  trait ConfirmProps
    extends StrictConfirmProps
       with /* key */ StringDictionary[js.Any]
  object ConfirmProps {
    
    @scala.inline
    def apply(): ConfirmProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmProps]
    }
  }
  
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
    implicit class StrictConfirmPropsMutableBuilder[Self <: StrictConfirmProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelButton(value: SemanticShorthandItem[ButtonProps]): Self = StObject.set(x, "cancelButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonFunction3(
        value: (/* component */ ElementType[ButtonProps], ButtonProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "cancelButton", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCancelButtonUndefined: Self = StObject.set(x, "cancelButton", js.undefined)
      
      @scala.inline
      def setConfirmButton(value: SemanticShorthandItem[ButtonProps]): Self = StObject.set(x, "confirmButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmButtonFunction3(
        value: (/* component */ ElementType[ButtonProps], ButtonProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "confirmButton", js.Any.fromFunction3(value))
      
      @scala.inline
      def setConfirmButtonUndefined: Self = StObject.set(x, "confirmButton", js.undefined)
      
      @scala.inline
      def setOnCancel(
        value: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ ConfirmProps) => Unit
      ): Self = StObject.set(x, "onCancel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnConfirm(
        value: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ ConfirmProps) => Unit
      ): Self = StObject.set(x, "onConfirm", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
    }
  }
  
  type _To = ComponentClass[ConfirmProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `confirmConfirmMod.foo` */
  override def _to: ComponentClass[ConfirmProps, ComponentState] = default
}
