package typings
package sinonLib.sinonMod.SinonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegacySandbox extends js.Object {
  var sandbox: sinonLib.Anon_Config
}

object LegacySandbox {
  @scala.inline
  def apply(sandbox: sinonLib.Anon_Config): LegacySandbox = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sandbox")(sandbox)
    __obj.asInstanceOf[LegacySandbox]
  }
}

