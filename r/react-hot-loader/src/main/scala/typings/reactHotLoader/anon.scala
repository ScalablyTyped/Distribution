package typings.reactHotLoader

import typings.react.mod.ComponentType
import typings.reactHotLoader.mod.HotError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Errors extends StObject {
    
    var errors: js.Array[HotError] = js.native
  }
  object Errors {
    
    @scala.inline
    def apply(errors: js.Array[HotError]): Errors = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errors]
    }
    
    @scala.inline
    implicit class ErrorsMutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[HotError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: HotError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Partial<react-hot-loader.react-hot-loader.Config> */
  @js.native
  trait PartialConfig extends StObject {
    
    var ErrorOverlay: js.UndefOr[ComponentType[Errors]] = js.native
    
    var allowSFC: js.UndefOr[Boolean] = js.native
    
    var disableHotRenderer: js.UndefOr[Boolean] = js.native
    
    var disableHotRendererWhenInjected: js.UndefOr[Boolean] = js.native
    
    var errorReporter: js.UndefOr[ComponentType[HotError]] = js.native
    
    var ignoreComponents: js.UndefOr[Boolean] = js.native
    
    var ignoreSFC: js.UndefOr[Boolean] = js.native
    
    var logLevel: js.UndefOr[String] = js.native
    
    var onComponentCreate: js.UndefOr[js.Function2[/* type */ js.Any, /* displayName */ String, _]] = js.native
    
    var onComponentRegister: js.UndefOr[
        js.Function3[/* type */ js.Any, /* uniqueLocalName */ String, /* fileName */ String, _]
      ] = js.native
    
    var pureRender: js.UndefOr[Boolean] = js.native
    
    var pureSFC: js.UndefOr[Boolean] = js.native
    
    var reloadHooks: js.UndefOr[Boolean] = js.native
    
    var showReactDomPatchNotification: js.UndefOr[Boolean] = js.native
    
    var trackTailUpdates: js.UndefOr[Boolean] = js.native
  }
  object PartialConfig {
    
    @scala.inline
    def apply(): PartialConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConfig]
    }
    
    @scala.inline
    implicit class PartialConfigMutableBuilder[Self <: PartialConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowSFC(value: Boolean): Self = StObject.set(x, "allowSFC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSFCUndefined: Self = StObject.set(x, "allowSFC", js.undefined)
      
      @scala.inline
      def setDisableHotRenderer(value: Boolean): Self = StObject.set(x, "disableHotRenderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableHotRendererUndefined: Self = StObject.set(x, "disableHotRenderer", js.undefined)
      
      @scala.inline
      def setDisableHotRendererWhenInjected(value: Boolean): Self = StObject.set(x, "disableHotRendererWhenInjected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableHotRendererWhenInjectedUndefined: Self = StObject.set(x, "disableHotRendererWhenInjected", js.undefined)
      
      @scala.inline
      def setErrorOverlay(value: ComponentType[Errors]): Self = StObject.set(x, "ErrorOverlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorOverlayUndefined: Self = StObject.set(x, "ErrorOverlay", js.undefined)
      
      @scala.inline
      def setErrorReporter(value: ComponentType[HotError]): Self = StObject.set(x, "errorReporter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorReporterUndefined: Self = StObject.set(x, "errorReporter", js.undefined)
      
      @scala.inline
      def setIgnoreComponents(value: Boolean): Self = StObject.set(x, "ignoreComponents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreComponentsUndefined: Self = StObject.set(x, "ignoreComponents", js.undefined)
      
      @scala.inline
      def setIgnoreSFC(value: Boolean): Self = StObject.set(x, "ignoreSFC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreSFCUndefined: Self = StObject.set(x, "ignoreSFC", js.undefined)
      
      @scala.inline
      def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setOnComponentCreate(value: (/* type */ js.Any, /* displayName */ String) => _): Self = StObject.set(x, "onComponentCreate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnComponentCreateUndefined: Self = StObject.set(x, "onComponentCreate", js.undefined)
      
      @scala.inline
      def setOnComponentRegister(value: (/* type */ js.Any, /* uniqueLocalName */ String, /* fileName */ String) => _): Self = StObject.set(x, "onComponentRegister", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnComponentRegisterUndefined: Self = StObject.set(x, "onComponentRegister", js.undefined)
      
      @scala.inline
      def setPureRender(value: Boolean): Self = StObject.set(x, "pureRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPureRenderUndefined: Self = StObject.set(x, "pureRender", js.undefined)
      
      @scala.inline
      def setPureSFC(value: Boolean): Self = StObject.set(x, "pureSFC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPureSFCUndefined: Self = StObject.set(x, "pureSFC", js.undefined)
      
      @scala.inline
      def setReloadHooks(value: Boolean): Self = StObject.set(x, "reloadHooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReloadHooksUndefined: Self = StObject.set(x, "reloadHooks", js.undefined)
      
      @scala.inline
      def setShowReactDomPatchNotification(value: Boolean): Self = StObject.set(x, "showReactDomPatchNotification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowReactDomPatchNotificationUndefined: Self = StObject.set(x, "showReactDomPatchNotification", js.undefined)
      
      @scala.inline
      def setTrackTailUpdates(value: Boolean): Self = StObject.set(x, "trackTailUpdates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackTailUpdatesUndefined: Self = StObject.set(x, "trackTailUpdates", js.undefined)
    }
  }
}
