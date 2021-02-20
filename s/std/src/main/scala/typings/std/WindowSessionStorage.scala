package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowSessionStorage extends StObject {
  
  val sessionStorage: Storage = js.native
}
object WindowSessionStorage {
  
  @scala.inline
  def apply(sessionStorage: Storage): WindowSessionStorage = {
    val __obj = js.Dynamic.literal(sessionStorage = sessionStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowSessionStorage]
  }
  
  @scala.inline
  implicit class WindowSessionStorageMutableBuilder[Self <: WindowSessionStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSessionStorage(value: Storage): Self = StObject.set(x, "sessionStorage", value.asInstanceOf[js.Any])
  }
}
