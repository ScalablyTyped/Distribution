package typings.reactSpringShared

import typings.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("@react-spring/shared/cjs/hooks", "useForceUpdate")
  @js.native
  def useForceUpdate(): js.Function0[Unit] = js.native
  
  @JSImport("@react-spring/shared/cjs/hooks", "useOnce")
  @js.native
  val useOnce: UseOnce_ = js.native
  
  @JSImport("@react-spring/shared/cjs/hooks", "usePrev")
  @js.native
  def usePrev[T](value: T): js.UndefOr[T] = js.native
  
  type UseOnce_ = js.Function1[/* effect */ EffectCallback, Unit]
}
