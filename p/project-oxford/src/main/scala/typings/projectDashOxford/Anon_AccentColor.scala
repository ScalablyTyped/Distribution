package typings.projectDashOxford

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccentColor extends js.Object {
  var accentColor: String
  var dominantColorBackground: String
  var dominantColorForeground: String
  var dominantColors: js.Array[String]
  var isBWImg: Boolean
}

object Anon_AccentColor {
  @scala.inline
  def apply(
    accentColor: String,
    dominantColorBackground: String,
    dominantColorForeground: String,
    dominantColors: js.Array[String],
    isBWImg: Boolean
  ): Anon_AccentColor = {
    val __obj = js.Dynamic.literal(accentColor = accentColor.asInstanceOf[js.Any], dominantColorBackground = dominantColorBackground.asInstanceOf[js.Any], dominantColorForeground = dominantColorForeground.asInstanceOf[js.Any], dominantColors = dominantColors.asInstanceOf[js.Any], isBWImg = isBWImg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AccentColor]
  }
}

