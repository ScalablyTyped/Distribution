package typings.ssh2.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKey extends StObject {
  
  /** The name of the key algorithm. */
  var algo: String = js.native
  
  /** The actual key data. */
  var data: Buffer = js.native
}
object PublicKey {
  
  @scala.inline
  def apply(algo: String, data: Buffer): PublicKey = {
    val __obj = js.Dynamic.literal(algo = algo.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
  
  @scala.inline
  implicit class PublicKeyMutableBuilder[Self <: PublicKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgo(value: String): Self = StObject.set(x, "algo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
