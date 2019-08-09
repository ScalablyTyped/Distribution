package typings.reactDashIntl.distComponentsMessageMod

import typings.react.reactMod.ElementType
import typings.react.reactMod.ReactNode
import typings.react.reactMod.ReactNodeArray
import typings.reactDashIntl.distTypesMod.MessageDescriptor
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ k in 'intl' ]: react-intl.react-intl/dist/types.IntlShape} */ trait Props[V /* <: Record[String, _] */] extends MessageDescriptor {
  var children: js.UndefOr[js.Function1[/* nodes */ ReactNodeArray, ReactNode]] = js.undefined
  var tagName: js.UndefOr[ElementType[_]] = js.undefined
  var values: js.UndefOr[V] = js.undefined
}

object Props {
  @scala.inline
  def apply[V /* <: Record[String, _] */](
    id: String,
    children: /* nodes */ ReactNodeArray => ReactNode = null,
    defaultMessage: String = null,
    description: String | js.Object = null,
    tagName: ElementType[_] = null,
    values: V = null
  ): Props[V] = {
    val __obj = js.Dynamic.literal(id = id)
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (defaultMessage != null) __obj.updateDynamic("defaultMessage")(defaultMessage)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[V]]
  }
}

