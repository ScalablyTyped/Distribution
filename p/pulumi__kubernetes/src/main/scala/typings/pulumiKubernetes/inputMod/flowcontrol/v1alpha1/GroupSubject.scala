package typings.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GroupSubject holds detailed information for group-kind subject.
  */
@js.native
trait GroupSubject extends StObject {
  
  /**
    * name is the user group that matches, or "*" to match all user groups. See https://github.com/kubernetes/apiserver/blob/master/pkg/authentication/user/user.go for some well-known group names. Required.
    */
  var name: Input[String] = js.native
}
object GroupSubject {
  
  @scala.inline
  def apply(name: Input[String]): GroupSubject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupSubject]
  }
  
  @scala.inline
  implicit class GroupSubjectMutableBuilder[Self <: GroupSubject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
