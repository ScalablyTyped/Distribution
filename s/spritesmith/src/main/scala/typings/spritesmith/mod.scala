package typings.spritesmith

import org.scalablytyped.runtime.StringDictionary
import typings.node.streamWebMod.ReadableStream
import typings.spritesmith.anon.Dictkey
import typings.spritesmith.anon.Height
import typings.spritesmith.anon.Sort
import typings.spritesmith.anon.SpritesmithParamsSpritesm
import typings.spritesmith.anon.SpritesmithResultimageBuf
import typings.spritesmith.anon.Width
import typings.spritesmith.spritesmithStrings.`alt-diagonal`
import typings.spritesmith.spritesmithStrings.`binary-tree`
import typings.spritesmith.spritesmithStrings.`left-right`
import typings.spritesmith.spritesmithStrings.`top-down`
import typings.spritesmith.spritesmithStrings.diagonal
import typings.std.Record
import typings.vinyl.mod.BufferFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("spritesmith", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Spritesmith {
    def this(params: SpritesmithParams) = this()
  }
  @JSImport("spritesmith", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def run(
    params: SpritesmithParamsSpritesm,
    callback: js.Function2[/* err */ js.Error | Null, /* result */ SpritesmithResultimageBuf, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(params.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait Spritesmith extends StObject {
    
    def createImages(
      src: SpritesmithCreateImagesSrc,
      callback: js.Function2[/* err */ js.Error | Null, /* images */ js.Array[SpritesmithImage], Unit]
    ): Unit = js.native
    
    def processImages(images: js.Array[SpritesmithImage]): SpritesmithResult = js.native
    def processImages(images: js.Array[SpritesmithImage], options: SpritesmithProcessImagesOptions): SpritesmithResult = js.native
  }
  
  type SpritesmithCreateImagesSrc = js.Array[String | BufferFile]
  
  trait SpritesmithImage
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var height: Double
    
    var width: Double
  }
  object SpritesmithImage {
    
    inline def apply(height: Double, width: Double): SpritesmithImage = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpritesmithImage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpritesmithImage] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait SpritesmithParams extends StObject {
    
    var engine: js.UndefOr[String] = js.undefined
    
    var engineOpts: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object SpritesmithParams {
    
    inline def apply(): SpritesmithParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpritesmithParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpritesmithParams] (val x: Self) extends AnyVal {
      
      inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineOpts(value: Record[String, Any]): Self = StObject.set(x, "engineOpts", value.asInstanceOf[js.Any])
      
      inline def setEngineOptsUndefined: Self = StObject.set(x, "engineOpts", js.undefined)
      
      inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
    }
  }
  
  trait SpritesmithProcessImagesOptions extends StObject {
    
    var algorithm: js.UndefOr[`top-down` | `left-right` | diagonal | `alt-diagonal` | `binary-tree`] = js.undefined
    
    var algorithmOpts: js.UndefOr[Sort] = js.undefined
    
    var exportOpts: js.UndefOr[Dictkey] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
  }
  object SpritesmithProcessImagesOptions {
    
    inline def apply(): SpritesmithProcessImagesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpritesmithProcessImagesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpritesmithProcessImagesOptions] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: `top-down` | `left-right` | diagonal | `alt-diagonal` | `binary-tree`): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmOpts(value: Sort): Self = StObject.set(x, "algorithmOpts", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmOptsUndefined: Self = StObject.set(x, "algorithmOpts", js.undefined)
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setExportOpts(value: Dictkey): Self = StObject.set(x, "exportOpts", value.asInstanceOf[js.Any])
      
      inline def setExportOptsUndefined: Self = StObject.set(x, "exportOpts", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  trait SpritesmithResult extends StObject {
    
    var coordinates: Record[String, Height]
    
    var image: ReadableStream[Any]
    
    var properties: Width
  }
  object SpritesmithResult {
    
    inline def apply(coordinates: Record[String, Height], image: ReadableStream[Any], properties: Width): SpritesmithResult = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpritesmithResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpritesmithResult] (val x: Self) extends AnyVal {
      
      inline def setCoordinates(value: Record[String, Height]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setImage(value: ReadableStream[Any]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Width): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
}
