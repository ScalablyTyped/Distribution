package typings.reactAsync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractState[T] extends StObject {
  
  def cancel(): Unit = js.native
  
  var counter: Double = js.native
  
  var initialValue: js.UndefOr[T | js.Error] = js.native
  
  var promise: js.Promise[T] = js.native
  
  def reload(): Unit = js.native
  
  def run(args: Any*): Unit = js.native
  
  def setData(data: T): T = js.native
  def setData(data: T, callback: js.Function0[Unit]): T = js.native
  
  def setError(error: js.Error): js.Error = js.native
  def setError(error: js.Error, callback: js.Function0[Unit]): js.Error = js.native
}
