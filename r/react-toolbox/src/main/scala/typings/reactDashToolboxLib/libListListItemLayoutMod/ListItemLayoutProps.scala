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
  var avatar: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
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
  var leftActions: js.UndefOr[js.Array[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  /**
    * A string key of a font icon or element to display an icon in the left side of the item.
    */
  var leftIcon: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * Secondary text to display under the caption.
    */
  var legend: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of elements that are placed on the right side of the item and after the rightIcon attribute.
    */
  var rightActions: js.UndefOr[js.Array[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  /**
    * The same as the leftIcon but in this case the icon is displayed in the right side.
    */
  var rightIcon: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
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

object ListItemLayoutProps {
  @scala.inline
  def apply(
    avatar: java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_] = null,
    caption: java.lang.String = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    itemContent: reactLib.reactMod.ReactNs.ReactChild = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    leftActions: js.Array[reactLib.reactMod.ReactNs.ReactNode] = null,
    leftIcon: java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_] = null,
    legend: java.lang.String = null,
    onClick: js.Function = null,
    onContextMenu: js.Function = null,
    onDoubleClick: js.Function = null,
    onDrag: js.Function = null,
    onDragEnd: js.Function = null,
    onDragEnter: js.Function = null,
    onDragExit: js.Function = null,
    onDragLeave: js.Function = null,
    onDragOver: js.Function = null,
    onDragStart: js.Function = null,
    onDrop: js.Function = null,
    onMouseDown: js.Function = null,
    onMouseEnter: js.Function = null,
    onMouseLeave: js.Function = null,
    onMouseMove: js.Function = null,
    onMouseOut: js.Function = null,
    onMouseOver: js.Function = null,
    onMouseUp: js.Function = null,
    onTouchCancel: js.Function = null,
    onTouchEnd: js.Function = null,
    onTouchMove: js.Function = null,
    onTouchStart: js.Function = null,
    rightActions: js.Array[reactLib.reactMod.ReactNs.ReactNode] = null,
    rightIcon: java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_] = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    theme: ListItemLayoutTheme with reactDashToolboxLib.libListListItemContentMod.ListItemContentTheme with reactDashToolboxLib.libListListItemActionsMod.ListItemActionsTheme = null,
    to: java.lang.String = null
  ): ListItemLayoutProps = {
    val __obj = js.Dynamic.literal()
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (itemContent != null) __obj.updateDynamic("itemContent")(itemContent.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (leftActions != null) __obj.updateDynamic("leftActions")(leftActions)
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu)
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter)
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit)
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave)
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut)
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (rightActions != null) __obj.updateDynamic("rightActions")(rightActions)
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (style != null) __obj.updateDynamic("style")(style)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[ListItemLayoutProps]
  }
}

