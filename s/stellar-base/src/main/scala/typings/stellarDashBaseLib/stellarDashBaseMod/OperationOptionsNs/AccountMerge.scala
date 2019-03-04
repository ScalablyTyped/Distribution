package typings
package stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountMerge
  extends BaseOptions
     with stellarDashBaseLib.stellarDashBaseMod._OperationOptions {
  var destination: java.lang.String
}

object AccountMerge {
  @scala.inline
  def apply(destination: java.lang.String, source: java.lang.String = null): AccountMerge = {
    val __obj = js.Dynamic.literal(destination = destination)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[AccountMerge]
  }
}

