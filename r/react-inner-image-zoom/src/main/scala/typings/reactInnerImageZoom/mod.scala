package typings.reactInnerImageZoom

import typings.react.mod.Component
import typings.react.mod.ImgHTMLAttributes
import typings.reactInnerImageZoom.anon.Media
import typings.reactInnerImageZoom.reactInnerImageZoomStrings.click
import typings.reactInnerImageZoom.reactInnerImageZoomStrings.drag
import typings.reactInnerImageZoom.reactInnerImageZoomStrings.hover
import typings.reactInnerImageZoom.reactInnerImageZoomStrings.pan
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-inner-image-zoom", JSImport.Default)
  @js.native
  open class default protected () extends InnerImageZoom {
    def this(props: InnerImageZoomProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: InnerImageZoomProps, context: Any) = this()
  }
  
  @JSImport("react-inner-image-zoom", "InnerImageZoom")
  @js.native
  open class InnerImageZoom protected ()
    extends Component[InnerImageZoomProps, js.Object, Any] {
    def this(props: InnerImageZoomProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: InnerImageZoomProps, context: Any) = this()
  }
  
  trait InnerImageZoomProps extends StObject {
    
    var afterZoomIn: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterZoomOut: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var fadeDuration: js.UndefOr[Double] = js.undefined
    
    var fullscreenOnMobile: js.UndefOr[Boolean] = js.undefined
    
    var hasSpacer: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var hideCloseButton: js.UndefOr[Boolean] = js.undefined
    
    var hideHint: js.UndefOr[Boolean] = js.undefined
    
    var imgAttributes: js.UndefOr[ImgHTMLAttributes[HTMLImageElement]] = js.undefined
    
    var mobileBreakpoint: js.UndefOr[Double] = js.undefined
    
    var moveType: js.UndefOr[pan | drag] = js.undefined
    
    var sources: js.UndefOr[js.Array[Media]] = js.undefined
    
    var src: String
    
    var width: js.UndefOr[Double] = js.undefined
    
    var zoomPreload: js.UndefOr[Boolean] = js.undefined
    
    var zoomScale: js.UndefOr[Double] = js.undefined
    
    var zoomSrc: js.UndefOr[String] = js.undefined
    
    var zoomType: js.UndefOr[click | hover] = js.undefined
  }
  object InnerImageZoomProps {
    
    inline def apply(src: String): InnerImageZoomProps = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[InnerImageZoomProps]
    }
    
    extension [Self <: InnerImageZoomProps](x: Self) {
      
      inline def setAfterZoomIn(value: () => Unit): Self = StObject.set(x, "afterZoomIn", js.Any.fromFunction0(value))
      
      inline def setAfterZoomInUndefined: Self = StObject.set(x, "afterZoomIn", js.undefined)
      
      inline def setAfterZoomOut(value: () => Unit): Self = StObject.set(x, "afterZoomOut", js.Any.fromFunction0(value))
      
      inline def setAfterZoomOutUndefined: Self = StObject.set(x, "afterZoomOut", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFadeDuration(value: Double): Self = StObject.set(x, "fadeDuration", value.asInstanceOf[js.Any])
      
      inline def setFadeDurationUndefined: Self = StObject.set(x, "fadeDuration", js.undefined)
      
      inline def setFullscreenOnMobile(value: Boolean): Self = StObject.set(x, "fullscreenOnMobile", value.asInstanceOf[js.Any])
      
      inline def setFullscreenOnMobileUndefined: Self = StObject.set(x, "fullscreenOnMobile", js.undefined)
      
      inline def setHasSpacer(value: Boolean): Self = StObject.set(x, "hasSpacer", value.asInstanceOf[js.Any])
      
      inline def setHasSpacerUndefined: Self = StObject.set(x, "hasSpacer", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHideCloseButton(value: Boolean): Self = StObject.set(x, "hideCloseButton", value.asInstanceOf[js.Any])
      
      inline def setHideCloseButtonUndefined: Self = StObject.set(x, "hideCloseButton", js.undefined)
      
      inline def setHideHint(value: Boolean): Self = StObject.set(x, "hideHint", value.asInstanceOf[js.Any])
      
      inline def setHideHintUndefined: Self = StObject.set(x, "hideHint", js.undefined)
      
      inline def setImgAttributes(value: ImgHTMLAttributes[HTMLImageElement]): Self = StObject.set(x, "imgAttributes", value.asInstanceOf[js.Any])
      
      inline def setImgAttributesUndefined: Self = StObject.set(x, "imgAttributes", js.undefined)
      
      inline def setMobileBreakpoint(value: Double): Self = StObject.set(x, "mobileBreakpoint", value.asInstanceOf[js.Any])
      
      inline def setMobileBreakpointUndefined: Self = StObject.set(x, "mobileBreakpoint", js.undefined)
      
      inline def setMoveType(value: pan | drag): Self = StObject.set(x, "moveType", value.asInstanceOf[js.Any])
      
      inline def setMoveTypeUndefined: Self = StObject.set(x, "moveType", js.undefined)
      
      inline def setSources(value: js.Array[Media]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
      
      inline def setSourcesVarargs(value: Media*): Self = StObject.set(x, "sources", js.Array(value*))
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZoomPreload(value: Boolean): Self = StObject.set(x, "zoomPreload", value.asInstanceOf[js.Any])
      
      inline def setZoomPreloadUndefined: Self = StObject.set(x, "zoomPreload", js.undefined)
      
      inline def setZoomScale(value: Double): Self = StObject.set(x, "zoomScale", value.asInstanceOf[js.Any])
      
      inline def setZoomScaleUndefined: Self = StObject.set(x, "zoomScale", js.undefined)
      
      inline def setZoomSrc(value: String): Self = StObject.set(x, "zoomSrc", value.asInstanceOf[js.Any])
      
      inline def setZoomSrcUndefined: Self = StObject.set(x, "zoomSrc", js.undefined)
      
      inline def setZoomType(value: click | hover): Self = StObject.set(x, "zoomType", value.asInstanceOf[js.Any])
      
      inline def setZoomTypeUndefined: Self = StObject.set(x, "zoomType", js.undefined)
    }
  }
}
