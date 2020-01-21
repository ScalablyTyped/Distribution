package typings.reactNativeTabView.tabBarMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeTabView.typesMod.Layout
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
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], tabWidths = tabWidths.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

