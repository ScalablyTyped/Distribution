package typings.spritesmith

import org.scalablytyped.runtime.StringDictionary
import typings.node.streamWebMod.ReadableStream
import typings.spritesmith.mod.SpritesmithCreateImagesSrc
import typings.spritesmith.spritesmithStrings.`alt-diagonal`
import typings.spritesmith.spritesmithStrings.`binary-tree`
import typings.spritesmith.spritesmithStrings.`left-right`
import typings.spritesmith.spritesmithStrings.`top-down`
import typings.spritesmith.spritesmithStrings.diagonal
import typings.spritesmith.spritesmithStrings.jpeg
import typings.spritesmith.spritesmithStrings.jpg
import typings.spritesmith.spritesmithStrings.png
import typings.spritesmith.spritesmithStrings.webp
import typings.std.Record
import typings.vinyl.mod.BufferFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var background: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[png | jpg | jpeg | webp] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
  }
  object Dictkey {
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setFormat(value: png | jpg | jpeg | webp): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Sort extends StObject {
    
    var sort: js.UndefOr[Boolean] = js.undefined
  }
  object Sort {
    
    inline def apply(): Sort = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Sort]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Sort] (val x: Self) extends AnyVal {
      
      inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
  
  /* Inlined spritesmith.spritesmith.SpritesmithParams & spritesmith.spritesmith.SpritesmithProcessImagesOptions & {  src :spritesmith.spritesmith.SpritesmithCreateImagesSrc} */
  trait SpritesmithParamsSpritesm extends StObject {
    
    var algorithm: js.UndefOr[`top-down` | `left-right` | diagonal | `alt-diagonal` | `binary-tree`] = js.undefined
    
    var algorithmOpts: js.UndefOr[Sort] = js.undefined
    
    var engine: js.UndefOr[String] = js.undefined
    
    var engineOpts: js.UndefOr[Record[String, Any]] = js.undefined
    
    var exportOpts: js.UndefOr[Dictkey] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var src: SpritesmithCreateImagesSrc
  }
  object SpritesmithParamsSpritesm {
    
    inline def apply(src: SpritesmithCreateImagesSrc): SpritesmithParamsSpritesm = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpritesmithParamsSpritesm]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpritesmithParamsSpritesm] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: `top-down` | `left-right` | diagonal | `alt-diagonal` | `binary-tree`): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmOpts(value: Sort): Self = StObject.set(x, "algorithmOpts", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmOptsUndefined: Self = StObject.set(x, "algorithmOpts", js.undefined)
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineOpts(value: Record[String, Any]): Self = StObject.set(x, "engineOpts", value.asInstanceOf[js.Any])
      
      inline def setEngineOptsUndefined: Self = StObject.set(x, "engineOpts", js.undefined)
      
      inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      inline def setExportOpts(value: Dictkey): Self = StObject.set(x, "exportOpts", value.asInstanceOf[js.Any])
      
      inline def setExportOptsUndefined: Self = StObject.set(x, "exportOpts", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setSrc(value: SpritesmithCreateImagesSrc): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcVarargs(value: (String | BufferFile)*): Self = StObject.set(x, "src", js.Array(value*))
    }
  }
  
  /* Inlined spritesmith.spritesmith.SpritesmithResult & {  image :node.buffer.<global>.Buffer} */
  trait SpritesmithResultimageBuf extends StObject {
    
    var coordinates: Record[String, Height]
    
    var image: ReadableStream[Any]
    
    var properties: Width
  }
  object SpritesmithResultimageBuf {
    
    inline def apply(coordinates: Record[String, Height], image: ReadableStream[Any], properties: Width): SpritesmithResultimageBuf = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpritesmithResultimageBuf]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpritesmithResultimageBuf] (val x: Self) extends AnyVal {
      
      inline def setCoordinates(value: Record[String, Height]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setImage(value: ReadableStream[Any]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Width): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
  
  trait Width extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Width {
    
    inline def apply(height: Double, width: Double): Width = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Width]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Width] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
