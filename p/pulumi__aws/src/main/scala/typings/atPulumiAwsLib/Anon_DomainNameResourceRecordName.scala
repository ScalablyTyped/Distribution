package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DomainNameResourceRecordName extends js.Object {
  var domainName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var resourceRecordName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var resourceRecordType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var resourceRecordValue: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_DomainNameResourceRecordName {
  @scala.inline
  def apply(
    domainName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    resourceRecordName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    resourceRecordType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    resourceRecordValue: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_DomainNameResourceRecordName = {
    val __obj = js.Dynamic.literal()
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (resourceRecordName != null) __obj.updateDynamic("resourceRecordName")(resourceRecordName.asInstanceOf[js.Any])
    if (resourceRecordType != null) __obj.updateDynamic("resourceRecordType")(resourceRecordType.asInstanceOf[js.Any])
    if (resourceRecordValue != null) __obj.updateDynamic("resourceRecordValue")(resourceRecordValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DomainNameResourceRecordName]
  }
}

