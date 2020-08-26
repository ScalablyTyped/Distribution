package typings.pulumiAws.domainNameMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.apigatewayv2.DomainNameDomainNameConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainNameArgs extends js.Object {
  /**
    * The domain name.
    */
  val domainName: Input[String] = js.native
  /**
    * The domain name configuration.
    */
  val domainNameConfiguration: Input[DomainNameDomainNameConfiguration] = js.native
  /**
    * A map of tags to assign to the domain name.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object DomainNameArgs {
  @scala.inline
  def apply(domainName: Input[String], domainNameConfiguration: Input[DomainNameDomainNameConfiguration]): DomainNameArgs = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], domainNameConfiguration = domainNameConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainNameArgs]
  }
  @scala.inline
  implicit class DomainNameArgsOps[Self <: DomainNameArgs] (val x: Self) extends AnyVal {
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
    def setDomainName(value: Input[String]): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainNameConfiguration(value: Input[DomainNameDomainNameConfiguration]): Self = this.set("domainNameConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

