package typings.reactEasyCrop.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerStyle extends js.Object {
  var containerStyle: CSSProperties
  var cropAreaStyle: CSSProperties
  var imageStyle: CSSProperties
}

object ContainerStyle {
  @scala.inline
  def apply(containerStyle: CSSProperties, cropAreaStyle: CSSProperties, imageStyle: CSSProperties): ContainerStyle = {
    val __obj = js.Dynamic.literal(containerStyle = containerStyle.asInstanceOf[js.Any], cropAreaStyle = cropAreaStyle.asInstanceOf[js.Any], imageStyle = imageStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStyle]
  }
}

