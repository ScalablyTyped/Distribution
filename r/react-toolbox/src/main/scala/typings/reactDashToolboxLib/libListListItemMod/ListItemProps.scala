package typings
package reactDashToolboxLib.libListListItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * If true, the item is displayed as disabled and is not clickable.
    * @default false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, the item displays a ripple effect on click. By default it's inherited from the parent element.
    */
  var ripple: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Classnames object defining the component style.
    * @default false
    */
  var theme: js.UndefOr[
    ListItemTheme with reactDashToolboxLib.libListListItemActionsMod.ListItemActionsTheme with reactDashToolboxLib.libListListItemContentMod.ListItemContentTheme with reactDashToolboxLib.libListListItemLayoutMod.ListItemLayoutTheme with reactDashToolboxLib.libListListItemTextMod.ListItemTextTheme
  ] = js.undefined
  /**
    * In case you want to provide the item as a link, you can pass this property to specify the href.
    */
  var to: js.UndefOr[java.lang.String] = js.undefined
}

