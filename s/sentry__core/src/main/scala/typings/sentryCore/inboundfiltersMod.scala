package typings.sentryCore

import typings.sentryCore.anon.PartialInboundFiltersOpti
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.eventprocessorMod.EventProcessor
import typings.sentryTypes.hubMod.Hub
import typings.sentryTypes.integrationMod.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inboundfiltersMod {
  
  @JSImport("@sentry/core/types/integrations/inboundfilters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/core/types/integrations/inboundfilters", "InboundFilters")
  @js.native
  open class InboundFilters ()
    extends StObject
       with Integration {
    def this(_options: PartialInboundFiltersOpti) = this()
    
    /* private */ val _options: Any = js.native
    
    /**
      * Returns {@link IntegrationClass.id}
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Sets the integration up only once.
      * This takes no options on purpose, options should be passed in the constructor
      */
    /* CompleteClass */
    override def setupOnce(
      addGlobalEventProcessor: js.Function1[/* callback */ EventProcessor, Unit],
      getCurrentHub: js.Function0[Hub]
    ): Unit = js.native
  }
  /* static members */
  object InboundFilters {
    
    @JSImport("@sentry/core/types/integrations/inboundfilters", "InboundFilters")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/core/types/integrations/inboundfilters", "InboundFilters.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  inline def mergeOptions(): PartialInboundFiltersOpti = ^.asInstanceOf[js.Dynamic].applyDynamic("_mergeOptions")().asInstanceOf[PartialInboundFiltersOpti]
  inline def mergeOptions(internalOptions: Unit, clientOptions: PartialInboundFiltersOpti): PartialInboundFiltersOpti = (^.asInstanceOf[js.Dynamic].applyDynamic("_mergeOptions")(internalOptions.asInstanceOf[js.Any], clientOptions.asInstanceOf[js.Any])).asInstanceOf[PartialInboundFiltersOpti]
  inline def mergeOptions(internalOptions: PartialInboundFiltersOpti): PartialInboundFiltersOpti = ^.asInstanceOf[js.Dynamic].applyDynamic("_mergeOptions")(internalOptions.asInstanceOf[js.Any]).asInstanceOf[PartialInboundFiltersOpti]
  inline def mergeOptions(internalOptions: PartialInboundFiltersOpti, clientOptions: PartialInboundFiltersOpti): PartialInboundFiltersOpti = (^.asInstanceOf[js.Dynamic].applyDynamic("_mergeOptions")(internalOptions.asInstanceOf[js.Any], clientOptions.asInstanceOf[js.Any])).asInstanceOf[PartialInboundFiltersOpti]
  
  inline def shouldDropEvent(event: Event, options: PartialInboundFiltersOpti): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_shouldDropEvent")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait InboundFiltersOptions extends StObject {
    
    var allowUrls: js.Array[String | js.RegExp]
    
    var denyUrls: js.Array[String | js.RegExp]
    
    var ignoreErrors: js.Array[String | js.RegExp]
    
    var ignoreInternal: Boolean
  }
  object InboundFiltersOptions {
    
    inline def apply(
      allowUrls: js.Array[String | js.RegExp],
      denyUrls: js.Array[String | js.RegExp],
      ignoreErrors: js.Array[String | js.RegExp],
      ignoreInternal: Boolean
    ): InboundFiltersOptions = {
      val __obj = js.Dynamic.literal(allowUrls = allowUrls.asInstanceOf[js.Any], denyUrls = denyUrls.asInstanceOf[js.Any], ignoreErrors = ignoreErrors.asInstanceOf[js.Any], ignoreInternal = ignoreInternal.asInstanceOf[js.Any])
      __obj.asInstanceOf[InboundFiltersOptions]
    }
    
    extension [Self <: InboundFiltersOptions](x: Self) {
      
      inline def setAllowUrls(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "allowUrls", value.asInstanceOf[js.Any])
      
      inline def setAllowUrlsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "allowUrls", js.Array(value*))
      
      inline def setDenyUrls(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "denyUrls", value.asInstanceOf[js.Any])
      
      inline def setDenyUrlsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "denyUrls", js.Array(value*))
      
      inline def setIgnoreErrors(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
      
      inline def setIgnoreErrorsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "ignoreErrors", js.Array(value*))
      
      inline def setIgnoreInternal(value: Boolean): Self = StObject.set(x, "ignoreInternal", value.asInstanceOf[js.Any])
    }
  }
}
