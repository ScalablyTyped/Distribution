package typings.sentryNode

import typings.sentryNode.sentryNodeBooleans.`true`
import typings.sentryTypes.typesContextMod.DeviceContext
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesEventprocessorMod.EventProcessor
import typings.sentryTypes.typesHubMod.Hub
import typings.sentryTypes.typesIntegrationMod.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIntegrationsContextMod {
  
  @JSImport("@sentry/node/types/integrations/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/node/types/integrations/context", "Context")
  @js.native
  open class Context ()
    extends StObject
       with Integration {
    def this(_options: ContextOptions) = this()
    
    /**
      * Caches context so it's only evaluated once
      */
    /* private */ var _cachedContext: Any = js.native
    
    /**
      * Gets the contexts for the current environment
      */
    /* private */ var _getContexts: Any = js.native
    
    /* private */ val _options: Any = js.native
    
    /**
      * Updates the context with dynamic values that can change
      */
    /* private */ var _updateContext: Any = js.native
    
    /** Processes an event and adds context */
    def addContext(event: Event): js.Promise[Event] = js.native
    
    /**
      * Returns {@link IntegrationClass.id}
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * @inheritDoc
      */
    def setupOnce(addGlobalEventProcessor: js.Function1[/* callback */ EventProcessor, Unit]): Unit = js.native
    /**
      * Sets the integration up only once.
      * This takes no options on purpose, options should be passed in the constructor
      */
    /* CompleteClass */
    override def setupOnce(
      addGlobalEventProcessor: js.Function1[/* callback */ EventProcessor, Unit],
      getCurrentHub: js.Function0[Hub]
    ): Unit = js.native
  }
  /* static members */
  object Context {
    
    @JSImport("@sentry/node/types/integrations/context", "Context")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/node/types/integrations/context", "Context.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  inline def getDeviceContext(deviceOpt: DeviceContextOptions): DeviceContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceContext")(deviceOpt.asInstanceOf[js.Any]).asInstanceOf[DeviceContext]
  
  inline def getDeviceContext_true(deviceOpt: `true`): DeviceContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceContext")(deviceOpt.asInstanceOf[js.Any]).asInstanceOf[DeviceContext]
  
  @JSImport("@sentry/node/types/integrations/context", "readDirAsync")
  @js.native
  val readDirAsync: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof readdir.__promisify__ */ Any = js.native
  
  @JSImport("@sentry/node/types/integrations/context", "readFileAsync")
  @js.native
  val readFileAsync: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof readFile.__promisify__ */ Any = js.native
  
  trait ContextOptions extends StObject {
    
    var app: js.UndefOr[Boolean] = js.undefined
    
    var culture: js.UndefOr[Boolean] = js.undefined
    
    var device: js.UndefOr[DeviceContextOptions | Boolean] = js.undefined
    
    var os: js.UndefOr[Boolean] = js.undefined
  }
  object ContextOptions {
    
    inline def apply(): ContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextOptions] (val x: Self) extends AnyVal {
      
      inline def setApp(value: Boolean): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      inline def setCulture(value: Boolean): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
      
      inline def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
      
      inline def setDevice(value: DeviceContextOptions | Boolean): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      inline def setOs(value: Boolean): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
    }
  }
  
  trait DeviceContextOptions extends StObject {
    
    var cpu: js.UndefOr[Boolean] = js.undefined
    
    var memory: js.UndefOr[Boolean] = js.undefined
  }
  object DeviceContextOptions {
    
    inline def apply(): DeviceContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeviceContextOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeviceContextOptions] (val x: Self) extends AnyVal {
      
      inline def setCpu(value: Boolean): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
      
      inline def setMemory(value: Boolean): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
    }
  }
}
