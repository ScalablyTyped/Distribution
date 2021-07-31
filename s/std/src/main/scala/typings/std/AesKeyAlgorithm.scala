package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AesKeyAlgorithm
  extends StObject
     with KeyAlgorithm {
  
  var length: Double
}
object AesKeyAlgorithm {
  
  @scala.inline
  def apply(length: Double, name: java.lang.String): AesKeyAlgorithm = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesKeyAlgorithm]
  }
  
  @scala.inline
  implicit class AesKeyAlgorithmMutableBuilder[Self <: AesKeyAlgorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
