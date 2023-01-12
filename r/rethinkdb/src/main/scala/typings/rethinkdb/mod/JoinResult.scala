package typings.rethinkdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JoinResult extends StObject {
  
  var left: Any
  
  var right: Any
}
object JoinResult {
  
  inline def apply(left: Any, right: Any): JoinResult = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JoinResult] (val x: Self) extends AnyVal {
    
    inline def setLeft(value: Any): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Any): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
