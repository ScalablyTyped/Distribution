package typings.simperium.anon

import typings.simperium.mod.DiffOp
import typings.simperium.simperiumStrings.I
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OV
  extends DiffOp[js.Any] {
  var o: I
  var v: Double
}

object OV {
  @scala.inline
  def apply(o: I, v: Double): OV = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[OV]
  }
}

