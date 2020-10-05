package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageBitmap
  extends CanvasImageSource
     with TexImageSource
     with Transferable {
  /**
    * Returns the intrinsic height of the image, in CSS pixels.
    */
  val height: Double = js.native
  /**
    * Returns the intrinsic width of the image, in CSS pixels.
    */
  val width: Double = js.native
  /**
    * Releases imageBitmap's underlying bitmap data.
    */
  def close(): Unit = js.native
}

object ImageBitmap {
  @scala.inline
  def apply(close: () => Unit, height: Double, width: Double): ImageBitmap = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageBitmap]
  }
  @scala.inline
  implicit class ImageBitmapOps[Self <: ImageBitmap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

