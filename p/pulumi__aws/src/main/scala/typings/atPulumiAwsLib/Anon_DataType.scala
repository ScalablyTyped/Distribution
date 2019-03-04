package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataType extends js.Object {
  var data: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object Anon_DataType {
  @scala.inline
  def apply(`type`: java.lang.String, data: java.lang.String = null): Anon_DataType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[Anon_DataType]
  }
}

