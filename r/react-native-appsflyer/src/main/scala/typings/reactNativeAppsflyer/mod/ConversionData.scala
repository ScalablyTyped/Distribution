package typings.reactNativeAppsflyer.mod

import typings.reactNativeAppsflyer.anon.Dictkey
import typings.reactNativeAppsflyer.reactNativeAppsflyerStrings.failure
import typings.reactNativeAppsflyer.reactNativeAppsflyerStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionData extends js.Object {
  var data: Dictkey
  var status: success | failure
  var `type`: String
}

object ConversionData {
  @scala.inline
  def apply(data: Dictkey, status: success | failure, `type`: String): ConversionData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversionData]
  }
}

