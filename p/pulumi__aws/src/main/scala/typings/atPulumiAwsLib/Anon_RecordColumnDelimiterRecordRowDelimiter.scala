package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RecordColumnDelimiterRecordRowDelimiter extends js.Object {
  var recordColumnDelimiter: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var recordRowDelimiter: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_RecordColumnDelimiterRecordRowDelimiter {
  @scala.inline
  def apply(
    recordColumnDelimiter: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    recordRowDelimiter: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_RecordColumnDelimiterRecordRowDelimiter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("recordColumnDelimiter")(recordColumnDelimiter.asInstanceOf[js.Any])
    __obj.updateDynamic("recordRowDelimiter")(recordRowDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RecordColumnDelimiterRecordRowDelimiter]
  }
}

