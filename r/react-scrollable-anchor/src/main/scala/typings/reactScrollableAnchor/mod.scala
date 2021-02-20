package typings.reactScrollableAnchor

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-scrollable-anchor", JSImport.Default)
  @js.native
  class default ()
    extends Component[ScrollableAnchorProps, js.Object, js.Any]
  
  @JSImport("react-scrollable-anchor", "configureAnchors")
  @js.native
  def configureAnchors(options: ConfigureAnchorsOptions): Unit = js.native
  
  @JSImport("react-scrollable-anchor", "goToAnchor")
  @js.native
  def goToAnchor(anchorId: String): Unit = js.native
  @JSImport("react-scrollable-anchor", "goToAnchor")
  @js.native
  def goToAnchor(anchorId: String, saveHashUpdate: Boolean): Unit = js.native
  
  @JSImport("react-scrollable-anchor", "goToTop")
  @js.native
  def goToTop(): Unit = js.native
  
  @JSImport("react-scrollable-anchor", "removeHash")
  @js.native
  def removeHash(): Unit = js.native
  
  @js.native
  trait ConfigureAnchorsOptions extends StObject {
    
    var keepLastAnchorHash: js.UndefOr[Boolean] = js.native
    
    var offset: js.UndefOr[Double] = js.native
    
    var scrollDuration: js.UndefOr[Double] = js.native
  }
  object ConfigureAnchorsOptions {
    
    @scala.inline
    def apply(): ConfigureAnchorsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigureAnchorsOptions]
    }
    
    @scala.inline
    implicit class ConfigureAnchorsOptionsMutableBuilder[Self <: ConfigureAnchorsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeepLastAnchorHash(value: Boolean): Self = StObject.set(x, "keepLastAnchorHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepLastAnchorHashUndefined: Self = StObject.set(x, "keepLastAnchorHash", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setScrollDuration(value: Double): Self = StObject.set(x, "scrollDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollDurationUndefined: Self = StObject.set(x, "scrollDuration", js.undefined)
    }
  }
  
  type ScrollableAnchor = Component[ScrollableAnchorProps, js.Object, js.Any]
  
  @js.native
  trait ScrollableAnchorProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var id: String = js.native
  }
  object ScrollableAnchorProps {
    
    @scala.inline
    def apply(id: String): ScrollableAnchorProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollableAnchorProps]
    }
    
    @scala.inline
    implicit class ScrollableAnchorPropsMutableBuilder[Self <: ScrollableAnchorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
