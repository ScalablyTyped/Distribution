package typings.sparqljs.mod

import typings.sparqljs.sparqljsBooleans.`false`
import typings.sparqljs.sparqljsStrings.load
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadOperation
  extends StObject
     with ManagementOperation {
  
  var destination: IriTerm | `false`
  
  var silent: Boolean
  
  var source: IriTerm
  
  var `type`: load
}
object LoadOperation {
  
  inline def apply(destination: IriTerm | `false`, silent: Boolean, source: IriTerm): LoadOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("load")
    __obj.asInstanceOf[LoadOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadOperation] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: IriTerm | `false`): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSource(value: IriTerm): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: load): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
