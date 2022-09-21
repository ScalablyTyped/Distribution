package typings.resemblejs

import typings.node.bufferMod.global.Buffer
import typings.resemblejs.mod.Analysis
import typings.resemblejs.mod.ComparisonCallback
import typings.resemblejs.mod.ComparisonOptions
import typings.resemblejs.mod.OutputSettings_
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object resemble {
    
    /**
      * Retrieve basic analysis for a single image (add compareTo to compare with another).
      *
      * @param image - The image to analyze. Accepts a URL to an image, a Data URI, a ImageData object, or a Buffer.
      */
    inline def apply(image: String): Analysis = ^.asInstanceOf[js.Dynamic].apply(image.asInstanceOf[js.Any]).asInstanceOf[Analysis]
    inline def apply(image: Buffer): Analysis = ^.asInstanceOf[js.Dynamic].apply(image.asInstanceOf[js.Any]).asInstanceOf[Analysis]
    inline def apply(image: ImageData): Analysis = ^.asInstanceOf[js.Dynamic].apply(image.asInstanceOf[js.Any]).asInstanceOf[Analysis]
    
    @JSGlobal("resemble")
    @js.native
    val ^ : js.Any = js.native
    
    inline def compare(image1: String, image2: String, options: ComparisonCallback, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def compare(image1: String, image2: String, options: ComparisonOptions, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def compare(image1: String, image2: Buffer, options: ComparisonCallback, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def compare(image1: String, image2: Buffer, options: ComparisonOptions, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def compare(image1: String, image2: ImageData, options: ComparisonCallback, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def compare(image1: String, image2: ImageData, options: ComparisonOptions, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def compare(image1: Buffer, image2: String, options: ComparisonCallback, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def compare(image1: Buffer, image2: String, options: ComparisonOptions, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def compare(image1: Buffer, image2: Buffer, options: ComparisonCallback, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def compare(image1: Buffer, image2: Buffer, options: ComparisonOptions, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def compare(image1: Buffer, image2: ImageData, options: ComparisonCallback, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def compare(image1: Buffer, image2: ImageData, options: ComparisonOptions, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def compare(image1: ImageData, image2: String, options: ComparisonCallback, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def compare(image1: ImageData, image2: String, options: ComparisonOptions, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def compare(image1: ImageData, image2: Buffer, options: ComparisonCallback, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def compare(image1: ImageData, image2: Buffer, options: ComparisonOptions, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def compare(image1: ImageData, image2: ImageData, options: ComparisonCallback, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def compare(image1: ImageData, image2: ImageData, options: ComparisonOptions, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Set the resemblance image output style
      */
    inline def outputSettings(settings: OutputSettings_): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("outputSettings")(settings.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
}
