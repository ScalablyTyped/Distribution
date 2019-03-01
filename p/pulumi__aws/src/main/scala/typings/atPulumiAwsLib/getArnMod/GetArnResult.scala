package typings
package atPulumiAwsLib.getArnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetArnResult extends js.Object {
  /**
    * The [ID](https://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html) of the AWS account that owns the resource, without the hyphens.
    */
  val account: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The partition that the resource is in.
    */
  val partition: java.lang.String
  /**
    * The region the resource resides in.
    * Note that the ARNs for some resources do not require a region, so this component might be omitted.
    */
  val region: java.lang.String
  /**
    * The content of this part of the ARN varies by service.
    * It often includes an indicator of the type of resource—for example, an IAM user or Amazon RDS database —followed by a slash (/) or a colon (:), followed by the resource name itself.
    */
  val resource: java.lang.String
  /**
    * The [service namespace](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces) that identifies the AWS product.
    */
  val service: java.lang.String
}

object GetArnResult {
  @scala.inline
  def apply(
    account: java.lang.String,
    id: java.lang.String,
    partition: java.lang.String,
    region: java.lang.String,
    resource: java.lang.String,
    service: java.lang.String
  ): GetArnResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("account")(account)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("partition")(partition)
    __obj.updateDynamic("region")(region)
    __obj.updateDynamic("resource")(resource)
    __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[GetArnResult]
  }
}

