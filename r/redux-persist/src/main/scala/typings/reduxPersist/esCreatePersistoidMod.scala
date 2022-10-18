package typings.reduxPersist

import typings.reduxPersist.esTypesMod.PersistConfig
import typings.reduxPersist.esTypesMod.Persistoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCreatePersistoidMod {
  
  @JSImport("redux-persist/es/createPersistoid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(config: PersistConfig[Any, Any, Any, Any]): Persistoid = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[Persistoid]
}
