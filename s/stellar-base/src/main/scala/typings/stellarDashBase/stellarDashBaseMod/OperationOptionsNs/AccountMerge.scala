package typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs

import typings.stellarDashBase.stellarDashBaseMod._OperationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountMerge
  extends BaseOptions
     with _OperationOptions {
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

