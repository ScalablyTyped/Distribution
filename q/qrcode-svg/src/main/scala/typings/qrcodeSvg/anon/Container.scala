package typings.qrcodeSvg.anon

import typings.qrcodeSvg.qrcodeSvgStrings.g
import typings.qrcodeSvg.qrcodeSvgStrings.none
import typings.qrcodeSvg.qrcodeSvgStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container extends js.Object {
  var container: svg | g | none = js.native
}

object Container {
  @scala.inline
  def apply(container: svg | g | none): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  @scala.inline
  implicit class ContainerOps[Self <: Container] (val x: Self) extends AnyVal {
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
    def setContainer(value: svg | g | none): Self = this.set("container", value.asInstanceOf[js.Any])
  }
  
}

