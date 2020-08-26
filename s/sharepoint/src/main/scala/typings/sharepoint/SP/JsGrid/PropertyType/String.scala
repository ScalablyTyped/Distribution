package typings.sharepoint.SP.JsGrid.PropertyType

import typings.sharepoint.SP.JsGrid.IPropertyType
import typings.sharepoint.anon.DataValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait String extends IPropertyType

object String {
  @scala.inline
  def apply(
    BeginValidateNormalizeConvert: (Double, java.lang.String, js.Any, Boolean, js.Function1[/* args */ DataValue, Unit], js.Any) => Unit,
    ID: java.lang.String
  ): String = {
    val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6(BeginValidateNormalizeConvert), ID = ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[String]
  }
}

