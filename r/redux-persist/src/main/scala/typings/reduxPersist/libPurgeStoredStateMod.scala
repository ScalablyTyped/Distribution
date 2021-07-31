package typings.reduxPersist

import typings.reduxPersist.typesMod.PersistConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPurgeStoredStateMod {
  
  @JSImport("redux-persist/lib/purgeStoredState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[S](config: PersistConfig[S, js.Any, js.Any, js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
