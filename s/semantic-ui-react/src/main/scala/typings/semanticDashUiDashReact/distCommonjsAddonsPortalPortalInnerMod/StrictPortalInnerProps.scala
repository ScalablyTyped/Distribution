package typings.semanticDashUiDashReact.distCommonjsAddonsPortalPortalInnerMod

import typings.react.reactMod.ReactNode
import typings.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictPortalInnerProps extends js.Object {
  /** Primary content. */
  var children: ReactNode
  /** Called with a ref to the inner node. */
  var innerRef: js.UndefOr[Ref[_]] = js.undefined
  /** The node where the portal should mount. */
  var mountNode: js.UndefOr[js.Any] = js.undefined
  /**
    * Called when the PortalInner is mounted on the DOM.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onMount: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ PortalInnerProps, Unit]] = js.undefined
  /**
    * Called when the PortalInner is unmounted from the DOM.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onUnmount: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ PortalInnerProps, Unit]] = js.undefined
}

object StrictPortalInnerProps {
  @scala.inline
  def apply(
    children: ReactNode,
    innerRef: Ref[_] = null,
    mountNode: js.Any = null,
    onMount: (/* nothing */ Null, /* data */ PortalInnerProps) => Unit = null,
    onUnmount: (/* nothing */ Null, /* data */ PortalInnerProps) => Unit = null
  ): StrictPortalInnerProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode)
    if (onMount != null) __obj.updateDynamic("onMount")(js.Any.fromFunction2(onMount))
    if (onUnmount != null) __obj.updateDynamic("onUnmount")(js.Any.fromFunction2(onUnmount))
    __obj.asInstanceOf[StrictPortalInnerProps]
  }
}

