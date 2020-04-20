package typings.pulumiAws.getArnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetArnResult extends js.Object {
  /**
    * The [ID](https://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html) of the AWS account that owns the resource, without the hyphens.
    */
  val account: String = js.native
  val arn: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The partition that the resource is in.
    */
  val partition: String = js.native
  /**
    * The region the resource resides in.
    * Note that the ARNs for some resources do not require a region, so this component might be omitted.
    */
  val region: String = js.native
  /**
    * The content of this part of the ARN varies by service.
    * It often includes an indicator of the type of resource—for example, an IAM user or Amazon RDS database —followed by a slash (/) or a colon (:), followed by the resource name itself.
    */
  val resource: String = js.native
  /**
    * The [service namespace](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces) that identifies the AWS product.
    */
  val service: String = js.native
}

object GetArnResult {
  @scala.inline
  def apply(
    account: String,
    arn: String,
    id: String,
    partition: String,
    region: String,
    resource: String,
    service: String
  ): GetArnResult = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetArnResult]
  }
}

