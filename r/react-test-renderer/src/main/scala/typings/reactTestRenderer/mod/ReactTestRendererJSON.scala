package typings.reactTestRenderer.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactTestRendererJSON extends js.Object {
  var children: Null | js.Array[ReactTestRendererNode] = js.native
  var props: StringDictionary[js.Any] = js.native
  var `type`: String = js.native
}

object ReactTestRendererJSON {
  @scala.inline
  def apply(props: StringDictionary[js.Any], `type`: String): ReactTestRendererJSON = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactTestRendererJSON]
  }
  @scala.inline
  implicit class ReactTestRendererJSONOps[Self <: ReactTestRendererJSON] (val x: Self) extends AnyVal {
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
    def setProps(value: StringDictionary[js.Any]): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenVarargs(value: ReactTestRendererNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[ReactTestRendererNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenNull: Self = this.set("children", null)
  }
  
}

