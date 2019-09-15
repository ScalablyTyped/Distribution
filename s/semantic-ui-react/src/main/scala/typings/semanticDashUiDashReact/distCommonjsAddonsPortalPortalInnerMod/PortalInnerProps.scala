package typings.semanticDashUiDashReact.distCommonjsAddonsPortalPortalInnerMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import typings.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalInnerProps
  extends StrictPortalInnerProps
     with /* key */ StringDictionary[js.Any]

object PortalInnerProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    children: ReactNode = null,
    innerRef: Ref[_] = null,
    mountNode: js.Any = null,
    onMount: (/* nothing */ Null, /* data */ PortalInnerProps) => Unit = null,
    onUnmount: (/* nothing */ Null, /* data */ PortalInnerProps) => Unit = null
  ): PortalInnerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode)
    if (onMount != null) __obj.updateDynamic("onMount")(js.Any.fromFunction2(onMount))
    if (onUnmount != null) __obj.updateDynamic("onUnmount")(js.Any.fromFunction2(onUnmount))
    __obj.asInstanceOf[PortalInnerProps]
  }
}

