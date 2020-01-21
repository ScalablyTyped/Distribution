package typings.stellarBase.mod.OperationOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BumpSequence extends BaseOptions {
  var bumpTo: String
}

object BumpSequence {
  @scala.inline
  def apply(bumpTo: String, source: String = null): BumpSequence = {
    val __obj = js.Dynamic.literal(bumpTo = bumpTo.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[BumpSequence]
  }
}

