package typings.pulumiAws.webhookMod

import typings.pulumiAws.inputMod.codebuild.WebhookFilterGroup
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookState extends js.Object {
  /**
    * A regular expression used to determine which branches get built. Default is all branches are built. It is recommended to use `filterGroup` over `branchFilter`.
    */
  val branchFilter: js.UndefOr[Input[String]] = js.native
  /**
    * Information about the webhook's trigger. Filter group blocks are documented below.
    */
  val filterGroups: js.UndefOr[Input[js.Array[Input[WebhookFilterGroup]]]] = js.native
  /**
    * The CodeBuild endpoint where webhook events are sent.
    */
  val payloadUrl: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the build project.
    */
  val projectName: js.UndefOr[Input[String]] = js.native
  /**
    * The secret token of the associated repository. Not returned by the CodeBuild API for all source types.
    */
  val secret: js.UndefOr[Input[String]] = js.native
  /**
    * The URL to the webhook.
    */
  val url: js.UndefOr[Input[String]] = js.native
}

object WebhookState {
  @scala.inline
  def apply(): WebhookState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebhookState]
  }
  @scala.inline
  implicit class WebhookStateOps[Self <: WebhookState] (val x: Self) extends AnyVal {
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
    def setBranchFilter(value: Input[String]): Self = this.set("branchFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBranchFilter: Self = this.set("branchFilter", js.undefined)
    @scala.inline
    def setFilterGroupsVarargs(value: Input[WebhookFilterGroup]*): Self = this.set("filterGroups", js.Array(value :_*))
    @scala.inline
    def setFilterGroups(value: Input[js.Array[Input[WebhookFilterGroup]]]): Self = this.set("filterGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterGroups: Self = this.set("filterGroups", js.undefined)
    @scala.inline
    def setPayloadUrl(value: Input[String]): Self = this.set("payloadUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayloadUrl: Self = this.set("payloadUrl", js.undefined)
    @scala.inline
    def setProjectName(value: Input[String]): Self = this.set("projectName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectName: Self = this.set("projectName", js.undefined)
    @scala.inline
    def setSecret(value: Input[String]): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
    @scala.inline
    def setUrl(value: Input[String]): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

