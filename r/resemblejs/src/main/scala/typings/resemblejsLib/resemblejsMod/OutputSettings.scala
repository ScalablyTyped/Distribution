package typings
package resemblejsLib.resemblejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputSettings extends js.Object {
  var errorColor: resemblejsLib.Anon_Blue
  var errorType: java.lang.String
  var largeImageThreshold: scala.Double
  var transparency: scala.Double
}

object OutputSettings {
  @scala.inline
  def apply(
    errorColor: resemblejsLib.Anon_Blue,
    errorType: java.lang.String,
    largeImageThreshold: scala.Double,
    transparency: scala.Double
  ): OutputSettings = {
    val __obj = js.Dynamic.literal(errorColor = errorColor, errorType = errorType, largeImageThreshold = largeImageThreshold, transparency = transparency)
  
    __obj.asInstanceOf[OutputSettings]
  }
}

