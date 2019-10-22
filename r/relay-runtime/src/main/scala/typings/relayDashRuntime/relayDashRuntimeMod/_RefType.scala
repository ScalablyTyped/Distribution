package typings.relayDashRuntime.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _RefType[Ref /* <: String */] extends js.Object {
  @JSName(" $refType")
  var ` $refType`: Ref
}

object _RefType {
  @scala.inline
  def apply[Ref /* <: String */](` $refType`: Ref): _RefType[Ref] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(" $refType")(` $refType`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_RefType[Ref]]
  }
}

