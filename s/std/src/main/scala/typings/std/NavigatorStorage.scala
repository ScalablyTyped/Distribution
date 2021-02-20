package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigatorStorage extends StObject {
  
  val storage: StorageManager = js.native
}
object NavigatorStorage {
  
  @scala.inline
  def apply(storage: StorageManager): NavigatorStorage = {
    val __obj = js.Dynamic.literal(storage = storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorStorage]
  }
  
  @scala.inline
  implicit class NavigatorStorageMutableBuilder[Self <: NavigatorStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStorage(value: StorageManager): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
  }
}
