package typings.recoil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recoil", "readOnlySelector")
@js.native
object readOnlySelector extends js.Object {
  def apply[T](atom: RecoilValue[T]): RecoilValueReadOnly[T] = js.native
}

