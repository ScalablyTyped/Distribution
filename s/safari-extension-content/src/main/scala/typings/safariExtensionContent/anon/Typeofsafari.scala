package typings.safariExtensionContent.anon

import typings.safariExtensionContent.SafariContentExtension
import typings.safariExtensionContent.SafariContentWebPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofsafari extends js.Object {
  var extension: SafariContentExtension = js.native
  var self: SafariContentWebPage = js.native
}

object Typeofsafari {
  @scala.inline
  def apply(extension: SafariContentExtension, self: SafariContentWebPage): Typeofsafari = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofsafari]
  }
  @scala.inline
  implicit class TypeofsafariOps[Self <: Typeofsafari] (val x: Self) extends AnyVal {
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
    def setExtension(value: SafariContentExtension): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelf(value: SafariContentWebPage): Self = this.set("self", value.asInstanceOf[js.Any])
  }
  
}

