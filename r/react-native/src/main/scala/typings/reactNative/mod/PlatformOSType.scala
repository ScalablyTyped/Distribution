package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNative.reactNativeStrings.ios
  - typings.reactNative.reactNativeStrings.android
  - typings.reactNative.reactNativeStrings.macos
  - typings.reactNative.reactNativeStrings.windows
  - typings.reactNative.reactNativeStrings.web
*/
trait PlatformOSType extends js.Object

object PlatformOSType {
  @scala.inline
  def android: typings.reactNative.reactNativeStrings.android = this.cast("android")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ios: typings.reactNative.reactNativeStrings.ios = this.cast("ios")
  @scala.inline
  def macos: typings.reactNative.reactNativeStrings.macos = this.cast("macos")
  @scala.inline
  def web: typings.reactNative.reactNativeStrings.web = this.cast("web")
  @scala.inline
  def windows: typings.reactNative.reactNativeStrings.windows = this.cast("windows")
}

