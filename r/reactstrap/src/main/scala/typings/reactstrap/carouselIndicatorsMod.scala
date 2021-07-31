package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselIndicatorsMod {
  
  @JSImport("reactstrap/lib/CarouselIndicators", JSImport.Default)
  @js.native
  class default ()
    extends Component[CarouselIndicatorsProps, js.Object, js.Any]
  
  type CarouselIndicators = Component[CarouselIndicatorsProps, js.Object, js.Any]
  
  trait CarouselIndicatorsProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var activeIndex: Double
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var items: js.Array[js.Object]
    
    def onClickHandler(idx: Double): Unit
  }
  object CarouselIndicatorsProps {
    
    @scala.inline
    def apply(activeIndex: Double, items: js.Array[js.Object], onClickHandler: Double => Unit): CarouselIndicatorsProps = {
      val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], onClickHandler = js.Any.fromFunction1(onClickHandler))
      __obj.asInstanceOf[CarouselIndicatorsProps]
    }
    
    @scala.inline
    implicit class CarouselIndicatorsPropsMutableBuilder[Self <: CarouselIndicatorsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[js.Object]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: js.Object*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setOnClickHandler(value: Double => Unit): Self = StObject.set(x, "onClickHandler", js.Any.fromFunction1(value))
    }
  }
}
