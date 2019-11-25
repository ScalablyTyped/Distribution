package typings.snappy.snappyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnappyDecompressOpts extends js.Object {
  var asBuffer: Boolean
}

object SnappyDecompressOpts {
  @scala.inline
  def apply(asBuffer: Boolean): SnappyDecompressOpts = {
    val __obj = js.Dynamic.literal(asBuffer = asBuffer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SnappyDecompressOpts]
  }
}

