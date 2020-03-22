package typings.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAssert extends js.Object {
  var assert: Boolean
  var `type`: String
}

object AnonAssert {
  @scala.inline
  def apply(assert: Boolean, `type`: String): AnonAssert = {
    val __obj = js.Dynamic.literal(assert = assert.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAssert]
  }
}

