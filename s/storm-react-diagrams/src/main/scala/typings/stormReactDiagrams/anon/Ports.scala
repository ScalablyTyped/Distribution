package typings.stormReactDiagrams.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ports extends js.Object {
  var extras: js.Any = js.native
  var id: String = js.native
  var ports: js.Array[Links] = js.native
  var selected: Boolean = js.native
  var `type`: String = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object Ports {
  @scala.inline
  def apply(
    extras: js.Any,
    id: String,
    ports: js.Array[Links],
    selected: Boolean,
    `type`: String,
    x: Double,
    y: Double
  ): Ports = {
    val __obj = js.Dynamic.literal(extras = extras.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ports]
  }
  @scala.inline
  implicit class PortsOps[Self <: Ports] (val x: Self) extends AnyVal {
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
    def setExtras(value: js.Any): Self = this.set("extras", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortsVarargs(value: Links*): Self = this.set("ports", js.Array(value :_*))
    @scala.inline
    def setPorts(value: js.Array[Links]): Self = this.set("ports", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

