package typings.stormReactDiagrams.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait In extends js.Object {
  var id: String = js.native
  var in: Boolean = js.native
  var label: String = js.native
  var links: js.Array[String] = js.native
  var maximumLinks: Double = js.native
  var name: String = js.native
  var parentNode: String = js.native
  var selected: Boolean = js.native
  var `type`: String = js.native
}

object In {
  @scala.inline
  def apply(
    id: String,
    in: Boolean,
    label: String,
    links: js.Array[String],
    maximumLinks: Double,
    name: String,
    parentNode: String,
    selected: Boolean,
    `type`: String
  ): In = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], maximumLinks = maximumLinks.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[In]
  }
  @scala.inline
  implicit class InOps[Self <: In] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIn(value: Boolean): Self = this.set("in", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinksVarargs(value: String*): Self = this.set("links", js.Array(value :_*))
    @scala.inline
    def setLinks(value: js.Array[String]): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaximumLinks(value: Double): Self = this.set("maximumLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentNode(value: String): Self = this.set("parentNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

