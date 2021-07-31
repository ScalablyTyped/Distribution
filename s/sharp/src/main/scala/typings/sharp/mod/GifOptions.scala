package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Requires libvips compiled with support for ImageMagick or GraphicsMagick.
  * The prebuilt binaries do not include this - see
  * {@link https://sharp.pixelplumbing.com/install#custom-libvips installing a custom libvips}.
  */
trait GifOptions
  extends StObject
     with OutputOptions
     with AnimationOptions
object GifOptions {
  
  @scala.inline
  def apply(): GifOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GifOptions]
  }
}
