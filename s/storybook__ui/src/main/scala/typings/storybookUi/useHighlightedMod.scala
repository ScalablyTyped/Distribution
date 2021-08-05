package typings.storybookUi

import typings.react.mod.Dispatch
import typings.react.mod.MutableRefObject
import typings.react.mod.SetStateAction
import typings.std.HTMLElement
import typings.storybookUi.sidebarTypesMod.CombinedDataset
import typings.storybookUi.sidebarTypesMod.Highlight
import typings.storybookUi.sidebarTypesMod.Selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useHighlightedMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/useHighlighted", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useHighlighted(hasContainerRefIsLoadingIsBrowsingDatasetSelected: HighlightedProps): js.Tuple3[Highlight, Dispatch[SetStateAction[Highlight]], MutableRefObject[Highlight]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useHighlighted")(hasContainerRefIsLoadingIsBrowsingDatasetSelected.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Highlight, Dispatch[SetStateAction[Highlight]], MutableRefObject[Highlight]]]
  
  trait HighlightedProps extends StObject {
    
    var containerRef: MutableRefObject[HTMLElement]
    
    var dataset: CombinedDataset
    
    var isBrowsing: Boolean
    
    var isLoading: Boolean
    
    var selected: Selection
  }
  object HighlightedProps {
    
    inline def apply(
      containerRef: MutableRefObject[HTMLElement],
      dataset: CombinedDataset,
      isBrowsing: Boolean,
      isLoading: Boolean
    ): HighlightedProps = {
      val __obj = js.Dynamic.literal(containerRef = containerRef.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], isBrowsing = isBrowsing.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], selected = null)
      __obj.asInstanceOf[HighlightedProps]
    }
    
    extension [Self <: HighlightedProps](x: Self) {
      
      inline def setContainerRef(value: MutableRefObject[HTMLElement]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      inline def setDataset(value: CombinedDataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      inline def setIsBrowsing(value: Boolean): Self = StObject.set(x, "isBrowsing", value.asInstanceOf[js.Any])
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Selection): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedNull: Self = StObject.set(x, "selected", null)
    }
  }
}
