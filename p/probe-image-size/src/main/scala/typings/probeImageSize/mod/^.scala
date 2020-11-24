package typings.probeImageSize.mod

import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("probe-image-size", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(source: String): js.Promise[ProbeResult] = js.native
  def apply(source: String, callback: ProbeCallback): Unit = js.native
  def apply(source: String, opts: ProbeOptions): js.Promise[ProbeResult] = js.native
  /**
    * Get image size without full download. Supported image types: JPG, GIF, PNG, WebP, BMP, TIFF, SVG, PSD.
    */
  def apply(source: String, opts: ProbeOptions, callback: ProbeCallback): Unit = js.native
  def apply(source: ReadableStream): js.Promise[ProbeResult] = js.native
  def apply(source: ReadableStream, callback: ProbeCallback): Unit = js.native
}
