package typings.ssrWindow

import typings.ssrWindow.anon.Blur
import typings.ssrWindow.anon.ChildNodes
import typings.ssrWindow.anon.Hash
import typings.ssrWindow.anon.InitEvent
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDocumentMod {
  
  @JSImport("ssr-window/types/document", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDocument(): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")().asInstanceOf[Document]
  
  object ssrDocument {
    
    @JSImport("ssr-window/types/document", "ssrDocument")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ssr-window/types/document", "ssrDocument.activeElement")
    @js.native
    def activeElement: Blur = js.native
    inline def activeElement_=(x: Blur): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeElement")(x.asInstanceOf[js.Any])
    
    inline def addEventListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")().asInstanceOf[Unit]
    
    inline def createElement(): ChildNodes = ^.asInstanceOf[js.Dynamic].applyDynamic("createElement")().asInstanceOf[ChildNodes]
    
    inline def createElementNS(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("createElementNS")().asInstanceOf[js.Object]
    
    inline def createEvent(): InitEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")().asInstanceOf[InitEvent]
    
    inline def getElementById(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementById")().asInstanceOf[Any]
    
    inline def importNode(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("importNode")().asInstanceOf[Any]
    
    @JSImport("ssr-window/types/document", "ssrDocument.location")
    @js.native
    def location: Hash = js.native
    inline def location_=(x: Hash): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("location")(x.asInstanceOf[js.Any])
    
    inline def querySelector(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("querySelector")().asInstanceOf[Any]
    
    inline def querySelectorAll(): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("querySelectorAll")().asInstanceOf[js.Array[Any]]
    
    inline def removeEventListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")().asInstanceOf[Unit]
  }
}
