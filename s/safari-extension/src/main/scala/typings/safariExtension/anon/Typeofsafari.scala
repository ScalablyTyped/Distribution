package typings.safariExtension.anon

import typings.safariExtension.SafariApplication
import typings.safariExtension.SafariExtension
import typings.safariExtension.SafariExtensionBar
import typings.safariExtension.SafariExtensionGlobalPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsafari extends js.Object {
  var application: SafariApplication
  var extension: SafariExtension
  var self: SafariExtensionGlobalPage | SafariExtensionBar
}

object Typeofsafari {
  @scala.inline
  def apply(
    application: SafariApplication,
    extension: SafariExtension,
    self: SafariExtensionGlobalPage | SafariExtensionBar
  ): Typeofsafari = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofsafari]
  }
}

