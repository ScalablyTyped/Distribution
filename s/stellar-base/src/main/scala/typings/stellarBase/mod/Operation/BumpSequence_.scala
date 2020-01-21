package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.OperationType.BumpSequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BumpSequence_ extends BaseOperation[BumpSequence] {
  var bumpTo: String
}

object BumpSequence_ {
  @scala.inline
  def apply(bumpTo: String, `type`: BumpSequence, source: String = null): BumpSequence_ = {
    val __obj = js.Dynamic.literal(bumpTo = bumpTo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[BumpSequence_]
  }
}

