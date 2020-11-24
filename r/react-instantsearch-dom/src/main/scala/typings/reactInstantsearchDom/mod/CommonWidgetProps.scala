package typings.reactInstantsearchDom.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// DOM
@js.native
trait CommonWidgetProps extends js.Object {
  
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
  implicit class CommonWidgetPropsOps[Self <: CommonWidgetProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTranslations(value: StringDictionary[String | (js.Function1[/* repeated */ js.Any, _])]): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
}
