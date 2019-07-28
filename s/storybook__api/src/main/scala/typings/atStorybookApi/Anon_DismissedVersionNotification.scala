package typings.atStorybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DismissedVersionNotification extends js.Object {
  var dismissedVersionNotification: String
  var lastVersionCheck: Double
  var versions: Anon_CurrentLatest
}

object Anon_DismissedVersionNotification {
  @scala.inline
  def apply(dismissedVersionNotification: String, lastVersionCheck: Double, versions: Anon_CurrentLatest): Anon_DismissedVersionNotification = {
    val __obj = js.Dynamic.literal(dismissedVersionNotification = dismissedVersionNotification, lastVersionCheck = lastVersionCheck, versions = versions)
  
    __obj.asInstanceOf[Anon_DismissedVersionNotification]
  }
}

