package typings
package snappyLib.snappyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnappyDecompressOpts extends js.Object {
  var asBuffer: scala.Boolean
}

object SnappyDecompressOpts {
  @scala.inline
  def apply(asBuffer: scala.Boolean): SnappyDecompressOpts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asBuffer")(asBuffer)
    __obj.asInstanceOf[SnappyDecompressOpts]
  }
}

