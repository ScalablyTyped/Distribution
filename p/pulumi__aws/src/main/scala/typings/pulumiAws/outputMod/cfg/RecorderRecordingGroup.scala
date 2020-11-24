package typings.pulumiAws.outputMod.cfg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecorderRecordingGroup extends js.Object {
  
  /**
    * Specifies whether AWS Config records configuration changes for every supported type of regional resource (which includes any new type that will become supported in the future). Conflicts with `resourceTypes`. Defaults to `true`.
    */
  var allSupported: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies whether AWS Config includes all supported types of *global resources* with the resources that it records. Requires `allSupported = true`. Conflicts with `resourceTypes`.
    */
  var includeGlobalResourceTypes: js.UndefOr[Boolean] = js.native
  
  /**
    * A list that specifies the types of AWS resources for which AWS Config records configuration changes (for example, `AWS::EC2::Instance` or `AWS::CloudTrail::Trail`). See [relevant part of AWS Docs](http://docs.aws.amazon.com/config/latest/APIReference/API_ResourceIdentifier.html#config-Type-ResourceIdentifier-resourceType) for available types.
    */
  var resourceTypes: js.UndefOr[js.Array[String]] = js.native
}
object RecorderRecordingGroup {
  
  @scala.inline
  def apply(): RecorderRecordingGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecorderRecordingGroup]
  }
  
  @scala.inline
  implicit class RecorderRecordingGroupOps[Self <: RecorderRecordingGroup] (val x: Self) extends AnyVal {
    
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
    def setAllSupported(value: Boolean): Self = this.set("allSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllSupported: Self = this.set("allSupported", js.undefined)
    
    @scala.inline
    def setIncludeGlobalResourceTypes(value: Boolean): Self = this.set("includeGlobalResourceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeGlobalResourceTypes: Self = this.set("includeGlobalResourceTypes", js.undefined)
    
    @scala.inline
    def setResourceTypesVarargs(value: String*): Self = this.set("resourceTypes", js.Array(value :_*))
    
    @scala.inline
    def setResourceTypes(value: js.Array[String]): Self = this.set("resourceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceTypes: Self = this.set("resourceTypes", js.undefined)
  }
}
