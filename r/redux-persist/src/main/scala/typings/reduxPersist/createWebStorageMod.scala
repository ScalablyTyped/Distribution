package typings.reduxPersist

import typings.reduxPersist.typesMod.WebStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createWebStorageMod {
  
  @JSImport("redux-persist/es/storage/createWebStorage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(`type`: String): WebStorage = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`type`.asInstanceOf[js.Any]).asInstanceOf[WebStorage]
}
