package typings.sentryHub

import typings.sentryHub.anon.Extensions
import typings.sentryHub.typesScopeMod.Scope
import typings.sentryTypes.typesClientMod.Client
import typings.sentryTypes.typesOptionsMod.ClientOptions
import typings.sentryTypes.typesSessionMod.Session
import typings.sentryTypes.typesSessionMod.SessionContext
import typings.sentryTypes.typesTransportMod.BaseTransportOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHubMod {
  
  @JSImport("@sentry/hub/types/hub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/hub/types/hub", "API_VERSION")
  @js.native
  val API_VERSION: /* 4 */ Double = js.native
  
  @JSImport("@sentry/hub/types/hub", "Hub")
  @js.native
  /**
    * Creates a new instance of the hub, will push one {@link Layer} into the
    * internal stack on creation.
    *
    * @param client bound to the hub.
    * @param scope bound to the hub.
    * @param version number, higher number means higher priority.
    */
  open class Hub ()
    extends StObject
       with typings.sentryTypes.typesHubMod.Hub {
    def this(client: Client[ClientOptions[BaseTransportOptions]]) = this()
    def this(client: Unit, scope: Scope) = this()
    def this(client: Client[ClientOptions[BaseTransportOptions]], scope: Scope) = this()
    def this(client: Unit, scope: Unit, _version: Double) = this()
    def this(client: Unit, scope: Scope, _version: Double) = this()
    def this(client: Client[ClientOptions[BaseTransportOptions]], scope: Unit, _version: Double) = this()
    def this(client: Client[ClientOptions[BaseTransportOptions]], scope: Scope, _version: Double) = this()
    
    /**
      * Calls global extension method and binding current instance to the function call
      */
    /* private */ var _callExtensionMethod: Any = js.native
    
    /** Contains the last event id of a captured event.  */
    /* private */ var _lastEventId: Any = js.native
    
    /**
      * Sends the current Session on the scope
      */
    /* private */ var _sendSessionUpdate: Any = js.native
    
    /** Is a {@link Layer}[] containing the client and scope */
    /* private */ val _stack: Any = js.native
    
    /* private */ val _version: Any = js.native
    
    /**
      * Internal helper function to call a method on the top client if it exists.
      *
      * @param method The method to call on the client.
      * @param args Arguments to pass to the client function.
      */
    /* private */ var _withClient: Any = js.native
    
    /** Returns the scope of the top stack. */
    def getScope(): js.UndefOr[Scope] = js.native
    
    /** Returns the scope stack for domains or the process. */
    def getStack(): js.Array[Layer] = js.native
    
    /** Returns the topmost scope layer in the order domain > local > process. */
    def getStackTop(): Layer = js.native
    
    /**
      * Returns if default PII should be sent to Sentry and propagated in ourgoing requests
      * when Tracing is used.
      */
    def shouldSendDefaultPii(): Boolean = js.native
    
    def startSession(context: SessionContext): Session = js.native
  }
  
  inline def getCurrentHub(): Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentHub")().asInstanceOf[Hub]
  
  inline def getHubFromCarrier(carrier: Carrier): Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("getHubFromCarrier")(carrier.asInstanceOf[js.Any]).asInstanceOf[Hub]
  
  inline def getMainCarrier(): Carrier = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainCarrier")().asInstanceOf[Carrier]
  
  inline def makeMain(hub: Hub): Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMain")(hub.asInstanceOf[js.Any]).asInstanceOf[Hub]
  
  inline def setHubOnCarrier(carrier: Carrier, hub: Hub): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setHubOnCarrier")(carrier.asInstanceOf[js.Any], hub.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Carrier extends StObject {
    
    var __SENTRY__ : js.UndefOr[Extensions] = js.undefined
  }
  object Carrier {
    
    inline def apply(): Carrier = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Carrier]
    }
    
    extension [Self <: Carrier](x: Self) {
      
      inline def set__SENTRY__(value: Extensions): Self = StObject.set(x, "__SENTRY__", value.asInstanceOf[js.Any])
      
      inline def set__SENTRY__Undefined: Self = StObject.set(x, "__SENTRY__", js.undefined)
    }
  }
  
  trait Layer extends StObject {
    
    var client: js.UndefOr[Client[ClientOptions[BaseTransportOptions]]] = js.undefined
    
    var scope: js.UndefOr[Scope] = js.undefined
  }
  object Layer {
    
    inline def apply(): Layer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Layer]
    }
    
    extension [Self <: Layer](x: Self) {
      
      inline def setClient(value: Client[ClientOptions[BaseTransportOptions]]): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
}
