package typings.reactInstantsearchDom.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// DOM
trait CommonWidgetProps extends StObject {
  
  /**
    * All static text rendered by widgets, such as “Load more”, “Show more” are translatable using the translations prop on relevant widgets.
    * This prop is a mapping of keys to translation values. Translation values can be either a String or a (...args: any[]) => any, as some take parameters.
    *
    * https://community.algolia.com/react-instantsearch/guide/i18n.html
    */
  var translations: js.UndefOr[StringDictionary[String | (js.Function1[/* repeated */ Any, Any])]] = js.undefined
}
object CommonWidgetProps {
  
  inline def apply(): CommonWidgetProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonWidgetProps]
  }
  
  extension [Self <: CommonWidgetProps](x: Self) {
    
    inline def setTranslations(value: StringDictionary[String | (js.Function1[/* repeated */ Any, Any])]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
  }
}
