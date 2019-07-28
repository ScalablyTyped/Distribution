package typings.reactDashNative.reactDashNativeMod.Global

import typings.reactDashNative.reactDashNativeMod.Geolocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Navigator object for accessing location API
  * @see https://facebook.github.io/react-native/docs/javascript-environment.html#polyfills
  */
trait Navigator extends js.Object {
  val geolocation: Geolocation
  val product: String
}

object Navigator {
  @scala.inline
  def apply(geolocation: Geolocation, product: String): Navigator = {
    val __obj = js.Dynamic.literal(geolocation = geolocation, product = product)
  
    __obj.asInstanceOf[Navigator]
  }
}

