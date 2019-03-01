package typings
package reactDashI18nextLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Init extends js.Object {
  var `type`: java.lang.String
  def init(instance: i18nextLib.i18nextMod.i18nextNs.i18n): scala.Unit
}

object Anon_Init {
  @scala.inline
  def apply(init: js.Function1[i18nextLib.i18nextMod.i18nextNs.i18n, scala.Unit], `type`: java.lang.String): Anon_Init = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("init")(init)
    __obj.asInstanceOf[Anon_Init]
  }
}

