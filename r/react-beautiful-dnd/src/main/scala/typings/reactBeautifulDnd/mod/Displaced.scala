package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Displaced extends StObject {
  
  var backwards: DisplacementGroups
  
  var forwards: DisplacementGroups
}
object Displaced {
  
  inline def apply(backwards: DisplacementGroups, forwards: DisplacementGroups): Displaced = {
    val __obj = js.Dynamic.literal(backwards = backwards.asInstanceOf[js.Any], forwards = forwards.asInstanceOf[js.Any])
    __obj.asInstanceOf[Displaced]
  }
  
  extension [Self <: Displaced](x: Self) {
    
    inline def setBackwards(value: DisplacementGroups): Self = StObject.set(x, "backwards", value.asInstanceOf[js.Any])
    
    inline def setForwards(value: DisplacementGroups): Self = StObject.set(x, "forwards", value.asInstanceOf[js.Any])
  }
}
