package typings.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Manages image data._
  * @see https://docs.scriptable.app/image
  */
trait Image extends js.Object {
  /**
    * _Size of the image in pixels._
    * @see https://docs.scriptable.app/image/#size
    */
  var size: Size
}

object Image {
  @scala.inline
  def apply(size: Size): Image = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

