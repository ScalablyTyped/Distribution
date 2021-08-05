package typings.reactSpringShared

import typings.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("@react-spring/shared/cjs/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useForceUpdate(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForceUpdate")().asInstanceOf[js.Function0[Unit]]
  
  @JSImport("@react-spring/shared/cjs/hooks", "useOnce")
  @js.native
  val useOnce: UseOnce_ = js.native
  
  inline def usePrev[T](value: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePrev")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  type UseOnce_ = js.Function1[/* effect */ EffectCallback, Unit]
}
