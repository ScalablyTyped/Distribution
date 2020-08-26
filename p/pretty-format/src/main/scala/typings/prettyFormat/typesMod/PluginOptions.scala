package typings.prettyFormat.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginOptions extends js.Object {
  var edgeSpacing: String = js.native
  var min: Boolean = js.native
  var spacing: String = js.native
}

object PluginOptions {
  @scala.inline
  def apply(edgeSpacing: String, min: Boolean, spacing: String): PluginOptions = {
    val __obj = js.Dynamic.literal(edgeSpacing = edgeSpacing.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginOptions]
  }
  @scala.inline
  implicit class PluginOptionsOps[Self <: PluginOptions] (val x: Self) extends AnyVal {
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
    def setEdgeSpacing(value: String): Self = this.set("edgeSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Boolean): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpacing(value: String): Self = this.set("spacing", value.asInstanceOf[js.Any])
  }
  
}

