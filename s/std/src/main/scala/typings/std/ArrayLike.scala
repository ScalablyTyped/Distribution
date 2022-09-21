package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// non-object or non-thenable
trait ArrayLike[T]
  extends StObject
     with /* standard es5 */
/* n */ NumberDictionary[T] {
  
  /* standard es5 */
  val length: Double
}
object ArrayLike {
  
  inline def apply[T](length: Double): ArrayLike[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayLike[T]]
  }
  
  extension [Self <: ArrayLike[?], T](x: Self & ArrayLike[T]) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
