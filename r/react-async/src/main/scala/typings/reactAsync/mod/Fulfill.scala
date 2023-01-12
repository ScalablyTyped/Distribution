package typings.reactAsync.mod

import typings.reactAsync.anon.Dictmeta
import typings.reactAsync.reactAsyncStrings.fulfill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fulfill[T]
  extends StObject
     with AbstractAction
     with AsyncAction[T] {
  
  var payload: T
  
  @JSName("type")
  var type_Fulfill: fulfill
}
object Fulfill {
  
  inline def apply[T](meta: Dictmeta, payload: T): Fulfill[T] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fulfill")
    __obj.asInstanceOf[Fulfill[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fulfill[?], T] (val x: Self & Fulfill[T]) extends AnyVal {
    
    inline def setPayload(value: T): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: fulfill): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
