package typings
package reduxDashBootstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accept extends js.Object {
  def accept(path: java.lang.String, cb: js.Function0[scala.Unit]): scala.Unit
}

object Anon_Accept {
  @scala.inline
  def apply(accept: js.Function2[java.lang.String, js.Function0[scala.Unit], scala.Unit]): Anon_Accept = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accept")(accept)
    __obj.asInstanceOf[Anon_Accept]
  }
}

