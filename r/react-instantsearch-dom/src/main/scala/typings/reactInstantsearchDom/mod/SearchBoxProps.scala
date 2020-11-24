package typings.reactInstantsearchDom.mod

import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLFormElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchBoxProps extends CommonWidgetProps {
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var defaultRefinement: js.UndefOr[String] = js.native
  
  var focusShortcuts: js.UndefOr[js.Array[String]] = js.native
  
  var loadingIndicator: js.UndefOr[Element] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLInputElement, Event], _]] = js.native
  
  var onReset: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLFormElement, Event], _]] = js.native
  
  var onSubmit: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLFormElement, Event], _]] = js.native
  
  var reset: js.UndefOr[Element] = js.native
  
  var searchAsYouType: js.UndefOr[Boolean] = js.native
  
  var showLoadingIndicator: js.UndefOr[Boolean] = js.native
  
  var submit: js.UndefOr[Element] = js.native
}
object SearchBoxProps {
  
  @scala.inline
  def apply(): SearchBoxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBoxProps]
  }
  
  @scala.inline
  implicit class SearchBoxPropsOps[Self <: SearchBoxProps] (val x: Self) extends AnyVal {
    
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
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setDefaultRefinement(value: String): Self = this.set("defaultRefinement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRefinement: Self = this.set("defaultRefinement", js.undefined)
    
    @scala.inline
    def setFocusShortcutsVarargs(value: String*): Self = this.set("focusShortcuts", js.Array(value :_*))
    
    @scala.inline
    def setFocusShortcuts(value: js.Array[String]): Self = this.set("focusShortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusShortcuts: Self = this.set("focusShortcuts", js.undefined)
    
    @scala.inline
    def setLoadingIndicator(value: Element): Self = this.set("loadingIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingIndicator: Self = this.set("loadingIndicator", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* event */ SyntheticEvent[HTMLInputElement, Event] => _): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnReset(value: /* event */ SyntheticEvent[HTMLFormElement, Event] => _): Self = this.set("onReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: /* event */ SyntheticEvent[HTMLFormElement, Event] => _): Self = this.set("onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    
    @scala.inline
    def setReset(value: Element): Self = this.set("reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    
    @scala.inline
    def setSearchAsYouType(value: Boolean): Self = this.set("searchAsYouType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchAsYouType: Self = this.set("searchAsYouType", js.undefined)
    
    @scala.inline
    def setShowLoadingIndicator(value: Boolean): Self = this.set("showLoadingIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLoadingIndicator: Self = this.set("showLoadingIndicator", js.undefined)
    
    @scala.inline
    def setSubmit(value: Element): Self = this.set("submit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmit: Self = this.set("submit", js.undefined)
  }
}
