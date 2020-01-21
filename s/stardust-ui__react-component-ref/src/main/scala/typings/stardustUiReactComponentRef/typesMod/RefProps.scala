package typings.stardustUiReactComponentRef.typesMod

import typings.react.mod.ReactElement
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefProps extends js.Object {
  var children: ReactElement
  /**
    * Called when a child component will be mounted or updated.
    *
    * @param {HTMLElement} node - Referred node.
    */
  var innerRef: Ref[_]
}

object RefProps {
  @scala.inline
  def apply(children: ReactElement, innerRef: Ref[_] = null): RefProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefProps]
  }
}

