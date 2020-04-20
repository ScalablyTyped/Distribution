package typings.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPurge extends js.Object {
  var assert: Boolean
  var options: AnonDurable
  var purge: Boolean
}

object AnonPurge {
  @scala.inline
  def apply(assert: Boolean, options: AnonDurable, purge: Boolean): AnonPurge = {
    val __obj = js.Dynamic.literal(assert = assert.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], purge = purge.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPurge]
  }
}

