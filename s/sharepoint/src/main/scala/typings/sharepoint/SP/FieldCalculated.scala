package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.FieldCalculated")
@js.native
class FieldCalculated () extends Field {
  def get_dateFormat(): DateTimeFieldFormatType = js.native
  def get_formula(): String = js.native
  def get_outputType(): FieldType = js.native
  def set_dateFormat(value: DateTimeFieldFormatType): Unit = js.native
  def set_formula(value: String): Unit = js.native
  def set_outputType(value: FieldType): Unit = js.native
}

