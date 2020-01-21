package typings.reduxPersist

import typings.reduxPersist.typesMod.PersistConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/lib/purgeStoredState", JSImport.Namespace)
@js.native
object libPurgeStoredStateMod extends js.Object {
  def default[S](config: PersistConfig[S, _, _, _]): js.Any = js.native
}

