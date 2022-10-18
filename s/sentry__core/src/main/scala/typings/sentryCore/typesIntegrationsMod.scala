package typings.sentryCore

import typings.sentryCore.anon.PartialInboundFiltersOpti
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIntegrationsMod {
  
  @JSImport("@sentry/core/types/integrations", "FunctionToString")
  @js.native
  open class FunctionToString ()
    extends typings.sentryCore.typesIntegrationsFunctiontostringMod.FunctionToString
  /* static members */
  object FunctionToString {
    
    @JSImport("@sentry/core/types/integrations", "FunctionToString")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/core/types/integrations", "FunctionToString.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/core/types/integrations", "InboundFilters")
  @js.native
  open class InboundFilters ()
    extends typings.sentryCore.typesIntegrationsInboundfiltersMod.InboundFilters {
    def this(_options: PartialInboundFiltersOpti) = this()
  }
  /* static members */
  object InboundFilters {
    
    @JSImport("@sentry/core/types/integrations", "InboundFilters")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/core/types/integrations", "InboundFilters.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
}
