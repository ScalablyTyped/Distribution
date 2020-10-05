package typings.rcTextarea.calculateNodeHeightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeType extends js.Object {
  var borderSize: Double = js.native
  var boxSizing: String = js.native
  var paddingSize: Double = js.native
  var sizingStyle: String = js.native
}

object NodeType {
  @scala.inline
  def apply(borderSize: Double, boxSizing: String, paddingSize: Double, sizingStyle: String): NodeType = {
    val __obj = js.Dynamic.literal(borderSize = borderSize.asInstanceOf[js.Any], boxSizing = boxSizing.asInstanceOf[js.Any], paddingSize = paddingSize.asInstanceOf[js.Any], sizingStyle = sizingStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeType]
  }
  @scala.inline
  implicit class NodeTypeOps[Self <: NodeType] (val x: Self) extends AnyVal {
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
    def setBorderSize(value: Double): Self = this.set("borderSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoxSizing(value: String): Self = this.set("boxSizing", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingSize(value: Double): Self = this.set("paddingSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizingStyle(value: String): Self = this.set("sizingStyle", value.asInstanceOf[js.Any])
  }
  
}

