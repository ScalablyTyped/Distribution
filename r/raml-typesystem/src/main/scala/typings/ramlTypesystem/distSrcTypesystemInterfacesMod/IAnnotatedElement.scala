package typings.ramlTypesystem.distSrcTypesystemInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnnotatedElement extends StObject {
  
  /**
    * Array view on the annotations applied
    */
  def annotations(): js.Array[IAnnotationInstance]
  
  /**
    * Map view on the annotations applied
    */
  def annotationsMap(): StringDictionary[IAnnotationInstance]
  
  /**
    * The element itself
    */
  def entry(): Any
  
  /**
    * Element kind
    */
  def kind(): String
  
  /**
    * Element name
    */
  def name(): String
  
  /**
    * JSON representation of the entry
    */
  def value(): Any
}
object IAnnotatedElement {
  
  inline def apply(
    annotations: () => js.Array[IAnnotationInstance],
    annotationsMap: () => StringDictionary[IAnnotationInstance],
    entry: () => Any,
    kind: () => String,
    name: () => String,
    value: () => Any
  ): IAnnotatedElement = {
    val __obj = js.Dynamic.literal(annotations = js.Any.fromFunction0(annotations), annotationsMap = js.Any.fromFunction0(annotationsMap), entry = js.Any.fromFunction0(entry), kind = js.Any.fromFunction0(kind), name = js.Any.fromFunction0(name), value = js.Any.fromFunction0(value))
    __obj.asInstanceOf[IAnnotatedElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAnnotatedElement] (val x: Self) extends AnyVal {
    
    inline def setAnnotations(value: () => js.Array[IAnnotationInstance]): Self = StObject.set(x, "annotations", js.Any.fromFunction0(value))
    
    inline def setAnnotationsMap(value: () => StringDictionary[IAnnotationInstance]): Self = StObject.set(x, "annotationsMap", js.Any.fromFunction0(value))
    
    inline def setEntry(value: () => Any): Self = StObject.set(x, "entry", js.Any.fromFunction0(value))
    
    inline def setKind(value: () => String): Self = StObject.set(x, "kind", js.Any.fromFunction0(value))
    
    inline def setName(value: () => String): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
    
    inline def setValue(value: () => Any): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
  }
}
