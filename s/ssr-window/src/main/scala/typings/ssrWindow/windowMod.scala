package typings.ssrWindow

import typings.node.timersMod.global.NodeJS.Timeout
import typings.ssrWindow.anon.ActiveElement
import typings.ssrWindow.anon.Back
import typings.ssrWindow.anon.GetPropertyValue
import typings.ssrWindow.anon.Hash
import typings.ssrWindow.anon.UserAgent
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowMod {
  
  @JSImport("ssr-window/types/window", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getWindow(): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindow")().asInstanceOf[Window]
  
  object ssrWindow {
    
    @JSImport("ssr-window/types/window", "ssrWindow")
    @js.native
    val ^ : js.Any = js.native
    
    inline def CustomEvent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("CustomEvent")().asInstanceOf[Any]
    
    inline def Date(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Date")().asInstanceOf[Unit]
    
    inline def Image(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Image")().asInstanceOf[Unit]
    
    inline def addEventListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")().asInstanceOf[Unit]
    
    inline def cancelAnimationFrame(id: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelAnimationFrame")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def clearTimeout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTimeout")().asInstanceOf[Unit]
    
    @JSImport("ssr-window/types/window", "ssrWindow.document")
    @js.native
    def document: ActiveElement = js.native
    inline def document_=(x: ActiveElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("document")(x.asInstanceOf[js.Any])
    
    inline def getComputedStyle(): GetPropertyValue = ^.asInstanceOf[js.Dynamic].applyDynamic("getComputedStyle")().asInstanceOf[GetPropertyValue]
    
    @JSImport("ssr-window/types/window", "ssrWindow.history")
    @js.native
    def history: Back = js.native
    inline def history_=(x: Back): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("history")(x.asInstanceOf[js.Any])
    
    @JSImport("ssr-window/types/window", "ssrWindow.location")
    @js.native
    def location: Hash = js.native
    inline def location_=(x: Hash): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("location")(x.asInstanceOf[js.Any])
    
    inline def matchMedia(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("matchMedia")().asInstanceOf[js.Object]
    
    @JSImport("ssr-window/types/window", "ssrWindow.navigator")
    @js.native
    def navigator: UserAgent = js.native
    inline def navigator_=(x: UserAgent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navigator")(x.asInstanceOf[js.Any])
    
    inline def removeEventListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")().asInstanceOf[Unit]
    
    inline def requestAnimationFrame(callback: Any): Timeout = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimationFrame")(callback.asInstanceOf[js.Any]).asInstanceOf[Timeout]
    
    inline def setTimeout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")().asInstanceOf[Unit]
  }
}
