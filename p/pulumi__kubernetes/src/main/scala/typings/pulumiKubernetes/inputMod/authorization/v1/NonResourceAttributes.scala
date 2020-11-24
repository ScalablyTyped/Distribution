package typings.pulumiKubernetes.inputMod.authorization.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NonResourceAttributes includes the authorization attributes available for non-resource requests to the Authorizer interface
  */
@js.native
trait NonResourceAttributes extends js.Object {
  
  /**
    * Path is the URL path of the request
    */
  var path: js.UndefOr[Input[String]] = js.native
  
  /**
    * Verb is the standard HTTP verb
    */
  var verb: js.UndefOr[Input[String]] = js.native
}
object NonResourceAttributes {
  
  @scala.inline
  def apply(): NonResourceAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonResourceAttributes]
  }
  
  @scala.inline
  implicit class NonResourceAttributesOps[Self <: NonResourceAttributes] (val x: Self) extends AnyVal {
    
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
    def setPath(value: Input[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setVerb(value: Input[String]): Self = this.set("verb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerb: Self = this.set("verb", js.undefined)
  }
}
