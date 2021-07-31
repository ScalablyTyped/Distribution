package typings.primereact

import typings.primereact.anon.IndexNumber
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object galleriaMod {
  
  @JSImport("primereact/components/galleria/Galleria", "Galleria")
  @js.native
  class Galleria protected ()
    extends Component[GalleriaProps, js.Any, js.Any] {
    def this(props: GalleriaProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: GalleriaProps, context: js.Any) = this()
    
    def hide(): Unit = js.native
    
    def isAutoPlayActive(): Boolean = js.native
    
    def show(): Unit = js.native
    
    def startSlideShow(): Unit = js.native
    
    def stopSlideShow(): Unit = js.native
  }
  
  trait GalleriaProps extends StObject {
    
    var activeIndex: js.UndefOr[Double] = js.undefined
    
    var autoPlay: js.UndefOr[Boolean] = js.undefined
    
    var baseZIndex: js.UndefOr[Double] = js.undefined
    
    var caption: js.UndefOr[js.Any] = js.undefined
    
    var changeItemOnIndicatorHover: js.UndefOr[Boolean] = js.undefined
    
    var circular: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var footer: js.UndefOr[js.Any] = js.undefined
    
    var fullScreen: js.UndefOr[Boolean] = js.undefined
    
    var header: js.UndefOr[js.Any] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var indicator: js.UndefOr[js.Any] = js.undefined
    
    var indicatorsPosition: js.UndefOr[String] = js.undefined
    
    var item: js.UndefOr[js.Any] = js.undefined
    
    var numVisible: js.UndefOr[Double] = js.undefined
    
    var onItemChange: js.UndefOr[js.Function1[/* e */ IndexNumber, Unit]] = js.undefined
    
    var responsiveOptions: js.UndefOr[js.Any] = js.undefined
    
    var showIndicators: js.UndefOr[Boolean] = js.undefined
    
    var showIndicatorsOnItem: js.UndefOr[Boolean] = js.undefined
    
    var showItemNavigators: js.UndefOr[Boolean] = js.undefined
    
    var showItemNavigatorsOnHover: js.UndefOr[Boolean] = js.undefined
    
    var showThumbnailNavigators: js.UndefOr[Boolean] = js.undefined
    
    var showThumbnails: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var thumbnail: js.UndefOr[js.Any] = js.undefined
    
    var thumbnailsPosition: js.UndefOr[String] = js.undefined
    
    var transitionInterval: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[js.Array[js.Any]] = js.undefined
  }
  object GalleriaProps {
    
    @scala.inline
    def apply(): GalleriaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GalleriaProps]
    }
    
    @scala.inline
    implicit class GalleriaPropsMutableBuilder[Self <: GalleriaProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      @scala.inline
      def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
      
      @scala.inline
      def setBaseZIndex(value: Double): Self = StObject.set(x, "baseZIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseZIndexUndefined: Self = StObject.set(x, "baseZIndex", js.undefined)
      
      @scala.inline
      def setCaption(value: js.Any): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      @scala.inline
      def setChangeItemOnIndicatorHover(value: Boolean): Self = StObject.set(x, "changeItemOnIndicatorHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeItemOnIndicatorHoverUndefined: Self = StObject.set(x, "changeItemOnIndicatorHover", js.undefined)
      
      @scala.inline
      def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFooter(value: js.Any): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setFullScreen(value: Boolean): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullScreenUndefined: Self = StObject.set(x, "fullScreen", js.undefined)
      
      @scala.inline
      def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIndicator(value: js.Any): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
      
      @scala.inline
      def setIndicatorsPosition(value: String): Self = StObject.set(x, "indicatorsPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorsPositionUndefined: Self = StObject.set(x, "indicatorsPosition", js.undefined)
      
      @scala.inline
      def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      @scala.inline
      def setNumVisible(value: Double): Self = StObject.set(x, "numVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumVisibleUndefined: Self = StObject.set(x, "numVisible", js.undefined)
      
      @scala.inline
      def setOnItemChange(value: /* e */ IndexNumber => Unit): Self = StObject.set(x, "onItemChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnItemChangeUndefined: Self = StObject.set(x, "onItemChange", js.undefined)
      
      @scala.inline
      def setResponsiveOptions(value: js.Any): Self = StObject.set(x, "responsiveOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveOptionsUndefined: Self = StObject.set(x, "responsiveOptions", js.undefined)
      
      @scala.inline
      def setShowIndicators(value: Boolean): Self = StObject.set(x, "showIndicators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowIndicatorsOnItem(value: Boolean): Self = StObject.set(x, "showIndicatorsOnItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowIndicatorsOnItemUndefined: Self = StObject.set(x, "showIndicatorsOnItem", js.undefined)
      
      @scala.inline
      def setShowIndicatorsUndefined: Self = StObject.set(x, "showIndicators", js.undefined)
      
      @scala.inline
      def setShowItemNavigators(value: Boolean): Self = StObject.set(x, "showItemNavigators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowItemNavigatorsOnHover(value: Boolean): Self = StObject.set(x, "showItemNavigatorsOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowItemNavigatorsOnHoverUndefined: Self = StObject.set(x, "showItemNavigatorsOnHover", js.undefined)
      
      @scala.inline
      def setShowItemNavigatorsUndefined: Self = StObject.set(x, "showItemNavigators", js.undefined)
      
      @scala.inline
      def setShowThumbnailNavigators(value: Boolean): Self = StObject.set(x, "showThumbnailNavigators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowThumbnailNavigatorsUndefined: Self = StObject.set(x, "showThumbnailNavigators", js.undefined)
      
      @scala.inline
      def setShowThumbnails(value: Boolean): Self = StObject.set(x, "showThumbnails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowThumbnailsUndefined: Self = StObject.set(x, "showThumbnails", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setThumbnail(value: js.Any): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
      
      @scala.inline
      def setThumbnailsPosition(value: String): Self = StObject.set(x, "thumbnailsPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailsPositionUndefined: Self = StObject.set(x, "thumbnailsPosition", js.undefined)
      
      @scala.inline
      def setTransitionInterval(value: Double): Self = StObject.set(x, "transitionInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionIntervalUndefined: Self = StObject.set(x, "transitionInterval", js.undefined)
      
      @scala.inline
      def setValue(value: js.Array[js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
