package typings.reactHotLoader

import typings.react.mod.ComponentType
import typings.reactHotLoader.mod.HotError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Errors extends StObject {
    
    var errors: js.Array[HotError]
  }
  object Errors {
    
    inline def apply(errors: js.Array[HotError]): Errors = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
      
      inline def setErrors(value: js.Array[HotError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: HotError*): Self = StObject.set(x, "errors", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<react-hot-loader.react-hot-loader.Config> */
  trait PartialConfig extends StObject {
    
    var ErrorOverlay: js.UndefOr[ComponentType[Errors]] = js.undefined
    
    var allowSFC: js.UndefOr[Boolean] = js.undefined
    
    var disableHotRenderer: js.UndefOr[Boolean] = js.undefined
    
    var disableHotRendererWhenInjected: js.UndefOr[Boolean] = js.undefined
    
    var errorReporter: js.UndefOr[ComponentType[HotError]] = js.undefined
    
    var ignoreComponents: js.UndefOr[Boolean] = js.undefined
    
    var ignoreSFC: js.UndefOr[Boolean] = js.undefined
    
    var logLevel: js.UndefOr[String] = js.undefined
    
    var onComponentCreate: js.UndefOr[js.Function2[/* type */ Any, /* displayName */ String, Any]] = js.undefined
    
    var onComponentRegister: js.UndefOr[
        js.Function3[/* type */ Any, /* uniqueLocalName */ String, /* fileName */ String, Any]
      ] = js.undefined
    
    var pureRender: js.UndefOr[Boolean] = js.undefined
    
    var pureSFC: js.UndefOr[Boolean] = js.undefined
    
    var reloadHooks: js.UndefOr[Boolean] = js.undefined
    
    var showReactDomPatchNotification: js.UndefOr[Boolean] = js.undefined
    
    var trackTailUpdates: js.UndefOr[Boolean] = js.undefined
  }
  object PartialConfig {
    
    inline def apply(): PartialConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialConfig] (val x: Self) extends AnyVal {
      
      inline def setAllowSFC(value: Boolean): Self = StObject.set(x, "allowSFC", value.asInstanceOf[js.Any])
      
      inline def setAllowSFCUndefined: Self = StObject.set(x, "allowSFC", js.undefined)
      
      inline def setDisableHotRenderer(value: Boolean): Self = StObject.set(x, "disableHotRenderer", value.asInstanceOf[js.Any])
      
      inline def setDisableHotRendererUndefined: Self = StObject.set(x, "disableHotRenderer", js.undefined)
      
      inline def setDisableHotRendererWhenInjected(value: Boolean): Self = StObject.set(x, "disableHotRendererWhenInjected", value.asInstanceOf[js.Any])
      
      inline def setDisableHotRendererWhenInjectedUndefined: Self = StObject.set(x, "disableHotRendererWhenInjected", js.undefined)
      
      inline def setErrorOverlay(value: ComponentType[Errors]): Self = StObject.set(x, "ErrorOverlay", value.asInstanceOf[js.Any])
      
      inline def setErrorOverlayUndefined: Self = StObject.set(x, "ErrorOverlay", js.undefined)
      
      inline def setErrorReporter(value: ComponentType[HotError]): Self = StObject.set(x, "errorReporter", value.asInstanceOf[js.Any])
      
      inline def setErrorReporterUndefined: Self = StObject.set(x, "errorReporter", js.undefined)
      
      inline def setIgnoreComponents(value: Boolean): Self = StObject.set(x, "ignoreComponents", value.asInstanceOf[js.Any])
      
      inline def setIgnoreComponentsUndefined: Self = StObject.set(x, "ignoreComponents", js.undefined)
      
      inline def setIgnoreSFC(value: Boolean): Self = StObject.set(x, "ignoreSFC", value.asInstanceOf[js.Any])
      
      inline def setIgnoreSFCUndefined: Self = StObject.set(x, "ignoreSFC", js.undefined)
      
      inline def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setOnComponentCreate(value: (/* type */ Any, /* displayName */ String) => Any): Self = StObject.set(x, "onComponentCreate", js.Any.fromFunction2(value))
      
      inline def setOnComponentCreateUndefined: Self = StObject.set(x, "onComponentCreate", js.undefined)
      
      inline def setOnComponentRegister(value: (/* type */ Any, /* uniqueLocalName */ String, /* fileName */ String) => Any): Self = StObject.set(x, "onComponentRegister", js.Any.fromFunction3(value))
      
      inline def setOnComponentRegisterUndefined: Self = StObject.set(x, "onComponentRegister", js.undefined)
      
      inline def setPureRender(value: Boolean): Self = StObject.set(x, "pureRender", value.asInstanceOf[js.Any])
      
      inline def setPureRenderUndefined: Self = StObject.set(x, "pureRender", js.undefined)
      
      inline def setPureSFC(value: Boolean): Self = StObject.set(x, "pureSFC", value.asInstanceOf[js.Any])
      
      inline def setPureSFCUndefined: Self = StObject.set(x, "pureSFC", js.undefined)
      
      inline def setReloadHooks(value: Boolean): Self = StObject.set(x, "reloadHooks", value.asInstanceOf[js.Any])
      
      inline def setReloadHooksUndefined: Self = StObject.set(x, "reloadHooks", js.undefined)
      
      inline def setShowReactDomPatchNotification(value: Boolean): Self = StObject.set(x, "showReactDomPatchNotification", value.asInstanceOf[js.Any])
      
      inline def setShowReactDomPatchNotificationUndefined: Self = StObject.set(x, "showReactDomPatchNotification", js.undefined)
      
      inline def setTrackTailUpdates(value: Boolean): Self = StObject.set(x, "trackTailUpdates", value.asInstanceOf[js.Any])
      
      inline def setTrackTailUpdatesUndefined: Self = StObject.set(x, "trackTailUpdates", js.undefined)
    }
  }
}
