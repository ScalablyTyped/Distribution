package typings.pulumiAws.documentsMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AWSPrincipal extends Principal {
  
  var AWS: Input[js.Array[Input[String]] | String] = js.native
}
object AWSPrincipal {
  
  @scala.inline
  def apply(AWS: Input[js.Array[Input[String]] | String]): AWSPrincipal = {
    val __obj = js.Dynamic.literal(AWS = AWS.asInstanceOf[js.Any])
    __obj.asInstanceOf[AWSPrincipal]
  }
  
  @scala.inline
  implicit class AWSPrincipalOps[Self <: AWSPrincipal] (val x: Self) extends AnyVal {
    
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
    def setAWSVarargs(value: Input[String]*): Self = this.set("AWS", js.Array(value :_*))
    
    @scala.inline
    def setAWS(value: Input[js.Array[Input[String]] | String]): Self = this.set("AWS", value.asInstanceOf[js.Any])
  }
}
