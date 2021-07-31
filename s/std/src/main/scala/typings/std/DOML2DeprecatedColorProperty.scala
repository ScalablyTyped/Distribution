package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOML2DeprecatedColorProperty extends StObject {
  
  var color: java.lang.String
}
object DOML2DeprecatedColorProperty {
  
  @scala.inline
  def apply(color: java.lang.String): DOML2DeprecatedColorProperty = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOML2DeprecatedColorProperty]
  }
  
  @scala.inline
  implicit class DOML2DeprecatedColorPropertyMutableBuilder[Self <: DOML2DeprecatedColorProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: java.lang.String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
