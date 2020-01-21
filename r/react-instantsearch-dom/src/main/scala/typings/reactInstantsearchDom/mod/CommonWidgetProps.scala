package typings.reactInstantsearchDom.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// DOM
trait CommonWidgetProps extends js.Object {
  /**
    * All static text rendered by widgets, such as “Load more”, “Show more” are translatable using the translations prop on relevant widgets.
    * This prop is a mapping of keys to translation values. Translation values can be either a String or a (...args: any[]) => any, as some take parameters.
    *
    * https://community.algolia.com/react-instantsearch/guide/i18n.html
    */
  var translations: js.UndefOr[StringDictionary[String | (js.Function1[/* repeated */ js.Any, _])]] = js.undefined
}

object CommonWidgetProps {
  @scala.inline
  def apply(translations: StringDictionary[String | (js.Function1[/* repeated */ js.Any, _])] = null): CommonWidgetProps = {
    val __obj = js.Dynamic.literal()
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonWidgetProps]
  }
}

