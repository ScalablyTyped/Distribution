package typings.resemblejs

import typings.node.bufferMod.global.Buffer
import typings.resemblejs.mod.ComparisonOptions
import typings.resemblejs.mod.ComparisonResult
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compareImagesMod {
  
  /**
    * The API under Node is the same as on the `resemble.compare` but promise based
    */
  inline def apply(image1: String, image2: String, options: ComparisonOptions): js.Promise[ComparisonResult] = (^.asInstanceOf[js.Dynamic].apply(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ComparisonResult]]
  inline def apply(image1: String, image2: Buffer, options: ComparisonOptions): js.Promise[ComparisonResult] = (^.asInstanceOf[js.Dynamic].apply(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ComparisonResult]]
  inline def apply(image1: String, image2: ImageData, options: ComparisonOptions): js.Promise[ComparisonResult] = (^.asInstanceOf[js.Dynamic].apply(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ComparisonResult]]
  inline def apply(image1: Buffer, image2: String, options: ComparisonOptions): js.Promise[ComparisonResult] = (^.asInstanceOf[js.Dynamic].apply(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ComparisonResult]]
  inline def apply(image1: Buffer, image2: Buffer, options: ComparisonOptions): js.Promise[ComparisonResult] = (^.asInstanceOf[js.Dynamic].apply(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ComparisonResult]]
  inline def apply(image1: Buffer, image2: ImageData, options: ComparisonOptions): js.Promise[ComparisonResult] = (^.asInstanceOf[js.Dynamic].apply(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ComparisonResult]]
  inline def apply(image1: ImageData, image2: String, options: ComparisonOptions): js.Promise[ComparisonResult] = (^.asInstanceOf[js.Dynamic].apply(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ComparisonResult]]
  inline def apply(image1: ImageData, image2: Buffer, options: ComparisonOptions): js.Promise[ComparisonResult] = (^.asInstanceOf[js.Dynamic].apply(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ComparisonResult]]
  inline def apply(image1: ImageData, image2: ImageData, options: ComparisonOptions): js.Promise[ComparisonResult] = (^.asInstanceOf[js.Dynamic].apply(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ComparisonResult]]
  
  @JSImport("resemblejs/compareImages", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
