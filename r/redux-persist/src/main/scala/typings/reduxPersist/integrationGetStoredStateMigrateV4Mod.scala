package typings.reduxPersist

import typings.reduxPersist.getStoredStateMigrateV4Mod.V4Config
import typings.reduxPersist.typesMod.PersistConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object integrationGetStoredStateMigrateV4Mod {
  
  @JSImport("redux-persist/lib/integration/getStoredStateMigrateV4", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(v4Config: V4Config): js.Function1[
    /* config */ PersistConfig[js.Any, js.Any, js.Any, js.Any], 
    js.Promise[js.UndefOr[js.Object]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(v4Config.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* config */ PersistConfig[js.Any, js.Any, js.Any, js.Any], 
    js.Promise[js.UndefOr[js.Object]]
  ]]
}
