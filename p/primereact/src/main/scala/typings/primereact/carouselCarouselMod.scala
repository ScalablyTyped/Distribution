package typings.primereact

import typings.primereact.anon.Page
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait CarouselProps extends StObject {
    
    var autoplayInterval: js.UndefOr[Double] = js.native
    
    var circular: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var containerClassName: js.UndefOr[String] = js.native
    
    var contentClassName: js.UndefOr[String] = js.native
    
    var footer: js.UndefOr[js.Any] = js.native
    
    var header: js.UndefOr[js.Any] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var indicatorsContentClassName: js.UndefOr[String] = js.native
    
    var itemTemplate: js.UndefOr[js.Any] = js.native
    
    var numScroll: js.UndefOr[Double] = js.native
    
    var numVisible: js.UndefOr[Double] = js.native
    
    var onPageChange: js.UndefOr[js.Function1[/* e */ Page, Unit]] = js.native
    
    var orientation: js.UndefOr[String] = js.native
    
    var page: js.UndefOr[Double] = js.native
    
    var responsiveOptions: js.UndefOr[js.Any] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
    
    var value: js.UndefOr[js.Any] = js.native
    
    var verticalViewPortHeight: js.UndefOr[String] = js.native
  }
  object CarouselProps {
    
    @scala.inline
    def apply(): CarouselProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselProps]
    }
    
    @scala.inline
    implicit class CarouselPropsMutableBuilder[Self <: CarouselProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoplayInterval(value: Double): Self = StObject.set(x, "autoplayInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayIntervalUndefined: Self = StObject.set(x, "autoplayInterval", js.undefined)
      
      @scala.inline
      def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      @scala.inline
      def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      @scala.inline
      def setFooter(value: js.Any): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIndicatorsContentClassName(value: String): Self = StObject.set(x, "indicatorsContentClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorsContentClassNameUndefined: Self = StObject.set(x, "indicatorsContentClassName", js.undefined)
      
      @scala.inline
      def setItemTemplate(value: js.Any): Self = StObject.set(x, "itemTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
      
      @scala.inline
      def setNumScroll(value: Double): Self = StObject.set(x, "numScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumScrollUndefined: Self = StObject.set(x, "numScroll", js.undefined)
      
      @scala.inline
      def setNumVisible(value: Double): Self = StObject.set(x, "numVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumVisibleUndefined: Self = StObject.set(x, "numVisible", js.undefined)
      
      @scala.inline
      def setOnPageChange(value: /* e */ Page => Unit): Self = StObject.set(x, "onPageChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPageChangeUndefined: Self = StObject.set(x, "onPageChange", js.undefined)
      
      @scala.inline
      def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      @scala.inline
      def setResponsiveOptions(value: js.Any): Self = StObject.set(x, "responsiveOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveOptionsUndefined: Self = StObject.set(x, "responsiveOptions", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setVerticalViewPortHeight(value: String): Self = StObject.set(x, "verticalViewPortHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalViewPortHeightUndefined: Self = StObject.set(x, "verticalViewPortHeight", js.undefined)
    }
  }
}
