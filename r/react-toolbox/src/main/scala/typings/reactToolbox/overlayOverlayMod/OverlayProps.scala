package typings.reactToolbox.overlayOverlayMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayProps extends js.Object {
  /**
    * Whether overlay is active.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * Nodes to be nested inside Overlay.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  /**
    * Additional class name(s) for root container.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Whether Overlay should have 'invisible' styles.
    * @default false
    */
  var invisible: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback invoked on Overlay click.
    */
  var onClick: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback invoked on ESC key.
    */
  var onEscKeyDown: js.UndefOr[js.Function] = js.undefined
  /**
    * Overlay theme.
    */
  var theme: js.UndefOr[OverlayTheme] = js.undefined
}

object OverlayProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    invisible: js.UndefOr[Boolean] = js.undefined,
    onClick: js.Function = null,
    onEscKeyDown: js.Function = null,
    theme: OverlayTheme = null
  ): OverlayProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(invisible)) __obj.updateDynamic("invisible")(invisible.get.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onEscKeyDown != null) __obj.updateDynamic("onEscKeyDown")(onEscKeyDown.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayProps]
  }
}

