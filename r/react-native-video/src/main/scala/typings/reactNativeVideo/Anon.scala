package typings.reactNativeVideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon extends js.Object {
  @JSName("")
  var _empty: String
  var errorString: String
}

object Anon {
  @scala.inline
  def apply(_empty: String, errorString: String): Anon = {
    val __obj = js.Dynamic.literal(errorString = errorString.asInstanceOf[js.Any])
    __obj.updateDynamic("")(_empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon]
  }
}

