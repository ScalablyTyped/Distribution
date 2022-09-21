package typings.stencilCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  /**
    * Cache key
    */
  var key: String
  
  /**
    * Mismatched pixels
    */
  var mp: Double
  
  /**
    * Timestamp used to remove the oldest data
    */
  var ts: Double
}
object Key {
  
  inline def apply(key: String, mp: Double, ts: Double): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], mp = mp.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  extension [Self <: Key](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setMp(value: Double): Self = StObject.set(x, "mp", value.asInstanceOf[js.Any])
    
    inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
  }
}
