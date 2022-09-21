package typings.savePixels

import typings.ndarray.mod.Data
import typings.ndarray.mod.NdArray
import typings.savePixels.anon.Quality
import typings.savePixels.savePixelsStrings.canvas
import typings.savePixels.savePixelsStrings.gif
import typings.savePixels.savePixelsStrings.jpeg
import typings.savePixels.savePixelsStrings.jpg
import typings.savePixels.savePixelsStrings.png
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // Function overloads. Most types return a Stream, except 'canvas'. Quality option only available for
  // JPEG format. See https://www.npmjs.com/package/save-pixels#requiresave-pixelsarray-type-options.
  inline def apply(array: NdArray[Data[Double]], `type`: gif | jpeg | jpg | png): typings.node.streamMod.^ = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.node.streamMod.^]
  inline def apply(array: NdArray[Data[Double]], `type`: jpeg | jpg, options: Quality): typings.node.streamMod.^ = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.streamMod.^]
  inline def apply(array: NdArray[Data[Double]], `type`: canvas): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
  
  @JSImport("save-pixels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
