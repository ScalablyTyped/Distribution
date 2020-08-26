package typings.pulumiAws.webAclMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.wafregional.WebAclDefaultAction
import typings.pulumiAws.inputMod.wafregional.WebAclLoggingConfiguration
import typings.pulumiAws.inputMod.wafregional.WebAclRule
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAclState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the WAF Regional WebACL.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The action that you want AWS WAF Regional to take when a request doesn't match the criteria in any of the rules that are associated with the web ACL.
    */
  val defaultAction: js.UndefOr[Input[WebAclDefaultAction]] = js.native
  /**
    * Configuration block to enable WAF logging. Detailed below.
    */
  val loggingConfiguration: js.UndefOr[Input[WebAclLoggingConfiguration]] = js.native
  /**
    * The name or description for the Amazon CloudWatch metric of this web ACL.
    */
  val metricName: js.UndefOr[Input[String]] = js.native
  /**
    * The name or description of the web ACL.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Set of configuration blocks containing rules for the web ACL. Detailed below.
    */
  val rules: js.UndefOr[Input[js.Array[Input[WebAclRule]]]] = js.native
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object WebAclState {
  @scala.inline
  def apply(): WebAclState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAclState]
  }
  @scala.inline
  implicit class WebAclStateOps[Self <: WebAclState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setDefaultAction(value: Input[WebAclDefaultAction]): Self = this.set("defaultAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultAction: Self = this.set("defaultAction", js.undefined)
    @scala.inline
    def setLoggingConfiguration(value: Input[WebAclLoggingConfiguration]): Self = this.set("loggingConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingConfiguration: Self = this.set("loggingConfiguration", js.undefined)
    @scala.inline
    def setMetricName(value: Input[String]): Self = this.set("metricName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricName: Self = this.set("metricName", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRulesVarargs(value: Input[WebAclRule]*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: Input[js.Array[Input[WebAclRule]]]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

