package typings.reactInspector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InspectorNodeParams extends js.Object {
  var data: js.Any = js.native
  var depth: Double = js.native
  var expanded: Boolean = js.native
  var isNonenumerable: Boolean = js.native
  var name: String = js.native
}

object InspectorNodeParams {
  @scala.inline
  def apply(data: js.Any, depth: Double, expanded: Boolean, isNonenumerable: Boolean, name: String): InspectorNodeParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], isNonenumerable = isNonenumerable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorNodeParams]
  }
  @scala.inline
  implicit class InspectorNodeParamsOps[Self <: InspectorNodeParams] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsNonenumerable(value: Boolean): Self = this.set("isNonenumerable", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

