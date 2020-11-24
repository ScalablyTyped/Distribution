package typings.pulumiAws.getLogGroupMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLogGroupResult extends js.Object {
  
  /**
    * The ARN of the Cloudwatch log group
    */
  val arn: String = js.native
  
  /**
    * The creation time of the log group, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  val creationTime: Double = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * The ARN of the KMS Key to use when encrypting log data.
    */
  val kmsKeyId: String = js.native
  
  val name: String = js.native
  
  /**
    * The number of days log events retained in the specified log group.
    */
  val retentionInDays: Double = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: StringDictionary[String] = js.native
}
object GetLogGroupResult {
  
  @scala.inline
  def apply(
    arn: String,
    creationTime: Double,
    id: String,
    kmsKeyId: String,
    name: String,
    retentionInDays: Double,
    tags: StringDictionary[String]
  ): GetLogGroupResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], retentionInDays = retentionInDays.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLogGroupResult]
  }
  
  @scala.inline
  implicit class GetLogGroupResultOps[Self <: GetLogGroupResult] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTime(value: Double): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionInDays(value: Double): Self = this.set("retentionInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
}
