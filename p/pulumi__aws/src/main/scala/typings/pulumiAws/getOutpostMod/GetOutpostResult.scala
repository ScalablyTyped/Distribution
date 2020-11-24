package typings.pulumiAws.getOutpostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOutpostResult extends js.Object {
  
  val arn: String = js.native
  
  /**
    * Availability Zone name.
    */
  val availabilityZone: String = js.native
  
  /**
    * Availability Zone identifier.
    */
  val availabilityZoneId: String = js.native
  
  /**
    * Description.
    */
  val description: String = js.native
  
  val id: String = js.native
  
  val name: String = js.native
  
  /**
    * AWS Account identifier of the Outpost owner.
    */
  val ownerId: String = js.native
  
  /**
    * Site identifier.
    */
  val siteId: String = js.native
}
object GetOutpostResult {
  
  @scala.inline
  def apply(
    arn: String,
    availabilityZone: String,
    availabilityZoneId: String,
    description: String,
    id: String,
    name: String,
    ownerId: String,
    siteId: String
  ): GetOutpostResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], availabilityZoneId = availabilityZoneId.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], siteId = siteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOutpostResult]
  }
  
  @scala.inline
  implicit class GetOutpostResultOps[Self <: GetOutpostResult] (val x: Self) extends AnyVal {
    
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
    def setAvailabilityZone(value: String): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneId(value: String): Self = this.set("availabilityZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerId(value: String): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteId(value: String): Self = this.set("siteId", value.asInstanceOf[js.Any])
  }
}
