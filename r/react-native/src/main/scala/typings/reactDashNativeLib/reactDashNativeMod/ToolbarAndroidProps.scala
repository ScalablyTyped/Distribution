package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var actions: js.UndefOr[js.Array[ToolbarAndroidAction]] = js.undefined
  /**
    * Sets the content inset for the toolbar ending edge.
    * The content inset affects the valid area for Toolbar content other
    * than the navigation button and menu. Insets define the minimum
    * margin for these components and can be used to effectively align
    * Toolbar content along well-known gridlines.
    */
  var contentInsetEnd: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets the content inset for the toolbar starting edge.
    * The content inset affects the valid area for Toolbar content
    * other than the navigation button and menu. Insets define the
    * minimum margin for these components and can be used to effectively
    * align Toolbar content along well-known gridlines.
    */
  var contentInsetStart: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets the toolbar logo.
    */
  var logo: js.UndefOr[ImageURISource] = js.undefined
  /**
    * Sets the navigation icon.
    */
  var navIcon: js.UndefOr[ImageURISource] = js.undefined
  /**
    * Callback that is called when an action is selected. The only
    * argument that is passed to the callback is the position of the
    * action in the actions array.
    */
  var onActionSelected: js.UndefOr[js.Function1[/* position */ scala.Double, scala.Unit]] = js.undefined
  /**
    * Callback called when the icon is selected.
    */
  var onIconClicked: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Sets the overflow icon.
    */
  var overflowIcon: js.UndefOr[ImageURISource] = js.undefined
  /**
    * Used to set the toolbar direction to RTL.
    * In addition to this property you need to add
    * android:supportsRtl="true"
    * to your application AndroidManifest.xml and then call
    * setLayoutDirection(LayoutDirection.RTL) in your MainActivity
    * onCreate method.
    */
  var rtl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets the toolbar subtitle.
    */
  var subtitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the toolbar subtitle color.
    */
  var subtitleColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the toolbar title.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the toolbar title color.
    */
  var titleColor: js.UndefOr[java.lang.String] = js.undefined
}

