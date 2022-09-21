package typings.redisClient.anon

import typings.redisClient.redisClientBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NX extends StObject {
  
  var NX: `true`
  
  var XX: `true`
}
object NX {
  
  inline def apply(): NX = {
    val __obj = js.Dynamic.literal(NX = true, XX = true)
    __obj.asInstanceOf[NX]
  }
  
  extension [Self <: NX](x: Self) {
    
    inline def setNX(value: `true`): Self = StObject.set(x, "NX", value.asInstanceOf[js.Any])
    
    inline def setXX(value: `true`): Self = StObject.set(x, "XX", value.asInstanceOf[js.Any])
  }
}
