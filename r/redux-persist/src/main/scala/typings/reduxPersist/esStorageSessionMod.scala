package typings.reduxPersist

import org.scalablytyped.runtime.Shortcut
import typings.reduxPersist.esTypesMod.WebStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esStorageSessionMod extends Shortcut {
  
  @JSImport("redux-persist/es/storage/session", JSImport.Default)
  @js.native
  val default: WebStorage = js.native
  
  type _To = WebStorage
  
  /* This means you don't have to write `default`, but can instead just say `esStorageSessionMod.foo` */
  override def _to: WebStorage = default
}
