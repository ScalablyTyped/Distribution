package typings.reactFilepond.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePondErrorDescription extends js.Object {
  var main: String
  var sub: String
}

object FilePondErrorDescription {
  @scala.inline
  def apply(main: String, sub: String): FilePondErrorDescription = {
    val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FilePondErrorDescription]
  }
}

