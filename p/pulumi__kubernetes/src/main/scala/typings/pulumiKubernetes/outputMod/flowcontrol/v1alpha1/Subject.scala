package typings.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Subject matches the originator of a request, as identified by the request authentication system. There are three ways of matching an originator; by user, group, or service account.
  */
trait Subject extends StObject {
  
  var group: GroupSubject
  
  /**
    * Required
    */
  var kind: String
  
  var serviceAccount: ServiceAccountSubject
  
  var user: UserSubject
}
object Subject {
  
  @scala.inline
  def apply(group: GroupSubject, kind: String, serviceAccount: ServiceAccountSubject, user: UserSubject): Subject = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], serviceAccount = serviceAccount.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subject]
  }
  
  @scala.inline
  implicit class SubjectMutableBuilder[Self <: Subject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: GroupSubject): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccount(value: ServiceAccountSubject): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: UserSubject): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
