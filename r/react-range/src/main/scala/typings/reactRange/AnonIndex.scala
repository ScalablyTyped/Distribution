package typings.reactRange

import typings.reactRange.typesMod.IThumbProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndex extends js.Object {
  var index: Double
  var isDragged: Boolean
  var props: IThumbProps
  var value: Double
}

object AnonIndex {
  @scala.inline
  def apply(index: Double, isDragged: Boolean, props: IThumbProps, value: Double): AnonIndex = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isDragged = isDragged.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndex]
  }
}

