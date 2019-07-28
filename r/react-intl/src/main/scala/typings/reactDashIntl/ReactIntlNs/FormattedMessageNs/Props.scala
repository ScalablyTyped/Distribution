package typings.reactDashIntl.ReactIntlNs.FormattedMessageNs

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.ReactNode
import typings.react.reactMod.ReactType
import typings.reactDashIntl.ReactIntlNs.MessageValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends MessageDescriptor {
  var children: js.UndefOr[js.Function1[/* repeated */ String | Element, ReactNode]] = js.undefined
  var tagName: js.UndefOr[ReactType[_]] = js.undefined
  var values: js.UndefOr[StringDictionary[MessageValue | Element]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    id: String,
    children: /* repeated */ String | Element => ReactNode = null,
    defaultMessage: String = null,
    description: String = null,
    tagName: ReactType[_] = null,
    values: StringDictionary[MessageValue | Element] = null
  ): Props = {
    val __obj = js.Dynamic.literal(id = id)
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (defaultMessage != null) __obj.updateDynamic("defaultMessage")(defaultMessage)
    if (description != null) __obj.updateDynamic("description")(description)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[Props]
  }
}

