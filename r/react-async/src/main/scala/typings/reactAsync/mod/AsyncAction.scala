package typings.reactAsync.mod

import typings.reactAsync.anon.Dictmeta
import typings.reactAsync.reactAsyncBooleans.`true`
import typings.reactAsync.reactAsyncStrings.cancel
import typings.reactAsync.reactAsyncStrings.fulfill
import typings.reactAsync.reactAsyncStrings.reject
import typings.reactAsync.reactAsyncStrings.start
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactAsync.mod.Start
  - typings.reactAsync.mod.Cancel
  - typings.reactAsync.mod.Fulfill[T]
  - typings.reactAsync.mod.Reject
*/
trait AsyncAction[T] extends js.Object
object AsyncAction {
  
  @scala.inline
  def Start[T](meta: Dictmeta, payload: () => js.Promise[Unit], `type`: String with start): AsyncAction[T] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = js.Any.fromFunction0(payload))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncAction[T]]
  }
  
  @scala.inline
  def Cancel[T](meta: Dictmeta, `type`: String with cancel): AsyncAction[T] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncAction[T]]
  }
  
  @scala.inline
  def Fulfill[T](meta: Dictmeta, payload: T, `type`: String with fulfill): AsyncAction[T] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncAction[T]]
  }
  
  @scala.inline
  def Reject[T](error: `true`, meta: Dictmeta, payload: Error, `type`: String with reject): AsyncAction[T] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncAction[T]]
  }
}
