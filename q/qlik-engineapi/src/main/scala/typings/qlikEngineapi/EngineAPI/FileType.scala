package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.qlikEngineapi.qlikEngineapiStrings.CSV_C
  - typings.qlikEngineapi.qlikEngineapiStrings.CSV_T
  - typings.qlikEngineapi.qlikEngineapiStrings.OOXML
*/
trait FileType extends js.Object

object FileType {
  @scala.inline
  def CSV_C: typings.qlikEngineapi.qlikEngineapiStrings.CSV_C = this.cast("CSV_C")
  @scala.inline
  def CSV_T: typings.qlikEngineapi.qlikEngineapiStrings.CSV_T = this.cast("CSV_T")
  @scala.inline
  def OOXML: typings.qlikEngineapi.qlikEngineapiStrings.OOXML = this.cast("OOXML")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

