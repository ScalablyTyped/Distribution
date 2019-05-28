package typings
package reduxDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Form extends js.Object {
  def apply[T](
    form: java.lang.String,
    syncWarnings: reduxDashFormLib.reduxDashFormMod.FormWarnings[_, T],
    warning: T
  ): reduxDashFormLib.libActionsMod.FormAction = js.native
}

