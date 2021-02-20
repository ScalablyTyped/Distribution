package typings.storybookUi

import typings.react.mod.FunctionComponent
import typings.react.mod.MutableRefObject
import typings.storybookUi.sidebarTypesMod.Highlight
import typings.storybookUi.sidebarTypesMod.RefType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refsMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/Refs", "Ref")
  @js.native
  val Ref: FunctionComponent[RefType with RefProps] = js.native
  
  @js.native
  trait RefProps extends StObject {
    
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
    implicit class RefPropsMutableBuilder[Self <: RefProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHighlightedRef(value: MutableRefObject[Highlight]): Self = StObject.set(x, "highlightedRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBrowsing(value: Boolean): Self = StObject.set(x, "isBrowsing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedStoryId(value: String): Self = StObject.set(x, "selectedStoryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedStoryIdNull: Self = StObject.set(x, "selectedStoryId", null)
      
      @scala.inline
      def setSetHighlighted(value: Highlight => Unit): Self = StObject.set(x, "setHighlighted", js.Any.fromFunction1(value))
    }
  }
}
