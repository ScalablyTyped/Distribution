package typings.qrImage.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bitmap extends js.Object {
  /**
    * @summary
    * Buffer with image data. It's a linear representation
    * of image in format:
    *
    * @example
    * <00> <xx> <xx> ..        <xx>
    * <00> <xx> <xx> ..        <xx>
    * ..
    * <00> <xx> <xx> ..        <xx>
    * ^    | size number of bytes |
    * \ do not modify. Must be 00
    *
    * @description
    * Each `<xx>` is a pixel of image.
    * It's value `0` — black, `255` — white, everything between are shades of gray.
    */
  var data: Buffer = js.native
  /**
    * width (and height) of resulting image in pixels
    */
  var size: Double = js.native
}

object Bitmap {
  @scala.inline
  def apply(data: Buffer, size: Double): Bitmap = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bitmap]
  }
  @scala.inline
  implicit class BitmapOps[Self <: Bitmap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: Buffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

