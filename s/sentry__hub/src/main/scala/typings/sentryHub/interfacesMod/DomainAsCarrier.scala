package typings.sentryHub.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainAsCarrier extends Carrier {
  
  var members: js.Array[StringDictionary[_]] = js.native
}
object DomainAsCarrier {
  
  @scala.inline
  def apply(members: js.Array[StringDictionary[_]]): DomainAsCarrier = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainAsCarrier]
  }
  
  @scala.inline
  implicit class DomainAsCarrierOps[Self <: DomainAsCarrier] (val x: Self) extends AnyVal {
    
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
    def setMembersVarargs(value: StringDictionary[js.Any]*): Self = this.set("members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: js.Array[StringDictionary[_]]): Self = this.set("members", value.asInstanceOf[js.Any])
  }
}
