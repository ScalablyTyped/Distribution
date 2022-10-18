package typings.ramlTypesystem.distSrcTypesystemInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyInfo extends StObject {
  
  def annotations(): js.Array[IAnnotation]
  
  def declaredAt(): IParsedType
  
  def isAdditional(): Boolean
  
  def isPattern(): Boolean
  
  def name(): String
  
  def range(): IParsedType
  
  def required(): Boolean
}
object IPropertyInfo {
  
  inline def apply(
    annotations: () => js.Array[IAnnotation],
    declaredAt: () => IParsedType,
    isAdditional: () => Boolean,
    isPattern: () => Boolean,
    name: () => String,
    range: () => IParsedType,
    required: () => Boolean
  ): IPropertyInfo = {
    val __obj = js.Dynamic.literal(annotations = js.Any.fromFunction0(annotations), declaredAt = js.Any.fromFunction0(declaredAt), isAdditional = js.Any.fromFunction0(isAdditional), isPattern = js.Any.fromFunction0(isPattern), name = js.Any.fromFunction0(name), range = js.Any.fromFunction0(range), required = js.Any.fromFunction0(required))
    __obj.asInstanceOf[IPropertyInfo]
  }
  
  extension [Self <: IPropertyInfo](x: Self) {
    
    inline def setAnnotations(value: () => js.Array[IAnnotation]): Self = StObject.set(x, "annotations", js.Any.fromFunction0(value))
    
    inline def setDeclaredAt(value: () => IParsedType): Self = StObject.set(x, "declaredAt", js.Any.fromFunction0(value))
    
    inline def setIsAdditional(value: () => Boolean): Self = StObject.set(x, "isAdditional", js.Any.fromFunction0(value))
    
    inline def setIsPattern(value: () => Boolean): Self = StObject.set(x, "isPattern", js.Any.fromFunction0(value))
    
    inline def setName(value: () => String): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
    
    inline def setRange(value: () => IParsedType): Self = StObject.set(x, "range", js.Any.fromFunction0(value))
    
    inline def setRequired(value: () => Boolean): Self = StObject.set(x, "required", js.Any.fromFunction0(value))
  }
}
