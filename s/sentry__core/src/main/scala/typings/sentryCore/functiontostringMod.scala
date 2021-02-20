package typings.sentryCore

import typings.sentryTypes.integrationMod.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functiontostringMod {
  
  @JSImport("@sentry/core/dist/integrations/functiontostring", "FunctionToString")
  @js.native
  class FunctionToString () extends Integration {
    
    /**
      * @inheritDoc
      */
    def setupOnce(): Unit = js.native
  }
  /* static members */
  object FunctionToString {
    
    @JSImport("@sentry/core/dist/integrations/functiontostring", "FunctionToString")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/core/dist/integrations/functiontostring", "FunctionToString.id")
    @js.native
    def id: String = js.native
    @scala.inline
    def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
}
