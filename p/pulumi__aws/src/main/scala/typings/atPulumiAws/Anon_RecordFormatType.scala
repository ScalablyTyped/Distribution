package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RecordFormatType extends js.Object {
  var recordFormatType: js.UndefOr[String] = js.undefined
}

object Anon_RecordFormatType {
  @scala.inline
  def apply(recordFormatType: String = null): Anon_RecordFormatType = {
    val __obj = js.Dynamic.literal()
    if (recordFormatType != null) __obj.updateDynamic("recordFormatType")(recordFormatType)
    __obj.asInstanceOf[Anon_RecordFormatType]
  }
}

