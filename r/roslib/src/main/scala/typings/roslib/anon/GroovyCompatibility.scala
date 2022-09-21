package typings.roslib.anon

import typings.roslib.roslibStrings.socketDotio
import typings.roslib.roslibStrings.websocket
import typings.roslib.roslibStrings.workersocket
import typings.std.RTCDataChannelInit
import typings.std.RTCPeerConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroovyCompatibility extends StObject {
  
  var groovyCompatibility: js.UndefOr[Boolean] = js.undefined
  
  var transportLibrary: js.UndefOr[websocket | workersocket | socketDotio | RTCPeerConnection] = js.undefined
  
  var transportOptions: js.UndefOr[RTCDataChannelInit] = js.undefined
  
  var url: js.UndefOr[java.lang.String] = js.undefined
}
object GroovyCompatibility {
  
  inline def apply(): GroovyCompatibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroovyCompatibility]
  }
  
  extension [Self <: GroovyCompatibility](x: Self) {
    
    inline def setGroovyCompatibility(value: Boolean): Self = StObject.set(x, "groovyCompatibility", value.asInstanceOf[js.Any])
    
    inline def setGroovyCompatibilityUndefined: Self = StObject.set(x, "groovyCompatibility", js.undefined)
    
    inline def setTransportLibrary(value: websocket | workersocket | socketDotio | RTCPeerConnection): Self = StObject.set(x, "transportLibrary", value.asInstanceOf[js.Any])
    
    inline def setTransportLibraryUndefined: Self = StObject.set(x, "transportLibrary", js.undefined)
    
    inline def setTransportOptions(value: RTCDataChannelInit): Self = StObject.set(x, "transportOptions", value.asInstanceOf[js.Any])
    
    inline def setTransportOptionsUndefined: Self = StObject.set(x, "transportOptions", js.undefined)
    
    inline def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
