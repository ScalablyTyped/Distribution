package typings.raml1Parser.datamodelMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberTypeDeclaration
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
    * Value format
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum attribute specifies the parameter's maximum value.
    */
  var maximum: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum attribute specifies the parameter's minimum value.
    */
  var minimum: js.UndefOr[Double] = js.undefined
  
  /**
    * A numeric instance is valid against \"multipleOf\" if the result of the division
    * of the instance by this keywords value is an integer.
    */
  var multipleOf: js.UndefOr[Double] = js.undefined
}
object NumberTypeDeclaration {
  
  inline def apply(displayName: String, name: String, `type`: js.Array[TypeReference10]): NumberTypeDeclaration = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberTypeDeclaration]
  }
  
  extension [Self <: NumberTypeDeclaration](x: Self) {
    
    inline def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
    
    inline def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value*))
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    inline def setMultipleOf(value: Double): Self = StObject.set(x, "multipleOf", value.asInstanceOf[js.Any])
    
    inline def setMultipleOfUndefined: Self = StObject.set(x, "multipleOf", js.undefined)
  }
}
