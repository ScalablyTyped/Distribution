package typings.snykRpmParser.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRpmMetadata extends js.Object {
  var packagesProcessed: Double
  var packagesSkipped: Double
}

object IRpmMetadata {
  @scala.inline
  def apply(packagesProcessed: Double, packagesSkipped: Double): IRpmMetadata = {
    val __obj = js.Dynamic.literal(packagesProcessed = packagesProcessed.asInstanceOf[js.Any], packagesSkipped = packagesSkipped.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRpmMetadata]
  }
}

