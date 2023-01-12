package typings.roxNode

import org.scalablytyped.runtime.StringDictionary
import typings.roxNode.roxNodeStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rox-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rox-node", "Flag")
  @js.native
  open class Flag () extends StObject {
    def this(defaultValue: Boolean) = this()
    
    // Default value of the Flag
    val defaultValue: Boolean = js.native
    
    // Returns true when the flag is enabled
    def isEnabled(): Boolean = js.native
    def isEnabled(context: Any): Boolean = js.native
    
    // The name of the Flag
    val name: String = js.native
  }
  
  @js.native
  sealed trait RoxErrorTrigger extends StObject
  @JSImport("rox-node", "RoxErrorTrigger")
  @js.native
  object RoxErrorTrigger extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RoxErrorTrigger & String] = js.native
    
    @js.native
    sealed trait CONFIGURATION_FETCHED_HANDLER
      extends StObject
         with RoxErrorTrigger
    /* "CONFIGURATION_FETCHED_HANDLER" */ val CONFIGURATION_FETCHED_HANDLER: typings.roxNode.mod.RoxErrorTrigger.CONFIGURATION_FETCHED_HANDLER & String = js.native
    
    @js.native
    sealed trait CUSTOM_PROPERTY_GENERATOR
      extends StObject
         with RoxErrorTrigger
    /* "CUSTOM_PROPERTY_GENERATOR" */ val CUSTOM_PROPERTY_GENERATOR: typings.roxNode.mod.RoxErrorTrigger.CUSTOM_PROPERTY_GENERATOR & String = js.native
    
    @js.native
    sealed trait DYNAMIC_PROPERTIES_RULE
      extends StObject
         with RoxErrorTrigger
    /* "DYNAMIC_PROPERTIES_RULE" */ val DYNAMIC_PROPERTIES_RULE: typings.roxNode.mod.RoxErrorTrigger.DYNAMIC_PROPERTIES_RULE & String = js.native
    
    @js.native
    sealed trait IMPRESSION_HANDLER
      extends StObject
         with RoxErrorTrigger
    /* "IMPRESSION_HANDLER" */ val IMPRESSION_HANDLER: typings.roxNode.mod.RoxErrorTrigger.IMPRESSION_HANDLER & String = js.native
  }
  
  @js.native
  sealed trait RoxFetcherStatus extends StObject
  @JSImport("rox-node", "RoxFetcherStatus")
  @js.native
  object RoxFetcherStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RoxFetcherStatus & String] = js.native
    
    @js.native
    sealed trait AppliedFromCache
      extends StObject
         with RoxFetcherStatus
    /* "APPLIED_FROM_CACHE" */ val AppliedFromCache: typings.roxNode.mod.RoxFetcherStatus.AppliedFromCache & String = js.native
    
    @js.native
    sealed trait AppliedFromEmbedded
      extends StObject
         with RoxFetcherStatus
    /* "APPLIED_FROM_EMBEDDED" */ val AppliedFromEmbedded: typings.roxNode.mod.RoxFetcherStatus.AppliedFromEmbedded & String = js.native
    
    @js.native
    sealed trait AppliedFromNetwork
      extends StObject
         with RoxFetcherStatus
    /* "APPLIED_FROM_NETWORK" */ val AppliedFromNetwork: typings.roxNode.mod.RoxFetcherStatus.AppliedFromNetwork & String = js.native
    
    @js.native
    sealed trait ErrorFetchFailed
      extends StObject
         with RoxFetcherStatus
    /* "ERROR_FETCH_FAILED" */ val ErrorFetchFailed: typings.roxNode.mod.RoxFetcherStatus.ErrorFetchFailed & String = js.native
  }
  
  @JSImport("rox-node", "RoxNumber")
  @js.native
  open class RoxNumber protected () extends StObject {
    def this(defaultValue: Double) = this()
    def this(defaultValue: Double, options: js.Array[Double]) = this()
    
    // Default value of the number flag
    val defaultValue: Double = js.native
    
    // Returns the current value of the number flag, accounting for value overrides
    def getValue(): Double = js.native
    def getValue(context: Any): Double = js.native
    
    // The name of the number flag
    val name: String = js.native
  }
  
  @JSImport("rox-node", "RoxString")
  @js.native
  open class RoxString protected () extends StObject {
    def this(defaultValue: String) = this()
    def this(defaultValue: String, options: js.Array[String]) = this()
    
    // Default value of the string flag
    val defaultValue: String = js.native
    
    // Returns the current value of the string flag, accounting for value overrides
    def getValue(): String = js.native
    def getValue(context: Any): String = js.native
    
    // The name of the string flag
    val name: String = js.native
  }
  
  object dynamicApi {
    
    @JSImport("rox-node", "dynamicApi")
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
  
  inline def fetch(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")().asInstanceOf[Unit]
  
  @JSImport("rox-node", "flags")
  @js.native
  val flags: js.Array[Flag] = js.native
  
  object overrides {
    
    @JSImport("rox-node", "overrides")
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
  
  inline def register(namespace: String, roxContainer: RoxContainer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(namespace.asInstanceOf[js.Any], roxContainer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def register(roxContainer: RoxContainer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(roxContainer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setContext(globalContext: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(globalContext.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setCustomBooleanProperty(name: String, value: js.Function1[/* context */ js.UndefOr[Any], Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomBooleanProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setCustomBooleanProperty(name: String, value: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomBooleanProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setCustomNumberProperty(name: String, value: js.Function1[/* context */ js.UndefOr[Any], Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomNumberProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setCustomNumberProperty(name: String, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomNumberProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setCustomStringProperty(name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomStringProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setCustomStringProperty(name: String, value: js.Function1[/* context */ js.UndefOr[Any], String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomStringProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setUserspaceUnhandledErrorHandler(handler: js.Function2[/* errorTrigger */ RoxErrorTrigger, /* error */ js.Error, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserspaceUnhandledErrorHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setup(apiKey: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(apiKey.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def setup(apiKey: String, options: RoxSetupOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(apiKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  type RoxContainer = StringDictionary[Flag | RoxNumber | RoxString]
  
  trait RoxFetcherResult extends StObject {
    
    var creationDate: js.Date
    
    var errorDetails: js.UndefOr[String] = js.undefined
    
    var fetcherStatus: RoxFetcherStatus
    
    var hasChanges: Boolean
  }
  object RoxFetcherResult {
    
    inline def apply(creationDate: js.Date, fetcherStatus: RoxFetcherStatus, hasChanges: Boolean): RoxFetcherResult = {
      val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], fetcherStatus = fetcherStatus.asInstanceOf[js.Any], hasChanges = hasChanges.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoxFetcherResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoxFetcherResult] (val x: Self) extends AnyVal {
      
      inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      inline def setErrorDetails(value: String): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
      
      inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
      
      inline def setFetcherStatus(value: RoxFetcherStatus): Self = StObject.set(x, "fetcherStatus", value.asInstanceOf[js.Any])
      
      inline def setHasChanges(value: Boolean): Self = StObject.set(x, "hasChanges", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoxReporting extends StObject {
    
    var name: String
    
    var targeting: Boolean
    
    var value: String
  }
  object RoxReporting {
    
    inline def apply(name: String, targeting: Boolean, value: String): RoxReporting = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], targeting = targeting.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoxReporting]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoxReporting] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTargeting(value: Boolean): Self = StObject.set(x, "targeting", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoxSetupOptions extends StObject {
    
    // https://docs.cloudbees.com/docs/cloudbees-feature-flags/latest/reporting/configuration-fetched-handler
    var configurationFetchedHandler: js.UndefOr[js.Function1[/* fetcherResult */ RoxFetcherResult, Unit]] = js.undefined
    
    var debugLevel: js.UndefOr[verbose] = js.undefined
    
    var devModeSecret: js.UndefOr[String] = js.undefined
    
    var disableNetworkFetch: js.UndefOr[Boolean] = js.undefined
    
    // https://docs.cloudbees.com/docs/cloudbees-feature-flags-api/latest/api-reference/nodejs-api#_dynamicpropertyrulehandler
    var dynamicPropertyRuleHandler: js.UndefOr[js.Function2[/* propName */ String, /* context */ Any, Any]] = js.undefined
    
    var fetchIntervalInSec: js.UndefOr[Double] = js.undefined
    
    // https://docs.cloudbees.com/docs/cloudbees-feature-flags-api/latest/api-reference/nodejs-api#_using_the_impressionhandler_option
    var impressionHandler: js.UndefOr[js.Function2[/* reporting */ RoxReporting, /* context */ Any, Unit]] = js.undefined
    
    var platform: js.UndefOr[String] = js.undefined
    
    /**
      * Set Roxy's URL for automated tests or local development.
      *
      * https://docs.cloudbees.com/docs/cloudbees-feature-flags/latest/debugging/microservices-automated-testing-and-local-development
      */
    var roxy: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object RoxSetupOptions {
    
    inline def apply(): RoxSetupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoxSetupOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoxSetupOptions] (val x: Self) extends AnyVal {
      
      inline def setConfigurationFetchedHandler(value: /* fetcherResult */ RoxFetcherResult => Unit): Self = StObject.set(x, "configurationFetchedHandler", js.Any.fromFunction1(value))
      
      inline def setConfigurationFetchedHandlerUndefined: Self = StObject.set(x, "configurationFetchedHandler", js.undefined)
      
      inline def setDebugLevel(value: verbose): Self = StObject.set(x, "debugLevel", value.asInstanceOf[js.Any])
      
      inline def setDebugLevelUndefined: Self = StObject.set(x, "debugLevel", js.undefined)
      
      inline def setDevModeSecret(value: String): Self = StObject.set(x, "devModeSecret", value.asInstanceOf[js.Any])
      
      inline def setDevModeSecretUndefined: Self = StObject.set(x, "devModeSecret", js.undefined)
      
      inline def setDisableNetworkFetch(value: Boolean): Self = StObject.set(x, "disableNetworkFetch", value.asInstanceOf[js.Any])
      
      inline def setDisableNetworkFetchUndefined: Self = StObject.set(x, "disableNetworkFetch", js.undefined)
      
      inline def setDynamicPropertyRuleHandler(value: (/* propName */ String, /* context */ Any) => Any): Self = StObject.set(x, "dynamicPropertyRuleHandler", js.Any.fromFunction2(value))
      
      inline def setDynamicPropertyRuleHandlerUndefined: Self = StObject.set(x, "dynamicPropertyRuleHandler", js.undefined)
      
      inline def setFetchIntervalInSec(value: Double): Self = StObject.set(x, "fetchIntervalInSec", value.asInstanceOf[js.Any])
      
      inline def setFetchIntervalInSecUndefined: Self = StObject.set(x, "fetchIntervalInSec", js.undefined)
      
      inline def setImpressionHandler(value: (/* reporting */ RoxReporting, /* context */ Any) => Unit): Self = StObject.set(x, "impressionHandler", js.Any.fromFunction2(value))
      
      inline def setImpressionHandlerUndefined: Self = StObject.set(x, "impressionHandler", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setRoxy(value: String): Self = StObject.set(x, "roxy", value.asInstanceOf[js.Any])
      
      inline def setRoxyUndefined: Self = StObject.set(x, "roxy", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
