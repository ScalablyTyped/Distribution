package typings.ssh2.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKey extends StObject {
  
  /** The name of the key algorithm. */
  var algo: String
  
  /** The actual key data. */
  var data: Buffer
}
object PublicKey {
  
  inline def apply(algo: String, data: Buffer): PublicKey = {
    val __obj = js.Dynamic.literal(algo = algo.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicKey] (val x: Self) extends AnyVal {
    
    inline def setAlgo(value: String): Self = StObject.set(x, "algo", value.asInstanceOf[js.Any])
    
    inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
