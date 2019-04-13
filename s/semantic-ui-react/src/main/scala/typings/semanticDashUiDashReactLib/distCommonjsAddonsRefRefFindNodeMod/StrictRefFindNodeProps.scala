package typings
package semanticDashUiDashReactLib.distCommonjsAddonsRefRefFindNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictRefFindNodeProps extends js.Object {
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  /**
    * Called when a child component will be mounted or updated.
    *
    * @param {HTMLElement} node - Referred node.
    */
  var innerRef: js.UndefOr[reactLib.reactMod.Ref[_]] = js.undefined
}

object StrictRefFindNodeProps {
  @scala.inline
  def apply(children: reactLib.reactMod.ReactElement[_] = null, innerRef: reactLib.reactMod.Ref[_] = null): StrictRefFindNodeProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictRefFindNodeProps]
  }
}

