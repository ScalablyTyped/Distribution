package typings
package sharedbLib.libSharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawOp extends js.Object {
  var c: java.lang.String
  var d: java.lang.String
  var m: js.Any
  var op: js.Array[Op]
  var seq: scala.Double
  var src: java.lang.String
  var v: scala.Double
}

object RawOp {
  @scala.inline
  def apply(
    c: java.lang.String,
    d: java.lang.String,
    m: js.Any,
    op: js.Array[Op],
    seq: scala.Double,
    src: java.lang.String,
    v: scala.Double
  ): RawOp = {
    val __obj = js.Dynamic.literal(c = c, d = d, m = m, op = op, seq = seq, src = src, v = v)
  
    __obj.asInstanceOf[RawOp]
  }
}

