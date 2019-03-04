package typings
package reduxDashPromiseDashMiddlewareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type[PA /* <: reduxDashPromiseDashMiddlewareLib.reduxDashPromiseDashMiddlewareMod.reduxMod.PromiseAction[R] */] extends js.Object {
  var `type`: java.lang.String
  var value: reduxDashPromiseDashMiddlewareLib.reduxDashPromiseDashMiddlewareMod.reduxMod.PayloadType[PA]
}

object Anon_Type {
  @scala.inline
  def apply[PA /* <: reduxDashPromiseDashMiddlewareLib.reduxDashPromiseDashMiddlewareMod.reduxMod.PromiseAction[R] */](
    `type`: java.lang.String,
    value: reduxDashPromiseDashMiddlewareLib.reduxDashPromiseDashMiddlewareMod.reduxMod.PayloadType[PA]
  ): Anon_Type[PA] = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Type[PA]]
  }
}

