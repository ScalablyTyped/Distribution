package typings.std

import typings.std.stdStrings.fulfilled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromiseFulfilledResult[T]
  extends StObject
     with PromiseSettledResult[T] {
  
  /* standard es2020.promise */
  var status: fulfilled
  
  /* standard es2020.promise */
  var value: T
}
object PromiseFulfilledResult {
  
  inline def apply[T](value: T): PromiseFulfilledResult[T] = {
    val __obj = js.Dynamic.literal(status = "fulfilled", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseFulfilledResult[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PromiseFulfilledResult[?], T] (val x: Self & PromiseFulfilledResult[T]) extends AnyVal {
    
    inline def setStatus(value: fulfilled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
