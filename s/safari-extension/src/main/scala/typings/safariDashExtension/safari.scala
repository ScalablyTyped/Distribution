package typings.safariDashExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("safari")
@js.native
object safari extends js.Object {
  var application: SafariApplication = js.native
  var extension: SafariExtension = js.native
  var self: SafariExtensionGlobalPage | SafariExtensionBar = js.native
}

