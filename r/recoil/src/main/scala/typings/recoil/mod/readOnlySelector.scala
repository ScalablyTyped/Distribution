package typings.recoil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recoil", "readOnlySelector")
@js.native
object readOnlySelector extends js.Object {
  
  def apply[T](atom: RecoilValue[T]): RecoilValueReadOnly[T] = js.native
}
