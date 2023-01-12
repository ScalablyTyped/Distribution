package typings.ramlTypesystem.distSrcTypesystemInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnnotated extends StObject {
  
  def annotation(name: String): Any
  
  def annotations(): js.Array[IAnnotation]
}
object IAnnotated {
  
  inline def apply(annotation: String => Any, annotations: () => js.Array[IAnnotation]): IAnnotated = {
    val __obj = js.Dynamic.literal(annotation = js.Any.fromFunction1(annotation), annotations = js.Any.fromFunction0(annotations))
    __obj.asInstanceOf[IAnnotated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAnnotated] (val x: Self) extends AnyVal {
    
    inline def setAnnotation(value: String => Any): Self = StObject.set(x, "annotation", js.Any.fromFunction1(value))
    
    inline def setAnnotations(value: () => js.Array[IAnnotation]): Self = StObject.set(x, "annotations", js.Any.fromFunction0(value))
  }
}
