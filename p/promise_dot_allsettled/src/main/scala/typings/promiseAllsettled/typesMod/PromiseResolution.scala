package typings.promiseAllsettled.typesMod

import typings.promiseAllsettled.promiseAllsettledStrings.fulfilled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseResolution[T]
  extends PromiseResult[T, js.Any] {
  var status: fulfilled
  var value: T
}

object PromiseResolution {
  @scala.inline
  def apply[T](status: fulfilled, value: T): PromiseResolution[T] = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseResolution[T]]
  }
}

