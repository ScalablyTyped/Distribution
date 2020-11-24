package typings.sidewayAddress.mod.domain.Tlds

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deny extends js.Object {
  
  val deny: Set[String] = js.native
}
object Deny {
  
  @scala.inline
  def apply(deny: Set[String]): Deny = {
    val __obj = js.Dynamic.literal(deny = deny.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deny]
  }
  
  @scala.inline
  implicit class DenyOps[Self <: Deny] (val x: Self) extends AnyVal {
    
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
    def setDeny(value: Set[String]): Self = this.set("deny", value.asInstanceOf[js.Any])
  }
}
