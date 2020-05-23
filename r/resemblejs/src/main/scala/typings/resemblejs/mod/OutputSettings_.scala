package typings.resemblejs.mod

import typings.resemblejs.anon.Blue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputSettings_ extends js.Object {
  var errorColor: Blue
  var errorType: String
  var largeImageThreshold: Double
  var transparency: Double
}

object OutputSettings_ {
  @scala.inline
  def apply(errorColor: Blue, errorType: String, largeImageThreshold: Double, transparency: Double): OutputSettings_ = {
    val __obj = js.Dynamic.literal(errorColor = errorColor.asInstanceOf[js.Any], errorType = errorType.asInstanceOf[js.Any], largeImageThreshold = largeImageThreshold.asInstanceOf[js.Any], transparency = transparency.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputSettings_]
  }
}

