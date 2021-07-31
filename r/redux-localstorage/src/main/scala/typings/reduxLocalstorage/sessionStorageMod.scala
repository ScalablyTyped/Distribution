package typings.reduxLocalstorage

import org.scalablytyped.runtime.Shortcut
import typings.reduxLocalstorage.mod.StorageAdapterCreator
import typings.std.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionStorageMod extends Shortcut {
  
  @JSImport("redux-localstorage/lib/adapters/sessionStorage", JSImport.Namespace)
  @js.native
  val ^ : StorageAdapterCreator[Storage] = js.native
  
  type _To = StorageAdapterCreator[Storage]
  
  /* This means you don't have to write `^`, but can instead just say `sessionStorageMod.foo` */
  override def _to: StorageAdapterCreator[Storage] = ^
}
