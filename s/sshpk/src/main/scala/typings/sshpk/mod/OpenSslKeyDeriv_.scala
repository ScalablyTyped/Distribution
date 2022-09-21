package typings.sshpk.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenSslKeyDeriv_ extends StObject {
  
  var iv: Buffer
  
  var key: Buffer
}
object OpenSslKeyDeriv_ {
  
  inline def apply(iv: Buffer, key: Buffer): OpenSslKeyDeriv_ = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenSslKeyDeriv_]
  }
  
  extension [Self <: OpenSslKeyDeriv_](x: Self) {
    
    inline def setIv(value: Buffer): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
