package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RsaKeyAlgorithm extends KeyAlgorithm {
  
  var modulusLength: Double = js.native
  
  var publicExponent: BigInteger = js.native
}
object RsaKeyAlgorithm {
  
  @scala.inline
  def apply(modulusLength: Double, name: java.lang.String, publicExponent: BigInteger): RsaKeyAlgorithm = {
    val __obj = js.Dynamic.literal(modulusLength = modulusLength.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaKeyAlgorithm]
  }
  
  @scala.inline
  implicit class RsaKeyAlgorithmMutableBuilder[Self <: RsaKeyAlgorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModulusLength(value: Double): Self = StObject.set(x, "modulusLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicExponent(value: BigInteger): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
  }
}
