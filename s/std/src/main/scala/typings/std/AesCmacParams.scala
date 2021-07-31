package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AesCmacParams
  extends StObject
     with Algorithm {
  
  var length: Double
}
object AesCmacParams {
  
  @scala.inline
  def apply(length: Double, name: java.lang.String): AesCmacParams = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesCmacParams]
  }
  
  @scala.inline
  implicit class AesCmacParamsMutableBuilder[Self <: AesCmacParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
