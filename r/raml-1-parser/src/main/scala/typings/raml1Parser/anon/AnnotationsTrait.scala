package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsTrait extends StObject {
  
  var annotations: NameString
  
  var `trait`: Domain
}
object AnnotationsTrait {
  
  inline def apply(annotations: NameString, `trait`: Domain): AnnotationsTrait = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any])
    __obj.updateDynamic("trait")(`trait`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsTrait]
  }
  
  extension [Self <: AnnotationsTrait](x: Self) {
    
    inline def setAnnotations(value: NameString): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setTrait(value: Domain): Self = StObject.set(x, "trait", value.asInstanceOf[js.Any])
  }
}
