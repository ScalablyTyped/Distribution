package typings
package reactDashNativeLib.reactDashNativeMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Navigator object for accessing location API
  * @see https://facebook.github.io/react-native/docs/javascript-environment.html#polyfills
  */
trait Navigator extends js.Object {
  val geolocation: reactDashNativeLib.reactDashNativeMod.Geolocation
  val product: java.lang.String
}

object Navigator {
  @scala.inline
  def apply(geolocation: reactDashNativeLib.reactDashNativeMod.Geolocation, product: java.lang.String): Navigator = {
    val __obj = js.Dynamic.literal(geolocation = geolocation, product = product)
  
    __obj.asInstanceOf[Navigator]
  }
}

