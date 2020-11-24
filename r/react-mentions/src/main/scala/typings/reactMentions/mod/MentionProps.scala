package typings.reactMentions.mod

import typings.react.mod.ReactNode
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MentionProps extends js.Object {
  
  var appendSpaceOnAdd: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var data: js.Array[SuggestionDataItem] | DataFunc = js.native
  
  var displayTransform: js.UndefOr[DisplayTransformFunc] = js.native
  
  var isLoading: js.UndefOr[Boolean] = js.native
  
  var markup: js.UndefOr[String] = js.native
  
  var onAdd: js.UndefOr[js.Function2[/* id */ String | Double, /* display */ String, Unit]] = js.native
  
  var regex: js.UndefOr[RegExp] = js.native
  
  var renderSuggestion: js.UndefOr[
    js.Function5[
      /* suggestion */ SuggestionDataItem, 
      /* search */ String, 
      /* highlightedDisplay */ ReactNode, 
      /* index */ Double, 
      /* focused */ Boolean, 
      ReactNode
    ]
  ] = js.native
  
  var style: js.UndefOr[js.Any] = js.native
  
  var trigger: String | RegExp = js.native
}
object MentionProps {
  
  @scala.inline
  def apply(data: js.Array[SuggestionDataItem] | DataFunc, trigger: String | RegExp): MentionProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[MentionProps]
  }
  
  @scala.inline
  implicit class MentionPropsOps[Self <: MentionProps] (val x: Self) extends AnyVal {
    
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
    def setDataFunction2(
      value: (/* query */ String, /* callback */ js.Function1[/* data */ js.Array[SuggestionDataItem], Unit]) => Unit | js.Array[SuggestionDataItem]
    ): Self = this.set("data", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDataVarargs(value: SuggestionDataItem*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[SuggestionDataItem] | DataFunc): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrigger(value: String | RegExp): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendSpaceOnAdd(value: Boolean): Self = this.set("appendSpaceOnAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendSpaceOnAdd: Self = this.set("appendSpaceOnAdd", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDisplayTransform(value: (/* id */ String, /* display */ String) => String): Self = this.set("displayTransform", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDisplayTransform: Self = this.set("displayTransform", js.undefined)
    
    @scala.inline
    def setIsLoading(value: Boolean): Self = this.set("isLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLoading: Self = this.set("isLoading", js.undefined)
    
    @scala.inline
    def setMarkup(value: String): Self = this.set("markup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkup: Self = this.set("markup", js.undefined)
    
    @scala.inline
    def setOnAdd(value: (/* id */ String | Double, /* display */ String) => Unit): Self = this.set("onAdd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnAdd: Self = this.set("onAdd", js.undefined)
    
    @scala.inline
    def setRegex(value: RegExp): Self = this.set("regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
    
    @scala.inline
    def setRenderSuggestion(
      value: (/* suggestion */ SuggestionDataItem, /* search */ String, /* highlightedDisplay */ ReactNode, /* index */ Double, /* focused */ Boolean) => ReactNode
    ): Self = this.set("renderSuggestion", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteRenderSuggestion: Self = this.set("renderSuggestion", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
