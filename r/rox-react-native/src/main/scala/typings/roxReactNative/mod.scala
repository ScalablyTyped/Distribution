package typings.roxReactNative

import org.scalablytyped.runtime.StringDictionary
import typings.roxReactNative.roxReactNativeStrings.`false`
import typings.roxReactNative.roxReactNativeStrings.`true`
import typings.roxReactNative.roxReactNativeStrings.verbose
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rox-react-native", "Configuration")
  @js.native
  class Configuration[T /* <: String | Boolean | Double */] protected () extends StObject {
    def this(defaultValue: T) = this()
    
    // Default value of the Configuration
    val defaultValue: BasicType[T] = js.native
    
    // Returns the current value of the Configuration, accounting for value overrides
    def getValue(): BasicType[T] = js.native
    
    // The name of the Configuration
    val name: String = js.native
    
    // Unlock the Configuration value from changes from the last time it was freezed
    def unfreeze(): Unit = js.native
  }
  
  @JSImport("rox-react-native", "Flag")
  @js.native
  class Flag () extends StObject {
    def this(defaultValue: Boolean) = this()
    def this(defaultValue: js.UndefOr[scala.Nothing], options: RoxFlagOptions) = this()
    def this(defaultValue: Boolean, options: RoxFlagOptions) = this()
    
    // Default value of the Flag
    val defaultValue: Boolean = js.native
    
    // Returns true when the flag is enabled
    def isEnabled(): Boolean = js.native
    
    // The name of the Flag
    val name: String = js.native
    
    // Unlock the Flag value from changes from the last time it was freezed
    def unfreeze(): Unit = js.native
  }
  
  @js.native
  sealed trait FreezeOptions extends StObject
  @JSImport("rox-react-native", "FreezeOptions")
  @js.native
  object FreezeOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FreezeOptions with Double] = js.native
    
    @js.native
    sealed trait freezeOptionNone extends FreezeOptions
    /* 3 */ val freezeOptionNone: typings.roxReactNative.mod.FreezeOptions.freezeOptionNone with Double = js.native
    
    @js.native
    sealed trait freezeOptionUntilForeground extends FreezeOptions
    /* 2 */ val freezeOptionUntilForeground: typings.roxReactNative.mod.FreezeOptions.freezeOptionUntilForeground with Double = js.native
    
    @js.native
    sealed trait freezeOptionUntilLaunch extends FreezeOptions
    /* 1 */ val freezeOptionUntilLaunch: typings.roxReactNative.mod.FreezeOptions.freezeOptionUntilLaunch with Double = js.native
  }
  
  @js.native
  sealed trait RoxFetcherStatus extends StObject
  @JSImport("rox-react-native", "RoxFetcherStatus")
  @js.native
  object RoxFetcherStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RoxFetcherStatus with String] = js.native
    
    @js.native
    sealed trait AppliedFromCache extends RoxFetcherStatus
    /* "APPLIED_FROM_CACHE" */ val AppliedFromCache: typings.roxReactNative.mod.RoxFetcherStatus.AppliedFromCache with String = js.native
    
    @js.native
    sealed trait AppliedFromEmbedded extends RoxFetcherStatus
    /* "APPLIED_FROM_EMBEDDED" */ val AppliedFromEmbedded: typings.roxReactNative.mod.RoxFetcherStatus.AppliedFromEmbedded with String = js.native
    
    @js.native
    sealed trait AppliedFromNetwork extends RoxFetcherStatus
    /* "APPLIED_FROM_NETWORK" */ val AppliedFromNetwork: typings.roxReactNative.mod.RoxFetcherStatus.AppliedFromNetwork with String = js.native
    
    @js.native
    sealed trait ErrorFetchFailed extends RoxFetcherStatus
    /* "ERROR_FETCH_FAILED" */ val ErrorFetchFailed: typings.roxReactNative.mod.RoxFetcherStatus.ErrorFetchFailed with String = js.native
  }
  
  @JSImport("rox-react-native", "Variant")
  @js.native
  class Variant[T /* <: String */] protected () extends StObject {
    def this(defaultValue: T, options: js.Array[T]) = this()
    def this(defaultValue: T, options: js.Array[T], name: String) = this()
    
    // Default value of the Variant
    val defaultValue: BasicType[T] = js.native
    
    // Returns the current value of the Variant, accounting for value overrides
    def getValue(): BasicType[T] = js.native
    
    // The name of the Flag
    val name: String = js.native
    
    // Unlock the Flag value from changes from the last time it was freezed
    def unfreeze(): Unit = js.native
  }
  
  object dynamicApi {
    
    /**
      * Getting boolean value of a flag
      */
    @JSImport("rox-react-native", "dynamicApi.isEnabled")
    @js.native
    def isEnabled(nameSpacedFlagName: String, defaultValue: Boolean): Boolean = js.native
    @JSImport("rox-react-native", "dynamicApi.isEnabled")
    @js.native
    def isEnabled(nameSpacedFlagName: String, defaultValue: Boolean, context: js.Any): Boolean = js.native
    
    /**
      * Getting string value of a Variant flag
      */
    @JSImport("rox-react-native", "dynamicApi.value")
    @js.native
    def value(nameSpacedFlagName: String, defaultValue: String): String = js.native
    @JSImport("rox-react-native", "dynamicApi.value")
    @js.native
    def value(nameSpacedFlagName: String, defaultValue: String, context: js.Any): String = js.native
  }
  
  @JSImport("rox-react-native", "fetch")
  @js.native
  def fetch(): Unit = js.native
  
  @JSImport("rox-react-native", "flags")
  @js.native
  val flags: js.Array[Flag] = js.native
  
  object overrides {
    
    /**
      * Clears the override value from the flag (and the disk).
      *
      * https://support.rollout.io/docs/reactnative#section--rox-overrides-clearoverride-
      */
    @JSImport("rox-react-native", "overrides.clearOverride")
    @js.native
    def clearOverride(nameSpacedFlagName: String): Unit = js.native
    
    @JSImport("rox-react-native", "overrides.getOriginalValue")
    @js.native
    def getOriginalValue(nameSpacedFlagName: String): String = js.native
    
    /**
      * full flag name including namespace
      *
      * https://support.rollout.io/docs/reactnative#section--rox-overrides-hasoverride-
      */
    @JSImport("rox-react-native", "overrides.hasOverride")
    @js.native
    def hasOverride(nameSpacedFlagName: String): Boolean = js.native
    
    /**
      * Sets an override value on a specific flag, this function accepts two parameters flag name (
      * full flag name including namespace) and desired value (from type String).
      * This function also saves the override value on the local device disk,
      * so it is "remembered" for the next the SDK is loaded to production.
      *
      * https://support.rollout.io/docs/reactnative#section--rox-overrides-setoverride-
      *
      * Note that for boolean flag we still give the value as a string.
      */
    @JSImport("rox-react-native", "overrides.setOverride")
    @js.native
    def setOverride(nameSpacedFlagName: String, value: String): Unit = js.native
    @JSImport("rox-react-native", "overrides.setOverride")
    @js.native
    def setOverride_false(nameSpacedFlagName: String, value: `false`): Unit = js.native
    @JSImport("rox-react-native", "overrides.setOverride")
    @js.native
    def setOverride_true(nameSpacedFlagName: String, value: `true`): Unit = js.native
  }
  
  @JSImport("rox-react-native", "register")
  @js.native
  def register(namespace: String, roxContainer: RoxContainer): Unit = js.native
  
  @JSImport("rox-react-native", "setCustomBooleanProperty")
  @js.native
  def setCustomBooleanProperty(name: String, value: js.Function0[Boolean]): Unit = js.native
  @JSImport("rox-react-native", "setCustomBooleanProperty")
  @js.native
  def setCustomBooleanProperty(name: String, value: Boolean): Unit = js.native
  
  @JSImport("rox-react-native", "setCustomNumberProperty")
  @js.native
  def setCustomNumberProperty(name: String, value: js.Function0[Double]): Unit = js.native
  @JSImport("rox-react-native", "setCustomNumberProperty")
  @js.native
  def setCustomNumberProperty(name: String, value: Double): Unit = js.native
  
  @JSImport("rox-react-native", "setCustomStringProperty")
  @js.native
  def setCustomStringProperty(name: String, value: String): Unit = js.native
  @JSImport("rox-react-native", "setCustomStringProperty")
  @js.native
  def setCustomStringProperty(name: String, value: js.Function0[String]): Unit = js.native
  
  @JSImport("rox-react-native", "setDynamicCustomPropertyRule")
  @js.native
  def setDynamicCustomPropertyRule(handler: js.Function2[/* propName */ String, /* context */ js.Any, Double | String | Boolean]): Unit = js.native
  
  @JSImport("rox-react-native", "setup")
  @js.native
  def setup(apiKey: String): js.Promise[_] = js.native
  @JSImport("rox-react-native", "setup")
  @js.native
  def setup(apiKey: String, options: RoxSetupOptions): js.Promise[_] = js.native
  
  @JSImport("rox-react-native", "unfreeze")
  @js.native
  def unfreeze(): Unit = js.native
  @JSImport("rox-react-native", "unfreeze")
  @js.native
  def unfreeze(namespace: String): Unit = js.native
  
  type BasicType[T] = String | Double | Boolean
  
  type RoxContainer = StringDictionary[Flag | Configuration[js.Any] | Variant[String]]
  
  @js.native
  trait RoxExperiment extends StObject {
    
    var identifier: String = js.native
    
    var isArchived: Boolean = js.native
    
    var labels: js.Array[String] = js.native
    
    //  experiment id
    var name: String = js.native
  }
  object RoxExperiment {
    
    @scala.inline
    def apply(identifier: String, isArchived: Boolean, labels: js.Array[String], name: String): RoxExperiment = {
      val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], isArchived = isArchived.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoxExperiment]
    }
    
    @scala.inline
    implicit class RoxExperimentMutableBuilder[Self <: RoxExperiment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsArchived(value: Boolean): Self = StObject.set(x, "isArchived", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RoxFetcherResult extends StObject {
    
    var creationDate: Date = js.native
    
    var errorDetails: js.UndefOr[String] = js.native
    
    var fetcherStatus: RoxFetcherStatus = js.native
    
    var hasChanges: Boolean = js.native
  }
  object RoxFetcherResult {
    
    @scala.inline
    def apply(creationDate: Date, fetcherStatus: RoxFetcherStatus, hasChanges: Boolean): RoxFetcherResult = {
      val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], fetcherStatus = fetcherStatus.asInstanceOf[js.Any], hasChanges = hasChanges.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoxFetcherResult]
    }
    
    @scala.inline
    implicit class RoxFetcherResultMutableBuilder[Self <: RoxFetcherResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreationDate(value: Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorDetails(value: String): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
      
      @scala.inline
      def setFetcherStatus(value: RoxFetcherStatus): Self = StObject.set(x, "fetcherStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasChanges(value: Boolean): Self = StObject.set(x, "hasChanges", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RoxFlagOptions extends StObject {
    
    var freeze: js.UndefOr[FreezeOptions] = js.native
  }
  object RoxFlagOptions {
    
    @scala.inline
    def apply(): RoxFlagOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoxFlagOptions]
    }
    
    @scala.inline
    implicit class RoxFlagOptionsMutableBuilder[Self <: RoxFlagOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFreeze(value: FreezeOptions): Self = StObject.set(x, "freeze", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreezeUndefined: Self = StObject.set(x, "freeze", js.undefined)
    }
  }
  
  @js.native
  trait RoxReporting extends StObject {
    
    var name: String = js.native
    
    var value: String = js.native
  }
  object RoxReporting {
    
    @scala.inline
    def apply(name: String, value: String): RoxReporting = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoxReporting]
    }
    
    @scala.inline
    implicit class RoxReportingMutableBuilder[Self <: RoxReporting] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RoxSetupOptions extends StObject {
    
    // https://support.rollout.io/docs/reactnative#section--asyncstorage-
    var AsyncStorage: js.UndefOr[js.Any] = js.native
    
    // https://support.rollout.io/docs/reactnative#section-configurationfetchedhandler
    var configurationFetchedHandler: js.UndefOr[js.Function1[/* fetcherResult */ RoxFetcherResult, Unit]] = js.native
    
    var debugLevel: js.UndefOr[verbose] = js.native
    
    var devModeSecret: js.UndefOr[String] = js.native
    
    var disableNetworkFetch: js.UndefOr[Boolean] = js.native
    
    var freeze: js.UndefOr[FreezeOptions] = js.native
    
    // https://support.rollout.io/docs/reactnative#section-using-the-impressionhandler-option
    var impressionHandler: js.UndefOr[
        js.Function3[
          /* reporting */ RoxReporting, 
          /* experiment */ RoxExperiment, 
          /* context */ js.Any, 
          Unit
        ]
      ] = js.native
    
    var platform: js.UndefOr[String] = js.native
    
    /**
      * Set Roxy's URL for automated tests or local development.
      *
      * https://support.rollout.io/docs/microservices-automated-testing-and-local-development
      */
    var roxy: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object RoxSetupOptions {
    
    @scala.inline
    def apply(): RoxSetupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoxSetupOptions]
    }
    
    @scala.inline
    implicit class RoxSetupOptionsMutableBuilder[Self <: RoxSetupOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsyncStorage(value: js.Any): Self = StObject.set(x, "AsyncStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncStorageUndefined: Self = StObject.set(x, "AsyncStorage", js.undefined)
      
      @scala.inline
      def setConfigurationFetchedHandler(value: /* fetcherResult */ RoxFetcherResult => Unit): Self = StObject.set(x, "configurationFetchedHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConfigurationFetchedHandlerUndefined: Self = StObject.set(x, "configurationFetchedHandler", js.undefined)
      
      @scala.inline
      def setDebugLevel(value: verbose): Self = StObject.set(x, "debugLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugLevelUndefined: Self = StObject.set(x, "debugLevel", js.undefined)
      
      @scala.inline
      def setDevModeSecret(value: String): Self = StObject.set(x, "devModeSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevModeSecretUndefined: Self = StObject.set(x, "devModeSecret", js.undefined)
      
      @scala.inline
      def setDisableNetworkFetch(value: Boolean): Self = StObject.set(x, "disableNetworkFetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableNetworkFetchUndefined: Self = StObject.set(x, "disableNetworkFetch", js.undefined)
      
      @scala.inline
      def setFreeze(value: FreezeOptions): Self = StObject.set(x, "freeze", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreezeUndefined: Self = StObject.set(x, "freeze", js.undefined)
      
      @scala.inline
      def setImpressionHandler(
        value: (/* reporting */ RoxReporting, /* experiment */ RoxExperiment, /* context */ js.Any) => Unit
      ): Self = StObject.set(x, "impressionHandler", js.Any.fromFunction3(value))
      
      @scala.inline
      def setImpressionHandlerUndefined: Self = StObject.set(x, "impressionHandler", js.undefined)
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setRoxy(value: String): Self = StObject.set(x, "roxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoxyUndefined: Self = StObject.set(x, "roxy", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
