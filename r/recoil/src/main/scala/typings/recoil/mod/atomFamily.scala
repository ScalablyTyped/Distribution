package typings.recoil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recoil", "atomFamily")
@js.native
object atomFamily extends js.Object {
  def apply[T, P /* <: SerializableParam */](options: AtomFamilyOptions[T, P]): js.Function1[/* param */ P, RecoilState[T]] = js.native
}

