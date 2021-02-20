package typings.reactNativeQrcode

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-qrcode", JSImport.Default)
  @js.native
  class default ()
    extends Component[QRCodeProperties, js.Object, js.Any]
  
  type QRCode = Component[QRCodeProperties, js.Object, js.Any]
  
  @js.native
  trait QRCodeProperties extends StObject {
    
    var bgColor: js.UndefOr[String] = js.native
    
    var fgColor: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object QRCodeProperties {
    
    @scala.inline
    def apply(): QRCodeProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QRCodeProperties]
    }
    
    @scala.inline
    implicit class QRCodePropertiesMutableBuilder[Self <: QRCodeProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
      
      @scala.inline
      def setFgColor(value: String): Self = StObject.set(x, "fgColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFgColorUndefined: Self = StObject.set(x, "fgColor", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
