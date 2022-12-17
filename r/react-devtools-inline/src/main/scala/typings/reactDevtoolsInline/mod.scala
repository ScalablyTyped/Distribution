package typings.reactDevtoolsInline

import typings.reactDevtoolsInline.commonsMod.BackendBridge
import typings.reactDevtoolsInline.commonsMod.FrontendBridge
import typings.reactDevtoolsInline.commonsMod.ProfilerStore
import typings.reactDevtoolsInline.commonsMod.Wall
import typings.reactDevtoolsInline.commonsMod.global.Window
import typings.reactDevtoolsInline.frontendMod.Config
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-devtools-inline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-devtools-inline", "Bridge")
  @js.native
  open class Bridge[OutgoingEvents /* <: Record[String, js.Array[Any]] */, IncomingEvents /* <: Record[String, js.Array[Any]] */] protected ()
    extends typings.reactDevtoolsInline.backendMod.Bridge[OutgoingEvents, IncomingEvents] {
    def this(wall: Wall) = this()
  }
  
  @JSImport("react-devtools-inline", "EventEmitter")
  @js.native
  open class EventEmitter[Events] ()
    extends typings.reactDevtoolsInline.backendMod.EventEmitter[Events]
  
  @JSImport("react-devtools-inline", "ProfilingCache")
  @js.native
  open class ProfilingCache protected ()
    extends typings.reactDevtoolsInline.backendMod.ProfilingCache {
    def this(profilerStore: ProfilerStore) = this()
  }
  
  @JSImport("react-devtools-inline", "Store")
  @js.native
  open class Store protected ()
    extends typings.reactDevtoolsInline.backendMod.Store {
    def this(bridge: FrontendBridge) = this()
    def this(bridge: FrontendBridge, config: Config) = this()
  }
  
  inline def activate(contentWindow: Window): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("activate")(contentWindow.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def activate(contentWindow: Window, options: typings.reactDevtoolsInline.anon.Bridge): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("activate")(contentWindow.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createBridge(contentWindow: Window): BackendBridge = ^.asInstanceOf[js.Dynamic].applyDynamic("createBridge")(contentWindow.asInstanceOf[js.Any]).asInstanceOf[BackendBridge]
  inline def createBridge(contentWindow: Window, wall: Wall): BackendBridge = (^.asInstanceOf[js.Dynamic].applyDynamic("createBridge")(contentWindow.asInstanceOf[js.Any], wall.asInstanceOf[js.Any])).asInstanceOf[BackendBridge]
  
  inline def initialize(contentWindow: Window): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(contentWindow.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
