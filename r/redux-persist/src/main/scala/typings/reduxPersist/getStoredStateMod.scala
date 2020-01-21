package typings.reduxPersist

import typings.reduxPersist.typesMod.PersistConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/es/getStoredState", JSImport.Namespace)
@js.native
object getStoredStateMod extends js.Object {
  def default(config: PersistConfig[_, _, _, _]): js.Promise[js.UndefOr[js.Object]] = js.native
}

