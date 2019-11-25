package typings.sinon.sinonMod

import typings.sinon.Anon_Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegacySandbox extends js.Object {
  var sandbox: Anon_Config
}

object LegacySandbox {
  @scala.inline
  def apply(sandbox: Anon_Config): LegacySandbox = {
    val __obj = js.Dynamic.literal(sandbox = sandbox.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LegacySandbox]
  }
}

