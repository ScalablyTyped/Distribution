package typings.reactNativeVideo.mod

import typings.reactNativeVideo.anon._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadError extends js.Object {
  var error: _empty = js.native
}

object LoadError {
  @scala.inline
  def apply(error: _empty): LoadError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadError]
  }
  @scala.inline
  implicit class LoadErrorOps[Self <: LoadError] (val x: Self) extends AnyVal {
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
    def setError(value: _empty): Self = this.set("error", value.asInstanceOf[js.Any])
  }
  
}

