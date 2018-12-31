package typings
package reactDashToolboxLib.libListListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * If true, each element in the list will have a ripple effect on click
    * @default false
    */
  var ripple: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, the elements in the list will display a hover effect and a pointer cursor.
    * @default false
    */
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[ListTheme] = js.undefined
}

