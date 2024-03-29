package typings.sentryCore

import typings.sentryCore.anon.Acs
import typings.sentryCore.typesScopeMod.Scope
import typings.sentryTypes.typesClientMod.Client
import typings.sentryTypes.typesOptionsMod.ClientOptions
import typings.sentryTypes.typesSessionMod.Session
import typings.sentryTypes.typesSessionMod.SessionContext
import typings.sentryTypes.typesTransportMod.BaseTransportOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHubMod {
  
  @JSImport("@sentry/core/types/hub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/core/types/hub", "API_VERSION")
  @js.native
  val API_VERSION: /* 4 */ Double = js.native
  
  @JSImport("@sentry/core/types/hub", "Hub")
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
    def getScope(): Scope = js.native
    
    /** Returns the scope stack for domains or the process. */
    def getStack(): js.Array[Layer] = js.native
    
    /** Returns the topmost scope layer in the order domain > local > process. */
    def getStackTop(): Layer = js.native
    
    def startSession(context: SessionContext): Session = js.native
  }
  
  inline def ensureHubOnCarrier(carrier: Carrier): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureHubOnCarrier")(carrier.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def ensureHubOnCarrier(carrier: Carrier, parent: Hub): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureHubOnCarrier")(carrier.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getCurrentHub(): Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentHub")().asInstanceOf[Hub]
  
  inline def getHubFromCarrier(carrier: Carrier): Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("getHubFromCarrier")(carrier.asInstanceOf[js.Any]).asInstanceOf[Hub]
  
  inline def getMainCarrier(): Carrier = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainCarrier")().asInstanceOf[Carrier]
  
  inline def makeMain(hub: Hub): Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMain")(hub.asInstanceOf[js.Any]).asInstanceOf[Hub]
  
  inline def runWithAsyncContext[T](callback: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("runWithAsyncContext")(callback.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def runWithAsyncContext[T](callback: js.Function0[T], options: RunWithAsyncContextOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("runWithAsyncContext")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def setAsyncContextStrategy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAsyncContextStrategy")().asInstanceOf[Unit]
  inline def setAsyncContextStrategy(strategy: AsyncContextStrategy): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAsyncContextStrategy")(strategy.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setHubOnCarrier(carrier: Carrier, hub: Hub): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setHubOnCarrier")(carrier.asInstanceOf[js.Any], hub.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait AsyncContextStrategy extends StObject {
    
    /**
      * Gets the current async context. Returns undefined if there is no current async context.
      */
    def getCurrentHub(): js.UndefOr[Hub]
    
    /**
      * Runs the supplied callback in its own async context.
      */
    def runWithAsyncContext[T](callback: js.Function0[T], options: RunWithAsyncContextOptions): T
  }
  object AsyncContextStrategy {
    
    inline def apply(
      getCurrentHub: () => js.UndefOr[Hub],
      runWithAsyncContext: (js.Function0[Any], RunWithAsyncContextOptions) => Any
    ): AsyncContextStrategy = {
      val __obj = js.Dynamic.literal(getCurrentHub = js.Any.fromFunction0(getCurrentHub), runWithAsyncContext = js.Any.fromFunction2(runWithAsyncContext))
      __obj.asInstanceOf[AsyncContextStrategy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncContextStrategy] (val x: Self) extends AnyVal {
      
      inline def setGetCurrentHub(value: () => js.UndefOr[Hub]): Self = StObject.set(x, "getCurrentHub", js.Any.fromFunction0(value))
      
      inline def setRunWithAsyncContext(value: (js.Function0[Any], RunWithAsyncContextOptions) => Any): Self = StObject.set(x, "runWithAsyncContext", js.Any.fromFunction2(value))
    }
  }
  
  trait Carrier extends StObject {
    
    var __SENTRY__ : js.UndefOr[Acs] = js.undefined
  }
  object Carrier {
    
    inline def apply(): Carrier = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Carrier]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Carrier] (val x: Self) extends AnyVal {
      
      inline def set__SENTRY__(value: Acs): Self = StObject.set(x, "__SENTRY__", value.asInstanceOf[js.Any])
      
      inline def set__SENTRY__Undefined: Self = StObject.set(x, "__SENTRY__", js.undefined)
    }
  }
  
  trait Layer extends StObject {
    
    var client: js.UndefOr[Client[ClientOptions[BaseTransportOptions]]] = js.undefined
    
    var scope: Scope
  }
  object Layer {
    
    inline def apply(scope: Scope): Layer = {
      val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[Layer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Layer] (val x: Self) extends AnyVal {
      
      inline def setClient(value: Client[ClientOptions[BaseTransportOptions]]): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  trait RunWithAsyncContextOptions extends StObject {
    
    /** Whether to reuse an existing async context if one exists. Defaults to false. */
    var reuseExisting: js.UndefOr[Boolean] = js.undefined
  }
  object RunWithAsyncContextOptions {
    
    inline def apply(): RunWithAsyncContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RunWithAsyncContextOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RunWithAsyncContextOptions] (val x: Self) extends AnyVal {
      
      inline def setReuseExisting(value: Boolean): Self = StObject.set(x, "reuseExisting", value.asInstanceOf[js.Any])
      
      inline def setReuseExistingUndefined: Self = StObject.set(x, "reuseExisting", js.undefined)
    }
  }
}
