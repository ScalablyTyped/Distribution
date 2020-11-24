package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudFormationResource extends js.Object {
  
  var DeletionPolicy: js.UndefOr[String] = js.native
  
  var DependsOn: js.UndefOr[String | StringDictionary[js.Any]] = js.native
  
  var Properties: StringDictionary[js.Any] = js.native
  
  var Type: String = js.native
}
object CloudFormationResource {
  
  @scala.inline
  def apply(Properties: StringDictionary[js.Any], Type: String): CloudFormationResource = {
    val __obj = js.Dynamic.literal(Properties = Properties.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFormationResource]
  }
  
  @scala.inline
  implicit class CloudFormationResourceOps[Self <: CloudFormationResource] (val x: Self) extends AnyVal {
    
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
    def setProperties(value: StringDictionary[js.Any]): Self = this.set("Properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionPolicy(value: String): Self = this.set("DeletionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionPolicy: Self = this.set("DeletionPolicy", js.undefined)
    
    @scala.inline
    def setDependsOn(value: String | StringDictionary[js.Any]): Self = this.set("DependsOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependsOn: Self = this.set("DependsOn", js.undefined)
  }
}
