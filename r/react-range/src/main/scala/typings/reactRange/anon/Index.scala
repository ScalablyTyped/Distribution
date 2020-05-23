package typings.reactRange.anon

import typings.reactRange.typesMod.IThumbProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  var index: Double
  var isDragged: Boolean
  var props: IThumbProps
  var value: Double
}

object Index {
  @scala.inline
  def apply(index: Double, isDragged: Boolean, props: IThumbProps, value: Double): Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isDragged = isDragged.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
}

