package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.FieldDateTime")
@js.native
class FieldDateTime () extends Field {
  def get_dateTimeCalendarType(): CalendarType = js.native
  def get_displayFormat(): DateTimeFieldFormatType = js.native
  def get_friendlyDisplayFormat(): DateTimeFieldFriendlyFormatType = js.native
  def set_dateTimeCalendarType(value: CalendarType): scala.Unit = js.native
  def set_displayFormat(value: DateTimeFieldFormatType): scala.Unit = js.native
  def set_friendlyDisplayFormat(value: DateTimeFieldFriendlyFormatType): scala.Unit = js.native
}

