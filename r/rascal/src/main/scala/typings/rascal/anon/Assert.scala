package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assert extends js.Object {
  var assert: Boolean
  var `type`: String
}

object Assert {
  @scala.inline
  def apply(assert: Boolean, `type`: String): Assert = {
    val __obj = js.Dynamic.literal(assert = assert.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assert]
  }
}

