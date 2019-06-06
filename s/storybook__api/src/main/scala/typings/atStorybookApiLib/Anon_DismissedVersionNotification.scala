package typings
package atStorybookApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DismissedVersionNotification extends js.Object {
  var dismissedVersionNotification: java.lang.String
  var lastVersionCheck: scala.Double
  var versions: Anon_CurrentLatest
}

object Anon_DismissedVersionNotification {
  @scala.inline
  def apply(
    dismissedVersionNotification: java.lang.String,
    lastVersionCheck: scala.Double,
    versions: Anon_CurrentLatest
  ): Anon_DismissedVersionNotification = {
    val __obj = js.Dynamic.literal(dismissedVersionNotification = dismissedVersionNotification, lastVersionCheck = lastVersionCheck, versions = versions)
  
    __obj.asInstanceOf[Anon_DismissedVersionNotification]
  }
}

