package typings.reactDashSelect.srcTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme extends js.Object {
  var borderRadius: Double
  var colors: StringDictionary[String]
  var spacing: ThemeSpacing
}

object Theme {
  @scala.inline
  def apply(borderRadius: Double, colors: StringDictionary[String], spacing: ThemeSpacing): Theme = {
    val __obj = js.Dynamic.literal(borderRadius = borderRadius, colors = colors, spacing = spacing)
  
    __obj.asInstanceOf[Theme]
  }
}

