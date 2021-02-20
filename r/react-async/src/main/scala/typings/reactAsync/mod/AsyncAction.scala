package typings.reactAsync.mod

import typings.reactAsync.anon.Dictmeta
import typings.reactAsync.reactAsyncBooleans.`true`
import typings.reactAsync.reactAsyncStrings.cancel
import typings.reactAsync.reactAsyncStrings.fulfill
import typings.reactAsync.reactAsyncStrings.reject
import typings.reactAsync.reactAsyncStrings.start
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactAsync.mod.Start
  - typings.reactAsync.mod.Cancel
  - typings.reactAsync.mod.Fulfill[T]
  - typings.reactAsync.mod.Reject
*/
trait AsyncAction[T] extends StObject
object AsyncAction {
  
  @scala.inline
  def Cancel(meta: Dictmeta, `type`: String with cancel): typings.reactAsync.mod.Cancel = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactAsync.mod.Cancel]
  }
  
  @scala.inline
  def Fulfill[T](meta: Dictmeta, payload: T, `type`: String with fulfill): typings.reactAsync.mod.Fulfill[T] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactAsync.mod.Fulfill[T]]
  }
  
  @scala.inline
  def Reject(error: `true`, meta: Dictmeta, payload: Error, `type`: String with reject): typings.reactAsync.mod.Reject = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactAsync.mod.Reject]
  }
  
  @scala.inline
  def Start(meta: Dictmeta, payload: () => js.Promise[Unit], `type`: String with start): typings.reactAsync.mod.Start = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = js.Any.fromFunction0(payload))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactAsync.mod.Start]
  }
}
