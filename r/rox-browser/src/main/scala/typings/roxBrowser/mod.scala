package typings.roxBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.roxBrowser.roxBrowserStrings.verbose
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rox-browser", "Configuration")
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
    
    // Unlock the Configuration value from changes from the last time it was freezed
    def unfreeze(): Unit = js.native
  }
  
  @JSImport("rox-browser", "Flag")
  @js.native
  class Flag () extends StObject {
    def this(defaultValue: Boolean) = this()
    def this(defaultValue: js.UndefOr[scala.Nothing], options: RoxFlagOptions) = this()
    def this(defaultValue: Boolean, options: RoxFlagOptions) = this()
    
    // Default value of the Flag
    val defaultValue: Boolean = js.native
    
    // Returns true when the flag is enabled
    def isEnabled(): Boolean = js.native
    def isEnabled(context: js.Any): Boolean = js.native
    
    // The name of the Flag
    val name: String = js.native
    
    // Unlock the Flag value from changes from the last time it was freezed
    def unfreeze(): Unit = js.native
  }
  
  @js.native
  sealed trait RoxFetcherStatus extends StObject
  @JSImport("rox-browser", "RoxFetcherStatus")
  @js.native
  object RoxFetcherStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RoxFetcherStatus with String] = js.native
    
    @js.native
    sealed trait AppliedFromCache extends RoxFetcherStatus
    /* "APPLIED_FROM_CACHE" */ val AppliedFromCache: typings.roxBrowser.mod.RoxFetcherStatus.AppliedFromCache with String = js.native
    
    @js.native
    sealed trait AppliedFromEmbedded extends RoxFetcherStatus
    /* "APPLIED_FROM_EMBEDDED" */ val AppliedFromEmbedded: typings.roxBrowser.mod.RoxFetcherStatus.AppliedFromEmbedded with String = js.native
    
    @js.native
    sealed trait AppliedFromNetwork extends RoxFetcherStatus
    /* "APPLIED_FROM_NETWORK" */ val AppliedFromNetwork: typings.roxBrowser.mod.RoxFetcherStatus.AppliedFromNetwork with String = js.native
    
    @js.native
    sealed trait ErrorFetchFailed extends RoxFetcherStatus
    /* "ERROR_FETCH_FAILED" */ val ErrorFetchFailed: typings.roxBrowser.mod.RoxFetcherStatus.ErrorFetchFailed with String = js.native
  }
  
  @js.native
  sealed trait RoxFlagFreezeLevel extends StObject
  @JSImport("rox-browser", "RoxFlagFreezeLevel")
  @js.native
  object RoxFlagFreezeLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RoxFlagFreezeLevel with String] = js.native
    
    @js.native
    sealed trait None extends RoxFlagFreezeLevel
    /* "none" */ val None: typings.roxBrowser.mod.RoxFlagFreezeLevel.None with String = js.native
    
    @js.native
    sealed trait UntilForeground extends RoxFlagFreezeLevel
    /* "untilForeground" */ val UntilForeground: typings.roxBrowser.mod.RoxFlagFreezeLevel.UntilForeground with String = js.native
    
    @js.native
    sealed trait UntilLaunch extends RoxFlagFreezeLevel
    /* "untilLaunch" */ val UntilLaunch: typings.roxBrowser.mod.RoxFlagFreezeLevel.UntilLaunch with String = js.native
  }
  
  @js.native
  sealed trait RoxOverridesPosition extends StObject
  @JSImport("rox-browser", "RoxOverridesPosition")
  @js.native
  object RoxOverridesPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RoxOverridesPosition with String] = js.native
    
    @js.native
    sealed trait BottomLeft extends RoxOverridesPosition
    /* "bottom left" */ val BottomLeft: typings.roxBrowser.mod.RoxOverridesPosition.BottomLeft with String = js.native
    
    @js.native
    sealed trait BottomRight extends RoxOverridesPosition
    /* "bottom right" */ val BottomRight: typings.roxBrowser.mod.RoxOverridesPosition.BottomRight with String = js.native
    
    @js.native
    sealed trait TopLeft extends RoxOverridesPosition
    /* "top left" */ val TopLeft: typings.roxBrowser.mod.RoxOverridesPosition.TopLeft with String = js.native
    
    @js.native
    sealed trait TopRight extends RoxOverridesPosition
    /* "top right" */ val TopRight: typings.roxBrowser.mod.RoxOverridesPosition.TopRight with String = js.native
  }
  
  @JSImport("rox-browser", "Variant")
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
    
    // Unlock the Variant value from changes from the last time it was freezed
    def unfreeze(): Unit = js.native
  }
  
  object dynamicApi {
    
    /**
      * Getting boolean value of a flag
      */
    @JSImport("rox-browser", "dynamicApi.isEnabled")
    @js.native
    def isEnabled(nameSpacedFlagName: String, defaultValue: Boolean): Boolean = js.native
    @JSImport("rox-browser", "dynamicApi.isEnabled")
    @js.native
    def isEnabled(nameSpacedFlagName: String, defaultValue: Boolean, context: js.Any): Boolean = js.native
    
    /**
      * Getting string value of a Variant flag
      */
    @JSImport("rox-browser", "dynamicApi.value")
    @js.native
    def value(nameSpacedFlagName: String, defaultValue: String): String = js.native
    @JSImport("rox-browser", "dynamicApi.value")
    @js.native
    def value(nameSpacedFlagName: String, defaultValue: String, context: js.Any): String = js.native
  }
  
  @JSImport("rox-browser", "fetch")
  @js.native
  def fetch(): Unit = js.native
  
  @JSImport("rox-browser", "flags")
  @js.native
  val flags: js.Array[Flag] = js.native
  
  object overrides {
    
    /**
      * Clears all override values
      */
    @JSImport("rox-browser", "overrides.clearAllOverrides")
    @js.native
    def clearAllOverrides(): Unit = js.native
    
    /**
      * Clears the override value from the flag (and the disk).
      *
      * https://support.rollout.io/docs/javascript-browser-api#section--rox-overrides-clearoverride-
      */
    @JSImport("rox-browser", "overrides.clearOverride")
    @js.native
    def clearOverride(nameSpacedFlagName: String): Unit = js.native
    
    @JSImport("rox-browser", "overrides.getOriginalValue")
    @js.native
    def getOriginalValue(nameSpacedFlagName: String): String = js.native
    
    /**
      * full flag name including namespace
      *
      * https://support.rollout.io/docs/javascript-browser-api#section--rox-overrides-hasoverride-
      */
    @JSImport("rox-browser", "overrides.hasOverride")
    @js.native
    def hasOverride(nameSpacedFlagName: String): Boolean = js.native
    
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
    @JSImport("rox-browser", "overrides.setOverride")
    @js.native
    def setOverride(nameSpacedFlagName: String, value: String): Unit = js.native
  }
  
  @JSImport("rox-browser", "register")
  @js.native
  def register(namespace: String, roxContainer: RoxContainer): Unit = js.native
  
  @JSImport("rox-browser", "setContext")
  @js.native
  def setContext(globalContext: js.Any): Unit = js.native
  
  @JSImport("rox-browser", "setCustomBooleanProperty")
  @js.native
  def setCustomBooleanProperty(name: String, value: js.Function1[/* context */ js.UndefOr[js.Any], Boolean]): Unit = js.native
  @JSImport("rox-browser", "setCustomBooleanProperty")
  @js.native
  def setCustomBooleanProperty(name: String, value: Boolean): Unit = js.native
  
  @JSImport("rox-browser", "setCustomNumberProperty")
  @js.native
  def setCustomNumberProperty(name: String, value: js.Function1[/* context */ js.UndefOr[js.Any], Double]): Unit = js.native
  @JSImport("rox-browser", "setCustomNumberProperty")
  @js.native
  def setCustomNumberProperty(name: String, value: Double): Unit = js.native
  
  @JSImport("rox-browser", "setCustomStringProperty")
  @js.native
  def setCustomStringProperty(name: String, value: String): Unit = js.native
  @JSImport("rox-browser", "setCustomStringProperty")
  @js.native
  def setCustomStringProperty(name: String, value: js.Function1[/* context */ js.UndefOr[js.Any], String]): Unit = js.native
  
  @JSImport("rox-browser", "setDynamicCustomPropertyRule")
  @js.native
  def setDynamicCustomPropertyRule(handler: js.Function2[/* propName */ String, /* context */ js.Any, Double | String | Boolean]): Unit = js.native
  
  @JSImport("rox-browser", "setup")
  @js.native
  def setup(apiKey: String): js.Promise[_] = js.native
  @JSImport("rox-browser", "setup")
  @js.native
  def setup(apiKey: String, options: RoxSetupOptions): js.Promise[_] = js.native
  
  @JSImport("rox-browser", "showOverrides")
  @js.native
  def showOverrides(): Unit = js.native
  @JSImport("rox-browser", "showOverrides")
  @js.native
  def showOverrides(position: RoxOverridesPosition): Unit = js.native
  
  @JSImport("rox-browser", "unfreeze")
  @js.native
  def unfreeze(): Unit = js.native
  @JSImport("rox-browser", "unfreeze")
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
    
    var freeze: js.UndefOr[RoxFlagFreezeLevel] = js.native
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
      def setFreeze(value: RoxFlagFreezeLevel): Self = StObject.set(x, "freeze", value.asInstanceOf[js.Any])
      
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
    
    // https://support.rollout.io/docs/javascript-browser-api#section-configurationfetchedhandler
    var configurationFetchedHandler: js.UndefOr[js.Function1[/* fetcherResult */ RoxFetcherResult, Unit]] = js.native
    
    var debugLevel: js.UndefOr[verbose] = js.native
    
    var devModeSecret: js.UndefOr[String] = js.native
    
    var disableNetworkFetch: js.UndefOr[Boolean] = js.native
    
    var freeze: js.UndefOr[RoxFlagFreezeLevel] = js.native
    
    // https://support.rollout.io/docs/javascript-browser-api#section-using-the-impressionhandler-option
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
      def setFreeze(value: RoxFlagFreezeLevel): Self = StObject.set(x, "freeze", value.asInstanceOf[js.Any])
      
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
