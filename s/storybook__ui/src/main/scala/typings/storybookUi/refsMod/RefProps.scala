package typings.storybookUi.refsMod

import typings.react.mod.MutableRefObject
import typings.storybookUi.sidebarTypesMod.Highlight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefProps extends js.Object {
  
  var highlightedRef: MutableRefObject[Highlight] = js.native
  
  var isBrowsing: Boolean = js.native
  
  var isLoading: Boolean = js.native
  
  var selectedStoryId: String | Null = js.native
  
  def setHighlighted(highlight: Highlight): Unit = js.native
}
object RefProps {
  
  @scala.inline
  def apply(
    highlightedRef: MutableRefObject[Highlight],
    isBrowsing: Boolean,
    isLoading: Boolean,
    setHighlighted: Highlight => Unit
  ): RefProps = {
    val __obj = js.Dynamic.literal(highlightedRef = highlightedRef.asInstanceOf[js.Any], isBrowsing = isBrowsing.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], setHighlighted = js.Any.fromFunction1(setHighlighted))
    __obj.asInstanceOf[RefProps]
  }
  
  @scala.inline
  implicit class RefPropsOps[Self <: RefProps] (val x: Self) extends AnyVal {
    
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
    def setHighlightedRef(value: MutableRefObject[Highlight]): Self = this.set("highlightedRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBrowsing(value: Boolean): Self = this.set("isBrowsing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLoading(value: Boolean): Self = this.set("isLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetHighlighted(value: Highlight => Unit): Self = this.set("setHighlighted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectedStoryId(value: String): Self = this.set("selectedStoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedStoryIdNull: Self = this.set("selectedStoryId", null)
  }
}
