package typings.std

import typings.std.stdStrings.fulfilled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiseFulfilledResult[T] extends PromiseSettledResult[T] {
  
  var status: fulfilled = js.native
  
  var value: T = js.native
}
object PromiseFulfilledResult {
  
  @scala.inline
  def apply[T](status: fulfilled, value: T): PromiseFulfilledResult[T] = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseFulfilledResult[T]]
  }
  
  @scala.inline
  implicit class PromiseFulfilledResultMutableBuilder[Self <: PromiseFulfilledResult[_], T] (val x: Self with PromiseFulfilledResult[T]) extends AnyVal {
    
    @scala.inline
    def setStatus(value: fulfilled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
