package typings
package stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BumpSequence
  extends BaseOptions
     with stellarDashBaseLib.stellarDashBaseMod._OperationOptions {
  var bumpTo: java.lang.String
}

object BumpSequence {
  @scala.inline
  def apply(bumpTo: java.lang.String, source: java.lang.String = null): BumpSequence = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bumpTo")(bumpTo)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[BumpSequence]
  }
}

