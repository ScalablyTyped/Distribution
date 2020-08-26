package typings.pulumiAws.getInternetGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetInternetGatewayAttachment
import typings.pulumiAws.outputMod.ec2.GetInternetGatewayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInternetGatewayResult extends js.Object {
  /**
    * The ARN of the Internet Gateway.
    */
  val arn: String = js.native
  val attachments: js.Array[GetInternetGatewayAttachment] = js.native
  val filters: js.UndefOr[js.Array[GetInternetGatewayFilter]] = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val internetGatewayId: String = js.native
  /**
    * The ID of the AWS account that owns the internet gateway.
    */
  val ownerId: String = js.native
  val tags: StringDictionary[String] = js.native
}

object GetInternetGatewayResult {
  @scala.inline
  def apply(
    arn: String,
    attachments: js.Array[GetInternetGatewayAttachment],
    id: String,
    internetGatewayId: String,
    ownerId: String,
    tags: StringDictionary[String]
  ): GetInternetGatewayResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], attachments = attachments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], internetGatewayId = internetGatewayId.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInternetGatewayResult]
  }
  @scala.inline
  implicit class GetInternetGatewayResultOps[Self <: GetInternetGatewayResult] (val x: Self) extends AnyVal {
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
    def setAttachmentsVarargs(value: GetInternetGatewayAttachment*): Self = this.set("attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: js.Array[GetInternetGatewayAttachment]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInternetGatewayId(value: String): Self = this.set("internetGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerId(value: String): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltersVarargs(value: GetInternetGatewayFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetInternetGatewayFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
  
}

