package typings.storybookUi

import typings.react.mod.FunctionComponent
import typings.storybookUi.sidebarTypesMod.CombinedDataset
import typings.storybookUi.sidebarTypesMod.Selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object explorerMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/Explorer", "Explorer")
  @js.native
  val Explorer: FunctionComponent[ExplorerProps] = js.native
  
  trait ExplorerProps extends StObject {
    
    var dataset: CombinedDataset
    
    var isBrowsing: Boolean
    
    var isLoading: Boolean
    
    var selected: Selection
  }
  object ExplorerProps {
    
    inline def apply(dataset: CombinedDataset, isBrowsing: Boolean, isLoading: Boolean): ExplorerProps = {
      val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], isBrowsing = isBrowsing.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], selected = null)
      __obj.asInstanceOf[ExplorerProps]
    }
    
    extension [Self <: ExplorerProps](x: Self) {
      
      inline def setDataset(value: CombinedDataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      inline def setIsBrowsing(value: Boolean): Self = StObject.set(x, "isBrowsing", value.asInstanceOf[js.Any])
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Selection): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedNull: Self = StObject.set(x, "selected", null)
    }
  }
}
