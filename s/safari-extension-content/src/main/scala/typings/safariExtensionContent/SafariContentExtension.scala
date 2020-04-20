package typings.safariExtensionContent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafariContentExtension extends js.Object {
  var baseURI: String
}

object SafariContentExtension {
  @scala.inline
  def apply(baseURI: String): SafariContentExtension = {
    val __obj = js.Dynamic.literal(baseURI = baseURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafariContentExtension]
  }
}

