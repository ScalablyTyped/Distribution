package typings.raml1Parser.raml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeInstanceProperty extends StObject {
  
  /**
    * Whether property has array as value
    **/
  def isArray(): Boolean
  
  /**
    * Property name
    **/
  def name(): String
  
  /**
    * Property value
    **/
  def value(): TypeInstance
  
  /**
    * Array of values if property value is array
    **/
  def values(): js.Array[TypeInstance]
}
object TypeInstanceProperty {
  
  inline def apply(
    isArray: () => Boolean,
    name: () => String,
    value: () => TypeInstance,
    values: () => js.Array[TypeInstance]
  ): TypeInstanceProperty = {
    val __obj = js.Dynamic.literal(isArray = js.Any.fromFunction0(isArray), name = js.Any.fromFunction0(name), value = js.Any.fromFunction0(value), values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[TypeInstanceProperty]
  }
  
  extension [Self <: TypeInstanceProperty](x: Self) {
    
    inline def setIsArray(value: () => Boolean): Self = StObject.set(x, "isArray", js.Any.fromFunction0(value))
    
    inline def setName(value: () => String): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
    
    inline def setValue(value: () => TypeInstance): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
    
    inline def setValues(value: () => js.Array[TypeInstance]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
  }
}
