package typings
package safariDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Application extends js.Object {
  var application: SafariApplication
  var extension: SafariExtension
  var self: SafariExtensionGlobalPage | SafariExtensionBar
}

object Anon_Application {
  @scala.inline
  def apply(
    application: SafariApplication,
    extension: SafariExtension,
    self: SafariExtensionGlobalPage | SafariExtensionBar
  ): Anon_Application = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application")(application)
    __obj.updateDynamic("extension")(extension)
    __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Application]
  }
}

