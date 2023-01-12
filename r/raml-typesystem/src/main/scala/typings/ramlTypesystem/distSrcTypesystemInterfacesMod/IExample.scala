package typings.ramlTypesystem.distSrcTypesystemInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExample extends StObject {
  
  def annotations(): js.Array[IAnnotation]
  
  def annotationsMap(): StringDictionary[js.Array[IAnnotation]]
  
  def description(): String
  
  def displayName(): String
  
  def name(): String
  
  def strict(): Boolean
  
  def value(): Any
}
object IExample {
  
  inline def apply(
    annotations: () => js.Array[IAnnotation],
    annotationsMap: () => StringDictionary[js.Array[IAnnotation]],
    description: () => String,
    displayName: () => String,
    name: () => String,
    strict: () => Boolean,
    value: () => Any
  ): IExample = {
    val __obj = js.Dynamic.literal(annotations = js.Any.fromFunction0(annotations), annotationsMap = js.Any.fromFunction0(annotationsMap), description = js.Any.fromFunction0(description), displayName = js.Any.fromFunction0(displayName), name = js.Any.fromFunction0(name), strict = js.Any.fromFunction0(strict), value = js.Any.fromFunction0(value))
    __obj.asInstanceOf[IExample]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IExample] (val x: Self) extends AnyVal {
    
    inline def setAnnotations(value: () => js.Array[IAnnotation]): Self = StObject.set(x, "annotations", js.Any.fromFunction0(value))
    
    inline def setAnnotationsMap(value: () => StringDictionary[js.Array[IAnnotation]]): Self = StObject.set(x, "annotationsMap", js.Any.fromFunction0(value))
    
    inline def setDescription(value: () => String): Self = StObject.set(x, "description", js.Any.fromFunction0(value))
    
    inline def setDisplayName(value: () => String): Self = StObject.set(x, "displayName", js.Any.fromFunction0(value))
    
    inline def setName(value: () => String): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
    
    inline def setStrict(value: () => Boolean): Self = StObject.set(x, "strict", js.Any.fromFunction0(value))
    
    inline def setValue(value: () => Any): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
  }
}
