package typings.reactDashToolbox.libCardCardMediaMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Key
import typings.react.reactMod.ReactNode
import typings.reactDashToolbox.libMod.ReactToolbox.Props
import typings.reactDashToolbox.reactDashToolboxStrings.square
import typings.reactDashToolbox.reactDashToolboxStrings.wide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardMediaProps
  extends Props
     with /**
  * Additional properties passed to component root.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * Forces a 16:9 or 1:1 aspect ratio respectively. Unset, the media area will have a flexible height.
    */
  var aspectRatio: js.UndefOr[wide | square] = js.undefined
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  /**
    * Sets the background color.
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Creates a dark overlay underneath the child components.
    */
  var contentOverlay: js.UndefOr[Boolean] = js.undefined
  /**
    * Can be used instead of children. Accepts an element or a URL string.
    */
  var image: js.UndefOr[ReactNode] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[CardMediaTheme] = js.undefined
}

object CardMediaProps {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Additional properties passed to component root.
    */
  /* key */ StringDictionary[js.Any] = null,
    aspectRatio: wide | square = null,
    children: ReactNode = null,
    className: String = null,
    color: String = null,
    contentOverlay: js.UndefOr[Boolean] = js.undefined,
    image: ReactNode = null,
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
    style: CSSProperties = null,
    theme: CardMediaTheme = null
  ): CardMediaProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(contentOverlay)) __obj.updateDynamic("contentOverlay")(contentOverlay)
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
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
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[CardMediaProps]
  }
}

