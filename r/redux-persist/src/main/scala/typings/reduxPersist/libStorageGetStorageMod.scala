package typings.reduxPersist

import typings.reduxPersist.esTypesMod.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStorageGetStorageMod {
  
  @JSImport("redux-persist/lib/storage/getStorage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(`type`: String): Storage = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`type`.asInstanceOf[js.Any]).asInstanceOf[Storage]
}
