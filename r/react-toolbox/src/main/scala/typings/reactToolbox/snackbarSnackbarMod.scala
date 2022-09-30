package typings.reactToolbox

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactToolbox.mod.ReactToolbox.Props
import typings.reactToolbox.reactToolboxStrings.accept
import typings.reactToolbox.reactToolboxStrings.cancel
import typings.reactToolbox.reactToolboxStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snackbarSnackbarMod {
  
  @JSImport("react-toolbox/components/snackbar/Snackbar", JSImport.Default)
  @js.native
  open class default protected () extends Snackbar {
    def this(props: SnackbarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SnackbarProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/snackbar/Snackbar", "Snackbar")
  @js.native
  open class Snackbar protected ()
    extends Component[SnackbarProps, js.Object, Any] {
    def this(props: SnackbarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SnackbarProps, context: Any) = this()
  }
  
  trait SnackbarProps
    extends StObject
       with Props {
    
    /**
      * Label for the action component inside the Snackbar.
      */
    var action: js.UndefOr[String] = js.undefined
    
    /**
      * If true, the snackbar will be active.
      * @default true
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Text to display in the content.
      */
    var label: js.UndefOr[String | Element] = js.undefined
    
    /**
      * Callback function when finish the set timeout.
      */
    var onTimeout: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[SnackbarTheme] = js.undefined
    
    /**
      * Amount of time in milliseconds after the Snackbar will be automatically hidden.
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Indicates the action type. Can be accept, warning or cancel
      */
    var `type`: js.UndefOr[accept | cancel | warning] = js.undefined
  }
  object SnackbarProps {
    
    inline def apply(): SnackbarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnackbarProps]
    }
    
    extension [Self <: SnackbarProps](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setLabel(value: String | Element): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnTimeout(value: js.Function): Self = StObject.set(x, "onTimeout", value.asInstanceOf[js.Any])
      
      inline def setOnTimeoutUndefined: Self = StObject.set(x, "onTimeout", js.undefined)
      
      inline def setTheme(value: SnackbarTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setType(value: accept | cancel | warning): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SnackbarTheme extends StObject {
    
    /**
      * Added to the root element in case it's accept type.
      */
    var accept: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root element when its active.
      */
    var active: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the button inside the component.
      */
    var button: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root element in case it's cancel type.
      */
    var cancel: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the label element.
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * Used as the className for the root element of the component.
      */
    var snackbar: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root element in case it's warning type.
      */
    var warning: js.UndefOr[String] = js.undefined
  }
  object SnackbarTheme {
    
    inline def apply(): SnackbarTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnackbarTheme]
    }
    
    extension [Self <: SnackbarTheme](x: Self) {
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setSnackbar(value: String): Self = StObject.set(x, "snackbar", value.asInstanceOf[js.Any])
      
      inline def setSnackbarUndefined: Self = StObject.set(x, "snackbar", js.undefined)
      
      inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
}
