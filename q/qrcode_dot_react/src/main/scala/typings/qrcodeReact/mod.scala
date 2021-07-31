package typings.qrcodeReact

import org.scalablytyped.runtime.Shortcut
import typings.qrcodeReact.qrcodeReactStrings.H
import typings.qrcodeReact.qrcodeReactStrings.L
import typings.qrcodeReact.qrcodeReactStrings.M
import typings.qrcodeReact.qrcodeReactStrings.Q
import typings.qrcodeReact.qrcodeReactStrings.canvas
import typings.qrcodeReact.qrcodeReactStrings.svg
import typings.react.mod.CanvasHTMLAttributes
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.SVGProps
import typings.std.HTMLCanvasElement
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("qrcode.react", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends Component[CanvasQRCodeProps | SvgQRCodeProps, ComponentState, js.Any] {
    def this(props: CanvasQRCodeProps) = this()
    def this(props: SvgQRCodeProps) = this()
    def this(props: CanvasQRCodeProps, context: js.Any) = this()
    def this(props: SvgQRCodeProps, context: js.Any) = this()
  }
  @JSImport("qrcode.react", JSImport.Namespace)
  @js.native
  val ^ : js.Object & QRCode = js.native
  
  trait BaseQRCodeProps extends StObject {
    
    var bgColor: js.UndefOr[String] = js.undefined
    
    var fgColor: js.UndefOr[String] = js.undefined
    
    var imageSettings: js.UndefOr[ImageSettings] = js.undefined
    
    var includeMargin: js.UndefOr[Boolean] = js.undefined
    
    var level: js.UndefOr[L | M | Q | H] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var value: String
  }
  object BaseQRCodeProps {
    
    @scala.inline
    def apply(value: String): BaseQRCodeProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseQRCodeProps]
    }
    
    @scala.inline
    implicit class BaseQRCodePropsMutableBuilder[Self <: BaseQRCodeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
      
      @scala.inline
      def setFgColor(value: String): Self = StObject.set(x, "fgColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFgColorUndefined: Self = StObject.set(x, "fgColor", js.undefined)
      
      @scala.inline
      def setImageSettings(value: ImageSettings): Self = StObject.set(x, "imageSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSettingsUndefined: Self = StObject.set(x, "imageSettings", js.undefined)
      
      @scala.inline
      def setIncludeMargin(value: Boolean): Self = StObject.set(x, "includeMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeMarginUndefined: Self = StObject.set(x, "includeMargin", js.undefined)
      
      @scala.inline
      def setLevel(value: L | M | Q | H): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait CanvasQRCodeProps
    extends StObject
       with BaseQRCodeProps
       with CanvasHTMLAttributes[HTMLCanvasElement] {
    
    var renderAs: js.UndefOr[canvas] = js.undefined
  }
  object CanvasQRCodeProps {
    
    @scala.inline
    def apply(value: String): CanvasQRCodeProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CanvasQRCodeProps]
    }
    
    @scala.inline
    implicit class CanvasQRCodePropsMutableBuilder[Self <: CanvasQRCodeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRenderAs(value: canvas): Self = StObject.set(x, "renderAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderAsUndefined: Self = StObject.set(x, "renderAs", js.undefined)
    }
  }
  
  trait ImageSettings extends StObject {
    
    var excavate: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var src: String
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object ImageSettings {
    
    @scala.inline
    def apply(src: String): ImageSettings = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageSettings]
    }
    
    @scala.inline
    implicit class ImageSettingsMutableBuilder[Self <: ImageSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExcavate(value: Boolean): Self = StObject.set(x, "excavate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcavateUndefined: Self = StObject.set(x, "excavate", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  type QRCode = ComponentClass[CanvasQRCodeProps | SvgQRCodeProps, ComponentState]
  
  trait SvgQRCodeProps
    extends StObject
       with BaseQRCodeProps
       with SVGProps[SVGSVGElement] {
    
    var renderAs: svg
  }
  object SvgQRCodeProps {
    
    @scala.inline
    def apply(value: String): SvgQRCodeProps = {
      val __obj = js.Dynamic.literal(renderAs = "svg", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SvgQRCodeProps]
    }
    
    @scala.inline
    implicit class SvgQRCodePropsMutableBuilder[Self <: SvgQRCodeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRenderAs(value: svg): Self = StObject.set(x, "renderAs", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Object & QRCode
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & QRCode = ^
}
