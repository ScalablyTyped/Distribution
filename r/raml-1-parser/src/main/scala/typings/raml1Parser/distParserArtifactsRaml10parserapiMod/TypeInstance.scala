package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeInstance extends StObject {
  
  /**
    * Indicates whether the instance is array
    **/
  def isArray(): Boolean
  
  /**
    * Whether the type is scalar
    **/
  def isScalar(): Boolean
  
  /**
    * Returns components of array instances
    **/
  def items(): js.Array[TypeInstance]
  
  /**
    * Array of instance properties
    **/
  def properties(): js.Array[TypeInstanceProperty]
  
  /**
    * For instances of scalar types returns scalar value
    **/
  def value(): Any
}
object TypeInstance {
  
  inline def apply(
    isArray: () => Boolean,
    isScalar: () => Boolean,
    items: () => js.Array[TypeInstance],
    properties: () => js.Array[TypeInstanceProperty],
    value: () => Any
  ): TypeInstance = {
    val __obj = js.Dynamic.literal(isArray = js.Any.fromFunction0(isArray), isScalar = js.Any.fromFunction0(isScalar), items = js.Any.fromFunction0(items), properties = js.Any.fromFunction0(properties), value = js.Any.fromFunction0(value))
    __obj.asInstanceOf[TypeInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeInstance] (val x: Self) extends AnyVal {
    
    inline def setIsArray(value: () => Boolean): Self = StObject.set(x, "isArray", js.Any.fromFunction0(value))
    
    inline def setIsScalar(value: () => Boolean): Self = StObject.set(x, "isScalar", js.Any.fromFunction0(value))
    
    inline def setItems(value: () => js.Array[TypeInstance]): Self = StObject.set(x, "items", js.Any.fromFunction0(value))
    
    inline def setProperties(value: () => js.Array[TypeInstanceProperty]): Self = StObject.set(x, "properties", js.Any.fromFunction0(value))
    
    inline def setValue(value: () => Any): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
  }
}
