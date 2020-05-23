package typings.reactNativeNavigation.optionsMod

import typings.reactNativeNavigation.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsTopBarBackground extends js.Object {
  /**
    * Enable background blur
    * #### (iOS specific)
    */
  var blur: js.UndefOr[Boolean] = js.undefined
  /**
    * Clip the top bar background to bounds if set to true.
    * #### (iOS specific)
    */
  var clipToBounds: js.UndefOr[Boolean] = js.undefined
  /**
    * Background color of the top bar
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * Set a custom component for the Top Bar background
    */
  var component: js.UndefOr[Name] = js.undefined
  /**
    * Allows the NavBar to be translucent (blurred)
    * #### (iOS specific)
    */
  var translucent: js.UndefOr[Boolean] = js.undefined
}

object OptionsTopBarBackground {
  @scala.inline
  def apply(
    blur: js.UndefOr[Boolean] = js.undefined,
    clipToBounds: js.UndefOr[Boolean] = js.undefined,
    color: Color = null,
    component: Name = null,
    translucent: js.UndefOr[Boolean] = js.undefined
  ): OptionsTopBarBackground = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blur)) __obj.updateDynamic("blur")(blur.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clipToBounds)) __obj.updateDynamic("clipToBounds")(clipToBounds.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsTopBarBackground]
  }
}

