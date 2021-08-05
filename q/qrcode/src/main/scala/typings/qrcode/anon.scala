package typings.qrcode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dark extends StObject {
    
    /**
      * Color of dark module. Value must be in hex format (RGBA).
      * Note: dark color should always be darker than color.light.
      * Default: #000000ff
      */
    var dark: js.UndefOr[String] = js.undefined
    
    /**
      * Color of light module. Value must be in hex format (RGBA).
      * Default: #ffffffff
      */
    var light: js.UndefOr[String] = js.undefined
  }
  object Dark {
    
    inline def apply(): Dark = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dark]
    }
    
    extension [Self <: Dark](x: Self) {
      
      inline def setDark(value: String): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
      
      inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
      
      inline def setLight(value: String): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
    }
  }
  
  trait DeflateLevel extends StObject {
    
    /**
      * Compression level for deflate.
      * Default: 9
      */
    var deflateLevel: js.UndefOr[Double] = js.undefined
    
    /**
      * Compression strategy for deflate.
      * Default: 3
      */
    var deflateStrategy: js.UndefOr[Double] = js.undefined
  }
  object DeflateLevel {
    
    inline def apply(): DeflateLevel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeflateLevel]
    }
    
    extension [Self <: DeflateLevel](x: Self) {
      
      inline def setDeflateLevel(value: Double): Self = StObject.set(x, "deflateLevel", value.asInstanceOf[js.Any])
      
      inline def setDeflateLevelUndefined: Self = StObject.set(x, "deflateLevel", js.undefined)
      
      inline def setDeflateStrategy(value: Double): Self = StObject.set(x, "deflateStrategy", value.asInstanceOf[js.Any])
      
      inline def setDeflateStrategyUndefined: Self = StObject.set(x, "deflateStrategy", js.undefined)
    }
  }
  
  trait Quality extends StObject {
    
    /**
      * A Number between 0 and 1 indicating image quality if the requested type is image/jpeg or image/webp.
      * Default: 0.92
      */
    var quality: js.UndefOr[Double] = js.undefined
  }
  object Quality {
    
    inline def apply(): Quality = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Quality]
    }
    
    extension [Self <: Quality](x: Self) {
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    }
  }
}
