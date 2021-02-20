package typings.reactSAlert

import typings.react.mod.Component
import typings.reactSAlert.mod.SAlert.SAlertConfigProps
import typings.reactSAlert.mod.SAlert.SAlertProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-s-alert", JSImport.Default)
  @js.native
  class default ()
    extends Component[SAlertProps, js.Object, js.Any]
  object default {
    
    @JSImport("react-s-alert", "default.close")
    @js.native
    def close(id: Double): Unit = js.native
    
    @JSImport("react-s-alert", "default.closeAll")
    @js.native
    def closeAll(): Unit = js.native
    
    @JSImport("react-s-alert", "default.error")
    @js.native
    def error(): Double = js.native
    @JSImport("react-s-alert", "default.error")
    @js.native
    def error(msg: js.UndefOr[scala.Nothing], data: SAlertConfigProps): Double = js.native
    @JSImport("react-s-alert", "default.error")
    @js.native
    def error(msg: String): Double = js.native
    @JSImport("react-s-alert", "default.error")
    @js.native
    def error(msg: String, data: SAlertConfigProps): Double = js.native
    
    @JSImport("react-s-alert", "default.info")
    @js.native
    def info(): Double = js.native
    @JSImport("react-s-alert", "default.info")
    @js.native
    def info(msg: js.UndefOr[scala.Nothing], data: SAlertConfigProps): Double = js.native
    @JSImport("react-s-alert", "default.info")
    @js.native
    def info(msg: String): Double = js.native
    @JSImport("react-s-alert", "default.info")
    @js.native
    def info(msg: String, data: SAlertConfigProps): Double = js.native
    
    @JSImport("react-s-alert", "default.success")
    @js.native
    def success(): Double = js.native
    @JSImport("react-s-alert", "default.success")
    @js.native
    def success(msg: js.UndefOr[scala.Nothing], data: SAlertConfigProps): Double = js.native
    @JSImport("react-s-alert", "default.success")
    @js.native
    def success(msg: String): Double = js.native
    @JSImport("react-s-alert", "default.success")
    @js.native
    def success(msg: String, data: SAlertConfigProps): Double = js.native
    
    @JSImport("react-s-alert", "default.warning")
    @js.native
    def warning(): Double = js.native
    @JSImport("react-s-alert", "default.warning")
    @js.native
    def warning(msg: js.UndefOr[scala.Nothing], data: SAlertConfigProps): Double = js.native
    @JSImport("react-s-alert", "default.warning")
    @js.native
    def warning(msg: String): Double = js.native
    @JSImport("react-s-alert", "default.warning")
    @js.native
    def warning(msg: String, data: SAlertConfigProps): Double = js.native
  }
  
  object SAlert {
    
    @js.native
    trait SAlertBeepProps extends StObject {
      
      var error: js.UndefOr[String] = js.native
      
      var info: js.UndefOr[String] = js.native
      
      var success: js.UndefOr[String] = js.native
      
      var warning: js.UndefOr[String] = js.native
    }
    object SAlertBeepProps {
      
      @scala.inline
      def apply(): SAlertBeepProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SAlertBeepProps]
      }
      
      @scala.inline
      implicit class SAlertBeepPropsMutableBuilder[Self <: SAlertBeepProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
        
        @scala.inline
        def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
        
        @scala.inline
        def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
        
        @scala.inline
        def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
      }
    }
    
    @js.native
    trait SAlertConfigProps extends StObject {
      
      var beep: js.UndefOr[String | Boolean | SAlertBeepProps] = js.native
      
      var contentTemplate: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
      
      var customFields: js.UndefOr[js.Object] = js.native
      
      var effect: js.UndefOr[String] = js.native
      
      var html: js.UndefOr[Boolean] = js.native
      
      var offset: js.UndefOr[Double] = js.native
      
      var onClose: js.UndefOr[js.Function0[Unit]] = js.native
      
      var onShow: js.UndefOr[js.Function0[Unit]] = js.native
      
      var position: js.UndefOr[String] = js.native
      
      var stack: js.UndefOr[Boolean | SAlertStackProps] = js.native
      
      var timeout: js.UndefOr[String | Double] = js.native
    }
    object SAlertConfigProps {
      
      @scala.inline
      def apply(): SAlertConfigProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SAlertConfigProps]
      }
      
      @scala.inline
      implicit class SAlertConfigPropsMutableBuilder[Self <: SAlertConfigProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBeep(value: String | Boolean | SAlertBeepProps): Self = StObject.set(x, "beep", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBeepUndefined: Self = StObject.set(x, "beep", js.undefined)
        
        @scala.inline
        def setContentTemplate(value: /* repeated */ js.Any => _): Self = StObject.set(x, "contentTemplate", js.Any.fromFunction1(value))
        
        @scala.inline
        def setContentTemplateUndefined: Self = StObject.set(x, "contentTemplate", js.undefined)
        
        @scala.inline
        def setCustomFields(value: js.Object): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
        
        @scala.inline
        def setEffect(value: String): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
        
        @scala.inline
        def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
        
        @scala.inline
        def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
        
        @scala.inline
        def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
        
        @scala.inline
        def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
        
        @scala.inline
        def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        @scala.inline
        def setStack(value: Boolean | SAlertStackProps): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
        
        @scala.inline
        def setTimeout(value: String | Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      }
    }
    
    @js.native
    trait SAlertProps extends SAlertConfigProps {
      
      var message: js.UndefOr[String] = js.native
    }
    object SAlertProps {
      
      @scala.inline
      def apply(): SAlertProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SAlertProps]
      }
      
      @scala.inline
      implicit class SAlertPropsMutableBuilder[Self <: SAlertProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      }
    }
    
    @js.native
    trait SAlertStackProps extends StObject {
      
      var limit: js.UndefOr[Double] = js.native
      
      var spacing: js.UndefOr[Double] = js.native
    }
    object SAlertStackProps {
      
      @scala.inline
      def apply(): SAlertStackProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SAlertStackProps]
      }
      
      @scala.inline
      implicit class SAlertStackPropsMutableBuilder[Self <: SAlertStackProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
        
        @scala.inline
        def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      }
    }
  }
  type SAlert = Component[SAlertProps, js.Object, js.Any]
}
