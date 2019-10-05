package typings.streamjs.Stream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JoinOptions extends js.Object {
  var delimiter: String
  var prefix: String
  var suffix: String
}

object JoinOptions {
  @scala.inline
  def apply(delimiter: String, prefix: String, suffix: String): JoinOptions = {
    val __obj = js.Dynamic.literal(delimiter = delimiter, prefix = prefix, suffix = suffix)
  
    __obj.asInstanceOf[JoinOptions]
  }
}

