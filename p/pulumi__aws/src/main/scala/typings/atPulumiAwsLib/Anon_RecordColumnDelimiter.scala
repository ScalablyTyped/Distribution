package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RecordColumnDelimiter extends js.Object {
  var recordColumnDelimiter: java.lang.String
  var recordRowDelimiter: java.lang.String
}

object Anon_RecordColumnDelimiter {
  @scala.inline
  def apply(recordColumnDelimiter: java.lang.String, recordRowDelimiter: java.lang.String): Anon_RecordColumnDelimiter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("recordColumnDelimiter")(recordColumnDelimiter)
    __obj.updateDynamic("recordRowDelimiter")(recordRowDelimiter)
    __obj.asInstanceOf[Anon_RecordColumnDelimiter]
  }
}

