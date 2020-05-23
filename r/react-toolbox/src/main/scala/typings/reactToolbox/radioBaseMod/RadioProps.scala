package typings.reactToolbox.radioBaseMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioProps
  extends /**
  * Additional attributes passed to composed component.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * If true, the input element will be selected by default. Transferred from the parent.
    * @default false
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  /**
    * Callback invoked on mouse down.
    */
  var onMouseDown: js.UndefOr[js.Function] = js.undefined
}

object RadioProps {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    onMouseDown: js.Function = null
  ): RadioProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioProps]
  }
}

