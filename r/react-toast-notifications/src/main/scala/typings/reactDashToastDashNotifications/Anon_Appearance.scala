package typings.reactDashToastDashNotifications

import typings.react.reactMod.ReactNode
import typings.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.AppearanceTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Appearance extends js.Object {
  var appearance: AppearanceTypes
  var content: ReactNode
  var id: String
}

object Anon_Appearance {
  @scala.inline
  def apply(appearance: AppearanceTypes, id: String, content: ReactNode = null): Anon_Appearance = {
    val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Appearance]
  }
}

