package typings.reactAsync.mod

import typings.reactAsync.anon.Dictmeta
import typings.reactAsync.reactAsyncStrings.fulfill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-async.react-async.AbstractAction & {  type :'fulfill',   payload :T} */
@js.native
trait Fulfill[T] extends AsyncAction[T] {
  
  var meta: Dictmeta = js.native
  
  var payload: T = js.native
  
  var `type`: String with fulfill = js.native
}
object Fulfill {
  
  @scala.inline
  def apply[T](meta: Dictmeta, payload: T, `type`: String with fulfill): Fulfill[T] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fulfill[T]]
  }
  
  @scala.inline
  implicit class FulfillMutableBuilder[Self <: Fulfill[_], T] (val x: Self with Fulfill[T]) extends AnyVal {
    
    @scala.inline
    def setMeta(value: Dictmeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: T): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String with fulfill): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
