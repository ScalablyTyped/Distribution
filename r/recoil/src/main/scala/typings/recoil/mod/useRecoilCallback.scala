package typings.recoil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recoil", "useRecoilCallback")
@js.native
object useRecoilCallback extends js.Object {
  def apply[Args /* <: js.Array[_] */, Return](fn: js.Function2[/* interface */ CallbackInterface, /* args */ Args, Return]): js.Function1[/* args */ Args, Return] = js.native
  def apply[Args /* <: js.Array[_] */, Return](fn: js.Function2[/* interface */ CallbackInterface, /* args */ Args, Return], deps: js.Array[_]): js.Function1[/* args */ Args, Return] = js.native
}

