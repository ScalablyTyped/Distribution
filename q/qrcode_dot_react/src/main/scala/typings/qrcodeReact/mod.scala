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
  open class ^ protected () extends Component[CanvasQRCodeProps | SvgQRCodeProps, ComponentState, Any] {
    def this(props: CanvasQRCodeProps) = this()
    def this(props: SvgQRCodeProps) = this()
    def this(props: CanvasQRCodeProps, context: Any) = this()
    def this(props: SvgQRCodeProps, context: Any) = this()
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
    
    inline def apply(value: String): BaseQRCodeProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseQRCodeProps]
    }
    
    extension [Self <: BaseQRCodeProps](x: Self) {
      
      inline def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
      
      inline def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
      
      inline def setFgColor(value: String): Self = StObject.set(x, "fgColor", value.asInstanceOf[js.Any])
      
      inline def setFgColorUndefined: Self = StObject.set(x, "fgColor", js.undefined)
      
      inline def setImageSettings(value: ImageSettings): Self = StObject.set(x, "imageSettings", value.asInstanceOf[js.Any])
      
      inline def setImageSettingsUndefined: Self = StObject.set(x, "imageSettings", js.undefined)
      
      inline def setIncludeMargin(value: Boolean): Self = StObject.set(x, "includeMargin", value.asInstanceOf[js.Any])
      
      inline def setIncludeMarginUndefined: Self = StObject.set(x, "includeMargin", js.undefined)
      
      inline def setLevel(value: L | M | Q | H): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait CanvasQRCodeProps
    extends StObject
       with BaseQRCodeProps
       with CanvasHTMLAttributes[HTMLCanvasElement] {
    
    var renderAs: js.UndefOr[canvas] = js.undefined
  }
  object CanvasQRCodeProps {
    
    inline def apply(value: String): CanvasQRCodeProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CanvasQRCodeProps]
    }
    
    extension [Self <: CanvasQRCodeProps](x: Self) {
      
      inline def setRenderAs(value: canvas): Self = StObject.set(x, "renderAs", value.asInstanceOf[js.Any])
      
      inline def setRenderAsUndefined: Self = StObject.set(x, "renderAs", js.undefined)
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
    
    inline def apply(src: String): ImageSettings = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageSettings]
    }
    
    extension [Self <: ImageSettings](x: Self) {
      
      inline def setExcavate(value: Boolean): Self = StObject.set(x, "excavate", value.asInstanceOf[js.Any])
      
      inline def setExcavateUndefined: Self = StObject.set(x, "excavate", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
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
    
    inline def apply(value: String): SvgQRCodeProps = {
      val __obj = js.Dynamic.literal(renderAs = "svg", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SvgQRCodeProps]
    }
    
    extension [Self <: SvgQRCodeProps](x: Self) {
      
      inline def setRenderAs(value: svg): Self = StObject.set(x, "renderAs", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Object & QRCode
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & QRCode = ^
}
