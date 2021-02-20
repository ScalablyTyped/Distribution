package typings.rbx

import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("rbx/utils", "canUseDOM")
  @js.native
  def canUseDOM(): Boolean = js.native
  
  @JSImport("rbx/utils", "combineRefs")
  @js.native
  def combineRefs[T](refs: (js.UndefOr[(js.Function1[/* instance */ T | Null, Unit]) | RefObject[T] | Null])*): js.Function1[/* instance */ T | Null, Unit] = js.native
  
  @JSImport("rbx/utils", "noop")
  @js.native
  def noop(): Unit = js.native
}
