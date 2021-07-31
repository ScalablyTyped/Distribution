package typings.reactScrollableAnchor

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-scrollable-anchor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-scrollable-anchor", JSImport.Default)
  @js.native
  class default ()
    extends Component[ScrollableAnchorProps, js.Object, js.Any]
  
  @scala.inline
  def configureAnchors(options: ConfigureAnchorsOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureAnchors")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def goToAnchor(anchorId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("goToAnchor")(anchorId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def goToAnchor(anchorId: String, saveHashUpdate: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("goToAnchor")(anchorId.asInstanceOf[js.Any], saveHashUpdate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def goToTop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("goToTop")().asInstanceOf[Unit]
  
  @scala.inline
  def removeHash(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeHash")().asInstanceOf[Unit]
  
  trait ConfigureAnchorsOptions extends StObject {
    
    var keepLastAnchorHash: js.UndefOr[Boolean] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var scrollDuration: js.UndefOr[Double] = js.undefined
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
  
  trait ScrollableAnchorProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var id: String
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
