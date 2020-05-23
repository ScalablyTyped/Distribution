package typings.std.global

import typings.std.ImageBitmapOptions
import typings.std.ImageBitmapSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createImageBitmap")
@js.native
object createImageBitmap extends js.Object {
  def apply(image: ImageBitmapSource): js.Promise[typings.std.ImageBitmap] = js.native
  def apply(image: ImageBitmapSource, options: ImageBitmapOptions): js.Promise[typings.std.ImageBitmap] = js.native
  def apply(image: ImageBitmapSource, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[typings.std.ImageBitmap] = js.native
  def apply(
    image: ImageBitmapSource,
    sx: Double,
    sy: Double,
    sw: Double,
    sh: Double,
    options: ImageBitmapOptions
  ): js.Promise[typings.std.ImageBitmap] = js.native
}

