package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for NativeModules which allows to augment NativeModules with type informations.
  * See react-native-sensor-manager for example.
  */
trait NativeModulesStatic
  extends /* name */ org.scalablytyped.runtime.StringDictionary[js.Any]

object NativeModulesStatic {
  @scala.inline
  def apply(StringDictionary: /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] = null): NativeModulesStatic = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[NativeModulesStatic]
  }
}

