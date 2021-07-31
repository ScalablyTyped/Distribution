package typings.std

import typings.std.stdStrings.fulfilled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromiseFulfilledResult[T]
  extends StObject
     with PromiseSettledResult[T] {
  
  var status: fulfilled
  
  var value: T
}
object PromiseFulfilledResult {
  
  @scala.inline
  def apply[T](value: T): PromiseFulfilledResult[T] = {
    val __obj = js.Dynamic.literal(status = "fulfilled", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseFulfilledResult[T]]
  }
  
  @scala.inline
  implicit class PromiseFulfilledResultMutableBuilder[Self <: PromiseFulfilledResult[?], T] (val x: Self & PromiseFulfilledResult[T]) extends AnyVal {
    
    @scala.inline
    def setStatus(value: fulfilled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
