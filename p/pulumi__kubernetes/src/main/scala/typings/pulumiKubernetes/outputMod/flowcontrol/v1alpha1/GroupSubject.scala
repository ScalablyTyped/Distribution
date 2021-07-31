package typings.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GroupSubject holds detailed information for group-kind subject.
  */
trait GroupSubject extends StObject {
  
  /**
    * name is the user group that matches, or "*" to match all user groups. See https://github.com/kubernetes/apiserver/blob/master/pkg/authentication/user/user.go for some well-known group names. Required.
    */
  var name: String
}
object GroupSubject {
  
  @scala.inline
  def apply(name: String): GroupSubject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupSubject]
  }
  
  @scala.inline
  implicit class GroupSubjectMutableBuilder[Self <: GroupSubject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
