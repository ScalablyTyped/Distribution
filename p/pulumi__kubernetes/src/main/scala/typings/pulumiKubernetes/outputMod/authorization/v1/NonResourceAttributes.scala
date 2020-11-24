package typings.pulumiKubernetes.outputMod.authorization.v1

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
  var path: String = js.native
  
  /**
    * Verb is the standard HTTP verb
    */
  var verb: String = js.native
}
object NonResourceAttributes {
  
  @scala.inline
  def apply(path: String, verb: String): NonResourceAttributes = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerb(value: String): Self = this.set("verb", value.asInstanceOf[js.Any])
  }
}
