package typings.reactNativeVideo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _empty extends js.Object {
  @JSName("")
  var _empty: String
  var errorString: String
}

object _empty {
  @scala.inline
  def apply(_empty: String, errorString: String): _empty = {
    val __obj = js.Dynamic.literal(errorString = errorString.asInstanceOf[js.Any])
    __obj.updateDynamic("")(_empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[_empty]
  }
}

