package typings
package slateDashReactLib.slateDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnChangeParam extends js.Object {
  var operations: immutableLib.immutableMod.List[slateLib.slateMod.Operation]
  var value: slateLib.slateMod.Value
}

object OnChangeParam {
  @scala.inline
  def apply(
    operations: immutableLib.immutableMod.List[slateLib.slateMod.Operation],
    value: slateLib.slateMod.Value
  ): OnChangeParam = {
    val __obj = js.Dynamic.literal(operations = operations, value = value)
  
    __obj.asInstanceOf[OnChangeParam]
  }
}

