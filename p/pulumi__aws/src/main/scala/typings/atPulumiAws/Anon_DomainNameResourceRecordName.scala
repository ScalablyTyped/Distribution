package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DomainNameResourceRecordName extends js.Object {
  var domainName: js.UndefOr[Input[String]] = js.undefined
  var resourceRecordName: js.UndefOr[Input[String]] = js.undefined
  var resourceRecordType: js.UndefOr[Input[String]] = js.undefined
  var resourceRecordValue: js.UndefOr[Input[String]] = js.undefined
}

object Anon_DomainNameResourceRecordName {
  @scala.inline
  def apply(
    domainName: Input[String] = null,
    resourceRecordName: Input[String] = null,
    resourceRecordType: Input[String] = null,
    resourceRecordValue: Input[String] = null
  ): Anon_DomainNameResourceRecordName = {
    val __obj = js.Dynamic.literal()
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (resourceRecordName != null) __obj.updateDynamic("resourceRecordName")(resourceRecordName.asInstanceOf[js.Any])
    if (resourceRecordType != null) __obj.updateDynamic("resourceRecordType")(resourceRecordType.asInstanceOf[js.Any])
    if (resourceRecordValue != null) __obj.updateDynamic("resourceRecordValue")(resourceRecordValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DomainNameResourceRecordName]
  }
}

