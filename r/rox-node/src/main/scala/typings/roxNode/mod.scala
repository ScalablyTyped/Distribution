package typings.roxNode

import org.scalablytyped.runtime.StringDictionary
import typings.roxNode.roxNodeStrings.verbose
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rox-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rox-node", "Configuration")
  @js.native
  class Configuration[T /* <: Double | Boolean | String */] protected () extends StObject {
    def this(defaultValue: T) = this()
    
    // Default value of the Configuration
    val defaultValue: BasicType[T] = js.native
    
    // Returns the current value of the Configuration, accounting for value overrides
    def getValue(): BasicType[T] = js.native
    def getValue(context: js.Any): BasicType[T] = js.native
    
    // The name of the Configuration
    val name: String = js.native
  }
  
  @JSImport("rox-node", "Flag")
  @js.native
  class Flag () extends StObject {
    def this(defaultValue: Boolean) = this()
    
    // Default value of the Flag
    val defaultValue: Boolean = js.native
    
    // Returns true when the flag is enabled
    def isEnabled(): Boolean = js.native
    def isEnabled(context: js.Any): Boolean = js.native
    
    // The name of the Flag
    val name: String = js.native
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
  
  @JSImport("rox-node", "Variant")
  @js.native
  class Variant[T /* <: String */] protected () extends StObject {
    def this(defaultValue: T, options: js.Array[T]) = this()
    def this(defaultValue: T, options: js.Array[T], name: String) = this()
    
    // Default value of the Variant
    val defaultValue: BasicType[T] = js.native
    
    // Returns the current value of the Variant, accounting for value overrides
    def getValue(): BasicType[T] = js.native
    def getValue(context: js.Any): BasicType[T] = js.native
    
    // The name of the Variant
    val name: String = js.native
  }
  
  object dynamicApi {
    
    @JSImport("rox-node", "dynamicApi")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Getting boolean value of a flag
      */
    inline def isEnabled(nameSpacedFlagName: String, defaultValue: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")(nameSpacedFlagName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isEnabled(nameSpacedFlagName: String, defaultValue: Boolean, context: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")(nameSpacedFlagName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Getting string value of a Variant flag
      */
    inline def value(nameSpacedFlagName: String, defaultValue: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("value")(nameSpacedFlagName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def value(nameSpacedFlagName: String, defaultValue: String, context: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("value")(nameSpacedFlagName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
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
      * https://support.rollout.io/docs/javascript-browser-api#section--rox-overrides-clearoverride-
      */
    inline def clearOverride(nameSpacedFlagName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearOverride")(nameSpacedFlagName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getOriginalValue(nameSpacedFlagName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOriginalValue")(nameSpacedFlagName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * full flag name including namespace
      *
      * https://support.rollout.io/docs/javascript-browser-api#section--rox-overrides-hasoverride-
      */
    inline def hasOverride(nameSpacedFlagName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasOverride")(nameSpacedFlagName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Sets an override value on a specific flag, this function accepts two parameters flag name (
      * full flag name including namespace) and desired value (from type String).
      * This function also saves the override value on the local device disk,
      * so it is "remembered" for the next the SDK is loaded to production.
      *
      * https://support.rollout.io/docs/javascript-browser-api#section--rox-overrides-setoverride-
      *
      * Note that for boolean flag we still give the value as a string.
      */
    inline def setOverride(nameSpacedFlagName: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setOverride")(nameSpacedFlagName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def register(namespace: String, roxContainer: RoxContainer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(namespace.asInstanceOf[js.Any], roxContainer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setContext(globalContext: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(globalContext.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setCustomBooleanProperty(name: String, value: js.Function1[/* context */ js.UndefOr[js.Any], Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomBooleanProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setCustomBooleanProperty(name: String, value: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomBooleanProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setCustomNumberProperty(name: String, value: js.Function1[/* context */ js.UndefOr[js.Any], Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomNumberProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setCustomNumberProperty(name: String, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomNumberProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setCustomStringProperty(name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomStringProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setCustomStringProperty(name: String, value: js.Function1[/* context */ js.UndefOr[js.Any], String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomStringProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setDynamicCustomPropertyRule(handler: js.Function2[/* propName */ String, /* context */ js.Any, Double | String | Boolean]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDynamicCustomPropertyRule")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setup(apiKey: String): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(apiKey.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  inline def setup(apiKey: String, options: RoxSetupOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(apiKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  type BasicType[T] = String | Double | Boolean
  
  type RoxContainer = StringDictionary[Flag | Configuration[js.Any] | Variant[String]]
  
  trait RoxExperiment extends StObject {
    
    var identifier: String
    
    var isArchived: Boolean
    
    var labels: js.Array[String]
    
    //  experiment id
    var name: String
  }
  object RoxExperiment {
    
    inline def apply(identifier: String, isArchived: Boolean, labels: js.Array[String], name: String): RoxExperiment = {
      val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], isArchived = isArchived.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoxExperiment]
    }
    
    extension [Self <: RoxExperiment](x: Self) {
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setIsArchived(value: Boolean): Self = StObject.set(x, "isArchived", value.asInstanceOf[js.Any])
      
      inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoxFetcherResult extends StObject {
    
    var creationDate: Date
    
    var errorDetails: js.UndefOr[String] = js.undefined
    
    var fetcherStatus: RoxFetcherStatus
    
    var hasChanges: Boolean
  }
  object RoxFetcherResult {
    
    inline def apply(creationDate: Date, fetcherStatus: RoxFetcherStatus, hasChanges: Boolean): RoxFetcherResult = {
      val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], fetcherStatus = fetcherStatus.asInstanceOf[js.Any], hasChanges = hasChanges.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoxFetcherResult]
    }
    
    extension [Self <: RoxFetcherResult](x: Self) {
      
      inline def setCreationDate(value: Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      inline def setErrorDetails(value: String): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
      
      inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
      
      inline def setFetcherStatus(value: RoxFetcherStatus): Self = StObject.set(x, "fetcherStatus", value.asInstanceOf[js.Any])
      
      inline def setHasChanges(value: Boolean): Self = StObject.set(x, "hasChanges", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoxReporting extends StObject {
    
    var name: String
    
    var value: String
  }
  object RoxReporting {
    
    inline def apply(name: String, value: String): RoxReporting = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoxReporting]
    }
    
    extension [Self <: RoxReporting](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoxSetupOptions extends StObject {
    
    // https://support.rollout.io/docs/configuration-fetched-handler
    var configurationFetchedHandler: js.UndefOr[js.Function1[/* fetcherResult */ RoxFetcherResult, Unit]] = js.undefined
    
    var debugLevel: js.UndefOr[verbose] = js.undefined
    
    var devModeSecret: js.UndefOr[String] = js.undefined
    
    var disableNetworkFetch: js.UndefOr[Boolean] = js.undefined
    
    var fetchIntervalInSec: js.UndefOr[Double] = js.undefined
    
    // https://support.rollout.io/docs/nodejs-api#section-using-the-impressionhandler-option
    var impressionHandler: js.UndefOr[
        js.Function3[
          /* reporting */ RoxReporting, 
          /* experiment */ RoxExperiment, 
          /* context */ js.Any, 
          Unit
        ]
      ] = js.undefined
    
    var platform: js.UndefOr[String] = js.undefined
    
    /**
      * Set Roxy's URL for automated tests or local development.
      *
      * https://support.rollout.io/docs/microservices-automated-testing-and-local-development
      */
    var roxy: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object RoxSetupOptions {
    
    inline def apply(): RoxSetupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoxSetupOptions]
    }
    
    extension [Self <: RoxSetupOptions](x: Self) {
      
      inline def setConfigurationFetchedHandler(value: /* fetcherResult */ RoxFetcherResult => Unit): Self = StObject.set(x, "configurationFetchedHandler", js.Any.fromFunction1(value))
      
      inline def setConfigurationFetchedHandlerUndefined: Self = StObject.set(x, "configurationFetchedHandler", js.undefined)
      
      inline def setDebugLevel(value: verbose): Self = StObject.set(x, "debugLevel", value.asInstanceOf[js.Any])
      
      inline def setDebugLevelUndefined: Self = StObject.set(x, "debugLevel", js.undefined)
      
      inline def setDevModeSecret(value: String): Self = StObject.set(x, "devModeSecret", value.asInstanceOf[js.Any])
      
      inline def setDevModeSecretUndefined: Self = StObject.set(x, "devModeSecret", js.undefined)
      
      inline def setDisableNetworkFetch(value: Boolean): Self = StObject.set(x, "disableNetworkFetch", value.asInstanceOf[js.Any])
      
      inline def setDisableNetworkFetchUndefined: Self = StObject.set(x, "disableNetworkFetch", js.undefined)
      
      inline def setFetchIntervalInSec(value: Double): Self = StObject.set(x, "fetchIntervalInSec", value.asInstanceOf[js.Any])
      
      inline def setFetchIntervalInSecUndefined: Self = StObject.set(x, "fetchIntervalInSec", js.undefined)
      
      inline def setImpressionHandler(
        value: (/* reporting */ RoxReporting, /* experiment */ RoxExperiment, /* context */ js.Any) => Unit
      ): Self = StObject.set(x, "impressionHandler", js.Any.fromFunction3(value))
      
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
