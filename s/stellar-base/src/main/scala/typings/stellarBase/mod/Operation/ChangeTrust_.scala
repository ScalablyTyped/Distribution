package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.Asset
import typings.stellarBase.mod.OperationType.ChangeTrust
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeTrust_ extends BaseOperation[ChangeTrust] {
  var limit: String
  var line: Asset
}

object ChangeTrust_ {
  @scala.inline
  def apply(limit: String, line: Asset, `type`: ChangeTrust, source: String = null): ChangeTrust_ = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeTrust_]
  }
}

