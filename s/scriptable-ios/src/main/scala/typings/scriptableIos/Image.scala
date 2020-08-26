package typings.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Manages image data._
  * @see https://docs.scriptable.app/image
  */
@js.native
trait Image extends js.Object {
  /**
    * _Size of the image in pixels._
    * @see https://docs.scriptable.app/image/#size
    */
  var size: Size = js.native
}

object Image {
  @scala.inline
  def apply(size: Size): Image = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  @scala.inline
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
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
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

