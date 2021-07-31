package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RsaPssParams
  extends StObject
     with Algorithm {
  
  var saltLength: Double
}
object RsaPssParams {
  
  @scala.inline
  def apply(name: java.lang.String, saltLength: Double): RsaPssParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], saltLength = saltLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaPssParams]
  }
  
  @scala.inline
  implicit class RsaPssParamsMutableBuilder[Self <: RsaPssParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSaltLength(value: Double): Self = StObject.set(x, "saltLength", value.asInstanceOf[js.Any])
  }
}
