package typings.simperium.anon

import typings.simperium.mod.DMPDiff
import typings.simperium.mod.DiffOp
import typings.simperium.simperiumStrings.d
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VDMPDiff
  extends DiffOp[js.Any] {
  var o: d
  var v: DMPDiff
}

object VDMPDiff {
  @scala.inline
  def apply(o: d, v: DMPDiff): VDMPDiff = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[VDMPDiff]
  }
}

