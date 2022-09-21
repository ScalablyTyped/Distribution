package typings.ramlTypesystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringType
  extends StObject
     with IType {
  
  /**
    * maximum length of the string
    */
  var maxLength: js.UndefOr[Double] = js.undefined
  
  /**
    * minimum length of the string
    */
  var minLength: js.UndefOr[Double] = js.undefined
  
  /**
    * regular expression which all instances of the type should pass
    */
  var pattern: js.UndefOr[String] = js.undefined
}
object StringType {
  
  inline def apply(): StringType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringType]
  }
  
  extension [Self <: StringType](x: Self) {
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
  }
}
