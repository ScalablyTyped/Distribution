package typings.reduxPersist

import typings.reduxPersist.typesMod.PersistConfig
import typings.reduxPersist.typesMod.Persistoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createPersistoidMod {
  
  @JSImport("redux-persist/es/createPersistoid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(config: PersistConfig[js.Any, js.Any, js.Any, js.Any]): Persistoid = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[Persistoid]
}
