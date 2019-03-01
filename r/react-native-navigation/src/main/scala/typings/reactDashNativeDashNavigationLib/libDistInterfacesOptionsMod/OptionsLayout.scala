package typings
package reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsLayout extends js.Object {
  /**
    * Set the screen background color
    */
  var backgroundColor: js.UndefOr[Color] = js.undefined
  /**
    * Set background color only for components, helps reduce overdraw if background color is set in default options.
    * #### (Android specific)
    */
  var componentBackgroundColor: js.UndefOr[Color] = js.undefined
  /**
    * Set the allowed orientations
    */
  var orientation: js.UndefOr[js.Array[LayoutOrientation]] = js.undefined
  /**
    * Layout top margin
    * #### (Android specific)
    */
  var topMargin: js.UndefOr[scala.Double] = js.undefined
}

object OptionsLayout {
  @scala.inline
  def apply(
    backgroundColor: Color = null,
    componentBackgroundColor: Color = null,
    orientation: js.Array[LayoutOrientation] = null,
    topMargin: scala.Int | scala.Double = null
  ): OptionsLayout = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (componentBackgroundColor != null) __obj.updateDynamic("componentBackgroundColor")(componentBackgroundColor)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (topMargin != null) __obj.updateDynamic("topMargin")(topMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsLayout]
  }
}

