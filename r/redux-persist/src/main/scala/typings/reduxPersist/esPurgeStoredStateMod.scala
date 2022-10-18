package typings.reduxPersist

import typings.reduxPersist.esTypesMod.PersistConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPurgeStoredStateMod {
  
  @JSImport("redux-persist/es/purgeStoredState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S](config: PersistConfig[S, Any, Any, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[Any]
}
