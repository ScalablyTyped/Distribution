package typings.reduxDashPersist

import typings.reduxDashPersist.esTypesMod.PersistConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/es/getStoredState", JSImport.Namespace)
@js.native
object esGetStoredStateMod extends js.Object {
  def getStoredState(config: PersistConfig): js.Promise[_ | Unit] = js.native
}

