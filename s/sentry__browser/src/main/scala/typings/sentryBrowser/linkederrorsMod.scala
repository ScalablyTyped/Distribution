package typings.sentryBrowser

import typings.sentryBrowser.anon.Key
import typings.sentryTypes.integrationMod.Integration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/browser/dist/integrations/linkederrors", JSImport.Namespace)
@js.native
object linkederrorsMod extends js.Object {
  
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
  @js.native
  object LinkedErrors extends js.Object {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
}
