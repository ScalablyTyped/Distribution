package typings.storybookUi.anon

import typings.react.mod.MutableRefObject
import typings.storybookApi.storiesMod.StoriesHash
import typings.storybookUi.sidebarTypesMod.Highlight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends js.Object {
  
  var data: StoriesHash = js.native
  
  var highlightedRef: MutableRefObject[Highlight] = js.native
  
  var isBrowsing: Boolean = js.native
  
  var isMain: Boolean = js.native
  
  def onSelectStoryId(storyId: String): Unit = js.native
  
  var refId: String = js.native
  
  var selectedStoryId: String | Null = js.native
  
  def setHighlightedItemId(itemId: String): Unit = js.native
}
object Data {
  
  @scala.inline
  def apply(
    data: StoriesHash,
    highlightedRef: MutableRefObject[Highlight],
    isBrowsing: Boolean,
    isMain: Boolean,
    onSelectStoryId: String => Unit,
    refId: String,
    setHighlightedItemId: String => Unit
  ): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], highlightedRef = highlightedRef.asInstanceOf[js.Any], isBrowsing = isBrowsing.asInstanceOf[js.Any], isMain = isMain.asInstanceOf[js.Any], onSelectStoryId = js.Any.fromFunction1(onSelectStoryId), refId = refId.asInstanceOf[js.Any], setHighlightedItemId = js.Any.fromFunction1(setHighlightedItemId))
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
    
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
    def setData(value: StoriesHash): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedRef(value: MutableRefObject[Highlight]): Self = this.set("highlightedRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBrowsing(value: Boolean): Self = this.set("isBrowsing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMain(value: Boolean): Self = this.set("isMain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSelectStoryId(value: String => Unit): Self = this.set("onSelectStoryId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefId(value: String): Self = this.set("refId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetHighlightedItemId(value: String => Unit): Self = this.set("setHighlightedItemId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectedStoryId(value: String): Self = this.set("selectedStoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedStoryIdNull: Self = this.set("selectedStoryId", null)
  }
}
