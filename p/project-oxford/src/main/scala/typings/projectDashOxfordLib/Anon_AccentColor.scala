package typings
package projectDashOxfordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccentColor extends js.Object {
  var accentColor: java.lang.String
  var dominantColorBackground: java.lang.String
  var dominantColorForeground: java.lang.String
  var dominantColors: js.Array[java.lang.String]
  var isBWImg: scala.Boolean
}

object Anon_AccentColor {
  @scala.inline
  def apply(
    accentColor: java.lang.String,
    dominantColorBackground: java.lang.String,
    dominantColorForeground: java.lang.String,
    dominantColors: js.Array[java.lang.String],
    isBWImg: scala.Boolean
  ): Anon_AccentColor = {
    val __obj = js.Dynamic.literal(accentColor = accentColor, dominantColorBackground = dominantColorBackground, dominantColorForeground = dominantColorForeground, dominantColors = dominantColors, isBWImg = isBWImg)
  
    __obj.asInstanceOf[Anon_AccentColor]
  }
}

