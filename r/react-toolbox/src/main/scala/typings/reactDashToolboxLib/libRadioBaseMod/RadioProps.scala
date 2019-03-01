package typings
package reactDashToolboxLib.libRadioBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioProps
  extends /**
  * Additional properties passed to Radio container.
  */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * If true, the input element will be selected by default. Transferred from the parent.
    * @default false
    */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Callback invoked on mouse down.
    */
  var onMouseDown: js.UndefOr[coreDashJsLib.Function] = js.undefined
}

object RadioProps {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Additional properties passed to Radio container.
    */
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    onMouseDown: coreDashJsLib.Function = null
  ): RadioProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    __obj.asInstanceOf[RadioProps]
  }
}

