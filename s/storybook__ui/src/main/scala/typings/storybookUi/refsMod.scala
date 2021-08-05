package typings.storybookUi

import typings.react.mod.FunctionComponent
import typings.react.mod.MutableRefObject
import typings.storybookUi.sidebarTypesMod.Highlight
import typings.storybookUi.sidebarTypesMod.RefType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refsMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/Refs", "Ref")
  @js.native
  val Ref: FunctionComponent[RefType & RefProps] = js.native
  
  trait RefProps extends StObject {
    
    var highlightedRef: MutableRefObject[Highlight]
    
    var isBrowsing: Boolean
    
    var isLoading: Boolean
    
    var selectedStoryId: String | Null
    
    def setHighlighted(highlight: Highlight): Unit
  }
  object RefProps {
    
    inline def apply(
      highlightedRef: MutableRefObject[Highlight],
      isBrowsing: Boolean,
      isLoading: Boolean,
      setHighlighted: Highlight => Unit
    ): RefProps = {
      val __obj = js.Dynamic.literal(highlightedRef = highlightedRef.asInstanceOf[js.Any], isBrowsing = isBrowsing.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], setHighlighted = js.Any.fromFunction1(setHighlighted), selectedStoryId = null)
      __obj.asInstanceOf[RefProps]
    }
    
    extension [Self <: RefProps](x: Self) {
      
      inline def setHighlightedRef(value: MutableRefObject[Highlight]): Self = StObject.set(x, "highlightedRef", value.asInstanceOf[js.Any])
      
      inline def setIsBrowsing(value: Boolean): Self = StObject.set(x, "isBrowsing", value.asInstanceOf[js.Any])
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      inline def setSelectedStoryId(value: String): Self = StObject.set(x, "selectedStoryId", value.asInstanceOf[js.Any])
      
      inline def setSelectedStoryIdNull: Self = StObject.set(x, "selectedStoryId", null)
      
      inline def setSetHighlighted(value: Highlight => Unit): Self = StObject.set(x, "setHighlighted", js.Any.fromFunction1(value))
    }
  }
}
