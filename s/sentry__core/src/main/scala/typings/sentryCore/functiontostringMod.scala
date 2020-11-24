package typings.sentryCore

import typings.sentryTypes.integrationMod.Integration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/core/dist/integrations/functiontostring", JSImport.Namespace)
@js.native
object functiontostringMod extends js.Object {
  
  @js.native
  class FunctionToString () extends Integration {
    
    /**
      * @inheritDoc
      */
    def setupOnce(): Unit = js.native
  }
  /* static members */
  @js.native
  object FunctionToString extends js.Object {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
}
