package typings.sharedb.libSharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawOp extends js.Object {
  var c: String
  var d: String
  var m: js.Any
  var op: js.Array[Op]
  var seq: Double
  var src: String
  var v: Double
}

object RawOp {
  @scala.inline
  def apply(c: String, d: String, m: js.Any, op: js.Array[Op], seq: Double, src: String, v: Double): RawOp = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RawOp]
  }
}

