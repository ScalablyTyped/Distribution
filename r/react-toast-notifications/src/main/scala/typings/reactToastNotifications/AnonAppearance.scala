package typings.reactToastNotifications

import typings.react.mod.ReactNode
import typings.reactToastNotifications.mod.AppearanceTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAppearance extends js.Object {
  var appearance: AppearanceTypes
  var content: ReactNode
  var id: String
}

object AnonAppearance {
  @scala.inline
  def apply(appearance: AppearanceTypes, id: String, content: ReactNode = null): AnonAppearance = {
    val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppearance]
  }
}

