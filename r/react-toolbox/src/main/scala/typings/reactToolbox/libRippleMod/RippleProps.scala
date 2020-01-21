package typings.reactToolbox.libRippleMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RippleProps
  extends /**
  * Additional properties passed to rippled component.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  /**
    * True in case you want a centered ripple.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Function that will be called when the ripple animation ends.
    */
  var onRippleEnded: js.UndefOr[js.Function] = js.undefined
  /**
    * Factor to indicate how much should the ripple spread under the component.
    * @default 2
    */
  var spread: js.UndefOr[Double] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[RippleTheme] = js.undefined
}

object RippleProps {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Additional properties passed to rippled component.
    */
  /* key */ StringDictionary[js.Any] = null,
    children: ReactNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onRippleEnded: js.Function = null,
    spread: Int | Double = null,
    theme: RippleTheme = null
  ): RippleProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onRippleEnded != null) __obj.updateDynamic("onRippleEnded")(onRippleEnded.asInstanceOf[js.Any])
    if (spread != null) __obj.updateDynamic("spread")(spread.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleProps]
  }
}

