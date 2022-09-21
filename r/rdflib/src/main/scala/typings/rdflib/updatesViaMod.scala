package typings.rdflib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updatesViaMod {
  
  @JSImport("rdflib/lib/updates-via", "UpdatesSocket")
  @js.native
  open class UpdatesSocket protected () extends StObject {
    def this(parent: Any, via: Any) = this()
    
    def _decode(q: Any): js.Object = js.native
    
    def _send(method: Any, uri: Any, data: Any): Any = js.native
    
    def _subscribe(uri: Any): Any = js.native
    
    var connected: Boolean = js.native
    
    def onClose(e: Any): js.Object = js.native
    
    def onError(e: Any): Unit = js.native
    
    def onMessage(e: Any): Any = js.native
    
    def onOpen(e: Any): js.Array[Any] = js.native
    
    var parent: Any = js.native
    
    def subscribe(uri: Any): Any = js.native
    
    var via: Any = js.native
  }
  
  @JSImport("rdflib/lib/updates-via", "UpdatesVia")
  @js.native
  open class UpdatesVia protected () extends StObject {
    def this(fetcher: Any) = this()
    
    var fetcher: Any = js.native
    
    def onHeaders(d: Any): Boolean = js.native
    
    def onUpdate(uri: Any, d: Any): Any = js.native
    
    def register(via: Any, uri: Any): Any = js.native
  }
}
