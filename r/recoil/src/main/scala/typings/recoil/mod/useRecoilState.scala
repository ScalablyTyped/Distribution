package typings.recoil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recoil", "useRecoilState")
@js.native
object useRecoilState extends js.Object {
  def apply[T](recoilState: RecoilState[T]): js.Tuple2[T, SetterOrUpdater[T]] = js.native
}

