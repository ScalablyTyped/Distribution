package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsNameString extends StObject {
  
  var annotations: NameString
}
object AnnotationsNameString {
  
  inline def apply(annotations: NameString): AnnotationsNameString = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsNameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnnotationsNameString] (val x: Self) extends AnyVal {
    
    inline def setAnnotations(value: NameString): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
  }
}
