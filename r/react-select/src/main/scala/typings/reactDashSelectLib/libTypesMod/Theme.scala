package typings
package reactDashSelectLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme extends js.Object {
  var borderRadius: scala.Double
  var colors: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var spacing: ThemeSpacing
}

object Theme {
  @scala.inline
  def apply(
    borderRadius: scala.Double,
    colors: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    spacing: ThemeSpacing
  ): Theme = {
    val __obj = js.Dynamic.literal(borderRadius = borderRadius, colors = colors, spacing = spacing)
  
    __obj.asInstanceOf[Theme]
  }
}

