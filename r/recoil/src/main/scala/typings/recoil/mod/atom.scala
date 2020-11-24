package typings.recoil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recoil", "atom")
@js.native
object atom extends js.Object {
  
  def apply[T](options: AtomOptions[T]): RecoilState[T] = js.native
}
