package typings.sentryBrowser

import typings.sentryTypes.integrationMod.Integration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/browser/dist/integrations/useragent", JSImport.Namespace)
@js.native
object useragentMod extends js.Object {
  
  @js.native
  class UserAgent () extends Integration {
    
    /**
      * @inheritDoc
      */
    def setupOnce(): Unit = js.native
  }
  /* static members */
  @js.native
  object UserAgent extends js.Object {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
}
