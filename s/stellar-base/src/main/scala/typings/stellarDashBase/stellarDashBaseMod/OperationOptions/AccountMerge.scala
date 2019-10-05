package typings.stellarDashBase.stellarDashBaseMod.OperationOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountMerge extends BaseOptions {
  var destination: String
}

object AccountMerge {
  @scala.inline
  def apply(destination: String, source: String = null): AccountMerge = {
    val __obj = js.Dynamic.literal(destination = destination)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[AccountMerge]
  }
}

