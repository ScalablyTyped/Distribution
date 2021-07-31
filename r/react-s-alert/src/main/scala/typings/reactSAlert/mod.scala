package typings.reactSAlert

import typings.react.mod.Component
import typings.reactSAlert.mod.SAlert.SAlertConfigProps
import typings.reactSAlert.mod.SAlert.SAlertProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-s-alert", JSImport.Default)
  @js.native
  class default ()
    extends Component[SAlertProps, js.Object, js.Any]
  object default {
    
    @JSImport("react-s-alert", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def close(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def closeAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeAll")().asInstanceOf[Unit]
    
    @scala.inline
    def error(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[Double]
    @scala.inline
    def error(msg: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def error(msg: String, data: SAlertConfigProps): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def error(msg: Unit, data: SAlertConfigProps): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def info(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("info")().asInstanceOf[Double]
    @scala.inline
    def info(msg: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def info(msg: String, data: SAlertConfigProps): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def info(msg: Unit, data: SAlertConfigProps): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def success(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("success")().asInstanceOf[Double]
    @scala.inline
    def success(msg: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("success")(msg.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def success(msg: String, data: SAlertConfigProps): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def success(msg: Unit, data: SAlertConfigProps): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def warning(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("warning")().asInstanceOf[Double]
    @scala.inline
    def warning(msg: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("warning")(msg.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def warning(msg: String, data: SAlertConfigProps): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("warning")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def warning(msg: Unit, data: SAlertConfigProps): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("warning")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  object SAlert {
    
    trait SAlertBeepProps extends StObject {
      
      var error: js.UndefOr[String] = js.undefined
      
      var info: js.UndefOr[String] = js.undefined
      
      var success: js.UndefOr[String] = js.undefined
      
      var warning: js.UndefOr[String] = js.undefined
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
    
    trait SAlertConfigProps extends StObject {
      
      var beep: js.UndefOr[String | Boolean | SAlertBeepProps] = js.undefined
      
      var contentTemplate: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
      
      var customFields: js.UndefOr[js.Object] = js.undefined
      
      var effect: js.UndefOr[String] = js.undefined
      
      var html: js.UndefOr[Boolean] = js.undefined
      
      var offset: js.UndefOr[Double] = js.undefined
      
      var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var position: js.UndefOr[String] = js.undefined
      
      var stack: js.UndefOr[Boolean | SAlertStackProps] = js.undefined
      
      var timeout: js.UndefOr[String | Double] = js.undefined
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
        def setContentTemplate(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "contentTemplate", js.Any.fromFunction1(value))
        
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
    
    trait SAlertProps
      extends StObject
         with SAlertConfigProps {
      
      var message: js.UndefOr[String] = js.undefined
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
    
    trait SAlertStackProps extends StObject {
      
      var limit: js.UndefOr[Double] = js.undefined
      
      var spacing: js.UndefOr[Double] = js.undefined
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
