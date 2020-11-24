package typings.reduxPersist

import typings.reduxPersist.typesMod.PersistConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-persist/es/stateReconciler/autoMergeLevel1", JSImport.Namespace)
@js.native
object autoMergeLevel1Mod extends js.Object {
  
  def default[S](inboundState: S, originalState: S, reducedState: S, config: PersistConfig[S, _, _, _]): S = js.native
}
