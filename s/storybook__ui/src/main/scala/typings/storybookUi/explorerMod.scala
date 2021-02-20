package typings.storybookUi

import typings.react.mod.FunctionComponent
import typings.storybookUi.sidebarTypesMod.CombinedDataset
import typings.storybookUi.sidebarTypesMod.Selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object explorerMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/Explorer", "Explorer")
  @js.native
  val Explorer: FunctionComponent[ExplorerProps] = js.native
  
  @js.native
  trait ExplorerProps extends StObject {
    
    var dataset: CombinedDataset = js.native
    
    var isBrowsing: Boolean = js.native
    
    var isLoading: Boolean = js.native
    
    var selected: Selection = js.native
  }
  object ExplorerProps {
    
    @scala.inline
    def apply(dataset: CombinedDataset, isBrowsing: Boolean, isLoading: Boolean): ExplorerProps = {
      val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], isBrowsing = isBrowsing.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExplorerProps]
    }
    
    @scala.inline
    implicit class ExplorerPropsMutableBuilder[Self <: ExplorerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataset(value: CombinedDataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBrowsing(value: Boolean): Self = StObject.set(x, "isBrowsing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: Selection): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedNull: Self = StObject.set(x, "selected", null)
    }
  }
}
