package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IValue extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var localized: js.UndefOr[String] = js.undefined
}

object IValue {
  @scala.inline
  def apply(data: js.Any = null, localized: String = null): IValue = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (localized != null) __obj.updateDynamic("localized")(localized.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValue]
  }
}

