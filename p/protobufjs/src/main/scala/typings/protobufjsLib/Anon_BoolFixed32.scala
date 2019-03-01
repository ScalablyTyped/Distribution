package typings
package protobufjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BoolFixed32 extends js.Object {
  var bool: scala.Double
  var fixed32: scala.Double
  var fixed64: scala.Double
  var int32: scala.Double
  var int64: scala.Double
  var sfixed32: scala.Double
  var sfixed64: scala.Double
  var sint32: scala.Double
  var sint64: scala.Double
  var string: scala.Double
  var uint32: scala.Double
  var uint64: scala.Double
}

object Anon_BoolFixed32 {
  @scala.inline
  def apply(
    bool: scala.Double,
    fixed32: scala.Double,
    fixed64: scala.Double,
    int32: scala.Double,
    int64: scala.Double,
    sfixed32: scala.Double,
    sfixed64: scala.Double,
    sint32: scala.Double,
    sint64: scala.Double,
    string: scala.Double,
    uint32: scala.Double,
    uint64: scala.Double
  ): Anon_BoolFixed32 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bool")(bool)
    __obj.updateDynamic("fixed32")(fixed32)
    __obj.updateDynamic("fixed64")(fixed64)
    __obj.updateDynamic("int32")(int32)
    __obj.updateDynamic("int64")(int64)
    __obj.updateDynamic("sfixed32")(sfixed32)
    __obj.updateDynamic("sfixed64")(sfixed64)
    __obj.updateDynamic("sint32")(sint32)
    __obj.updateDynamic("sint64")(sint64)
    __obj.updateDynamic("string")(string)
    __obj.updateDynamic("uint32")(uint32)
    __obj.updateDynamic("uint64")(uint64)
    __obj.asInstanceOf[Anon_BoolFixed32]
  }
}

