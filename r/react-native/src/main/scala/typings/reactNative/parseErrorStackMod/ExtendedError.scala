package typings.reactNative.parseErrorStackMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtendedError extends Error {
  var framesToPop: js.UndefOr[Double] = js.native
}

object ExtendedError {
  @scala.inline
  def apply(message: String, name: String): ExtendedError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedError]
  }
  @scala.inline
  implicit class ExtendedErrorOps[Self <: ExtendedError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFramesToPop(value: Double): Self = this.set("framesToPop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramesToPop: Self = this.set("framesToPop", js.undefined)
  }
  
}

