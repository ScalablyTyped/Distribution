package typings.reactInstantsearchDom.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// DOM
@js.native
trait CommonWidgetProps extends StObject {
  
  /**
    * All static text rendered by widgets, such as “Load more”, “Show more” are translatable using the translations prop on relevant widgets.
    * This prop is a mapping of keys to translation values. Translation values can be either a String or a (...args: any[]) => any, as some take parameters.
    *
    * https://community.algolia.com/react-instantsearch/guide/i18n.html
    */
  var translations: js.UndefOr[StringDictionary[String | (js.Function1[/* repeated */ js.Any, _])]] = js.native
}
object CommonWidgetProps {
  
  @scala.inline
  def apply(): CommonWidgetProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonWidgetProps]
  }
  
  @scala.inline
  implicit class CommonWidgetPropsMutableBuilder[Self <: CommonWidgetProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTranslations(value: StringDictionary[String | (js.Function1[/* repeated */ js.Any, _])]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
  }
}
