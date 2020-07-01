package typings.recoil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recoil", "useRecoilValueLoadable")
@js.native
object useRecoilValueLoadable extends js.Object {
  def apply[T](recoilValue: RecoilValue[T]): Loadable[T] = js.native
}

