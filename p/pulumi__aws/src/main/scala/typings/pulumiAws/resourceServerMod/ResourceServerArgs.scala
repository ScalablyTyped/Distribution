package typings.pulumiAws.resourceServerMod

import typings.pulumiAws.inputMod.cognito.ResourceServerScope
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceServerArgs extends js.Object {
  
  /**
    * An identifier for the resource server.
    */
  val identifier: Input[String] = js.native
  
  /**
    * A name for the resource server.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of Authorization Scope.
    */
  val scopes: js.UndefOr[Input[js.Array[Input[ResourceServerScope]]]] = js.native
  
  val userPoolId: Input[String] = js.native
}
object ResourceServerArgs {
  
  @scala.inline
  def apply(identifier: Input[String], userPoolId: Input[String]): ResourceServerArgs = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceServerArgs]
  }
  
  @scala.inline
  implicit class ResourceServerArgsOps[Self <: ResourceServerArgs] (val x: Self) extends AnyVal {
    
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
    def setIdentifier(value: Input[String]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: Input[String]): Self = this.set("userPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setScopesVarargs(value: Input[ResourceServerScope]*): Self = this.set("scopes", js.Array(value :_*))
    
    @scala.inline
    def setScopes(value: Input[js.Array[Input[ResourceServerScope]]]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
  }
}
