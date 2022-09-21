package typings.reactBootstrapConfirmation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-bootstrap-confirmation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alert(message: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("alert")(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def alert(message: String, options: AlertOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def confirm(message: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def confirm(message: String, options: ConfirmOptions): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  trait AlertOptions extends StObject {
    
    /**
      * The style of the "OK" button. Must correspond to one of the 6 button styles of Bootstrap.
      * @default "primary"
      */
    var okButtonStyle: js.UndefOr[BootstrapStyleFlags] = js.undefined
    
    /**
      * The text of the "OK" button.
      * @default "OK"
      */
    var okText: js.UndefOr[String] = js.undefined
    
    /**
      * A facultative title to use for the modal.
      * @default undefined
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object AlertOptions {
    
    inline def apply(): AlertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertOptions]
    }
    
    extension [Self <: AlertOptions](x: Self) {
      
      inline def setOkButtonStyle(value: BootstrapStyleFlags): Self = StObject.set(x, "okButtonStyle", value.asInstanceOf[js.Any])
      
      inline def setOkButtonStyleUndefined: Self = StObject.set(x, "okButtonStyle", js.undefined)
      
      inline def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      inline def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.primary
    - typings.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.secondary
    - typings.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.success
    - typings.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.danger
    - typings.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.warning
    - typings.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.info
    - typings.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.light
    - typings.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.dark
    - typings.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.link
  */
  trait BootstrapStyleFlags extends StObject
  object BootstrapStyleFlags {
    
    inline def danger: typings.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.danger = "danger".asInstanceOf[typings.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.danger]
    
    inline def dark: typings.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.dark = "dark".asInstanceOf[typings.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.dark]
    
    inline def info: typings.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.info = "info".asInstanceOf[typings.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.info]
    
    inline def light: typings.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.light = "light".asInstanceOf[typings.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.light]
    
    inline def link: typings.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.link = "link".asInstanceOf[typings.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.link]
    
    inline def primary: typings.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.primary = "primary".asInstanceOf[typings.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.primary]
    
    inline def secondary: typings.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.secondary = "secondary".asInstanceOf[typings.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.secondary]
    
    inline def success: typings.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.success = "success".asInstanceOf[typings.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.success]
    
    inline def warning: typings.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.warning = "warning".asInstanceOf[typings.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.warning]
  }
  
  trait ConfirmOptions
    extends StObject
       with AlertOptions {
    
    /**
      * The style of the "Cancel" button. Must correspond to one of the 6 button styles of Bootstrap.
      * @default "secondary"
      */
    var cancelButtonStyle: js.UndefOr[BootstrapStyleFlags] = js.undefined
    
    /**
      * The text of the "Cancel" button.
      * @default "Cancel"
      */
    var cancelText: js.UndefOr[String] = js.undefined
  }
  object ConfirmOptions {
    
    inline def apply(): ConfirmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmOptions]
    }
    
    extension [Self <: ConfirmOptions](x: Self) {
      
      inline def setCancelButtonStyle(value: BootstrapStyleFlags): Self = StObject.set(x, "cancelButtonStyle", value.asInstanceOf[js.Any])
      
      inline def setCancelButtonStyleUndefined: Self = StObject.set(x, "cancelButtonStyle", js.undefined)
      
      inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    }
  }
}
