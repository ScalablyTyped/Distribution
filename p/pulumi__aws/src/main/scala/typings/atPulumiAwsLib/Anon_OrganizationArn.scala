package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OrganizationArn extends js.Object {
  var organizationArn: java.lang.String
  var position: scala.Double
  var topicArn: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_OrganizationArn {
  @scala.inline
  def apply(organizationArn: java.lang.String, position: scala.Double, topicArn: java.lang.String = null): Anon_OrganizationArn = {
    val __obj = js.Dynamic.literal(organizationArn = organizationArn, position = position)
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn)
    __obj.asInstanceOf[Anon_OrganizationArn]
  }
}

