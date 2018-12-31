package typings
package reactDashToolboxLib.libButtonBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonBaseProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
    * Indicates if the button should have accent color.
    * @default false
    */
  var accent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * If true, component will be disabled.
    * @default false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Value of the icon (See Font Icon Component).
    */
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * If true, the neutral colors are inverted. Useful to put a button over a dark background.
    */
  var inverse: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set it to false if you don't want the neutral styles to be included.
    * @default true
    */
  var neutral: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates if the button should have primary color.
    * @default false
    */
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, component will have a ripple effect on click.
    * @default true
    */
  var ripple: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Component root container type.
    * @default button
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

