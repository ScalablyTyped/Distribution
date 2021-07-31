package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RsaKeyGenParams
  extends StObject
     with Algorithm {
  
  var modulusLength: Double
  
  var publicExponent: BigInteger
}
object RsaKeyGenParams {
  
  @scala.inline
  def apply(modulusLength: Double, name: java.lang.String, publicExponent: BigInteger): RsaKeyGenParams = {
    val __obj = js.Dynamic.literal(modulusLength = modulusLength.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaKeyGenParams]
  }
  
  @scala.inline
  implicit class RsaKeyGenParamsMutableBuilder[Self <: RsaKeyGenParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModulusLength(value: Double): Self = StObject.set(x, "modulusLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicExponent(value: BigInteger): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
  }
}
