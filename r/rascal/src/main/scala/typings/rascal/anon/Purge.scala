package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Purge extends js.Object {
  var assert: Boolean
  var options: Durable
  var purge: Boolean
}

object Purge {
  @scala.inline
  def apply(assert: Boolean, options: Durable, purge: Boolean): Purge = {
    val __obj = js.Dynamic.literal(assert = assert.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], purge = purge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Purge]
  }
}

