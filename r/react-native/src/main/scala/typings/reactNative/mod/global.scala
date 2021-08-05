package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("ErrorUtils")
  @js.native
  val ErrorUtils: typings.reactNative.mod.ErrorUtils = js.native
  
  @JSGlobal("HermesInternal")
  @js.native
  val HermesInternal: Null | js.Object = js.native
  
  @JSGlobal("__BUNDLE_START_TIME__")
  @js.native
  val __BUNDLE_START_TIME__ : Double = js.native
  
  /**
    * This variable is set to true when react-native is running in Dev mode
    * Typical usage:
    * <code> if (__DEV__) console.log('Running in dev mode')</code>
    */
  @JSGlobal("__DEV__")
  @js.native
  val __DEV__ : Boolean = js.native
  
  @JSGlobal("console")
  @js.native
  def console: Console_ = js.native
  inline def console_=(x: Console_): Unit = js.Dynamic.global.updateDynamic("console")(x.asInstanceOf[js.Any])
  
  /**
    * This contains the non-native `XMLHttpRequest` object, which you can use if you want to route network requests
    * through DevTools (to trace them):
    *
    *   global.XMLHttpRequest = global.originalXMLHttpRequest;
    *
    * @see https://github.com/facebook/react-native/issues/934
    */
  @JSGlobal("originalXMLHttpRequest")
  @js.native
  val originalXMLHttpRequest: js.Any = js.native
  
  @JSGlobal("require")
  @js.native
  def require: NodeRequire = js.native
  inline def require_=(x: NodeRequire): Unit = js.Dynamic.global.updateDynamic("require")(x.asInstanceOf[js.Any])
  
  /**
    * Console polyfill
    * @see https://reactnative.dev/docs/javascript-environment#polyfills
    */
  @js.native
  trait Console_ extends StObject {
    
    def debug(message: js.Any, optionalParams: js.Any*): Unit = js.native
    def debug(message: Unit, optionalParams: js.Any*): Unit = js.native
    
    /**
      * @deprecated Use LogBox.ignoreAllLogs(disable) instead
      */
    var disableYellowBox: Boolean = js.native
    
    def error(message: js.Any, optionalParams: js.Any*): Unit = js.native
    def error(message: Unit, optionalParams: js.Any*): Unit = js.native
    
    def group(): Unit = js.native
    def group(label: String): Unit = js.native
    
    def groupCollapsed(): Unit = js.native
    def groupCollapsed(label: String): Unit = js.native
    
    def groupEnd(): Unit = js.native
    
    /**
      * @deprecated Use LogBox.ignoreLogs(patterns) instead
      */
    var ignoredYellowBox: js.Array[String] = js.native
    
    def info(message: js.Any, optionalParams: js.Any*): Unit = js.native
    def info(message: Unit, optionalParams: js.Any*): Unit = js.native
    
    def log(message: js.Any, optionalParams: js.Any*): Unit = js.native
    def log(message: Unit, optionalParams: js.Any*): Unit = js.native
    
    def table(data: js.Any*): Unit = js.native
    
    def trace(message: js.Any, optionalParams: js.Any*): Unit = js.native
    def trace(message: Unit, optionalParams: js.Any*): Unit = js.native
    
    def warn(message: js.Any, optionalParams: js.Any*): Unit = js.native
    def warn(message: Unit, optionalParams: js.Any*): Unit = js.native
  }
  
  type NodeRequire = js.Function1[/* id */ String, js.Any]
}
