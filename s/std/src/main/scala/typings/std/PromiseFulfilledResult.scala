package typings.std

import typings.std.stdStrings.fulfilled
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
  implicit class PromiseFulfilledResultOps[Self <: PromiseFulfilledResult[_], T] (val x: Self with PromiseFulfilledResult[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStatus(value: fulfilled): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

