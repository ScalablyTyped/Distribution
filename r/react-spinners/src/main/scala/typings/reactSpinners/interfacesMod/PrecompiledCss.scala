package typings.reactSpinners.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrecompiledCss extends js.Object {
  var name: String = js.native
  var styles: String = js.native
}

object PrecompiledCss {
  @scala.inline
  def apply(name: String, styles: String): PrecompiledCss = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrecompiledCss]
  }
  @scala.inline
  implicit class PrecompiledCssOps[Self <: PrecompiledCss] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyles(value: String): Self = this.set("styles", value.asInstanceOf[js.Any])
  }
  
}

