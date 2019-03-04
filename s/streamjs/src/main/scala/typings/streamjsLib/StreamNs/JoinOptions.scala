package typings
package streamjsLib.StreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JoinOptions extends js.Object {
  var delimiter: java.lang.String
  var prefix: java.lang.String
  var suffix: java.lang.String
}

object JoinOptions {
  @scala.inline
  def apply(delimiter: java.lang.String, prefix: java.lang.String, suffix: java.lang.String): JoinOptions = {
    val __obj = js.Dynamic.literal(delimiter = delimiter, prefix = prefix, suffix = suffix)
  
    __obj.asInstanceOf[JoinOptions]
  }
}

