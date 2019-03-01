package typings
package reactDashDevDashUtilsLib.filesizereporterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpaqueFileSizes extends js.Object {
  var root: java.lang.String
  var sizes: stdLib.Record[java.lang.String, scala.Double]
}

object OpaqueFileSizes {
  @scala.inline
  def apply(root: java.lang.String, sizes: stdLib.Record[java.lang.String, scala.Double]): OpaqueFileSizes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("root")(root)
    __obj.updateDynamic("sizes")(sizes)
    __obj.asInstanceOf[OpaqueFileSizes]
  }
}

