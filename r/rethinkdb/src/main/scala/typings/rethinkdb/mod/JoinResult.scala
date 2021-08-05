package typings.rethinkdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JoinResult extends StObject {
  
  var left: js.Any
  
  var right: js.Any
}
object JoinResult {
  
  inline def apply(left: js.Any, right: js.Any): JoinResult = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinResult]
  }
  
  extension [Self <: JoinResult](x: Self) {
    
    inline def setLeft(value: js.Any): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: js.Any): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
