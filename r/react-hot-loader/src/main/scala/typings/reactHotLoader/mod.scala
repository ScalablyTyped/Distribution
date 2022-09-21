package typings.reactHotLoader

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ErrorInfo
import typings.react.mod.ReactElement
import typings.reactHotLoader.anon.Errors
import typings.reactHotLoader.anon.PartialConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-hot-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-hot-loader", "AppContainer")
  @js.native
  open class AppContainer protected ()
    extends Component[AppContainerProps & AppChildren, js.Object, Any] {
    def this(props: AppContainerProps & AppChildren) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AppContainerProps & AppChildren, context: Any) = this()
  }
  
  inline def areComponentsEqual[T](typeA: ComponentType[T], typeB: ComponentType[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areComponentsEqual")(typeA.asInstanceOf[js.Any], typeB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def cold[T](component: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cold")(component.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def hot(module: Any): js.Function2[
    /* Component */ ComponentType[Any], 
    /* props */ js.UndefOr[AppContainerProps], 
    ComponentType[Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("hot")(module.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* Component */ ComponentType[Any], 
    /* props */ js.UndefOr[AppContainerProps], 
    ComponentType[Any]
  ]]
  
  inline def setConfig(config: PartialConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setConfig")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait AppChildren extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.undefined
  }
  object AppChildren {
    
    inline def apply(): AppChildren = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppChildren]
    }
    
    extension [Self <: AppChildren](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait AppContainerProps extends StObject {
    
    var errorBoundary: js.UndefOr[Boolean] = js.undefined
    
    var errorReporter: js.UndefOr[ComponentType[ErrorReporterProps]] = js.undefined
  }
  object AppContainerProps {
    
    inline def apply(): AppContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppContainerProps]
    }
    
    extension [Self <: AppContainerProps](x: Self) {
      
      inline def setErrorBoundary(value: Boolean): Self = StObject.set(x, "errorBoundary", value.asInstanceOf[js.Any])
      
      inline def setErrorBoundaryUndefined: Self = StObject.set(x, "errorBoundary", js.undefined)
      
      inline def setErrorReporter(value: ComponentType[ErrorReporterProps]): Self = StObject.set(x, "errorReporter", value.asInstanceOf[js.Any])
      
      inline def setErrorReporterUndefined: Self = StObject.set(x, "errorReporter", js.undefined)
    }
  }
  
  trait Config extends StObject {
    
    /**
      * Global error overlay
      */
    var ErrorOverlay: ComponentType[Errors]
    
    /**
      * Allows SFC to be used, enables "intermediate" components used by Relay, should be disabled for Preact
      */
    var allowSFC: Boolean
    
    /**
      * Disable "hot-replacement-render"
      */
    var disableHotRenderer: Boolean
    
    /**
      * Disable "hot-replacement-render" when injection into react-dom are made
      */
    var disableHotRendererWhenInjected: Boolean
    
    /**
      * default value for AppContainer errorOverlay
      */
    var errorReporter: ComponentType[HotError]
    
    /**
      * flag to completely disable RHL for Components
      */
    var ignoreComponents: Boolean
    
    /**
      * flag to completely disable RHL for SFC
      */
    var ignoreSFC: Boolean
    
    /**
      * Specify loglLevel, default to 'error', set it to false to disable logs.
      * Available levels: ['debug', 'log', 'warn', 'error']
      */
    var logLevel: String
    
    /**
      *
      * @param type {any} type being rendered. The first argument of React.createElement
      * @param displayName {string} type display name (if exists)
      */
    def onComponentCreate(`type`: Any, displayName: String): Any
    
    /**
      *
      * @param {any} type being registered. This could be ANY top level variable among project.
      * @param {string} uniqueLocalName - variable name
      * @param {string} fileName - origin file
      * @return {any}
      */
    def onComponentRegister(`type`: Any, uniqueLocalName: String, fileName: String): Any
    
    /**
      * keep render method unpatched, moving sideEffect to componentDidUpdate
      */
    var pureRender: Boolean
    
    /**
      *  Allows using SFC without changes. leading to some components not updated
      */
    var pureSFC: Boolean
    
    /**
      * enables or disables hooks treatment
      */
    var reloadHooks: Boolean
    
    /**
      * Show "hot-loader/react-dom" warning
      */
    var showReactDomPatchNotification: Boolean
    
    /**
      * Controls tail(deferred) update checking
      */
    var trackTailUpdates: Boolean
  }
  object Config {
    
    inline def apply(
      ErrorOverlay: ComponentType[Errors],
      allowSFC: Boolean,
      disableHotRenderer: Boolean,
      disableHotRendererWhenInjected: Boolean,
      errorReporter: ComponentType[HotError],
      ignoreComponents: Boolean,
      ignoreSFC: Boolean,
      logLevel: String,
      onComponentCreate: (Any, String) => Any,
      onComponentRegister: (Any, String, String) => Any,
      pureRender: Boolean,
      pureSFC: Boolean,
      reloadHooks: Boolean,
      showReactDomPatchNotification: Boolean,
      trackTailUpdates: Boolean
    ): Config = {
      val __obj = js.Dynamic.literal(ErrorOverlay = ErrorOverlay.asInstanceOf[js.Any], allowSFC = allowSFC.asInstanceOf[js.Any], disableHotRenderer = disableHotRenderer.asInstanceOf[js.Any], disableHotRendererWhenInjected = disableHotRendererWhenInjected.asInstanceOf[js.Any], errorReporter = errorReporter.asInstanceOf[js.Any], ignoreComponents = ignoreComponents.asInstanceOf[js.Any], ignoreSFC = ignoreSFC.asInstanceOf[js.Any], logLevel = logLevel.asInstanceOf[js.Any], onComponentCreate = js.Any.fromFunction2(onComponentCreate), onComponentRegister = js.Any.fromFunction3(onComponentRegister), pureRender = pureRender.asInstanceOf[js.Any], pureSFC = pureSFC.asInstanceOf[js.Any], reloadHooks = reloadHooks.asInstanceOf[js.Any], showReactDomPatchNotification = showReactDomPatchNotification.asInstanceOf[js.Any], trackTailUpdates = trackTailUpdates.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setAllowSFC(value: Boolean): Self = StObject.set(x, "allowSFC", value.asInstanceOf[js.Any])
      
      inline def setDisableHotRenderer(value: Boolean): Self = StObject.set(x, "disableHotRenderer", value.asInstanceOf[js.Any])
      
      inline def setDisableHotRendererWhenInjected(value: Boolean): Self = StObject.set(x, "disableHotRendererWhenInjected", value.asInstanceOf[js.Any])
      
      inline def setErrorOverlay(value: ComponentType[Errors]): Self = StObject.set(x, "ErrorOverlay", value.asInstanceOf[js.Any])
      
      inline def setErrorReporter(value: ComponentType[HotError]): Self = StObject.set(x, "errorReporter", value.asInstanceOf[js.Any])
      
      inline def setIgnoreComponents(value: Boolean): Self = StObject.set(x, "ignoreComponents", value.asInstanceOf[js.Any])
      
      inline def setIgnoreSFC(value: Boolean): Self = StObject.set(x, "ignoreSFC", value.asInstanceOf[js.Any])
      
      inline def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setOnComponentCreate(value: (Any, String) => Any): Self = StObject.set(x, "onComponentCreate", js.Any.fromFunction2(value))
      
      inline def setOnComponentRegister(value: (Any, String, String) => Any): Self = StObject.set(x, "onComponentRegister", js.Any.fromFunction3(value))
      
      inline def setPureRender(value: Boolean): Self = StObject.set(x, "pureRender", value.asInstanceOf[js.Any])
      
      inline def setPureSFC(value: Boolean): Self = StObject.set(x, "pureSFC", value.asInstanceOf[js.Any])
      
      inline def setReloadHooks(value: Boolean): Self = StObject.set(x, "reloadHooks", value.asInstanceOf[js.Any])
      
      inline def setShowReactDomPatchNotification(value: Boolean): Self = StObject.set(x, "showReactDomPatchNotification", value.asInstanceOf[js.Any])
      
      inline def setTrackTailUpdates(value: Boolean): Self = StObject.set(x, "trackTailUpdates", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorReporterProps extends StObject {
    
    var error: Any
  }
  object ErrorReporterProps {
    
    inline def apply(error: Any): ErrorReporterProps = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorReporterProps]
    }
    
    extension [Self <: ErrorReporterProps](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait HotError extends StObject {
    
    var error: js.Error
    
    var errorInfo: js.UndefOr[ErrorInfo] = js.undefined
  }
  object HotError {
    
    inline def apply(error: js.Error): HotError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[HotError]
    }
    
    extension [Self <: HotError](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorInfo(value: ErrorInfo): Self = StObject.set(x, "errorInfo", value.asInstanceOf[js.Any])
      
      inline def setErrorInfoUndefined: Self = StObject.set(x, "errorInfo", js.undefined)
    }
  }
}
