package typings.reactDevtoolsInline

import typings.react.mod.ComponentType
import typings.reactDevtoolsInline.commonsMod.DevtoolsProps
import typings.reactDevtoolsInline.commonsMod.FrontendBridge
import typings.reactDevtoolsInline.commonsMod.ProfilerStore
import typings.reactDevtoolsInline.commonsMod.Wall
import typings.reactDevtoolsInline.commonsMod.global.Window
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frontendMod {
  
  @JSImport("react-devtools-inline/frontend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-devtools-inline/frontend", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.reactDevtoolsInline.commonsMod.default {
    def this(
      bridge: FrontendBridge,
      store: typings.reactDevtoolsInline.commonsMod.Store,
      defaultIsProfiling: Boolean
    ) = this()
  }
  
  @JSImport("react-devtools-inline/frontend", "Bridge")
  @js.native
  open class Bridge[OutgoingEvents /* <: Record[String, js.Array[Any]] */, IncomingEvents /* <: Record[String, js.Array[Any]] */] protected ()
    extends typings.reactDevtoolsInline.commonsMod.Bridge[OutgoingEvents, IncomingEvents] {
    def this(wall: Wall) = this()
  }
  
  @JSImport("react-devtools-inline/frontend", "EventEmitter")
  @js.native
  open class EventEmitter[Events] ()
    extends typings.reactDevtoolsInline.commonsMod.EventEmitter[Events]
  
  @JSImport("react-devtools-inline/frontend", "ProfilingCache")
  @js.native
  open class ProfilingCache protected ()
    extends typings.reactDevtoolsInline.commonsMod.ProfilingCache {
    def this(profilerStore: ProfilerStore) = this()
  }
  
  @JSImport("react-devtools-inline/frontend", "Store")
  @js.native
  open class Store protected ()
    extends typings.reactDevtoolsInline.commonsMod.Store {
    def this(bridge: FrontendBridge) = this()
    def this(bridge: FrontendBridge, config: Config) = this()
  }
  
  inline def createBridge(contentWindow: Window): FrontendBridge = ^.asInstanceOf[js.Dynamic].applyDynamic("createBridge")(contentWindow.asInstanceOf[js.Any]).asInstanceOf[FrontendBridge]
  inline def createBridge(contentWindow: Window, wall: Wall): FrontendBridge = (^.asInstanceOf[js.Dynamic].applyDynamic("createBridge")(contentWindow.asInstanceOf[js.Any], wall.asInstanceOf[js.Any])).asInstanceOf[FrontendBridge]
  
  inline def createStore(bridge: FrontendBridge): typings.reactDevtoolsInline.commonsMod.Store = ^.asInstanceOf[js.Dynamic].applyDynamic("createStore")(bridge.asInstanceOf[js.Any]).asInstanceOf[typings.reactDevtoolsInline.commonsMod.Store]
  inline def createStore(bridge: FrontendBridge, config: Config): typings.reactDevtoolsInline.commonsMod.Store = (^.asInstanceOf[js.Dynamic].applyDynamic("createStore")(bridge.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.reactDevtoolsInline.commonsMod.Store]
  
  inline def initialize(contentWindow: Window): ComponentType[DevtoolsProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(contentWindow.asInstanceOf[js.Any]).asInstanceOf[ComponentType[DevtoolsProps]]
  inline def initialize(contentWindow: Window, options: typings.reactDevtoolsInline.anon.Store): ComponentType[DevtoolsProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(contentWindow.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ComponentType[DevtoolsProps]]
  
  trait Config extends StObject {
    
    var checkBridgeProtocolCompatibility: js.UndefOr[Boolean] = js.undefined
    
    var isProfiling: js.UndefOr[Boolean] = js.undefined
    
    var supportsNativeInspection: js.UndefOr[Boolean] = js.undefined
    
    var supportsProfiling: js.UndefOr[Boolean] = js.undefined
    
    var supportsReloadAndProfile: js.UndefOr[Boolean] = js.undefined
    
    var supportsTimeline: js.UndefOr[Boolean] = js.undefined
    
    var supportsTraceUpdates: js.UndefOr[Boolean] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setCheckBridgeProtocolCompatibility(value: Boolean): Self = StObject.set(x, "checkBridgeProtocolCompatibility", value.asInstanceOf[js.Any])
      
      inline def setCheckBridgeProtocolCompatibilityUndefined: Self = StObject.set(x, "checkBridgeProtocolCompatibility", js.undefined)
      
      inline def setIsProfiling(value: Boolean): Self = StObject.set(x, "isProfiling", value.asInstanceOf[js.Any])
      
      inline def setIsProfilingUndefined: Self = StObject.set(x, "isProfiling", js.undefined)
      
      inline def setSupportsNativeInspection(value: Boolean): Self = StObject.set(x, "supportsNativeInspection", value.asInstanceOf[js.Any])
      
      inline def setSupportsNativeInspectionUndefined: Self = StObject.set(x, "supportsNativeInspection", js.undefined)
      
      inline def setSupportsProfiling(value: Boolean): Self = StObject.set(x, "supportsProfiling", value.asInstanceOf[js.Any])
      
      inline def setSupportsProfilingUndefined: Self = StObject.set(x, "supportsProfiling", js.undefined)
      
      inline def setSupportsReloadAndProfile(value: Boolean): Self = StObject.set(x, "supportsReloadAndProfile", value.asInstanceOf[js.Any])
      
      inline def setSupportsReloadAndProfileUndefined: Self = StObject.set(x, "supportsReloadAndProfile", js.undefined)
      
      inline def setSupportsTimeline(value: Boolean): Self = StObject.set(x, "supportsTimeline", value.asInstanceOf[js.Any])
      
      inline def setSupportsTimelineUndefined: Self = StObject.set(x, "supportsTimeline", js.undefined)
      
      inline def setSupportsTraceUpdates(value: Boolean): Self = StObject.set(x, "supportsTraceUpdates", value.asInstanceOf[js.Any])
      
      inline def setSupportsTraceUpdatesUndefined: Self = StObject.set(x, "supportsTraceUpdates", js.undefined)
    }
  }
}
