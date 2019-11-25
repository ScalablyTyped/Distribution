package typings.safariDashExtensionDashContent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsafari extends js.Object {
  var extension: SafariContentExtension
  var self: SafariContentWebPage
}

object Typeofsafari {
  @scala.inline
  def apply(extension: SafariContentExtension, self: SafariContentWebPage): Typeofsafari = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Typeofsafari]
  }
}

