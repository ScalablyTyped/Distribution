package typings.recoil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recoil", "noWait")
@js.native
object noWait extends js.Object {
  
  def apply[T](state: RecoilValue[T]): RecoilValueReadOnly[Loadable[T]] = js.native
}
