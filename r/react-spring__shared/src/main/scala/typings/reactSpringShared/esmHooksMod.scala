package typings.reactSpringShared

import typings.react.mod.EffectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-spring/shared/esm/hooks", JSImport.Namespace)
@js.native
object esmHooksMod extends js.Object {
  
  def useForceUpdate(): js.Function0[Unit] = js.native
  
  val useOnce: UseOnce_ = js.native
  
  def usePrev[T](value: T): js.UndefOr[T] = js.native
  
  type UseOnce_ = js.Function1[/* effect */ EffectCallback, Unit]
}
