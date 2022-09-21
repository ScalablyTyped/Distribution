package typings.roxBrowser

import typings.roxBrowser.mod.RoxContainer
import typings.roxBrowser.mod.RoxErrorTrigger
import typings.roxBrowser.mod.RoxFlagOptions
import typings.roxBrowser.mod.RoxOverridesPosition
import typings.roxBrowser.mod.RoxSetupOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Rox {
    
    @JSGlobal("Rox")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Flag
      * https://docs.cloudbees.com/docs/cloudbees-feature-flags-api/latest/api-reference/javascript-browser-api#_rox_flag
      */
    @JSGlobal("Rox.Flag")
    @js.native
    open class Flag ()
      extends typings.roxBrowser.mod.Flag {
      def this(defaultValue: Boolean) = this()
      def this(defaultValue: Boolean, options: RoxFlagOptions) = this()
      def this(defaultValue: Unit, options: RoxFlagOptions) = this()
    }
    
    @JSGlobal("Rox.RoxErrorTrigger")
    @js.native
    object RoxErrorTrigger extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.roxBrowser.mod.RoxErrorTrigger & String] = js.native
      
      /* "CONFIGURATION_FETCHED_HANDLER" */ val CONFIGURATION_FETCHED_HANDLER: typings.roxBrowser.mod.RoxErrorTrigger.CONFIGURATION_FETCHED_HANDLER & String = js.native
      
      /* "CUSTOM_PROPERTY_GENERATOR" */ val CUSTOM_PROPERTY_GENERATOR: typings.roxBrowser.mod.RoxErrorTrigger.CUSTOM_PROPERTY_GENERATOR & String = js.native
      
      /* "DYNAMIC_PROPERTIES_RULE" */ val DYNAMIC_PROPERTIES_RULE: typings.roxBrowser.mod.RoxErrorTrigger.DYNAMIC_PROPERTIES_RULE & String = js.native
      
      /* "IMPRESSION_HANDLER" */ val IMPRESSION_HANDLER: typings.roxBrowser.mod.RoxErrorTrigger.IMPRESSION_HANDLER & String = js.native
    }
    
    @JSGlobal("Rox.RoxFetcherStatus")
    @js.native
    object RoxFetcherStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.roxBrowser.mod.RoxFetcherStatus & String] = js.native
      
      /* "APPLIED_FROM_CACHE" */ val AppliedFromCache: typings.roxBrowser.mod.RoxFetcherStatus.AppliedFromCache & String = js.native
      
      /* "APPLIED_FROM_EMBEDDED" */ val AppliedFromEmbedded: typings.roxBrowser.mod.RoxFetcherStatus.AppliedFromEmbedded & String = js.native
      
      /* "APPLIED_FROM_NETWORK" */ val AppliedFromNetwork: typings.roxBrowser.mod.RoxFetcherStatus.AppliedFromNetwork & String = js.native
      
      /* "ERROR_FETCH_FAILED" */ val ErrorFetchFailed: typings.roxBrowser.mod.RoxFetcherStatus.ErrorFetchFailed & String = js.native
    }
    
    /**
      * Default is none
      *
      * https://docs.cloudbees.com/docs/cloudbees-feature-flags/latest/feature-flags/flag-freeze
      */
    @JSGlobal("Rox.RoxFlagFreezeLevel")
    @js.native
    object RoxFlagFreezeLevel extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.roxBrowser.mod.RoxFlagFreezeLevel & String] = js.native
      
      /* "none" */ val None: typings.roxBrowser.mod.RoxFlagFreezeLevel.None & String = js.native
      
      /* "untilForeground" */ val UntilForeground: typings.roxBrowser.mod.RoxFlagFreezeLevel.UntilForeground & String = js.native
      
      /* "untilLaunch" */ val UntilLaunch: typings.roxBrowser.mod.RoxFlagFreezeLevel.UntilLaunch & String = js.native
    }
    
    /**
      * Used to create and manage Rollout feature flags that determine different predefined number values
      *
      * https://docs.cloudbees.com/docs/cloudbees-feature-flags-api/latest/api-reference/javascript-browser-api#_rox_roxnumber
      */
    @JSGlobal("Rox.RoxNumber")
    @js.native
    open class RoxNumber protected ()
      extends typings.roxBrowser.mod.RoxNumber {
      def this(defaultValue: Double) = this()
      def this(defaultValue: Double, options: js.Array[Double]) = this()
    }
    
    @JSGlobal("Rox.RoxOverridesPosition")
    @js.native
    object RoxOverridesPosition extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.roxBrowser.mod.RoxOverridesPosition & String] = js.native
      
      /* "bottom left" */ val BottomLeft: typings.roxBrowser.mod.RoxOverridesPosition.BottomLeft & String = js.native
      
      /* "bottom right" */ val BottomRight: typings.roxBrowser.mod.RoxOverridesPosition.BottomRight & String = js.native
      
      /* "top left" */ val TopLeft: typings.roxBrowser.mod.RoxOverridesPosition.TopLeft & String = js.native
      
      /* "top right" */ val TopRight: typings.roxBrowser.mod.RoxOverridesPosition.TopRight & String = js.native
    }
    
    /**
      * Used to create and manage Rollout feature flags that determine different predefined string values
      *
      * https://docs.cloudbees.com/docs/cloudbees-feature-flags-api/latest/api-reference/javascript-browser-api#_rox_roxstring
      */
    @JSGlobal("Rox.RoxString")
    @js.native
    open class RoxString protected ()
      extends typings.roxBrowser.mod.RoxString {
      def this(defaultValue: String) = this()
      def this(defaultValue: String, options: js.Array[String]) = this()
    }
    
    /**
      * Dynamic API is an alternative to Rollout static API for defining flags on the
      * different container objects and accessing them from that container object.
      * https://docs.cloudbees.com/docs/cloudbees-feature-flags-api/latest/api-reference/javascript-browser-api#_rox_dynamicapi
      */
    object dynamicApi {
      
      @JSGlobal("Rox.dynamicApi")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Getting string value of a number flag
        */
      inline def getNumber(nameSpacedFlagName: String, defaultValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getNumber")(nameSpacedFlagName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def getNumber(nameSpacedFlagName: String, defaultValue: Double, context: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getNumber")(nameSpacedFlagName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Getting boolean value of a flag
        */
      inline def isEnabled(nameSpacedFlagName: String, defaultValue: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")(nameSpacedFlagName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      inline def isEnabled(nameSpacedFlagName: String, defaultValue: Boolean, context: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")(nameSpacedFlagName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      /**
        * Getting string value of a string flag
        */
      inline def value(nameSpacedFlagName: String, defaultValue: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("value")(nameSpacedFlagName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[String]
      inline def value(nameSpacedFlagName: String, defaultValue: String, context: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("value")(nameSpacedFlagName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
    }
    
    /**
      * Pulls the latest configuration and flag values down from the Rollout servers
      *
      * https://docs.cloudbees.com/docs/cloudbees-feature-flags-api/latest/api-reference/javascript-browser-api#_fetch
      */
    inline def fetch(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")().asInstanceOf[Unit]
    
    @JSGlobal("Rox.flags")
    @js.native
    val flags: js.Array[typings.roxBrowser.mod.Flag] = js.native
    
    /**
      * Override: Should only be used for development purposes (QA - Feature dev - e2e)
      *
      * When you override an existing flag value using the Rox.overrides.setOverride method,
      * the SDK will disregard existing configuration coming from the dashboard and will
      * serialize the override on disk this value will be loaded and override the flag
      * right after you call Rox.setup. To clear the override from the cache you need to
      * call the Rox.overrides.clearOverride method
      *
      * https://docs.cloudbees.com/docs/cloudbees-feature-flags-api/latest/api-reference/javascript-browser-api#_rox_overrides
      */
    object overrides {
      
      @JSGlobal("Rox.overrides")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Clears all override values
        */
      inline def clearAllOverrides(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAllOverrides")().asInstanceOf[Unit]
      
      /**
        * Clears the override value from the flag (and the disk).
        *
        * https://docs.cloudbees.com/docs/cloudbees-feature-flags-api/latest/api-reference/javascript-browser-api#_rox_overrides_clearoverride
        */
      inline def clearOverride(nameSpacedFlagName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearOverride")(nameSpacedFlagName.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def getOriginalValue(nameSpacedFlagName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOriginalValue")(nameSpacedFlagName.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * full flag name including namespace
        *
        * https://docs.cloudbees.com/docs/cloudbees-feature-flags-api/latest/api-reference/javascript-browser-api#_rox_overrides_hasoverride
        */
      inline def hasOverride(nameSpacedFlagName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasOverride")(nameSpacedFlagName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Sets an override value on a specific flag, this function accepts two parameters flag name (
        * full flag name including namespace) and desired value (from type String).
        * This function also saves the override value on the local device disk,
        * so it is "remembered" for the next the SDK is loaded to production.
        *
        * https://docs.cloudbees.com/docs/cloudbees-feature-flags-api/latest/api-reference/javascript-browser-api#_rox_overrides_setoverride
        *
        * Note that for boolean flag we still give the value as a string.
        */
      inline def setOverride(nameSpacedFlagName: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setOverride")(nameSpacedFlagName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    /**
      * The register function should be called before the call to Rox.setup()
      *
      * https://docs.cloudbees.com/docs/cloudbees-feature-flags-api/latest/api-reference/javascript-browser-api#_register
      */
    inline def register(namespace: String, roxContainer: RoxContainer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(namespace.asInstanceOf[js.Any], roxContainer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def register(roxContainer: RoxContainer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(roxContainer.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Set Global Context.
      * You can think of Global Context as a default context
      *
      * https://docs.cloudbees.com/docs/cloudbees-feature-flags/latest/feature-releases/custom-properties#_global_context
      */
    inline def setContext(globalContext: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(globalContext.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setCustomBooleanProperty(name: String, value: js.Function1[/* context */ js.UndefOr[Any], Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomBooleanProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setCustomBooleanProperty(name: String, value: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomBooleanProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setCustomNumberProperty(name: String, value: js.Function1[/* context */ js.UndefOr[Any], Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomNumberProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Note that you might have to call unfreeze after setting custom properties such as email after login
      * https://docs.cloudbees.com/docs/cloudbees-feature-flags/latest/feature-releases/custom-properties
      */
    inline def setCustomNumberProperty(name: String, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomNumberProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setCustomStringProperty(name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomStringProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setCustomStringProperty(name: String, value: js.Function1[/* context */ js.UndefOr[Any], String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomStringProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    // https://docs.cloudbees.com/docs/cloudbees-feature-flags-api/latest/api-reference/javascript-browser-api#_setuserspaceunhandlederrorhandler
    inline def setUserspaceUnhandledErrorHandler(handler: js.Function2[/* errorTrigger */ RoxErrorTrigger, /* error */ js.Error, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserspaceUnhandledErrorHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Initiate connection with Rox servers for the application identified by the application key.
      * The registered containers will be synced and Rox entities will get the appropriate values.
      *
      * https://docs.cloudbees.com/docs/cloudbees-feature-flags-api/latest/api-reference/javascript-browser-api#_setup
      */
    inline def setup(apiKey: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(apiKey.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def setup(apiKey: String, options: RoxSetupOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(apiKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    /**
      * Opens the flag override view, providing a debug UI for the application's set of feature flags.
      * https://docs.cloudbees.com/docs/cloudbees-feature-flags-api/latest/api-reference/javascript-browser-api#_showoverrides
      */
    inline def showOverrides(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showOverrides")().asInstanceOf[Unit]
    inline def showOverrides(position: RoxOverridesPosition): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showOverrides")(position.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Unfreeze the state of all flags in code
      * Calling this function will unfreeze all flags, and using a flag will return it’s most updated value
      *
      * https://docs.cloudbees.com/docs/cloudbees-feature-flags/latest/feature-flags/flag-freeze#_flag_unfreeze
      * https://docs.cloudbees.com/docs/cloudbees-feature-flags-api/latest/api-reference/javascript-browser-api#_unfreeze_4
      */
    inline def unfreeze(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unfreeze")().asInstanceOf[Unit]
    inline def unfreeze(namespace: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unfreeze")(namespace.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
