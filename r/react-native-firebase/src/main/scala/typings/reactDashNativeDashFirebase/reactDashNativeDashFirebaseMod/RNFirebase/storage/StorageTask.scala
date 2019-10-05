package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.storage

import typings.reactDashNativeDashFirebase.Anon_Complete
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.ErrorHandler
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.Handler
import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageTask[T] extends Promise[T] {
  /**
    * Not supported by react-native-firebase
    */
  def cancel(): Unit = js.native
  def on(event: TaskEvent, next: Handler[T]): js.Function0[Unit] = js.native
  def on(event: TaskEvent, next: Handler[T], error: ErrorHandler): js.Function0[Unit] = js.native
  def on(event: TaskEvent, next: Handler[T], error: ErrorHandler, complete: Handler[T]): js.Function0[Unit] = js.native
  def on(event: TaskEvent, observer: Anon_Complete[T]): js.Function0[Unit] = js.native
  /**
    * Not supported by react-native-firebase
    */
  def pause(): Unit = js.native
  /**
    * Not supported by react-native-firebase
    */
  def resume(): Unit = js.native
}

