package typings.reactDashSketchapp.typesMod

import typings.reactDashSketchapp.Anon_HeightWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchShadow extends js.Object {
  var shadowColor: Color
  var shadowInner: Boolean
  var shadowOffset: Anon_HeightWidth
  var shadowOpacity: Double
  var shadowRadius: Double
  var shadowSpread: Double
}

object SketchShadow {
  @scala.inline
  def apply(
    shadowColor: Color,
    shadowInner: Boolean,
    shadowOffset: Anon_HeightWidth,
    shadowOpacity: Double,
    shadowRadius: Double,
    shadowSpread: Double
  ): SketchShadow = {
    val __obj = js.Dynamic.literal(shadowColor = shadowColor.asInstanceOf[js.Any], shadowInner = shadowInner.asInstanceOf[js.Any], shadowOffset = shadowOffset.asInstanceOf[js.Any], shadowOpacity = shadowOpacity.asInstanceOf[js.Any], shadowRadius = shadowRadius.asInstanceOf[js.Any], shadowSpread = shadowSpread.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SketchShadow]
  }
}

