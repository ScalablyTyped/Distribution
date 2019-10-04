package typings.reduxDashPersist

import typings.reduxDashPersist.esTypesMod.PersistConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/lib/getStoredState", JSImport.Namespace)
@js.native
object libGetStoredStateMod extends js.Object {
  def default(config: PersistConfig[_, _, _, _]): js.Promise[js.UndefOr[js.Object]] = js.native
}

