package typings.safariExtensionContent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafariContentExtension extends js.Object {
  var baseURI: String = js.native
}

object SafariContentExtension {
  @scala.inline
  def apply(baseURI: String): SafariContentExtension = {
    val __obj = js.Dynamic.literal(baseURI = baseURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafariContentExtension]
  }
  @scala.inline
  implicit class SafariContentExtensionOps[Self <: SafariContentExtension] (val x: Self) extends AnyVal {
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
    def setBaseURI(value: String): Self = this.set("baseURI", value.asInstanceOf[js.Any])
  }
  
}

