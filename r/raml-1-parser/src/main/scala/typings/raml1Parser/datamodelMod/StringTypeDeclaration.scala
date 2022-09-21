package typings.raml1Parser.datamodelMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringTypeDeclaration
  extends StObject
     with TypeDeclaration {
  
  /**
    * The enum attribute provides an enumeration of the parameter's valid values.
    * This MUST be an array. If the enum attribute is defined, API clients
    * and servers MUST verify that a parameter's value matches a value in the enum array.
    * If there is no matching value, the clients and servers MUST treat this as an error.
    */
  var `enum`: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Maximum length of the string
    */
  var maxLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum length of the string
    */
  var minLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Regular expression that this string should path
    */
  var pattern: js.UndefOr[js.Array[String]] = js.undefined
}
object StringTypeDeclaration {
  
  inline def apply(displayName: String, name: String, `type`: js.Array[TypeReference10]): StringTypeDeclaration = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringTypeDeclaration]
  }
  
  extension [Self <: StringTypeDeclaration](x: Self) {
    
    inline def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
    
    inline def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value*))
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setPattern(value: js.Array[String]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setPatternVarargs(value: String*): Self = StObject.set(x, "pattern", js.Array(value*))
  }
}
