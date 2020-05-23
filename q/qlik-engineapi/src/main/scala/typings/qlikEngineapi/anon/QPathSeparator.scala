package typings.qlikEngineapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QPathSeparator extends js.Object {
  /**
    * Path Separator for the OS
    */
  var qPathSeparator: String
}

object QPathSeparator {
  @scala.inline
  def apply(qPathSeparator: String): QPathSeparator = {
    val __obj = js.Dynamic.literal(qPathSeparator = qPathSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[QPathSeparator]
  }
}

