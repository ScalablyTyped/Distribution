package typings.rpiWs281xNative

import typings.rpiWs281xNative.mod.StripTypeEnum
import typings.rpiWs281xNative.rpiWs281xNativeInts.`1048584`
import typings.rpiWs281xNative.rpiWs281xNativeInts.`1050624`
import typings.rpiWs281xNative.rpiWs281xNativeInts.`2064`
import typings.rpiWs281xNative.rpiWs281xNativeInts.`402655248`
import typings.rpiWs281xNative.rpiWs281xNativeInts.`402657288`
import typings.rpiWs281xNative.rpiWs281xNativeInts.`403177488`
import typings.rpiWs281xNative.rpiWs281xNativeInts.`403181568`
import typings.rpiWs281xNative.rpiWs281xNativeInts.`403701768`
import typings.rpiWs281xNative.rpiWs281xNativeInts.`403703808`
import typings.rpiWs281xNative.rpiWs281xNativeInts.`4104`
import typings.rpiWs281xNative.rpiWs281xNativeInts.`524304`
import typings.rpiWs281xNative.rpiWs281xNativeInts.`528384`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Omit<rpi-ws281x-native.rpi-ws281x-native.ChannelOptions, 'count'> */
  trait OmitChannelOptionscount extends StObject {
    
    var brightness: js.UndefOr[Double] = js.undefined
    
    var gpio: js.UndefOr[Double] = js.undefined
    
    var invert: js.UndefOr[Boolean] = js.undefined
    
    var stripType: js.UndefOr[StripTypeEnum] = js.undefined
  }
  object OmitChannelOptionscount {
    
    inline def apply(): OmitChannelOptionscount = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitChannelOptionscount]
    }
    
    extension [Self <: OmitChannelOptionscount](x: Self) {
      
      inline def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
      
      inline def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
      
      inline def setGpio(value: Double): Self = StObject.set(x, "gpio", value.asInstanceOf[js.Any])
      
      inline def setGpioUndefined: Self = StObject.set(x, "gpio", js.undefined)
      
      inline def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
      
      inline def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
      
      inline def setStripType(value: StripTypeEnum): Self = StObject.set(x, "stripType", value.asInstanceOf[js.Any])
      
      inline def setStripTypeUndefined: Self = StObject.set(x, "stripType", js.undefined)
    }
  }
  
  trait SK6812 extends StObject {
    
    var SK6812: `528384`
    
    var SK6812W: `403177488`
    
    var SK6812_BGRW: `402655248`
    
    var SK6812_BRGW: `402657288`
    
    var SK6812_GBRW: `403177488`
    
    var SK6812_GRBW: `403181568`
    
    var SK6812_RBGW: `403701768`
    
    var SK6812_RGBW: `403703808`
    
    var WS2811_BGR: `2064`
    
    var WS2811_BRG: `4104`
    
    var WS2811_GBR: `524304`
    
    var WS2811_GRB: `528384`
    
    var WS2811_RBG: `1048584`
    
    var WS2811_RGB: `1050624`
    
    var WS2812: `528384`
  }
  object SK6812 {
    
    inline def apply(): SK6812 = {
      val __obj = js.Dynamic.literal(SK6812 = 528384, SK6812W = 403177488, SK6812_BGRW = 402655248, SK6812_BRGW = 402657288, SK6812_GBRW = 403177488, SK6812_GRBW = 403181568, SK6812_RBGW = 403701768, SK6812_RGBW = 403703808, WS2811_BGR = 2064, WS2811_BRG = 4104, WS2811_GBR = 524304, WS2811_GRB = 528384, WS2811_RBG = 1048584, WS2811_RGB = 1050624, WS2812 = 528384)
      __obj.asInstanceOf[SK6812]
    }
    
    extension [Self <: SK6812](x: Self) {
      
      inline def setSK6812(value: `528384`): Self = StObject.set(x, "SK6812", value.asInstanceOf[js.Any])
      
      inline def setSK6812W(value: `403177488`): Self = StObject.set(x, "SK6812W", value.asInstanceOf[js.Any])
      
      inline def setSK6812_BGRW(value: `402655248`): Self = StObject.set(x, "SK6812_BGRW", value.asInstanceOf[js.Any])
      
      inline def setSK6812_BRGW(value: `402657288`): Self = StObject.set(x, "SK6812_BRGW", value.asInstanceOf[js.Any])
      
      inline def setSK6812_GBRW(value: `403177488`): Self = StObject.set(x, "SK6812_GBRW", value.asInstanceOf[js.Any])
      
      inline def setSK6812_GRBW(value: `403181568`): Self = StObject.set(x, "SK6812_GRBW", value.asInstanceOf[js.Any])
      
      inline def setSK6812_RBGW(value: `403701768`): Self = StObject.set(x, "SK6812_RBGW", value.asInstanceOf[js.Any])
      
      inline def setSK6812_RGBW(value: `403703808`): Self = StObject.set(x, "SK6812_RGBW", value.asInstanceOf[js.Any])
      
      inline def setWS2811_BGR(value: `2064`): Self = StObject.set(x, "WS2811_BGR", value.asInstanceOf[js.Any])
      
      inline def setWS2811_BRG(value: `4104`): Self = StObject.set(x, "WS2811_BRG", value.asInstanceOf[js.Any])
      
      inline def setWS2811_GBR(value: `524304`): Self = StObject.set(x, "WS2811_GBR", value.asInstanceOf[js.Any])
      
      inline def setWS2811_GRB(value: `528384`): Self = StObject.set(x, "WS2811_GRB", value.asInstanceOf[js.Any])
      
      inline def setWS2811_RBG(value: `1048584`): Self = StObject.set(x, "WS2811_RBG", value.asInstanceOf[js.Any])
      
      inline def setWS2811_RGB(value: `1050624`): Self = StObject.set(x, "WS2811_RGB", value.asInstanceOf[js.Any])
      
      inline def setWS2812(value: `528384`): Self = StObject.set(x, "WS2812", value.asInstanceOf[js.Any])
    }
  }
}
