package typings.semanticDashUiDashReact.distCommonjsAddonsRefRefForwardMod

import typings.react.reactMod.ReactElement
import typings.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictRefForwardProps extends js.Object {
  /** Primary content. */
  var children: js.UndefOr[ReactElement] = js.undefined
  /**
    * Called when a child component will be mounted or updated.
    *
    * @param {HTMLElement} node - Referred node.
    */
  var innerRef: js.UndefOr[Ref[_]] = js.undefined
}

object StrictRefForwardProps {
  @scala.inline
  def apply(children: ReactElement = null, innerRef: Ref[_] = null): StrictRefForwardProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictRefForwardProps]
  }
}

