package typings.reactToolbox

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactToolbox.componentsButtonButtonMod.ButtonProps
import typings.reactToolbox.mod.ReactToolbox.Props
import typings.reactToolbox.reactToolboxStrings.large
import typings.reactToolbox.reactToolboxStrings.normal
import typings.reactToolbox.reactToolboxStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsDialogDialogMod {
  
  @JSImport("react-toolbox/components/dialog/Dialog", JSImport.Default)
  @js.native
  open class default protected () extends Dialog {
    def this(props: DialogProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DialogProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/dialog/Dialog", "Dialog")
  @js.native
  open class Dialog protected ()
    extends Component[DialogProps, js.Object, Any] {
    def this(props: DialogProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DialogProps, context: Any) = this()
  }
  
  trait DialogActionProps
    extends StObject
       with ButtonProps
  object DialogActionProps {
    
    inline def apply(): DialogActionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogActionProps]
    }
  }
  
  trait DialogProps
    extends StObject
       with Props {
    
    /**
      * A array of objects representing the buttons for the dialog navigation area. The properties will be transferred to the buttons.
      */
    var actions: js.UndefOr[js.Array[DialogActionProps]] = js.undefined
    
    /**
      * If true, the dialog will be active.
      * @default false
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Callback called when the ESC key is pressed with the overlay active.
      */
    var onEscKeyDown: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback to be invoked when the dialog overlay is clicked.
      */
    var onOverlayClick: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback called when the mouse button is pressed on the overlay.
      */
    var onOverlayMouseDown: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback called when the mouse is moving over the overlay.
      */
    var onOverlayMouseMove: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback called when the mouse button is released over the overlay.
      */
    var onOverlayMouseUp: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[DialogTheme] = js.undefined
    
    /**
      * The text string to use as standar title of the dialog.
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * Used to determine the size of the dialog. It can be small, normal or large.
      * @default "normal"
      */
    var `type`: js.UndefOr[small | normal | large | String] = js.undefined
  }
  object DialogProps {
    
    inline def apply(): DialogProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogProps]
    }
    
    extension [Self <: DialogProps](x: Self) {
      
      inline def setActions(value: js.Array[DialogActionProps]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: DialogActionProps*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnEscKeyDown(value: js.Function): Self = StObject.set(x, "onEscKeyDown", value.asInstanceOf[js.Any])
      
      inline def setOnEscKeyDownUndefined: Self = StObject.set(x, "onEscKeyDown", js.undefined)
      
      inline def setOnOverlayClick(value: js.Function): Self = StObject.set(x, "onOverlayClick", value.asInstanceOf[js.Any])
      
      inline def setOnOverlayClickUndefined: Self = StObject.set(x, "onOverlayClick", js.undefined)
      
      inline def setOnOverlayMouseDown(value: js.Function): Self = StObject.set(x, "onOverlayMouseDown", value.asInstanceOf[js.Any])
      
      inline def setOnOverlayMouseDownUndefined: Self = StObject.set(x, "onOverlayMouseDown", js.undefined)
      
      inline def setOnOverlayMouseMove(value: js.Function): Self = StObject.set(x, "onOverlayMouseMove", value.asInstanceOf[js.Any])
      
      inline def setOnOverlayMouseMoveUndefined: Self = StObject.set(x, "onOverlayMouseMove", js.undefined)
      
      inline def setOnOverlayMouseUp(value: js.Function): Self = StObject.set(x, "onOverlayMouseUp", value.asInstanceOf[js.Any])
      
      inline def setOnOverlayMouseUpUndefined: Self = StObject.set(x, "onOverlayMouseUp", js.undefined)
      
      inline def setTheme(value: DialogTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: small | normal | large | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DialogTheme extends StObject {
    
    /**
      * Used for the root when the dialog is active.
      */
    var active: js.UndefOr[String] = js.undefined
    
    /**
      * Used to wrap the dialog body.
      */
    var body: js.UndefOr[String] = js.undefined
    
    /**
      * Used in buttons when the dialog implements actions.
      */
    var button: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the root element.
      */
    var dialog: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the navigation element when it implements actions.
      */
    var navigation: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the title element of the dialog.
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object DialogTheme {
    
    inline def apply(): DialogTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogTheme]
    }
    
    extension [Self <: DialogTheme](x: Self) {
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setDialog(value: String): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
      
      inline def setDialogUndefined: Self = StObject.set(x, "dialog", js.undefined)
      
      inline def setNavigation(value: String): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
