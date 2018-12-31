package typings
package reactDashToolboxLib.libChipChipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChipProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * If true, the chip will be rendered with a delete icon.
    * @default false
    */
  var deletable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Callback to be invoked when the delete icon is clicked.
    */
  var onDeleteClick: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[ChipTheme] = js.undefined
}

