package typings.reactNativeFirebase.mod.RNFirebase.storage

import typings.reactNativeFirebase.anon.Complete
import typings.reactNativeFirebase.mod.RNFirebase.ErrorHandler
import typings.reactNativeFirebase.mod.RNFirebase.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageTask[T]
  extends js.Promise[T] {
  
  /**
    * Not supported by react-native-firebase
    */
  def cancel(): Unit = js.native
  
  def on(event: TaskEvent, next: Handler[T]): js.Function0[Unit] = js.native
  def on(event: TaskEvent, next: Handler[T], error: js.UndefOr[scala.Nothing], complete: Handler[T]): js.Function0[Unit] = js.native
  def on(event: TaskEvent, next: Handler[T], error: ErrorHandler): js.Function0[Unit] = js.native
  def on(event: TaskEvent, next: Handler[T], error: ErrorHandler, complete: Handler[T]): js.Function0[Unit] = js.native
  def on(event: TaskEvent, observer: Complete[T]): js.Function0[Unit] = js.native
  
  /**
    * Not supported by react-native-firebase
    */
  def pause(): Unit = js.native
  
  /**
    * Not supported by react-native-firebase
    */
  def resume(): Unit = js.native
}
