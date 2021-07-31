package typings.sentryCore

import typings.sentryCore.anon.PartialInboundFiltersOpti
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object integrationsMod {
  
  @JSImport("@sentry/core/dist/integrations", "FunctionToString")
  @js.native
  class FunctionToString ()
    extends typings.sentryCore.functiontostringMod.FunctionToString
  /* static members */
  object FunctionToString {
    
    @JSImport("@sentry/core/dist/integrations", "FunctionToString")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/core/dist/integrations", "FunctionToString.id")
    @js.native
    def id: String = js.native
    @scala.inline
    def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/core/dist/integrations", "InboundFilters")
  @js.native
  class InboundFilters ()
    extends typings.sentryCore.inboundfiltersMod.InboundFilters {
    def this(_options: PartialInboundFiltersOpti) = this()
  }
  /* static members */
  object InboundFilters {
    
    @JSImport("@sentry/core/dist/integrations", "InboundFilters")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/core/dist/integrations", "InboundFilters.id")
    @js.native
    def id: String = js.native
    @scala.inline
    def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
}
