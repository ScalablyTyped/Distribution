package typings.searchIndex.mod

import typings.searchIndex.anon.EXCLUDE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NOT
  extends StObject
     with QueryVerb {
  
  var NOT: EXCLUDE
}
object NOT {
  
  inline def apply(NOT: EXCLUDE): NOT = {
    val __obj = js.Dynamic.literal(NOT = NOT.asInstanceOf[js.Any])
    __obj.asInstanceOf[NOT]
  }
  
  extension [Self <: NOT](x: Self) {
    
    inline def setNOT(value: EXCLUDE): Self = StObject.set(x, "NOT", value.asInstanceOf[js.Any])
  }
}
