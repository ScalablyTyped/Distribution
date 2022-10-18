package typings.reduxPersist

import typings.reduxPersist.esTypesMod.WebStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esStorageCreateWebStorageMod {
  
  @JSImport("redux-persist/es/storage/createWebStorage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(`type`: String): WebStorage = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`type`.asInstanceOf[js.Any]).asInstanceOf[WebStorage]
}
