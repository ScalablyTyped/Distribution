package typings.reactSpringShared

import typings.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmHooksMod {
  
  @JSImport("@react-spring/shared/esm/hooks", "useForceUpdate")
  @js.native
  def useForceUpdate(): js.Function0[Unit] = js.native
  
  @JSImport("@react-spring/shared/esm/hooks", "useOnce")
  @js.native
  val useOnce: UseOnce_ = js.native
  
  @JSImport("@react-spring/shared/esm/hooks", "usePrev")
  @js.native
  def usePrev[T](value: T): js.UndefOr[T] = js.native
  
  type UseOnce_ = js.Function1[/* effect */ EffectCallback, Unit]
}
