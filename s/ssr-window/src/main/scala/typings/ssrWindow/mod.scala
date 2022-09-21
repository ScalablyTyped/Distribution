package typings.ssrWindow

import typings.node.timersMod.global.NodeJS.Timeout
import typings.ssrWindow.anon.ActiveElement
import typings.ssrWindow.anon.Back
import typings.ssrWindow.anon.Blur
import typings.ssrWindow.anon.ChildNodes
import typings.ssrWindow.anon.GetPropertyValue
import typings.ssrWindow.anon.Hash
import typings.ssrWindow.anon.InitEvent
import typings.ssrWindow.anon.UserAgent
import typings.std.Document
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ssr-window", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extend(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")().asInstanceOf[Unit]
  inline def extend(target: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def extend(target: Any, src: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def extend(target: Unit, src: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getDocument(): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")().asInstanceOf[Document]
  
  inline def getWindow(): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindow")().asInstanceOf[Window]
  
  object ssrDocument {
    
    @JSImport("ssr-window", "ssrDocument")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ssr-window", "ssrDocument.activeElement")
    @js.native
    def activeElement: Blur = js.native
    inline def activeElement_=(x: Blur): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeElement")(x.asInstanceOf[js.Any])
    
    inline def addEventListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")().asInstanceOf[Unit]
    
    inline def createElement(): ChildNodes = ^.asInstanceOf[js.Dynamic].applyDynamic("createElement")().asInstanceOf[ChildNodes]
    
    inline def createElementNS(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("createElementNS")().asInstanceOf[js.Object]
    
    inline def createEvent(): InitEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")().asInstanceOf[InitEvent]
    
    inline def getElementById(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementById")().asInstanceOf[Any]
    
    inline def importNode(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("importNode")().asInstanceOf[Any]
    
    @JSImport("ssr-window", "ssrDocument.location")
    @js.native
    def location: Hash = js.native
    inline def location_=(x: Hash): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("location")(x.asInstanceOf[js.Any])
    
    inline def querySelector(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("querySelector")().asInstanceOf[Any]
    
    inline def querySelectorAll(): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("querySelectorAll")().asInstanceOf[js.Array[Any]]
    
    inline def removeEventListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")().asInstanceOf[Unit]
  }
  
  object ssrWindow {
    
    @JSImport("ssr-window", "ssrWindow")
    @js.native
    val ^ : js.Any = js.native
    
    inline def CustomEvent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("CustomEvent")().asInstanceOf[Any]
    
    inline def Date(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Date")().asInstanceOf[Unit]
    
    inline def Image(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Image")().asInstanceOf[Unit]
    
    inline def addEventListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")().asInstanceOf[Unit]
    
    inline def cancelAnimationFrame(id: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelAnimationFrame")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def clearTimeout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTimeout")().asInstanceOf[Unit]
    
    @JSImport("ssr-window", "ssrWindow.document")
    @js.native
    def document: ActiveElement = js.native
    inline def document_=(x: ActiveElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("document")(x.asInstanceOf[js.Any])
    
    inline def getComputedStyle(): GetPropertyValue = ^.asInstanceOf[js.Dynamic].applyDynamic("getComputedStyle")().asInstanceOf[GetPropertyValue]
    
    @JSImport("ssr-window", "ssrWindow.history")
    @js.native
    def history: Back = js.native
    inline def history_=(x: Back): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("history")(x.asInstanceOf[js.Any])
    
    @JSImport("ssr-window", "ssrWindow.location")
    @js.native
    def location: Hash = js.native
    inline def location_=(x: Hash): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("location")(x.asInstanceOf[js.Any])
    
    inline def matchMedia(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("matchMedia")().asInstanceOf[js.Object]
    
    @JSImport("ssr-window", "ssrWindow.navigator")
    @js.native
    def navigator: UserAgent = js.native
    inline def navigator_=(x: UserAgent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navigator")(x.asInstanceOf[js.Any])
    
    inline def removeEventListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")().asInstanceOf[Unit]
    
    inline def requestAnimationFrame(callback: Any): Timeout = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimationFrame")(callback.asInstanceOf[js.Any]).asInstanceOf[Timeout]
    
    inline def setTimeout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")().asInstanceOf[Unit]
  }
}
