package typings.reactHotLoader

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ErrorInfo
import typings.react.mod.ReactElement
import typings.reactHotLoader.anon.Errors
import typings.reactHotLoader.anon.PartialConfig
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-hot-loader", "AppContainer")
  @js.native
  class AppContainer protected ()
    extends Component[AppContainerProps with AppChildren, js.Object, js.Any] {
    def this(props: AppContainerProps with AppChildren) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AppContainerProps with AppChildren, context: js.Any) = this()
  }
  
  @JSImport("react-hot-loader", "areComponentsEqual")
  @js.native
  def areComponentsEqual[T](typeA: ComponentType[T], typeB: ComponentType[T]): Boolean = js.native
  
  @JSImport("react-hot-loader", "cold")
  @js.native
  def cold[T](component: T): T = js.native
  
  @JSImport("react-hot-loader", "hot")
  @js.native
  def hot(module: js.Any): js.Function2[
    /* Component */ ComponentType[_], 
    /* props */ js.UndefOr[AppContainerProps], 
    ComponentType[_]
  ] = js.native
  
  @JSImport("react-hot-loader", "setConfig")
  @js.native
  def setConfig(config: PartialConfig): Unit = js.native
  
  @js.native
  trait AppChildren extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
  }
  object AppChildren {
    
    @scala.inline
    def apply(): AppChildren = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppChildren]
    }
    
    @scala.inline
    implicit class AppChildrenMutableBuilder[Self <: AppChildren] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  @js.native
  trait AppContainerProps extends StObject {
    
    var errorBoundary: js.UndefOr[Boolean] = js.native
    
    var errorReporter: js.UndefOr[ComponentType[ErrorReporterProps]] = js.native
  }
  object AppContainerProps {
    
    @scala.inline
    def apply(): AppContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppContainerProps]
    }
    
    @scala.inline
    implicit class AppContainerPropsMutableBuilder[Self <: AppContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorBoundary(value: Boolean): Self = StObject.set(x, "errorBoundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorBoundaryUndefined: Self = StObject.set(x, "errorBoundary", js.undefined)
      
      @scala.inline
      def setErrorReporter(value: ComponentType[ErrorReporterProps]): Self = StObject.set(x, "errorReporter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorReporterUndefined: Self = StObject.set(x, "errorReporter", js.undefined)
    }
  }
  
  @js.native
  trait Config extends StObject {
    
    /**
      * Global error overlay
      */
    var ErrorOverlay: ComponentType[Errors] = js.native
    
    /**
      * Allows SFC to be used, enables "intermediate" components used by Relay, should be disabled for Preact
      */
    var allowSFC: Boolean = js.native
    
    /**
      * Disable "hot-replacement-render"
      */
    var disableHotRenderer: Boolean = js.native
    
    /**
      * Disable "hot-replacement-render" when injection into react-dom are made
      */
    var disableHotRendererWhenInjected: Boolean = js.native
    
    /**
      * default value for AppContainer errorOverlay
      */
    var errorReporter: ComponentType[HotError] = js.native
    
    /**
      * flag to completely disable RHL for Components
      */
    var ignoreComponents: Boolean = js.native
    
    /**
      * flag to completely disable RHL for SFC
      */
    var ignoreSFC: Boolean = js.native
    
    /**
      * Specify loglLevel, default to 'error', set it to false to disable logs.
      * Available levels: ['debug', 'log', 'warn', 'error']
      */
    var logLevel: String = js.native
    
    /**
      *
      * @param type {any} type being rendered. The first argument of React.createElement
      * @param displayName {string} type display name (if exists)
      */
    def onComponentCreate(`type`: js.Any, displayName: String): js.Any = js.native
    
    /**
      *
      * @param {any} type being registered. This could be ANY top level variable among project.
      * @param {string} uniqueLocalName - variable name
      * @param {string} fileName - origin file
      * @return {any}
      */
    def onComponentRegister(`type`: js.Any, uniqueLocalName: String, fileName: String): js.Any = js.native
    
    /**
      * keep render method unpatched, moving sideEffect to componentDidUpdate
      */
    var pureRender: Boolean = js.native
    
    /**
      *  Allows using SFC without changes. leading to some components not updated
      */
    var pureSFC: Boolean = js.native
    
    /**
      * enables or disables hooks treatment
      */
    var reloadHooks: Boolean = js.native
    
    /**
      * Show "hot-loader/react-dom" warning
      */
    var showReactDomPatchNotification: Boolean = js.native
    
    /**
      * Controls tail(deferred) update checking
      */
    var trackTailUpdates: Boolean = js.native
  }
  object Config {
    
    @scala.inline
    def apply(
      ErrorOverlay: ComponentType[Errors],
      allowSFC: Boolean,
      disableHotRenderer: Boolean,
      disableHotRendererWhenInjected: Boolean,
      errorReporter: ComponentType[HotError],
      ignoreComponents: Boolean,
      ignoreSFC: Boolean,
      logLevel: String,
      onComponentCreate: (js.Any, String) => js.Any,
      onComponentRegister: (js.Any, String, String) => js.Any,
      pureRender: Boolean,
      pureSFC: Boolean,
      reloadHooks: Boolean,
      showReactDomPatchNotification: Boolean,
      trackTailUpdates: Boolean
    ): Config = {
      val __obj = js.Dynamic.literal(ErrorOverlay = ErrorOverlay.asInstanceOf[js.Any], allowSFC = allowSFC.asInstanceOf[js.Any], disableHotRenderer = disableHotRenderer.asInstanceOf[js.Any], disableHotRendererWhenInjected = disableHotRendererWhenInjected.asInstanceOf[js.Any], errorReporter = errorReporter.asInstanceOf[js.Any], ignoreComponents = ignoreComponents.asInstanceOf[js.Any], ignoreSFC = ignoreSFC.asInstanceOf[js.Any], logLevel = logLevel.asInstanceOf[js.Any], onComponentCreate = js.Any.fromFunction2(onComponentCreate), onComponentRegister = js.Any.fromFunction3(onComponentRegister), pureRender = pureRender.asInstanceOf[js.Any], pureSFC = pureSFC.asInstanceOf[js.Any], reloadHooks = reloadHooks.asInstanceOf[js.Any], showReactDomPatchNotification = showReactDomPatchNotification.asInstanceOf[js.Any], trackTailUpdates = trackTailUpdates.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowSFC(value: Boolean): Self = StObject.set(x, "allowSFC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableHotRenderer(value: Boolean): Self = StObject.set(x, "disableHotRenderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableHotRendererWhenInjected(value: Boolean): Self = StObject.set(x, "disableHotRendererWhenInjected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorOverlay(value: ComponentType[Errors]): Self = StObject.set(x, "ErrorOverlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorReporter(value: ComponentType[HotError]): Self = StObject.set(x, "errorReporter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreComponents(value: Boolean): Self = StObject.set(x, "ignoreComponents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreSFC(value: Boolean): Self = StObject.set(x, "ignoreSFC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnComponentCreate(value: (js.Any, String) => js.Any): Self = StObject.set(x, "onComponentCreate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnComponentRegister(value: (js.Any, String, String) => js.Any): Self = StObject.set(x, "onComponentRegister", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPureRender(value: Boolean): Self = StObject.set(x, "pureRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPureSFC(value: Boolean): Self = StObject.set(x, "pureSFC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReloadHooks(value: Boolean): Self = StObject.set(x, "reloadHooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowReactDomPatchNotification(value: Boolean): Self = StObject.set(x, "showReactDomPatchNotification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackTailUpdates(value: Boolean): Self = StObject.set(x, "trackTailUpdates", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ErrorReporterProps extends StObject {
    
    var error: js.Any = js.native
  }
  object ErrorReporterProps {
    
    @scala.inline
    def apply(error: js.Any): ErrorReporterProps = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorReporterProps]
    }
    
    @scala.inline
    implicit class ErrorReporterPropsMutableBuilder[Self <: ErrorReporterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HotError extends StObject {
    
    var error: Error = js.native
    
    var errorInfo: js.UndefOr[ErrorInfo] = js.native
  }
  object HotError {
    
    @scala.inline
    def apply(error: Error): HotError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[HotError]
    }
    
    @scala.inline
    implicit class HotErrorMutableBuilder[Self <: HotError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorInfo(value: ErrorInfo): Self = StObject.set(x, "errorInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorInfoUndefined: Self = StObject.set(x, "errorInfo", js.undefined)
    }
  }
}
