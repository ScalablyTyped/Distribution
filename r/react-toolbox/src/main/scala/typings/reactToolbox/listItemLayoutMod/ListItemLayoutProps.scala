package typings.reactToolbox.listItemLayoutMod

import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.ReactChild
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactToolbox.componentsMod.ReactToolbox.Props
import typings.reactToolbox.listItemActionsMod.ListItemActionsTheme
import typings.reactToolbox.listItemContentMod.ListItemContentTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemLayoutProps extends Props {
  /**
    * A string URL to specify an avatar in the left side of the item.
    */
  var avatar: js.UndefOr[String | ReactElement] = js.undefined
  /**
    * Main text of the item.
    */
  var caption: js.UndefOr[String] = js.undefined
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  /**
    * If true, the item is displayed as disabled and it's not clickable.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Layout content.
    */
  var itemContent: js.UndefOr[ReactChild] = js.undefined
  /**
    * A list of elements that are placed on the left side of the item and after the avatar attribute.
    */
  var leftActions: js.UndefOr[js.Array[ReactNode]] = js.undefined
  /**
    * A string key of a font icon or element to display an icon in the left side of the item.
    */
  var leftIcon: js.UndefOr[String | ReactElement] = js.undefined
  /**
    * Secondary text to display under the caption.
    */
  var legend: js.UndefOr[String] = js.undefined
  /**
    * A list of elements that are placed on the right side of the item and after the rightIcon attribute.
    */
  var rightActions: js.UndefOr[js.Array[ReactNode]] = js.undefined
  /**
    * The same as the leftIcon but in this case the icon is displayed in the right side.
    */
  var rightIcon: js.UndefOr[String | ReactElement] = js.undefined
  /**
    * If true, the elements in the list will display a hover effect and a pointer cursor. Inherited from the parent.
    * @default false
    */
  var selectable: js.UndefOr[Boolean] = js.undefined
  /**
    * Object defining the component class name mappings.
    */
  var theme: js.UndefOr[ListItemLayoutTheme with ListItemContentTheme with ListItemActionsTheme] = js.undefined
  /**
    * In case you want to provide the item as a link, you can pass this property to specify the href.
    */
  var to: js.UndefOr[String] = js.undefined
}

object ListItemLayoutProps {
  @scala.inline
  def apply(
    avatar: String | ReactElement = null,
    caption: String = null,
    children: ReactNode = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    itemContent: ReactChild = null,
    key: Key = null,
    leftActions: js.Array[ReactNode] = null,
    leftIcon: String | ReactElement = null,
    legend: String = null,
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
    rightActions: js.Array[ReactNode] = null,
    rightIcon: String | ReactElement = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    theme: ListItemLayoutTheme with ListItemContentTheme with ListItemActionsTheme = null,
    to: String = null
  ): ListItemLayoutProps = {
    val __obj = js.Dynamic.literal()
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (itemContent != null) __obj.updateDynamic("itemContent")(itemContent.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (leftActions != null) __obj.updateDynamic("leftActions")(leftActions.asInstanceOf[js.Any])
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu.asInstanceOf[js.Any])
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag.asInstanceOf[js.Any])
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd.asInstanceOf[js.Any])
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter.asInstanceOf[js.Any])
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit.asInstanceOf[js.Any])
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave.asInstanceOf[js.Any])
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver.asInstanceOf[js.Any])
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart.asInstanceOf[js.Any])
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop.asInstanceOf[js.Any])
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter.asInstanceOf[js.Any])
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave.asInstanceOf[js.Any])
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove.asInstanceOf[js.Any])
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut.asInstanceOf[js.Any])
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver.asInstanceOf[js.Any])
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp.asInstanceOf[js.Any])
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel.asInstanceOf[js.Any])
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd.asInstanceOf[js.Any])
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove.asInstanceOf[js.Any])
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart.asInstanceOf[js.Any])
    if (rightActions != null) __obj.updateDynamic("rightActions")(rightActions.asInstanceOf[js.Any])
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemLayoutProps]
  }
}

