package typings
package protobufjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fixed64 extends js.Object {
  var fixed64: scala.Double
  var int64: scala.Double
  var sfixed64: scala.Double
  var sint64: scala.Double
  var uint64: scala.Double
}

object Anon_Fixed64 {
  @scala.inline
  def apply(
    fixed64: scala.Double,
    int64: scala.Double,
    sfixed64: scala.Double,
    sint64: scala.Double,
    uint64: scala.Double
  ): Anon_Fixed64 = {
    val __obj = js.Dynamic.literal(fixed64 = fixed64, int64 = int64, sfixed64 = sfixed64, sint64 = sint64, uint64 = uint64)
  
    __obj.asInstanceOf[Anon_Fixed64]
  }
}

