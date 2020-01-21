package typings.stellarBase.mod.Operation

import typings.node.Buffer
import typings.stellarBase.mod.OperationType.ManageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManageData_ extends BaseOperation[ManageData] {
  var name: String
  var value: Buffer
}

object ManageData_ {
  @scala.inline
  def apply(name: String, `type`: ManageData, value: Buffer, source: String = null): ManageData_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageData_]
  }
}

