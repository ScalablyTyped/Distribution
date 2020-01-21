package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ platform in react-native.react-native.PlatformOSType ]: T} */
trait platforminPlatformOSTypeT[T] extends js.Object {
  var android: T
  var ios: T
  var macos: T
  var web: T
  var windows: T
}

object platforminPlatformOSTypeT {
  @scala.inline
  def apply[T](android: T, ios: T, macos: T, web: T, windows: T): platforminPlatformOSTypeT[T] = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any], macos = macos.asInstanceOf[js.Any], web = web.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[platforminPlatformOSTypeT[T]]
  }
}

