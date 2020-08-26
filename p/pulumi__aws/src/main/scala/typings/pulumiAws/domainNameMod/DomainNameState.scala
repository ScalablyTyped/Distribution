package typings.pulumiAws.domainNameMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.apigatewayv2.DomainNameDomainNameConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainNameState extends js.Object {
  /**
    * The [API mapping selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-mapping-selection-expressions) for the domain name.
    */
  val apiMappingSelectionExpression: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the domain name.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The domain name.
    */
  val domainName: js.UndefOr[Input[String]] = js.native
  /**
    * The domain name configuration.
    */
  val domainNameConfiguration: js.UndefOr[Input[DomainNameDomainNameConfiguration]] = js.native
  /**
    * A map of tags to assign to the domain name.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object DomainNameState {
  @scala.inline
  def apply(): DomainNameState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainNameState]
  }
  @scala.inline
  implicit class DomainNameStateOps[Self <: DomainNameState] (val x: Self) extends AnyVal {
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
    def setApiMappingSelectionExpression(value: Input[String]): Self = this.set("apiMappingSelectionExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiMappingSelectionExpression: Self = this.set("apiMappingSelectionExpression", js.undefined)
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setDomainName(value: Input[String]): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    @scala.inline
    def setDomainNameConfiguration(value: Input[DomainNameDomainNameConfiguration]): Self = this.set("domainNameConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainNameConfiguration: Self = this.set("domainNameConfiguration", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

