package typings.stackblurCanvas

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stackblur-canvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("stackblur-canvas", "BlurStack")
  @js.native
  open class BlurStack () extends StObject {
    
    var a: Double = js.native
    
    var b: Double = js.native
    
    var g: Double = js.native
    
    var next: BlurStack = js.native
    
    var r: Double = js.native
  }
  
  inline def canvasRGB(
    canvas: HTMLCanvasElement,
    topX: Double,
    topY: Double,
    width: Double,
    height: Double,
    radius: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("canvasRGB")(canvas.asInstanceOf[js.Any], topX.asInstanceOf[js.Any], topY.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def canvasRGBA(
    canvas: HTMLCanvasElement,
    topX: Double,
    topY: Double,
    width: Double,
    height: Double,
    radius: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("canvasRGBA")(canvas.asInstanceOf[js.Any], topX.asInstanceOf[js.Any], topY.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def image(img: String, canvas: String, radius: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(img: String, canvas: String, radius: Double, blurAlphaChannel: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(img: String, canvas: String, radius: Double, blurAlphaChannel: Boolean, useOffset: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any], useOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(
    img: String,
    canvas: String,
    radius: Double,
    blurAlphaChannel: Boolean,
    useOffset: Boolean,
    skipStyles: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any], useOffset.asInstanceOf[js.Any], skipStyles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(
    img: String,
    canvas: String,
    radius: Double,
    blurAlphaChannel: Boolean,
    useOffset: Unit,
    skipStyles: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any], useOffset.asInstanceOf[js.Any], skipStyles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(img: String, canvas: String, radius: Double, blurAlphaChannel: Unit, useOffset: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any], useOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(
    img: String,
    canvas: String,
    radius: Double,
    blurAlphaChannel: Unit,
    useOffset: Boolean,
    skipStyles: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any], useOffset.asInstanceOf[js.Any], skipStyles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(
    img: String,
    canvas: String,
    radius: Double,
    blurAlphaChannel: Unit,
    useOffset: Unit,
    skipStyles: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any], useOffset.asInstanceOf[js.Any], skipStyles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(img: String, canvas: HTMLCanvasElement, radius: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(img: String, canvas: HTMLCanvasElement, radius: Double, blurAlphaChannel: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(
    img: String,
    canvas: HTMLCanvasElement,
    radius: Double,
    blurAlphaChannel: Boolean,
    useOffset: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any], useOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(
    img: String,
    canvas: HTMLCanvasElement,
    radius: Double,
    blurAlphaChannel: Boolean,
    useOffset: Boolean,
    skipStyles: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any], useOffset.asInstanceOf[js.Any], skipStyles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(
    img: String,
    canvas: HTMLCanvasElement,
    radius: Double,
    blurAlphaChannel: Boolean,
    useOffset: Unit,
    skipStyles: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any], useOffset.asInstanceOf[js.Any], skipStyles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(img: String, canvas: HTMLCanvasElement, radius: Double, blurAlphaChannel: Unit, useOffset: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any], useOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(
    img: String,
    canvas: HTMLCanvasElement,
    radius: Double,
    blurAlphaChannel: Unit,
    useOffset: Boolean,
    skipStyles: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any], useOffset.asInstanceOf[js.Any], skipStyles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(
    img: String,
    canvas: HTMLCanvasElement,
    radius: Double,
    blurAlphaChannel: Unit,
    useOffset: Unit,
    skipStyles: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any], useOffset.asInstanceOf[js.Any], skipStyles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(img: HTMLImageElement, canvas: String, radius: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(img: HTMLImageElement, canvas: String, radius: Double, blurAlphaChannel: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(
    img: HTMLImageElement,
    canvas: String,
    radius: Double,
    blurAlphaChannel: Boolean,
    useOffset: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any], useOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(
    img: HTMLImageElement,
    canvas: String,
    radius: Double,
    blurAlphaChannel: Boolean,
    useOffset: Boolean,
    skipStyles: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any], useOffset.asInstanceOf[js.Any], skipStyles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(
    img: HTMLImageElement,
    canvas: String,
    radius: Double,
    blurAlphaChannel: Boolean,
    useOffset: Unit,
    skipStyles: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any], useOffset.asInstanceOf[js.Any], skipStyles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(img: HTMLImageElement, canvas: String, radius: Double, blurAlphaChannel: Unit, useOffset: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any], useOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(
    img: HTMLImageElement,
    canvas: String,
    radius: Double,
    blurAlphaChannel: Unit,
    useOffset: Boolean,
    skipStyles: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any], useOffset.asInstanceOf[js.Any], skipStyles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(
    img: HTMLImageElement,
    canvas: String,
    radius: Double,
    blurAlphaChannel: Unit,
    useOffset: Unit,
    skipStyles: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any], useOffset.asInstanceOf[js.Any], skipStyles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(img: HTMLImageElement, canvas: HTMLCanvasElement, radius: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(img: HTMLImageElement, canvas: HTMLCanvasElement, radius: Double, blurAlphaChannel: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(
    img: HTMLImageElement,
    canvas: HTMLCanvasElement,
    radius: Double,
    blurAlphaChannel: Boolean,
    useOffset: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any], useOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(
    img: HTMLImageElement,
    canvas: HTMLCanvasElement,
    radius: Double,
    blurAlphaChannel: Boolean,
    useOffset: Boolean,
    skipStyles: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any], useOffset.asInstanceOf[js.Any], skipStyles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(
    img: HTMLImageElement,
    canvas: HTMLCanvasElement,
    radius: Double,
    blurAlphaChannel: Boolean,
    useOffset: Unit,
    skipStyles: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any], useOffset.asInstanceOf[js.Any], skipStyles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(
    img: HTMLImageElement,
    canvas: HTMLCanvasElement,
    radius: Double,
    blurAlphaChannel: Unit,
    useOffset: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any], useOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(
    img: HTMLImageElement,
    canvas: HTMLCanvasElement,
    radius: Double,
    blurAlphaChannel: Unit,
    useOffset: Boolean,
    skipStyles: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any], useOffset.asInstanceOf[js.Any], skipStyles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def image(
    img: HTMLImageElement,
    canvas: HTMLCanvasElement,
    radius: Double,
    blurAlphaChannel: Unit,
    useOffset: Unit,
    skipStyles: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], blurAlphaChannel.asInstanceOf[js.Any], useOffset.asInstanceOf[js.Any], skipStyles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def imageDataRGB(data: ImageData, topX: Double, topY: Double, width: Double, height: Double, radius: Double): ImageData = (^.asInstanceOf[js.Dynamic].applyDynamic("imageDataRGB")(data.asInstanceOf[js.Any], topX.asInstanceOf[js.Any], topY.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[ImageData]
  
  inline def imageDataRGBA(data: ImageData, topX: Double, topY: Double, width: Double, height: Double, radius: Double): ImageData = (^.asInstanceOf[js.Dynamic].applyDynamic("imageDataRGBA")(data.asInstanceOf[js.Any], topX.asInstanceOf[js.Any], topY.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[ImageData]
}
