package typings
package slateDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Operations extends js.Object {
  var operations: immutableLib.immutableMod.List[slateLib.slateMod.Operation]
  var value: slateLib.slateMod.Value
}

object Anon_Operations {
  @scala.inline
  def apply(
    operations: immutableLib.immutableMod.List[slateLib.slateMod.Operation],
    value: slateLib.slateMod.Value
  ): Anon_Operations = {
    val __obj = js.Dynamic.literal(operations = operations, value = value)
  
    __obj.asInstanceOf[Anon_Operations]
  }
}

