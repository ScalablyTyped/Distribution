package typings.reactShare.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCount extends StObject {
  
  def updateCount(index: String, count: String): Unit
}
object UpdateCount {
  
  inline def apply(updateCount: (String, String) => Unit): UpdateCount = {
    val __obj = js.Dynamic.literal(updateCount = js.Any.fromFunction2(updateCount))
    __obj.asInstanceOf[UpdateCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCount] (val x: Self) extends AnyVal {
    
    inline def setUpdateCount(value: (String, String) => Unit): Self = StObject.set(x, "updateCount", js.Any.fromFunction2(value))
  }
}
