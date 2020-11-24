package typings.rbx

import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rbx/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def canUseDOM(): Boolean = js.native
  
  def combineRefs[T](refs: (js.UndefOr[(js.Function1[/* instance */ T | Null, Unit]) | RefObject[T] | Null])*): js.Function1[/* instance */ T | Null, Unit] = js.native
  
  def noop(): Unit = js.native
}
