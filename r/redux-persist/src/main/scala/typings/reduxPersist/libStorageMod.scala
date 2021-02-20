package typings.reduxPersist

import org.scalablytyped.runtime.Shortcut
import typings.reduxPersist.typesMod.WebStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStorageMod extends Shortcut {
  
  @JSImport("redux-persist/lib/storage", JSImport.Default)
  @js.native
  val default: WebStorage = js.native
  
  type _To = WebStorage
  
  /* This means you don't have to write `default`, but can instead just say `libStorageMod.foo` */
  override def _to: WebStorage = default
}
