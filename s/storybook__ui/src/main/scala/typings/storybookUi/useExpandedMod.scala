package typings.storybookUi

import typings.react.mod.Dispatch
import typings.react.mod.MutableRefObject
import typings.std.HTMLElement
import typings.std.Record
import typings.storybookApi.storiesMod.StoriesHash
import typings.storybookUi.sidebarTypesMod.Highlight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useExpandedMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/useExpanded", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useExpanded(
    hasContainerRefIsBrowsingRefIdDataRootIdsHighlightedRefSetHighlightedItemIdSelectedStoryIdOnSelectStoryId: ExpandedProps
  ): js.Tuple2[Record[String, Boolean], Dispatch[ExpandAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useExpanded")(hasContainerRefIsBrowsingRefIdDataRootIdsHighlightedRefSetHighlightedItemIdSelectedStoryIdOnSelectStoryId.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Record[String, Boolean], Dispatch[ExpandAction]]]
  
  trait ExpandAction extends StObject {
    
    var ids: js.Array[String]
    
    var value: Boolean
  }
  object ExpandAction {
    
    inline def apply(ids: js.Array[String], value: Boolean): ExpandAction = {
      val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpandAction]
    }
    
    extension [Self <: ExpandAction](x: Self) {
      
      inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExpandedProps extends StObject {
    
    var containerRef: MutableRefObject[HTMLElement]
    
    var data: StoriesHash
    
    var highlightedRef: MutableRefObject[Highlight]
    
    var isBrowsing: Boolean
    
    def onSelectStoryId(storyId: String): Unit
    
    var refId: String
    
    var rootIds: js.Array[String]
    
    var selectedStoryId: String | Null
    
    def setHighlightedItemId(storyId: String): Unit
  }
  object ExpandedProps {
    
    inline def apply(
      containerRef: MutableRefObject[HTMLElement],
      data: StoriesHash,
      highlightedRef: MutableRefObject[Highlight],
      isBrowsing: Boolean,
      onSelectStoryId: String => Unit,
      refId: String,
      rootIds: js.Array[String],
      setHighlightedItemId: String => Unit
    ): ExpandedProps = {
      val __obj = js.Dynamic.literal(containerRef = containerRef.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], highlightedRef = highlightedRef.asInstanceOf[js.Any], isBrowsing = isBrowsing.asInstanceOf[js.Any], onSelectStoryId = js.Any.fromFunction1(onSelectStoryId), refId = refId.asInstanceOf[js.Any], rootIds = rootIds.asInstanceOf[js.Any], setHighlightedItemId = js.Any.fromFunction1(setHighlightedItemId), selectedStoryId = null)
      __obj.asInstanceOf[ExpandedProps]
    }
    
    extension [Self <: ExpandedProps](x: Self) {
      
      inline def setContainerRef(value: MutableRefObject[HTMLElement]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      inline def setData(value: StoriesHash): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHighlightedRef(value: MutableRefObject[Highlight]): Self = StObject.set(x, "highlightedRef", value.asInstanceOf[js.Any])
      
      inline def setIsBrowsing(value: Boolean): Self = StObject.set(x, "isBrowsing", value.asInstanceOf[js.Any])
      
      inline def setOnSelectStoryId(value: String => Unit): Self = StObject.set(x, "onSelectStoryId", js.Any.fromFunction1(value))
      
      inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      inline def setRootIds(value: js.Array[String]): Self = StObject.set(x, "rootIds", value.asInstanceOf[js.Any])
      
      inline def setRootIdsVarargs(value: String*): Self = StObject.set(x, "rootIds", js.Array(value :_*))
      
      inline def setSelectedStoryId(value: String): Self = StObject.set(x, "selectedStoryId", value.asInstanceOf[js.Any])
      
      inline def setSelectedStoryIdNull: Self = StObject.set(x, "selectedStoryId", null)
      
      inline def setSetHighlightedItemId(value: String => Unit): Self = StObject.set(x, "setHighlightedItemId", js.Any.fromFunction1(value))
    }
  }
  
  type ExpandedState = Record[String, Boolean]
}
