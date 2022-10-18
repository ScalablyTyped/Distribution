package typings.reactRedux

import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsUseIsomorphicLayoutEffectMod {
  
  @JSImport("react-redux/es/utils/useIsomorphicLayoutEffect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-redux/es/utils/useIsomorphicLayoutEffect", "canUseDOM")
  @js.native
  val canUseDOM: Boolean = js.native
  
  inline def useIsomorphicLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useIsomorphicLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
