package typings.atPulumiAws.typesOutputMod.route53

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordAlias extends js.Object {
  /**
    * Set to `true` if you want Route 53 to determine whether to respond to DNS queries using this resource record set by checking the health of the resource record set. Some resources have special requirements, see [related part of documentation](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resource-record-sets-values.html#rrsets-values-alias-evaluate-target-health).
    */
  var evaluateTargetHealth: Boolean
  /**
    * DNS domain name for a CloudFront distribution, S3 bucket, ELB, or another resource record set in this hosted zone.
    */
  var name: String
  /**
    * Hosted zone ID for a CloudFront distribution, S3 bucket, ELB, or Route 53 hosted zone. See [`resource_elb.zone_id`](https://www.terraform.io/docs/providers/aws/r/elb.html#zone_id) for example.
    */
  var zoneId: String
}

object RecordAlias {
  @scala.inline
  def apply(evaluateTargetHealth: Boolean, name: String, zoneId: String): RecordAlias = {
    val __obj = js.Dynamic.literal(evaluateTargetHealth = evaluateTargetHealth, name = name, zoneId = zoneId)
  
    __obj.asInstanceOf[RecordAlias]
  }
}

