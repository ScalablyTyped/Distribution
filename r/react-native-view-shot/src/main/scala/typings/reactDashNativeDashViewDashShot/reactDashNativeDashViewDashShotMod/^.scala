package typings.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotMod

import typings.react.reactMod.ReactInstance
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-view-shot", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def captureRef[T](viewRef: ReactInstance): js.Promise[String] = js.native
  def captureRef[T](viewRef: ReactInstance, options: CaptureOptions): js.Promise[String] = js.native
  def captureRef[T](viewRef: RefObject[T]): js.Promise[String] = js.native
  def captureRef[T](viewRef: RefObject[T], options: CaptureOptions): js.Promise[String] = js.native
  def captureScreen(): js.Promise[String] = js.native
  def captureScreen(options: CaptureOptions): js.Promise[String] = js.native
  def releaseCapture(uri: String): Unit = js.native
}

