package typings.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAssertBoolean extends js.Object {
  var assert: Boolean
}

object AnonAssertBoolean {
  @scala.inline
  def apply(assert: Boolean): AnonAssertBoolean = {
    val __obj = js.Dynamic.literal(assert = assert.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAssertBoolean]
  }
}

