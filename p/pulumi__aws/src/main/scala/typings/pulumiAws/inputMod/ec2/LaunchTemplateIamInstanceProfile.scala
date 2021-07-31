package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateIamInstanceProfile extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the instance profile.
    */
  var arn: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The name of the instance profile.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
}
object LaunchTemplateIamInstanceProfile {
  
  @scala.inline
  def apply(): LaunchTemplateIamInstanceProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateIamInstanceProfile]
  }
  
  @scala.inline
  implicit class LaunchTemplateIamInstanceProfileMutableBuilder[Self <: LaunchTemplateIamInstanceProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
