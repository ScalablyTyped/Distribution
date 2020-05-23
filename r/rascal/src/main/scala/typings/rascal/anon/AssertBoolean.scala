package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertBoolean extends js.Object {
  var assert: Boolean
}

object AssertBoolean {
  @scala.inline
  def apply(assert: Boolean): AssertBoolean = {
    val __obj = js.Dynamic.literal(assert = assert.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertBoolean]
  }
}

