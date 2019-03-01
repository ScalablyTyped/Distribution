package typings
package reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsTopBarBackground extends js.Object {
  /**
    * Enable background blur
    * #### (iOS specific)
    */
  var blur: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Clip the top bar background to bounds if set to true.
    * #### (iOS specific)
    */
  var clipToBounds: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Background color of the top bar
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * Set a custom component for the Top Bar background
    */
  var component: js.UndefOr[reactDashNativeDashNavigationLib.Anon_Name] = js.undefined
  /**
    * Allows the NavBar to be translucent (blurred)
    * #### (iOS specific)
    */
  var translucent: js.UndefOr[scala.Boolean] = js.undefined
}

object OptionsTopBarBackground {
  @scala.inline
  def apply(
    blur: js.UndefOr[scala.Boolean] = js.undefined,
    clipToBounds: js.UndefOr[scala.Boolean] = js.undefined,
    color: Color = null,
    component: reactDashNativeDashNavigationLib.Anon_Name = null,
    translucent: js.UndefOr[scala.Boolean] = js.undefined
  ): OptionsTopBarBackground = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blur)) __obj.updateDynamic("blur")(blur)
    if (!js.isUndefined(clipToBounds)) __obj.updateDynamic("clipToBounds")(clipToBounds)
    if (color != null) __obj.updateDynamic("color")(color)
    if (component != null) __obj.updateDynamic("component")(component)
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent)
    __obj.asInstanceOf[OptionsTopBarBackground]
  }
}

