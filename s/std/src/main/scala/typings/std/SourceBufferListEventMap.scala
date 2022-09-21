package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceBufferListEventMap extends StObject {
  
  /* standard dom */
  var addsourcebuffer: Event
  
  /* standard dom */
  var removesourcebuffer: Event
}
object SourceBufferListEventMap {
  
  inline def apply(addsourcebuffer: Event, removesourcebuffer: Event): SourceBufferListEventMap = {
    val __obj = js.Dynamic.literal(addsourcebuffer = addsourcebuffer.asInstanceOf[js.Any], removesourcebuffer = removesourcebuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceBufferListEventMap]
  }
  
  extension [Self <: SourceBufferListEventMap](x: Self) {
    
    inline def setAddsourcebuffer(value: Event): Self = StObject.set(x, "addsourcebuffer", value.asInstanceOf[js.Any])
    
    inline def setRemovesourcebuffer(value: Event): Self = StObject.set(x, "removesourcebuffer", value.asInstanceOf[js.Any])
  }
}
