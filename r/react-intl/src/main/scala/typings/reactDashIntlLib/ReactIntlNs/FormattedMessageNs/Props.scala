package typings
package reactDashIntlLib.ReactIntlNs.FormattedMessageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends MessageDescriptor {
  var children: js.UndefOr[
    js.Function1[
      /* repeated */ java.lang.String | reactLib.reactMod.Global.JSXNs.Element, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var tagName: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var values: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      reactDashIntlLib.ReactIntlNs.MessageValue | reactLib.reactMod.Global.JSXNs.Element
    ]
  ] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    id: java.lang.String,
    children: js.Function1[
      /* repeated */ java.lang.String | reactLib.reactMod.Global.JSXNs.Element, 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    defaultMessage: java.lang.String = null,
    description: java.lang.String = null,
    tagName: reactLib.reactMod.ReactNs.ReactType[_] = null,
    values: org.scalablytyped.runtime.StringDictionary[
      reactDashIntlLib.ReactIntlNs.MessageValue | reactLib.reactMod.Global.JSXNs.Element
    ] = null
  ): Props = {
    val __obj = js.Dynamic.literal(id = id)
    if (children != null) __obj.updateDynamic("children")(children)
    if (defaultMessage != null) __obj.updateDynamic("defaultMessage")(defaultMessage)
    if (description != null) __obj.updateDynamic("description")(description)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[Props]
  }
}

