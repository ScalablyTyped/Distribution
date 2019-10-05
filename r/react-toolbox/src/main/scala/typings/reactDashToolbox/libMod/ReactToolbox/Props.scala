package typings.reactDashToolbox.libMod.ReactToolbox

import typings.react.reactMod.Attributes
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends Attributes {
  /**
    * Set a class for the root component.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Callback called when the component is clicked.
    */
  var onClick: js.UndefOr[js.Function] = js.undefined
  var onContextMenu: js.UndefOr[js.Function] = js.undefined
  var onDoubleClick: js.UndefOr[js.Function] = js.undefined
  var onDrag: js.UndefOr[js.Function] = js.undefined
  var onDragEnd: js.UndefOr[js.Function] = js.undefined
  var onDragEnter: js.UndefOr[js.Function] = js.undefined
  var onDragExit: js.UndefOr[js.Function] = js.undefined
  var onDragLeave: js.UndefOr[js.Function] = js.undefined
  var onDragOver: js.UndefOr[js.Function] = js.undefined
  var onDragStart: js.UndefOr[js.Function] = js.undefined
  var onDrop: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback called when the mouse press the Component.
    */
  var onMouseDown: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback called when the mouse enters the Component.
    */
  var onMouseEnter: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback called when the mouse leaves the Component.
    */
  var onMouseLeave: js.UndefOr[js.Function] = js.undefined
  var onMouseMove: js.UndefOr[js.Function] = js.undefined
  var onMouseOut: js.UndefOr[js.Function] = js.undefined
  var onMouseOver: js.UndefOr[js.Function] = js.undefined
  /**
    * Fires after the mouse is released from the Component.
    */
  var onMouseUp: js.UndefOr[js.Function] = js.undefined
  var onTouchCancel: js.UndefOr[js.Function] = js.undefined
  var onTouchEnd: js.UndefOr[js.Function] = js.undefined
  var onTouchMove: js.UndefOr[js.Function] = js.undefined
  var onTouchStart: js.UndefOr[js.Function] = js.undefined
  /**
    * Set inline style for the root component.
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    className: String = null,
    key: Key = null,
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
    style: CSSProperties = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
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
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[Props]
  }
}

