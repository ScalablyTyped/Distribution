package typings.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Subject matches the originator of a request, as identified by the request authentication system. There are three ways of matching an originator; by user, group, or service account.
  */
@js.native
trait Subject extends StObject {
  
  var group: js.UndefOr[Input[GroupSubject]] = js.native
  
  /**
    * Required
    */
  var kind: Input[String] = js.native
  
  var serviceAccount: js.UndefOr[Input[ServiceAccountSubject]] = js.native
  
  var user: js.UndefOr[Input[UserSubject]] = js.native
}
object Subject {
  
  @scala.inline
  def apply(kind: Input[String]): Subject = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subject]
  }
  
  @scala.inline
  implicit class SubjectMutableBuilder[Self <: Subject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: Input[GroupSubject]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setKind(value: Input[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccount(value: Input[ServiceAccountSubject]): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    @scala.inline
    def setUser(value: Input[UserSubject]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
