package typings.reduxPromiseListener.mod.ReduxPromiseListener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncFunction[TReturn] extends js.Object {
  
  def asyncFunction(): js.Promise[TReturn] = js.native
  def asyncFunction(payload: js.Any): js.Promise[TReturn] = js.native
  
  def unsubscribe(): Unit = js.native
}
