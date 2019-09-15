package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.semanticDashUiDashReact.distCommonjsAddonsPortalPortalInnerMod.PortalInnerProps
import typings.semanticDashUiDashReact.distCommonjsAddonsPortalPortalInnerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children */
object PortalInner
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.semanticDashUiDashReact.distCommonjsAddonsPortalPortalInnerMod.default].asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    innerRef: typings.react.reactMod.Ref[_] = null,
    mountNode: js.Any = null,
    onMount: (/* nothing */ Null, /* data */ PortalInnerProps) => Unit = null,
    onUnmount: (/* nothing */ Null, /* data */ PortalInnerProps) => Unit = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode)
    if (onMount != null) __obj.updateDynamic("onMount")(js.Any.fromFunction2(onMount))
    if (onUnmount != null) __obj.updateDynamic("onUnmount")(js.Any.fromFunction2(onUnmount))
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PortalInnerProps
}

