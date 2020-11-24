package typings.rsocketFlowable.singleMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFutureSubject[T] extends js.Object {
  
  def onComplete(value: T): Unit = js.native
  
  def onError(error: Error): Unit = js.native
  
  def onSubscribe(): Unit = js.native
  def onSubscribe(cancel: CancelCallback): Unit = js.native
}
