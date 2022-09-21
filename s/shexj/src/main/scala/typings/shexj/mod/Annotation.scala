package typings.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Annotation extends StObject {
  
  /**
    * A value for the above {@link predicate}.
    */
  var `object`: objectValue
  
  /**
    * The <a href="https://www.w3.org/TR/json-ld11/#node-identifiers">RDF Predicate</a> of the annotation.
    */
  var predicate: IRI
  
  /**
    * Mandatory type "Annotation".
    */
  var `type`: typings.shexj.shexjStrings.Annotation
}
object Annotation {
  
  inline def apply(`object`: objectValue, predicate: IRI): Annotation = {
    val __obj = js.Dynamic.literal(predicate = predicate.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Annotation")
    __obj.asInstanceOf[Annotation]
  }
  
  extension [Self <: Annotation](x: Self) {
    
    inline def setObject(value: objectValue): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPredicate(value: IRI): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.shexj.shexjStrings.Annotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
