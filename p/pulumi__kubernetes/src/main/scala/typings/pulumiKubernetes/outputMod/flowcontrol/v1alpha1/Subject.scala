package typings.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Subject matches the originator of a request, as identified by the request authentication system. There are three ways of matching an originator; by user, group, or service account.
  */
@js.native
trait Subject extends js.Object {
  
  var group: GroupSubject = js.native
  
  /**
    * Required
    */
  var kind: String = js.native
  
  var serviceAccount: ServiceAccountSubject = js.native
  
  var user: UserSubject = js.native
}
object Subject {
  
  @scala.inline
  def apply(group: GroupSubject, kind: String, serviceAccount: ServiceAccountSubject, user: UserSubject): Subject = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], serviceAccount = serviceAccount.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subject]
  }
  
  @scala.inline
  implicit class SubjectOps[Self <: Subject] (val x: Self) extends AnyVal {
    
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
    def setGroup(value: GroupSubject): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccount(value: ServiceAccountSubject): Self = this.set("serviceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: UserSubject): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
