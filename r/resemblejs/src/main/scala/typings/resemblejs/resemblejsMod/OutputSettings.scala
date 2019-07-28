package typings.resemblejs.resemblejsMod

import typings.resemblejs.Anon_Blue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputSettings extends js.Object {
  var errorColor: Anon_Blue
  var errorType: String
  var largeImageThreshold: Double
  var transparency: Double
}

object OutputSettings {
  @scala.inline
  def apply(errorColor: Anon_Blue, errorType: String, largeImageThreshold: Double, transparency: Double): OutputSettings = {
    val __obj = js.Dynamic.literal(errorColor = errorColor, errorType = errorType, largeImageThreshold = largeImageThreshold, transparency = transparency)
  
    __obj.asInstanceOf[OutputSettings]
  }
}

