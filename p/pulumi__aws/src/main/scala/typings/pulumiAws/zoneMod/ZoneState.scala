package typings.pulumiAws.zoneMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.route53.ZoneVpc
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoneState extends js.Object {
  
  /**
    * A comment for the hosted zone. Defaults to 'Managed by Pulumi'.
    */
  val comment: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the reusable delegation set whose NS records you want to assign to the hosted zone. Conflicts with `vpc` as delegation sets can only be used for public zones.
    */
  val delegationSetId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Whether to destroy all records (possibly managed outside of this provider) in the zone when destroying the zone.
    */
  val forceDestroy: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * This is the name of the hosted zone.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of name servers in associated (or default) delegation set.
    * Find more about delegation sets in [AWS docs](https://docs.aws.amazon.com/Route53/latest/APIReference/actions-on-reusable-delegation-sets.html).
    */
  val nameServers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * A mapping of tags to assign to the zone.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Configuration block(s) specifying VPC(s) to associate with a private hosted zone. Conflicts with the `delegationSetId` argument in this resource and any `aws.route53.ZoneAssociation` resource specifying the same zone ID. Detailed below.
    */
  val vpcs: js.UndefOr[Input[js.Array[Input[ZoneVpc]]]] = js.native
  
  /**
    * The Hosted Zone ID. This can be referenced by zone records.
    */
  val zoneId: js.UndefOr[Input[String]] = js.native
}
object ZoneState {
  
  @scala.inline
  def apply(): ZoneState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneState]
  }
  
  @scala.inline
  implicit class ZoneStateOps[Self <: ZoneState] (val x: Self) extends AnyVal {
    
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
    def setComment(value: Input[String]): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setDelegationSetId(value: Input[String]): Self = this.set("delegationSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelegationSetId: Self = this.set("delegationSetId", js.undefined)
    
    @scala.inline
    def setForceDestroy(value: Input[Boolean]): Self = this.set("forceDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceDestroy: Self = this.set("forceDestroy", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameServersVarargs(value: Input[String]*): Self = this.set("nameServers", js.Array(value :_*))
    
    @scala.inline
    def setNameServers(value: Input[js.Array[Input[String]]]): Self = this.set("nameServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameServers: Self = this.set("nameServers", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVpcsVarargs(value: Input[ZoneVpc]*): Self = this.set("vpcs", js.Array(value :_*))
    
    @scala.inline
    def setVpcs(value: Input[js.Array[Input[ZoneVpc]]]): Self = this.set("vpcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcs: Self = this.set("vpcs", js.undefined)
    
    @scala.inline
    def setZoneId(value: Input[String]): Self = this.set("zoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoneId: Self = this.set("zoneId", js.undefined)
  }
}
