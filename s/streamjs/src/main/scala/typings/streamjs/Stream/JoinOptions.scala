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
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JoinOptions]
  }
}

