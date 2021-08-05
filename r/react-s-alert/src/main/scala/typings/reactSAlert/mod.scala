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
    
    inline def close(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def closeAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeAll")().asInstanceOf[Unit]
    
    inline def error(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[Double]
    inline def error(msg: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def error(msg: String, data: SAlertConfigProps): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def error(msg: Unit, data: SAlertConfigProps): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def info(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("info")().asInstanceOf[Double]
    inline def info(msg: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def info(msg: String, data: SAlertConfigProps): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def info(msg: Unit, data: SAlertConfigProps): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def success(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("success")().asInstanceOf[Double]
    inline def success(msg: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("success")(msg.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def success(msg: String, data: SAlertConfigProps): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def success(msg: Unit, data: SAlertConfigProps): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def warning(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("warning")().asInstanceOf[Double]
    inline def warning(msg: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("warning")(msg.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def warning(msg: String, data: SAlertConfigProps): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("warning")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def warning(msg: Unit, data: SAlertConfigProps): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("warning")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  object SAlert {
    
    trait SAlertBeepProps extends StObject {
      
      var error: js.UndefOr[String] = js.undefined
      
      var info: js.UndefOr[String] = js.undefined
      
      var success: js.UndefOr[String] = js.undefined
      
      var warning: js.UndefOr[String] = js.undefined
    }
    object SAlertBeepProps {
      
      inline def apply(): SAlertBeepProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SAlertBeepProps]
      }
      
      extension [Self <: SAlertBeepProps](x: Self) {
        
        inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
        
        inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
        
        inline def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
        
        inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
        
        inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
        
        inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
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
      
      inline def apply(): SAlertConfigProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SAlertConfigProps]
      }
      
      extension [Self <: SAlertConfigProps](x: Self) {
        
        inline def setBeep(value: String | Boolean | SAlertBeepProps): Self = StObject.set(x, "beep", value.asInstanceOf[js.Any])
        
        inline def setBeepUndefined: Self = StObject.set(x, "beep", js.undefined)
        
        inline def setContentTemplate(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "contentTemplate", js.Any.fromFunction1(value))
        
        inline def setContentTemplateUndefined: Self = StObject.set(x, "contentTemplate", js.undefined)
        
        inline def setCustomFields(value: js.Object): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
        
        inline def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
        
        inline def setEffect(value: String): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
        
        inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
        
        inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
        
        inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
        
        inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
        
        inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
        
        inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
        
        inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
        
        inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
        
        inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        inline def setStack(value: Boolean | SAlertStackProps): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
        
        inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
        
        inline def setTimeout(value: String | Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      }
    }
    
    trait SAlertProps
      extends StObject
         with SAlertConfigProps {
      
      var message: js.UndefOr[String] = js.undefined
    }
    object SAlertProps {
      
      inline def apply(): SAlertProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SAlertProps]
      }
      
      extension [Self <: SAlertProps](x: Self) {
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      }
    }
    
    trait SAlertStackProps extends StObject {
      
      var limit: js.UndefOr[Double] = js.undefined
      
      var spacing: js.UndefOr[Double] = js.undefined
    }
    object SAlertStackProps {
      
      inline def apply(): SAlertStackProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SAlertStackProps]
      }
      
      extension [Self <: SAlertStackProps](x: Self) {
        
        inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
        
        inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
        
        inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
        
        inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      }
    }
  }
  type SAlert = Component[SAlertProps, js.Object, js.Any]
}
