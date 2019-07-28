package typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs

import typings.stellarDashBase.stellarDashBaseMod._OperationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BumpSequence
  extends BaseOptions
     with _OperationOptions {
  var bumpTo: String
}

object BumpSequence {
  @scala.inline
  def apply(bumpTo: String, source: String = null): BumpSequence = {
    val __obj = js.Dynamic.literal(bumpTo = bumpTo)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[BumpSequence]
  }
}

