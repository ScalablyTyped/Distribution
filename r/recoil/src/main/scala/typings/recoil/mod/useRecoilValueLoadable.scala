package typings.recoil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recoil", "useRecoilValueLoadable")
@js.native
object useRecoilValueLoadable extends js.Object {
  
  def apply[T](recoilValue: RecoilValue[T]): Loadable[T] = js.native
}
