package typings.reactEasyCrop.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerClassName extends js.Object {
  var containerClassName: String
  var cropAreaClassName: String
  var imageClassName: String
}

object ContainerClassName {
  @scala.inline
  def apply(containerClassName: String, cropAreaClassName: String, imageClassName: String): ContainerClassName = {
    val __obj = js.Dynamic.literal(containerClassName = containerClassName.asInstanceOf[js.Any], cropAreaClassName = cropAreaClassName.asInstanceOf[js.Any], imageClassName = imageClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerClassName]
  }
}

