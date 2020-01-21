package typings.reactEasyCrop

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainerStyle extends js.Object {
  var containerStyle: CSSProperties
  var cropAreaStyle: CSSProperties
  var imageStyle: CSSProperties
}

object AnonContainerStyle {
  @scala.inline
  def apply(containerStyle: CSSProperties, cropAreaStyle: CSSProperties, imageStyle: CSSProperties): AnonContainerStyle = {
    val __obj = js.Dynamic.literal(containerStyle = containerStyle.asInstanceOf[js.Any], cropAreaStyle = cropAreaStyle.asInstanceOf[js.Any], imageStyle = imageStyle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContainerStyle]
  }
}

