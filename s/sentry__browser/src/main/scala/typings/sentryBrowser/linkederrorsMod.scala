package typings.sentryBrowser

import typings.sentryBrowser.anon.Key
import typings.sentryTypes.integrationMod.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkederrorsMod {
  
  @JSImport("@sentry/browser/dist/integrations/linkederrors", "LinkedErrors")
  @js.native
  /**
    * @inheritDoc
    */
  class LinkedErrors () extends Integration {
    def this(options: Key) = this()
    
    /**
      * @inheritDoc
      */
    var _handler: js.Any = js.native
    
    /**
      * @inheritDoc
      */
    val _key: js.Any = js.native
    
    /**
      * @inheritDoc
      */
    val _limit: js.Any = js.native
    
    /**
      * @inheritDoc
      */
    var _walkErrorTree: js.Any = js.native
    
    /**
      * @inheritDoc
      */
    def setupOnce(): Unit = js.native
  }
  /* static members */
  object LinkedErrors {
    
    @JSImport("@sentry/browser/dist/integrations/linkederrors", "LinkedErrors")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/dist/integrations/linkederrors", "LinkedErrors.id")
    @js.native
    def id: String = js.native
    @scala.inline
    def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
}
