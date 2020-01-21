package typings.reactDevUtils.fileSizeReporterMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpaqueFileSizes extends js.Object {
  var root: String
  var sizes: Record[String, Double]
}

object OpaqueFileSizes {
  @scala.inline
  def apply(root: String, sizes: Record[String, Double]): OpaqueFileSizes = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpaqueFileSizes]
  }
}

