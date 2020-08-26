package typings.reactNativeNavigation.optionsMod

import typings.reactNativeNavigation.reactNativeNavigationStrings.auto
import typings.reactNativeNavigation.reactNativeNavigationStrings.hidden
import typings.reactNativeNavigation.reactNativeNavigationStrings.leading
import typings.reactNativeNavigation.reactNativeNavigationStrings.none
import typings.reactNativeNavigation.reactNativeNavigationStrings.overlay
import typings.reactNativeNavigation.reactNativeNavigationStrings.sidebar
import typings.reactNativeNavigation.reactNativeNavigationStrings.trailing
import typings.reactNativeNavigation.reactNativeNavigationStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsSplitView extends js.Object {
  /**
    * Master view display mode
    * @default 'auto'
    */
  var displayMode: js.UndefOr[auto | visible | hidden | overlay] = js.native
  /**
    * Set the maximum width of master view
    */
  var maxWidth: js.UndefOr[Double] = js.native
  /**
    * Set the minimum width of master view
    */
  var minWidth: js.UndefOr[Double] = js.native
  /**
    * Set background style of sidebar. Currently works for Mac Catalyst apps only.
    * @default 'none'
    */
  var primaryBackgroundStyle: js.UndefOr[none | sidebar] = js.native
  /**
    * Master view side. Leading is left. Trailing is right.
    * @default 'leading'
    */
  var primaryEdge: js.UndefOr[leading | trailing] = js.native
}

object OptionsSplitView {
  @scala.inline
  def apply(): OptionsSplitView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsSplitView]
  }
  @scala.inline
  implicit class OptionsSplitViewOps[Self <: OptionsSplitView] (val x: Self) extends AnyVal {
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
    def setDisplayMode(value: auto | visible | hidden | overlay): Self = this.set("displayMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayMode: Self = this.set("displayMode", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setPrimaryBackgroundStyle(value: none | sidebar): Self = this.set("primaryBackgroundStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryBackgroundStyle: Self = this.set("primaryBackgroundStyle", js.undefined)
    @scala.inline
    def setPrimaryEdge(value: leading | trailing): Self = this.set("primaryEdge", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryEdge: Self = this.set("primaryEdge", js.undefined)
  }
  
}

