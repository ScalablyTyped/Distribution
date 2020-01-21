package typings.relayRuntime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefType[Ref /* <: String */] extends js.Object {
  @JSName(" $refType")
  var Space$refType: Ref
}

object RefType {
  @scala.inline
  def apply[Ref /* <: String */](Space$refType: Ref): RefType[Ref] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(" $refType")(Space$refType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefType[Ref]]
  }
}

