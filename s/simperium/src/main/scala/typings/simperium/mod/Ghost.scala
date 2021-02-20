package typings.simperium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ghost[T] extends StObject {
  
  var data: T = js.native
  
  var key: EntityId = js.native
  
  var version: Double = js.native
}
object Ghost {
  
  @scala.inline
  def apply[T](data: T, key: EntityId, version: Double): Ghost[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ghost[T]]
  }
  
  @scala.inline
  implicit class GhostMutableBuilder[Self <: Ghost[_], T] (val x: Self with Ghost[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: EntityId): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
