package typings.reactDashDraggableDashList.reactDashDraggableDashListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateProps[I, C] extends js.Object {
  var anySelected: Double
  var commonProps: C
  var dragHandleProps: js.Object
  var item: I
  var itemSelected: Double
}

object TemplateProps {
  @scala.inline
  def apply[I, C](anySelected: Double, commonProps: C, dragHandleProps: js.Object, item: I, itemSelected: Double): TemplateProps[I, C] = {
    val __obj = js.Dynamic.literal(anySelected = anySelected, commonProps = commonProps.asInstanceOf[js.Any], dragHandleProps = dragHandleProps, item = item.asInstanceOf[js.Any], itemSelected = itemSelected)
  
    __obj.asInstanceOf[TemplateProps[I, C]]
  }
}

