package typings
package semanticDashUiDashReactLib.distCommonjsAddonsRefRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictRefProps extends js.Object {
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Called when componentDidMount.
    *
    * @param {HTMLElement} node - Referred node.
    */
  var innerRef: js.UndefOr[reactLib.reactMod.ReactNs.Ref[_]] = js.undefined
}

object StrictRefProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] = null
  ): StrictRefProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictRefProps]
  }
}

