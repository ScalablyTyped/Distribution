package typings.reactAsync.mod

import typings.reactAsync.anon.Dictmeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactAsync.mod.Start
  - typings.reactAsync.mod.Cancel
  - typings.reactAsync.mod.Fulfill[T]
  - typings.reactAsync.mod.Reject
*/
trait AsyncAction[T] extends StObject
object AsyncAction {
  
  inline def Cancel(meta: Dictmeta): typings.reactAsync.mod.Cancel = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("cancel")
    __obj.asInstanceOf[typings.reactAsync.mod.Cancel]
  }
  
  inline def Fulfill[T](meta: Dictmeta, payload: T): typings.reactAsync.mod.Fulfill[T] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fulfill")
    __obj.asInstanceOf[typings.reactAsync.mod.Fulfill[T]]
  }
  
  inline def Reject(meta: Dictmeta, payload: js.Error): typings.reactAsync.mod.Reject = {
    val __obj = js.Dynamic.literal(error = true, meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reject")
    __obj.asInstanceOf[typings.reactAsync.mod.Reject]
  }
  
  inline def Start(meta: Dictmeta, payload: () => js.Promise[Unit]): typings.reactAsync.mod.Start = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = js.Any.fromFunction0(payload))
    __obj.updateDynamic("type")("start")
    __obj.asInstanceOf[typings.reactAsync.mod.Start]
  }
}
