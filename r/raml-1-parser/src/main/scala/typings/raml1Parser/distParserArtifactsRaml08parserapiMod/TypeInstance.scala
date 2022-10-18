package typings.raml1Parser.distParserArtifactsRaml08parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeInstance extends StObject {
  
  /**
    * Whether the type is scalar
    **/
  def isScalar(): Boolean
  
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
  
  inline def apply(isScalar: () => Boolean, properties: () => js.Array[TypeInstanceProperty], value: () => Any): TypeInstance = {
    val __obj = js.Dynamic.literal(isScalar = js.Any.fromFunction0(isScalar), properties = js.Any.fromFunction0(properties), value = js.Any.fromFunction0(value))
    __obj.asInstanceOf[TypeInstance]
  }
  
  extension [Self <: TypeInstance](x: Self) {
    
    inline def setIsScalar(value: () => Boolean): Self = StObject.set(x, "isScalar", js.Any.fromFunction0(value))
    
    inline def setProperties(value: () => js.Array[TypeInstanceProperty]): Self = StObject.set(x, "properties", js.Any.fromFunction0(value))
    
    inline def setValue(value: () => Any): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
  }
}
