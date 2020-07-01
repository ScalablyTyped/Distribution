package typings.recoil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recoil", "useRecoilStateLoadable")
@js.native
object useRecoilStateLoadable extends js.Object {
  def apply[T](recoilState: RecoilState[T]): js.Tuple2[Loadable[T], SetterOrUpdater[T]] = js.native
}

