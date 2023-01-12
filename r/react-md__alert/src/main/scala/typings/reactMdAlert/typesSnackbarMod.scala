package typings.reactMdAlert

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.reactMdPortal.typesConditionalPortalMod.RenderConditionalPortalProps
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSnackbarMod {
  
  @JSImport("@react-md/alert/types/Snackbar", "Snackbar")
  @js.native
  val Snackbar: ForwardRefExoticComponent[SnackbarProps & RefAttributes[HTMLDivElement]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdAlert.reactMdAlertStrings.bottom
    - typings.reactMdAlert.reactMdAlertStrings.top
  */
  trait SnackbarPosition extends StObject
  object SnackbarPosition {
    
    inline def bottom: typings.reactMdAlert.reactMdAlertStrings.bottom = "bottom".asInstanceOf[typings.reactMdAlert.reactMdAlertStrings.bottom]
    
    inline def top: typings.reactMdAlert.reactMdAlertStrings.top = "top".asInstanceOf[typings.reactMdAlert.reactMdAlertStrings.top]
  }
  
  trait SnackbarProps
    extends StObject
       with HTMLAttributes[HTMLDivElement]
       with RenderConditionalPortalProps {
    
    /**
      * The id for the snackbar element. This is required for a11y.
      */
    @JSName("id")
    var id_SnackbarProps: String
    
    /**
      * The position for the snackbar to be fixed within the viewport or a
      * container element.
      */
    var position: js.UndefOr[SnackbarPosition] = js.undefined
  }
  object SnackbarProps {
    
    inline def apply(id: String): SnackbarProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnackbarProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SnackbarProps] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: SnackbarPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
}
