package typings.reactNativeFirebase.mod.RNFirebase.storage

import typings.reactNativeFirebase.AnonComplete
import typings.reactNativeFirebase.mod.RNFirebase.ErrorHandler
import typings.reactNativeFirebase.mod.RNFirebase.Handler
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
  def on(event: TaskEvent, observer: AnonComplete[T]): js.Function0[Unit] = js.native
  /**
    * Not supported by react-native-firebase
    */
  def pause(): Unit = js.native
  /**
    * Not supported by react-native-firebase
    */
  def resume(): Unit = js.native
}

