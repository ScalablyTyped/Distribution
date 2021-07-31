package typings.roxBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.roxBrowser.roxBrowserStrings.verbose
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rox-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    def this(defaultValue: Boolean, options: RoxFlagOptions) = this()
    def this(defaultValue: Unit, options: RoxFlagOptions) = this()
    
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
    def apply(value: String): js.UndefOr[RoxFetcherStatus & String] = js.native
    
    @js.native
    sealed trait AppliedFromCache
      extends StObject
         with RoxFetcherStatus
    /* "APPLIED_FROM_CACHE" */ val AppliedFromCache: typings.roxBrowser.mod.RoxFetcherStatus.AppliedFromCache & String = js.native
    
    @js.native
    sealed trait AppliedFromEmbedded
      extends StObject
         with RoxFetcherStatus
    /* "APPLIED_FROM_EMBEDDED" */ val AppliedFromEmbedded: typings.roxBrowser.mod.RoxFetcherStatus.AppliedFromEmbedded & String = js.native
    
    @js.native
    sealed trait AppliedFromNetwork
      extends StObject
         with RoxFetcherStatus
    /* "APPLIED_FROM_NETWORK" */ val AppliedFromNetwork: typings.roxBrowser.mod.RoxFetcherStatus.AppliedFromNetwork & String = js.native
    
    @js.native
    sealed trait ErrorFetchFailed
      extends StObject
         with RoxFetcherStatus
    /* "ERROR_FETCH_FAILED" */ val ErrorFetchFailed: typings.roxBrowser.mod.RoxFetcherStatus.ErrorFetchFailed & String = js.native
  }
  
  @js.native
  sealed trait RoxFlagFreezeLevel extends StObject
  @JSImport("rox-browser", "RoxFlagFreezeLevel")
  @js.native
  object RoxFlagFreezeLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RoxFlagFreezeLevel & String] = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with RoxFlagFreezeLevel
    /* "none" */ val None: typings.roxBrowser.mod.RoxFlagFreezeLevel.None & String = js.native
    
    @js.native
    sealed trait UntilForeground
      extends StObject
         with RoxFlagFreezeLevel
    /* "untilForeground" */ val UntilForeground: typings.roxBrowser.mod.RoxFlagFreezeLevel.UntilForeground & String = js.native
    
    @js.native
    sealed trait UntilLaunch
      extends StObject
         with RoxFlagFreezeLevel
    /* "untilLaunch" */ val UntilLaunch: typings.roxBrowser.mod.RoxFlagFreezeLevel.UntilLaunch & String = js.native
  }
  
  @js.native
  sealed trait RoxOverridesPosition extends StObject
  @JSImport("rox-browser", "RoxOverridesPosition")
  @js.native
  object RoxOverridesPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RoxOverridesPosition & String] = js.native
    
    @js.native
    sealed trait BottomLeft
      extends StObject
         with RoxOverridesPosition
    /* "bottom left" */ val BottomLeft: typings.roxBrowser.mod.RoxOverridesPosition.BottomLeft & String = js.native
    
    @js.native
    sealed trait BottomRight
      extends StObject
         with RoxOverridesPosition
    /* "bottom right" */ val BottomRight: typings.roxBrowser.mod.RoxOverridesPosition.BottomRight & String = js.native
    
    @js.native
    sealed trait TopLeft
      extends StObject
         with RoxOverridesPosition
    /* "top left" */ val TopLeft: typings.roxBrowser.mod.RoxOverridesPosition.TopLeft & String = js.native
    
    @js.native
    sealed trait TopRight
      extends StObject
         with RoxOverridesPosition
    /* "top right" */ val TopRight: typings.roxBrowser.mod.RoxOverridesPosition.TopRight & String = js.native
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
    
    @JSImport("rox-browser", "dynamicApi")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Getting boolean value of a flag
      */
    @scala.inline
    def isEnabled(nameSpacedFlagName: String, defaultValue: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")(nameSpacedFlagName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def isEnabled(nameSpacedFlagName: String, defaultValue: Boolean, context: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")(nameSpacedFlagName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Getting string value of a Variant flag
      */
    @scala.inline
    def value(nameSpacedFlagName: String, defaultValue: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("value")(nameSpacedFlagName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def value(nameSpacedFlagName: String, defaultValue: String, context: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("value")(nameSpacedFlagName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @scala.inline
  def fetch(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")().asInstanceOf[Unit]
  
  @JSImport("rox-browser", "flags")
  @js.native
  val flags: js.Array[Flag] = js.native
  
  object overrides {
    
    @JSImport("rox-browser", "overrides")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Clears all override values
      */
    @scala.inline
    def clearAllOverrides(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAllOverrides")().asInstanceOf[Unit]
    
    /**
      * Clears the override value from the flag (and the disk).
      *
      * https://support.rollout.io/docs/javascript-browser-api#section--rox-overrides-clearoverride-
      */
    @scala.inline
    def clearOverride(nameSpacedFlagName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearOverride")(nameSpacedFlagName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def getOriginalValue(nameSpacedFlagName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOriginalValue")(nameSpacedFlagName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * full flag name including namespace
      *
      * https://support.rollout.io/docs/javascript-browser-api#section--rox-overrides-hasoverride-
      */
    @scala.inline
    def hasOverride(nameSpacedFlagName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasOverride")(nameSpacedFlagName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
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
    @scala.inline
    def setOverride(nameSpacedFlagName: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setOverride")(nameSpacedFlagName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @scala.inline
  def register(namespace: String, roxContainer: RoxContainer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(namespace.asInstanceOf[js.Any], roxContainer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setContext(globalContext: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(globalContext.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setCustomBooleanProperty(name: String, value: js.Function1[/* context */ js.UndefOr[js.Any], Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomBooleanProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setCustomBooleanProperty(name: String, value: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomBooleanProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setCustomNumberProperty(name: String, value: js.Function1[/* context */ js.UndefOr[js.Any], Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomNumberProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setCustomNumberProperty(name: String, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomNumberProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setCustomStringProperty(name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomStringProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setCustomStringProperty(name: String, value: js.Function1[/* context */ js.UndefOr[js.Any], String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomStringProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setDynamicCustomPropertyRule(handler: js.Function2[/* propName */ String, /* context */ js.Any, Double | String | Boolean]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDynamicCustomPropertyRule")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setup(apiKey: String): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(apiKey.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def setup(apiKey: String, options: RoxSetupOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(apiKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def showOverrides(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showOverrides")().asInstanceOf[Unit]
  @scala.inline
  def showOverrides(position: RoxOverridesPosition): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showOverrides")(position.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def unfreeze(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unfreeze")().asInstanceOf[Unit]
  @scala.inline
  def unfreeze(namespace: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unfreeze")(namespace.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
  
  trait RoxFetcherResult extends StObject {
    
    var creationDate: Date
    
    var errorDetails: js.UndefOr[String] = js.undefined
    
    var fetcherStatus: RoxFetcherStatus
    
    var hasChanges: Boolean
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
  
  trait RoxFlagOptions extends StObject {
    
    var freeze: js.UndefOr[RoxFlagFreezeLevel] = js.undefined
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
  
  trait RoxReporting extends StObject {
    
    var name: String
    
    var value: String
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
  
  trait RoxSetupOptions extends StObject {
    
    // https://support.rollout.io/docs/javascript-browser-api#section-configurationfetchedhandler
    var configurationFetchedHandler: js.UndefOr[js.Function1[/* fetcherResult */ RoxFetcherResult, Unit]] = js.undefined
    
    var debugLevel: js.UndefOr[verbose] = js.undefined
    
    var devModeSecret: js.UndefOr[String] = js.undefined
    
    var disableNetworkFetch: js.UndefOr[Boolean] = js.undefined
    
    var freeze: js.UndefOr[RoxFlagFreezeLevel] = js.undefined
    
    // https://support.rollout.io/docs/javascript-browser-api#section-using-the-impressionhandler-option
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
