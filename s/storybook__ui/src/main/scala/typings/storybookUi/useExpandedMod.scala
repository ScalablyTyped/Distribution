package typings.storybookUi

import typings.react.mod.Dispatch
import typings.react.mod.MutableRefObject
import typings.std.HTMLElement
import typings.std.Record
import typings.storybookApi.storiesMod.StoriesHash
import typings.storybookUi.sidebarTypesMod.Highlight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useExpandedMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/useExpanded", "useExpanded")
  @js.native
  def useExpanded(
    hasContainerRefIsBrowsingRefIdDataRootIdsHighlightedRefSetHighlightedItemIdSelectedStoryIdOnSelectStoryId: ExpandedProps
  ): js.Tuple2[Record[String, Boolean], Dispatch[ExpandAction]] = js.native
  
  @js.native
  trait ExpandAction extends StObject {
    
    var ids: js.Array[String] = js.native
    
    var value: Boolean = js.native
  }
  object ExpandAction {
    
    @scala.inline
    def apply(ids: js.Array[String], value: Boolean): ExpandAction = {
      val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpandAction]
    }
    
    @scala.inline
    implicit class ExpandActionMutableBuilder[Self <: ExpandAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExpandedProps extends StObject {
    
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
    implicit class ExpandedPropsMutableBuilder[Self <: ExpandedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerRef(value: MutableRefObject[HTMLElement]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: StoriesHash): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightedRef(value: MutableRefObject[Highlight]): Self = StObject.set(x, "highlightedRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBrowsing(value: Boolean): Self = StObject.set(x, "isBrowsing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelectStoryId(value: String => Unit): Self = StObject.set(x, "onSelectStoryId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootIds(value: js.Array[String]): Self = StObject.set(x, "rootIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootIdsVarargs(value: String*): Self = StObject.set(x, "rootIds", js.Array(value :_*))
      
      @scala.inline
      def setSelectedStoryId(value: String): Self = StObject.set(x, "selectedStoryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedStoryIdNull: Self = StObject.set(x, "selectedStoryId", null)
      
      @scala.inline
      def setSetHighlightedItemId(value: String => Unit): Self = StObject.set(x, "setHighlightedItemId", js.Any.fromFunction1(value))
    }
  }
  
  type ExpandedState = Record[String, Boolean]
}
