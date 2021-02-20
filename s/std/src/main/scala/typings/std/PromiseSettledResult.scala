package typings.std

import typings.std.stdStrings.fulfilled
import typings.std.stdStrings.rejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.std.PromiseFulfilledResult[T]
  - typings.std.PromiseRejectedResult
*/
trait PromiseSettledResult[T] extends StObject
object PromiseSettledResult {
  
  @scala.inline
  def PromiseFulfilledResult[T](status: fulfilled, value: T): typings.std.PromiseFulfilledResult[T] = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.std.PromiseFulfilledResult[T]]
  }
  
  @scala.inline
  def PromiseRejectedResult(reason: js.Any, status: rejected): typings.std.PromiseRejectedResult = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.std.PromiseRejectedResult]
  }
}
