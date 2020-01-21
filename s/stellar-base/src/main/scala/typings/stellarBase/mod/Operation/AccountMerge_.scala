package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.OperationType.AccountMerge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountMerge_ extends BaseOperation[AccountMerge] {
  var destination: String
}

object AccountMerge_ {
  @scala.inline
  def apply(destination: String, `type`: AccountMerge, source: String = null): AccountMerge_ = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountMerge_]
  }
}

