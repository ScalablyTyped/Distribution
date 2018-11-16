package typings
package siestaLib.SiestaNs.TestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IActionConfig
  extends IActionCall
     with IAction {
  var action: js.UndefOr[IActionCall] = js.native
  var timeout: js.UndefOr[scala.Double] = js.native
  /* InferMemberOverrides */
  override def apply(T0: /* next */ js.Function1[/* repeated */js.Any, scala.Unit], T1: /* repeated */js.Any): scala.Unit = js.native
}

