package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashNative.reactDashNativeStrings.ios
  - typings.reactDashNative.reactDashNativeStrings.android
  - typings.reactDashNative.reactDashNativeStrings.macos
  - typings.reactDashNative.reactDashNativeStrings.windows
  - typings.reactDashNative.reactDashNativeStrings.web
*/
trait PlatformOSType extends js.Object

object PlatformOSType {
  @scala.inline
  def android: typings.reactDashNative.reactDashNativeStrings.android = this.cast("android")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ios: typings.reactDashNative.reactDashNativeStrings.ios = this.cast("ios")
  @scala.inline
  def macos: typings.reactDashNative.reactDashNativeStrings.macos = this.cast("macos")
  @scala.inline
  def web: typings.reactDashNative.reactDashNativeStrings.web = this.cast("web")
  @scala.inline
  def windows: typings.reactDashNative.reactDashNativeStrings.windows = this.cast("windows")
}

