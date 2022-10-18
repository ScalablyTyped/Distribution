package typings.ramlTypesystem.distSrcTypesystemInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnnotationInstance extends StObject {
  
  /**
    * Annotation definition type
    */
  def definition(): IParsedType
  
  /**
    * Annotation name
    */
  def name(): String
  
  /**
    * Annotation value
    */
  def value(): Any
}
object IAnnotationInstance {
  
  inline def apply(definition: () => IParsedType, name: () => String, value: () => Any): IAnnotationInstance = {
    val __obj = js.Dynamic.literal(definition = js.Any.fromFunction0(definition), name = js.Any.fromFunction0(name), value = js.Any.fromFunction0(value))
    __obj.asInstanceOf[IAnnotationInstance]
  }
  
  extension [Self <: IAnnotationInstance](x: Self) {
    
    inline def setDefinition(value: () => IParsedType): Self = StObject.set(x, "definition", js.Any.fromFunction0(value))
    
    inline def setName(value: () => String): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
    
    inline def setValue(value: () => Any): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
  }
}
