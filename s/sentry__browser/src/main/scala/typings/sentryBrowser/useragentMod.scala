package typings.sentryBrowser

import typings.sentryTypes.integrationMod.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useragentMod {
  
  @JSImport("@sentry/browser/dist/integrations/useragent", "UserAgent")
  @js.native
  class UserAgent () extends Integration {
    
    /**
      * @inheritDoc
      */
    def setupOnce(): Unit = js.native
  }
  /* static members */
  object UserAgent {
    
    @JSImport("@sentry/browser/dist/integrations/useragent", "UserAgent")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/dist/integrations/useragent", "UserAgent.id")
    @js.native
    def id: String = js.native
    @scala.inline
    def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
}
