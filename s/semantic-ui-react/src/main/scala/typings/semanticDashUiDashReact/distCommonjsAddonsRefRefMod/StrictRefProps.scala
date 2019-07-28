package typings.semanticDashUiDashReact.distCommonjsAddonsRefRefMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictRefProps extends js.Object {
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /**
    * Called when componentDidMount.
    *
    * @param {HTMLElement} node - Referred node.
    */
  var innerRef: js.UndefOr[typings.react.reactMod.Ref[_]] = js.undefined
}

object StrictRefProps {
  @scala.inline
  def apply(children: ReactNode = null, innerRef: typings.react.reactMod.Ref[_] = null): StrictRefProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictRefProps]
  }
}

