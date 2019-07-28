package typings.reduxDashPersist

import typings.reduxDashPersist.esTypesMod.PersistConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/lib/getStoredState", JSImport.Namespace)
@js.native
object libGetStoredStateMod extends js.Object {
  def getStoredState(config: PersistConfig): js.Promise[_ | Unit] = js.native
}

