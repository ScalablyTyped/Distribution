package typings.reactNativeViewShot.mod

import typings.react.mod.ReactInstance
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-view-shot", "captureRef")
@js.native
object captureRef extends js.Object {
  def apply[T](viewRef: ReactInstance): js.Promise[String] = js.native
  def apply[T](viewRef: ReactInstance, options: CaptureOptions): js.Promise[String] = js.native
  def apply[T](viewRef: RefObject[T]): js.Promise[String] = js.native
  def apply[T](viewRef: RefObject[T], options: CaptureOptions): js.Promise[String] = js.native
}

