package typings.sharepoint.SP.JsGrid.Internal

import typings.sharepoint.SP.JsGrid.IValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyUpdate extends IValue {
  @JSName("localized")
  var localized_PropertyUpdate: String
}

object PropertyUpdate {
  @scala.inline
  def apply(localized: String, data: js.Any = null): PropertyUpdate = {
    val __obj = js.Dynamic.literal(localized = localized.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyUpdate]
  }
}

