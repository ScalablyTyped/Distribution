package typings.reactNativeTabView.tabBarMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeTabView.typesMod.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var layout: Layout = js.native
  var tabWidths: StringDictionary[Double] = js.native
}

object State {
  @scala.inline
  def apply(layout: Layout, tabWidths: StringDictionary[Double]): State = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], tabWidths = tabWidths.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLayout(value: Layout): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabWidths(value: StringDictionary[Double]): Self = this.set("tabWidths", value.asInstanceOf[js.Any])
  }
  
}

