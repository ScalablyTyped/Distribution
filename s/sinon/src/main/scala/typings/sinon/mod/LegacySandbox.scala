package typings.sinon.mod

import typings.sinon.Anon0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegacySandbox extends js.Object {
  var sandbox: Anon0
}

object LegacySandbox {
  @scala.inline
  def apply(sandbox: Anon0): LegacySandbox = {
    val __obj = js.Dynamic.literal(sandbox = sandbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacySandbox]
  }
}

