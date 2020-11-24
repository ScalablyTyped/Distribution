package typings.storybookUi.useExpandedMod

import typings.react.mod.MutableRefObject
import typings.std.HTMLElement
import typings.storybookApi.storiesMod.StoriesHash
import typings.storybookUi.sidebarTypesMod.Highlight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpandedProps extends js.Object {
  
  var containerRef: MutableRefObject[HTMLElement] = js.native
  
  var data: StoriesHash = js.native
  
  var highlightedRef: MutableRefObject[Highlight] = js.native
  
  var isBrowsing: Boolean = js.native
  
  def onSelectStoryId(storyId: String): Unit = js.native
  
  var refId: String = js.native
  
  var rootIds: js.Array[String] = js.native
  
  var selectedStoryId: String | Null = js.native
  
  def setHighlightedItemId(storyId: String): Unit = js.native
}
object ExpandedProps {
  
  @scala.inline
  def apply(
    containerRef: MutableRefObject[HTMLElement],
    data: StoriesHash,
    highlightedRef: MutableRefObject[Highlight],
    isBrowsing: Boolean,
    onSelectStoryId: String => Unit,
    refId: String,
    rootIds: js.Array[String],
    setHighlightedItemId: String => Unit
  ): ExpandedProps = {
    val __obj = js.Dynamic.literal(containerRef = containerRef.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], highlightedRef = highlightedRef.asInstanceOf[js.Any], isBrowsing = isBrowsing.asInstanceOf[js.Any], onSelectStoryId = js.Any.fromFunction1(onSelectStoryId), refId = refId.asInstanceOf[js.Any], rootIds = rootIds.asInstanceOf[js.Any], setHighlightedItemId = js.Any.fromFunction1(setHighlightedItemId))
    __obj.asInstanceOf[ExpandedProps]
  }
  
  @scala.inline
  implicit class ExpandedPropsOps[Self <: ExpandedProps] (val x: Self) extends AnyVal {
    
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
    def setContainerRef(value: MutableRefObject[HTMLElement]): Self = this.set("containerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: StoriesHash): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedRef(value: MutableRefObject[Highlight]): Self = this.set("highlightedRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBrowsing(value: Boolean): Self = this.set("isBrowsing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSelectStoryId(value: String => Unit): Self = this.set("onSelectStoryId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefId(value: String): Self = this.set("refId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootIdsVarargs(value: String*): Self = this.set("rootIds", js.Array(value :_*))
    
    @scala.inline
    def setRootIds(value: js.Array[String]): Self = this.set("rootIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetHighlightedItemId(value: String => Unit): Self = this.set("setHighlightedItemId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectedStoryId(value: String): Self = this.set("selectedStoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedStoryIdNull: Self = this.set("selectedStoryId", null)
  }
}
