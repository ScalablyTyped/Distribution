package typings.rcSelect

import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useLayoutEffectMod {
  
  @JSImport("rc-select/lib/hooks/useLayoutEffect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def default(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
