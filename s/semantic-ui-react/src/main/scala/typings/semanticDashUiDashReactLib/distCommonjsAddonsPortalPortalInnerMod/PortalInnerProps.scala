package typings
package semanticDashUiDashReactLib.distCommonjsAddonsPortalPortalInnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalInnerProps
  extends StrictPortalInnerProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object PortalInnerProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    mountNode: js.Any = null,
    onMount: (/* nothing */ scala.Null, /* data */ PortalInnerProps) => scala.Unit = null,
    onUnmount: (/* nothing */ scala.Null, /* data */ PortalInnerProps) => scala.Unit = null
  ): PortalInnerProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode)
    if (onMount != null) __obj.updateDynamic("onMount")(js.Any.fromFunction2(onMount))
    if (onUnmount != null) __obj.updateDynamic("onUnmount")(js.Any.fromFunction2(onUnmount))
    __obj.asInstanceOf[PortalInnerProps]
  }
}

