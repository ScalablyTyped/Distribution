package typings.rdflib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RDF extends StObject {
  
  var RDF: String
  
  var RDFS: String
}
object RDF {
  
  inline def apply(RDF: String, RDFS: String): RDF = {
    val __obj = js.Dynamic.literal(RDF = RDF.asInstanceOf[js.Any], RDFS = RDFS.asInstanceOf[js.Any])
    __obj.asInstanceOf[RDF]
  }
  
  extension [Self <: RDF](x: Self) {
    
    inline def setRDF(value: String): Self = StObject.set(x, "RDF", value.asInstanceOf[js.Any])
    
    inline def setRDFS(value: String): Self = StObject.set(x, "RDFS", value.asInstanceOf[js.Any])
  }
}
