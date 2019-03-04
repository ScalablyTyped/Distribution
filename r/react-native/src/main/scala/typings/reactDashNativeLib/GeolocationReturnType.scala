package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolocationReturnType extends js.Object {
  var coords: Anon_Accuracy
  var timestamp: scala.Double
}

object GeolocationReturnType {
  @scala.inline
  def apply(coords: Anon_Accuracy, timestamp: scala.Double): GeolocationReturnType = {
    val __obj = js.Dynamic.literal(coords = coords, timestamp = timestamp)
  
    __obj.asInstanceOf[GeolocationReturnType]
  }
}

