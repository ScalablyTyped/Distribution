package typings.saml2Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthnContextClassRef extends js.Object {
  
  var class_refs: js.Array[String] = js.native
  
  var comparison: String = js.native
}
object AuthnContextClassRef {
  
  @scala.inline
  def apply(class_refs: js.Array[String], comparison: String): AuthnContextClassRef = {
    val __obj = js.Dynamic.literal(class_refs = class_refs.asInstanceOf[js.Any], comparison = comparison.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthnContextClassRef]
  }
  
  @scala.inline
  implicit class AuthnContextClassRefOps[Self <: AuthnContextClassRef] (val x: Self) extends AnyVal {
    
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
    def setClass_refsVarargs(value: String*): Self = this.set("class_refs", js.Array(value :_*))
    
    @scala.inline
    def setClass_refs(value: js.Array[String]): Self = this.set("class_refs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparison(value: String): Self = this.set("comparison", value.asInstanceOf[js.Any])
  }
}
