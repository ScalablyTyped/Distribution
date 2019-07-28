package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataType extends js.Object {
  var data: js.UndefOr[String] = js.undefined
  var `type`: String
}

object Anon_DataType {
  @scala.inline
  def apply(`type`: String, data: String = null): Anon_DataType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[Anon_DataType]
  }
}

