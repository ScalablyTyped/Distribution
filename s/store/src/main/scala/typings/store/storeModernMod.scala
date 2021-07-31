package typings.store

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storeModernMod extends Shortcut {
  
  @JSImport("store/dist/store.modern", JSImport.Namespace)
  @js.native
  val ^ : StoreJsAPI = js.native
  
  type _To = StoreJsAPI
  
  /* This means you don't have to write `^`, but can instead just say `storeModernMod.foo` */
  override def _to: StoreJsAPI = ^
}
