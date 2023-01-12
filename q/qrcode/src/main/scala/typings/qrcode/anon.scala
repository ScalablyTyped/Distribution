package typings.qrcode

import typings.node.bufferMod.global.Buffer
import typings.qrcode.mod.QRCodeSegment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dark extends StObject {
    
    /**
      * Color of dark module. Value must be in hex format (RGBA).
      * Note: dark color should always be darker than `color.light`.
      * @default '#000000ff'
      */
    var dark: js.UndefOr[String] = js.undefined
    
    /**
      * Color of light module. Value must be in hex format (RGBA).
      * @default '#ffffffff'
      */
    var light: js.UndefOr[String] = js.undefined
  }
  object Dark {
    
    inline def apply(): Dark = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dark]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dark] (val x: Self) extends AnyVal {
      
      inline def setDark(value: String): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
      
      inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
      
      inline def setLight(value: String): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
    }
  }
  
  trait Data
    extends StObject
       with QRCodeSegment {
    
    var data: String | Buffer | js.typedarray.Uint8ClampedArray | js.typedarray.Uint8Array
  }
  object Data {
    
    inline def apply(data: String | Buffer | js.typedarray.Uint8ClampedArray | js.typedarray.Uint8Array): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setData(value: String | Buffer | js.typedarray.Uint8ClampedArray | js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeflateLevel extends StObject {
    
    /**
      * Compression level for deflate.
      * @default 9
      */
    var deflateLevel: js.UndefOr[Double] = js.undefined
    
    /**
      * Compression strategy for deflate.
      * @default 3
      */
    var deflateStrategy: js.UndefOr[Double] = js.undefined
  }
  object DeflateLevel {
    
    inline def apply(): DeflateLevel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeflateLevel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeflateLevel] (val x: Self) extends AnyVal {
      
      inline def setDeflateLevel(value: Double): Self = StObject.set(x, "deflateLevel", value.asInstanceOf[js.Any])
      
      inline def setDeflateLevelUndefined: Self = StObject.set(x, "deflateLevel", js.undefined)
      
      inline def setDeflateStrategy(value: Double): Self = StObject.set(x, "deflateStrategy", value.asInstanceOf[js.Any])
      
      inline def setDeflateStrategyUndefined: Self = StObject.set(x, "deflateStrategy", js.undefined)
    }
  }
  
  trait Quality extends StObject {
    
    /**
      * A number between `0` and `1` indicating image quality.
      * @default 0.92
      */
    var quality: js.UndefOr[Double] = js.undefined
  }
  object Quality {
    
    inline def apply(): Quality = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Quality]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Quality] (val x: Self) extends AnyVal {
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    }
  }
}
