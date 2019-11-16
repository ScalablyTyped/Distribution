package typings.reactDashNativeDashTabDashView.libTypescriptSrcTabBarMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var layout: Layout
  var tabWidths: StringDictionary[Double]
}

object State {
  @scala.inline
  def apply(layout: Layout, tabWidths: StringDictionary[Double]): State = {
    val __obj = js.Dynamic.literal(layout = layout, tabWidths = tabWidths)
  
    __obj.asInstanceOf[State]
  }
}

