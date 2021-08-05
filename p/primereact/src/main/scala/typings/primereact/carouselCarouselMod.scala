package typings.primereact

import typings.primereact.anon.Page
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselCarouselMod {
  
  @JSImport("primereact/components/carousel/Carousel", "Carousel")
  @js.native
  class Carousel protected ()
    extends Component[CarouselProps, js.Any, js.Any] {
    def this(props: CarouselProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CarouselProps, context: js.Any) = this()
  }
  
  trait CarouselProps extends StObject {
    
    var autoplayInterval: js.UndefOr[Double] = js.undefined
    
    var circular: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var containerClassName: js.UndefOr[String] = js.undefined
    
    var contentClassName: js.UndefOr[String] = js.undefined
    
    var footer: js.UndefOr[js.Any] = js.undefined
    
    var header: js.UndefOr[js.Any] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var indicatorsContentClassName: js.UndefOr[String] = js.undefined
    
    var itemTemplate: js.UndefOr[js.Any] = js.undefined
    
    var numScroll: js.UndefOr[Double] = js.undefined
    
    var numVisible: js.UndefOr[Double] = js.undefined
    
    var onPageChange: js.UndefOr[js.Function1[/* e */ Page, Unit]] = js.undefined
    
    var orientation: js.UndefOr[String] = js.undefined
    
    var page: js.UndefOr[Double] = js.undefined
    
    var responsiveOptions: js.UndefOr[js.Any] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var value: js.UndefOr[js.Any] = js.undefined
    
    var verticalViewPortHeight: js.UndefOr[String] = js.undefined
  }
  object CarouselProps {
    
    inline def apply(): CarouselProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselProps]
    }
    
    extension [Self <: CarouselProps](x: Self) {
      
      inline def setAutoplayInterval(value: Double): Self = StObject.set(x, "autoplayInterval", value.asInstanceOf[js.Any])
      
      inline def setAutoplayIntervalUndefined: Self = StObject.set(x, "autoplayInterval", js.undefined)
      
      inline def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      inline def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      inline def setFooter(value: js.Any): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndicatorsContentClassName(value: String): Self = StObject.set(x, "indicatorsContentClassName", value.asInstanceOf[js.Any])
      
      inline def setIndicatorsContentClassNameUndefined: Self = StObject.set(x, "indicatorsContentClassName", js.undefined)
      
      inline def setItemTemplate(value: js.Any): Self = StObject.set(x, "itemTemplate", value.asInstanceOf[js.Any])
      
      inline def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
      
      inline def setNumScroll(value: Double): Self = StObject.set(x, "numScroll", value.asInstanceOf[js.Any])
      
      inline def setNumScrollUndefined: Self = StObject.set(x, "numScroll", js.undefined)
      
      inline def setNumVisible(value: Double): Self = StObject.set(x, "numVisible", value.asInstanceOf[js.Any])
      
      inline def setNumVisibleUndefined: Self = StObject.set(x, "numVisible", js.undefined)
      
      inline def setOnPageChange(value: /* e */ Page => Unit): Self = StObject.set(x, "onPageChange", js.Any.fromFunction1(value))
      
      inline def setOnPageChangeUndefined: Self = StObject.set(x, "onPageChange", js.undefined)
      
      inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setResponsiveOptions(value: js.Any): Self = StObject.set(x, "responsiveOptions", value.asInstanceOf[js.Any])
      
      inline def setResponsiveOptionsUndefined: Self = StObject.set(x, "responsiveOptions", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVerticalViewPortHeight(value: String): Self = StObject.set(x, "verticalViewPortHeight", value.asInstanceOf[js.Any])
      
      inline def setVerticalViewPortHeightUndefined: Self = StObject.set(x, "verticalViewPortHeight", js.undefined)
    }
  }
}
