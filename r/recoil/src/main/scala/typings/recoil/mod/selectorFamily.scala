package typings.recoil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recoil", "selectorFamily")
@js.native
object selectorFamily extends js.Object {
  
  def apply[T, P /* <: SerializableParam */](options: ReadOnlySelectorFamilyOptions[T, P]): js.Function1[/* param */ P, RecoilValueReadOnly[T]] = js.native
  def apply[T, P /* <: SerializableParam */](options: ReadWriteSelectorFamilyOptions[T, P]): js.Function1[/* param */ P, RecoilState[T]] = js.native
}
