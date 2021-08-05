package typings.sentryHub

import typings.sentryHub.interfacesMod.Carrier
import typings.sentryHub.interfacesMod.DomainAsCarrier
import typings.sentryHub.interfacesMod.Layer
import typings.sentryHub.scopeMod.Scope
import typings.sentryTypes.clientMod.Client
import typings.sentryTypes.optionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hubMod {
  
  @JSImport("@sentry/hub/dist/hub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/hub/dist/hub", "API_VERSION")
  @js.native
  val API_VERSION: /* 3 */ Double = js.native
  
  @JSImport("@sentry/hub/dist/hub", "Hub")
  @js.native
  /**
    * Creates a new instance of the hub, will push one {@link Layer} into the
    * internal stack on creation.
    *
    * @param client bound to the hub.
    * @param scope bound to the hub.
    * @param version number, higher number means higher priority.
    */
  class Hub ()
    extends StObject
       with typings.sentryTypes.hubMod.Hub {
    def this(client: Client[Options]) = this()
    def this(client: Unit, scope: Scope) = this()
    def this(client: Client[Options], scope: Scope) = this()
    def this(client: Unit, scope: Unit, _version: Double) = this()
    def this(client: Unit, scope: Scope, _version: Double) = this()
    def this(client: Client[Options], scope: Unit, _version: Double) = this()
    def this(client: Client[Options], scope: Scope, _version: Double) = this()
    
    /**
      * Calls global extension method and binding current instance to the function call
      */
    /* private */ var _callExtensionMethod: js.Any = js.native
    
    /**
      * Internal helper function to call a method on the top client if it exists.
      *
      * @param method The method to call on the client.
      * @param args Arguments to pass to the client function.
      */
    /* private */ var _invokeClient: js.Any = js.native
    
    /** Contains the last event id of a captured event.  */
    /* private */ var _lastEventId: js.Any = js.native
    
    /** Is a {@link Layer}[] containing the client and scope */
    /* private */ val _stack: js.Any = js.native
    
    /* private */ val _version: js.Any = js.native
    
    /** Returns the scope of the top stack. */
    def getScope(): js.UndefOr[Scope] = js.native
    
    /** Returns the scope stack for domains or the process. */
    def getStack(): js.Array[Layer] = js.native
    
    /** Returns the topmost scope layer in the order domain > local > process. */
    def getStackTop(): Layer = js.native
  }
  
  inline def getActiveDomain(): js.UndefOr[DomainAsCarrier] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveDomain")().asInstanceOf[js.UndefOr[DomainAsCarrier]]
  
  inline def getCurrentHub(): Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentHub")().asInstanceOf[Hub]
  
  inline def getHubFromCarrier(carrier: Carrier): Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("getHubFromCarrier")(carrier.asInstanceOf[js.Any]).asInstanceOf[Hub]
  
  inline def getMainCarrier(): Carrier = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainCarrier")().asInstanceOf[Carrier]
  
  inline def makeMain(hub: Hub): Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMain")(hub.asInstanceOf[js.Any]).asInstanceOf[Hub]
  
  inline def setHubOnCarrier(carrier: Carrier, hub: Hub): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setHubOnCarrier")(carrier.asInstanceOf[js.Any], hub.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
