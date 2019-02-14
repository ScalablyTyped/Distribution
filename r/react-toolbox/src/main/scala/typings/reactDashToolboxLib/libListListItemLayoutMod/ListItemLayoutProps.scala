package typings
package reactDashToolboxLib.libListListItemLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemLayoutProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
    * A string URL to specify an avatar in the left side of the item.
    */
  var avatar: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactElement] = js.undefined
  /**
    * Main text of the item.
    */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * If true, the item is displayed as disabled and it's not clickable.
    * @default false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Layout content.
    */
  var itemContent: js.UndefOr[reactLib.reactMod.ReactNs.ReactChild] = js.undefined
  /**
    * A list of elements that are placed on the left side of the item and after the avatar attribute.
    */
  var leftActions: js.UndefOr[coreDashJsLib.Array[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  /**
    * A string key of a font icon or element to display an icon in the left side of the item.
    */
  var leftIcon: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactElement] = js.undefined
  /**
    * Secondary text to display under the caption.
    */
  var legend: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of elements that are placed on the right side of the item and after the rightIcon attribute.
    */
  var rightActions: js.UndefOr[coreDashJsLib.Array[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  /**
    * The same as the leftIcon but in this case the icon is displayed in the right side.
    */
  var rightIcon: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactElement] = js.undefined
  /**
    * If true, the elements in the list will display a hover effect and a pointer cursor. Inherited from the parent.
    * @default false
    */
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Object defining the component class name mappings.
    */
  var theme: js.UndefOr[
    ListItemLayoutTheme with reactDashToolboxLib.libListListItemContentMod.ListItemContentTheme with reactDashToolboxLib.libListListItemActionsMod.ListItemActionsTheme
  ] = js.undefined
  /**
    * In case you want to provide the item as a link, you can pass this property to specify the href.
    */
  var to: js.UndefOr[java.lang.String] = js.undefined
}

