package typings.promiseAllsettled.typesMod

import typings.promiseAllsettled.promiseAllsettledStrings.fulfilled
import typings.promiseAllsettled.promiseAllsettledStrings.rejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.promiseAllsettled.typesMod.PromiseResolution[T]
  - typings.promiseAllsettled.typesMod.PromiseRejection[E]
*/
trait PromiseResult[T, E] extends js.Object

object PromiseResult {
  @scala.inline
  def PromiseResolution[T, E](status: fulfilled, value: T): PromiseResult[T, E] = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseResult[T, E]]
  }
  @scala.inline
  def PromiseRejection[T, E](reason: E, status: rejected): PromiseResult[T, E] = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseResult[T, E]]
  }
}

