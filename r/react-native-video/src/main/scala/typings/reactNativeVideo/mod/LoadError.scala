package typings.reactNativeVideo.mod

import typings.reactNativeVideo.Anon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadError extends js.Object {
  var error: Anon
}

object LoadError {
  @scala.inline
  def apply(error: Anon): LoadError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadError]
  }
}

