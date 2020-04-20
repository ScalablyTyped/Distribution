package typings.qlikEngineapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQPathSeparator extends js.Object {
  /**
    * Path Separator for the OS
    */
  var qPathSeparator: String
}

object AnonQPathSeparator {
  @scala.inline
  def apply(qPathSeparator: String): AnonQPathSeparator = {
    val __obj = js.Dynamic.literal(qPathSeparator = qPathSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQPathSeparator]
  }
}

