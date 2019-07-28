package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OrganizationArn extends js.Object {
  var organizationArn: String
  var position: Double
  var topicArn: js.UndefOr[String] = js.undefined
}

object Anon_OrganizationArn {
  @scala.inline
  def apply(organizationArn: String, position: Double, topicArn: String = null): Anon_OrganizationArn = {
    val __obj = js.Dynamic.literal(organizationArn = organizationArn, position = position)
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn)
    __obj.asInstanceOf[Anon_OrganizationArn]
  }
}

