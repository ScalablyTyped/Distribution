package typings.reactNavigationCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-navigation/core/lib/typescript/src/useFocusEffect", JSImport.Namespace)
@js.native
object useFocusEffectMod extends js.Object {
  
  def default(effect: EffectCallback): Unit = js.native
  
  type EffectCallback = js.Function0[js.UndefOr[Unit | js.Function0[Unit]]]
}
