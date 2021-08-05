package typings.reactNavigationCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFocusEffectMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useFocusEffect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type EffectCallback = js.Function0[js.UndefOr[Unit | js.Function0[Unit]]]
}
