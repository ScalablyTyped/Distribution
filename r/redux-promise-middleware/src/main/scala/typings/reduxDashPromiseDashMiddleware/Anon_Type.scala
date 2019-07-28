package typings.reduxDashPromiseDashMiddleware

import typings.reduxDashPromiseDashMiddleware.reduxDashPromiseDashMiddlewareMod.reduxMod.PayloadType
import typings.reduxDashPromiseDashMiddleware.reduxDashPromiseDashMiddlewareMod.reduxMod.PromiseAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type[PA /* <: PromiseAction[R] */] extends js.Object {
  var `type`: String
  var value: PayloadType[PA]
}

object Anon_Type {
  @scala.inline
  def apply[PA /* <: PromiseAction[R] */](`type`: String, value: PayloadType[PA]): Anon_Type[PA] = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Type[PA]]
  }
}

