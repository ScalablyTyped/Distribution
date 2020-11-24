package typings.relayRuntime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefType[Ref /* <: String */] extends js.Object {
  
  @JSName(" $refType")
  var Space$refType: Ref = js.native
}
object RefType {
  
  @scala.inline
  def apply[Ref /* <: String */](Space$refType: Ref): RefType[Ref] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(" $refType")(Space$refType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefType[Ref]]
  }
  
  @scala.inline
  implicit class RefTypeOps[Self <: RefType[_], Ref /* <: String */] (val x: Self with RefType[Ref]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSpace$refType(value: Ref): Self = this.set(" $refType", value.asInstanceOf[js.Any])
  }
}
