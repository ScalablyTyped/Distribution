package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarAndroidProps extends ViewProps {
  /**
    * Sets possible actions on the toolbar as part of the action menu. These are displayed as icons
    * or text on the right side of the widget. If they don't fit they are placed in an 'overflow'
    * menu.
    *
    * This property takes an array of objects, where each object has the following keys:
    *
    * * `title`: **required**, the title of this action
    * * `icon`: the icon for this action, e.g. `require('./some_icon.png')`
    * * `show`: when to show this action as an icon or hide it in the overflow menu: `always`,
    * `ifRoom` or `never`
    * * `showWithText`: boolean, whether to show text alongside the icon or not
    */
  var actions: js.UndefOr[js.Array[ToolbarAndroidAction]] = js.native
  /**
    * Sets the content inset for the toolbar ending edge.
    * The content inset affects the valid area for Toolbar content other
    * than the navigation button and menu. Insets define the minimum
    * margin for these components and can be used to effectively align
    * Toolbar content along well-known gridlines.
    */
  var contentInsetEnd: js.UndefOr[Double] = js.native
  /**
    * Sets the content inset for the toolbar starting edge.
    * The content inset affects the valid area for Toolbar content
    * other than the navigation button and menu. Insets define the
    * minimum margin for these components and can be used to effectively
    * align Toolbar content along well-known gridlines.
    */
  var contentInsetStart: js.UndefOr[Double] = js.native
  /**
    * Sets the toolbar logo.
    */
  var logo: js.UndefOr[ImageURISource] = js.native
  /**
    * Sets the navigation icon.
    */
  var navIcon: js.UndefOr[ImageURISource] = js.native
  /**
    * Callback that is called when an action is selected. The only
    * argument that is passed to the callback is the position of the
    * action in the actions array.
    */
  var onActionSelected: js.UndefOr[js.Function1[/* position */ Double, Unit]] = js.native
  /**
    * Callback called when the icon is selected.
    */
  var onIconClicked: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Sets the overflow icon.
    */
  var overflowIcon: js.UndefOr[ImageURISource] = js.native
  /**
    * Used to set the toolbar direction to RTL.
    * In addition to this property you need to add
    * android:supportsRtl="true"
    * to your application AndroidManifest.xml and then call
    * setLayoutDirection(LayoutDirection.RTL) in your MainActivity
    * onCreate method.
    */
  var rtl: js.UndefOr[Boolean] = js.native
  /**
    * Sets the toolbar subtitle.
    */
  var subtitle: js.UndefOr[String] = js.native
  /**
    * Sets the toolbar subtitle color.
    */
  var subtitleColor: js.UndefOr[ColorValue] = js.native
  /**
    * Sets the toolbar title.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Sets the toolbar title color.
    */
  var titleColor: js.UndefOr[ColorValue] = js.native
}

object ToolbarAndroidProps {
  @scala.inline
  def apply(): ToolbarAndroidProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarAndroidProps]
  }
  @scala.inline
  implicit class ToolbarAndroidPropsOps[Self <: ToolbarAndroidProps] (val x: Self) extends AnyVal {
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
    def setActionsVarargs(value: ToolbarAndroidAction*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[ToolbarAndroidAction]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setContentInsetEnd(value: Double): Self = this.set("contentInsetEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentInsetEnd: Self = this.set("contentInsetEnd", js.undefined)
    @scala.inline
    def setContentInsetStart(value: Double): Self = this.set("contentInsetStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentInsetStart: Self = this.set("contentInsetStart", js.undefined)
    @scala.inline
    def setLogo(value: ImageURISource): Self = this.set("logo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogo: Self = this.set("logo", js.undefined)
    @scala.inline
    def setNavIcon(value: ImageURISource): Self = this.set("navIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavIcon: Self = this.set("navIcon", js.undefined)
    @scala.inline
    def setOnActionSelected(value: /* position */ Double => Unit): Self = this.set("onActionSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnActionSelected: Self = this.set("onActionSelected", js.undefined)
    @scala.inline
    def setOnIconClicked(value: () => Unit): Self = this.set("onIconClicked", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnIconClicked: Self = this.set("onIconClicked", js.undefined)
    @scala.inline
    def setOverflowIcon(value: ImageURISource): Self = this.set("overflowIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflowIcon: Self = this.set("overflowIcon", js.undefined)
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    @scala.inline
    def setSubtitleColor(value: ColorValue): Self = this.set("subtitleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitleColor: Self = this.set("subtitleColor", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleColor(value: ColorValue): Self = this.set("titleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleColor: Self = this.set("titleColor", js.undefined)
  }
  
}

