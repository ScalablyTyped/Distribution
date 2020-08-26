package typings.pulumiAws.codepipelineWebhookMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.codepipeline.WebhookAuthenticationConfiguration
import typings.pulumiAws.inputMod.codepipeline.WebhookFilter
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookState extends js.Object {
  /**
    * The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
    */
  val authentication: js.UndefOr[Input[String]] = js.native
  /**
    * An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
    */
  val authenticationConfiguration: js.UndefOr[Input[WebhookAuthenticationConfiguration]] = js.native
  /**
    * One or more `filter` blocks. Filter blocks are documented below.
    */
  val filters: js.UndefOr[Input[js.Array[Input[WebhookFilter]]]] = js.native
  /**
    * The name of the webhook.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
    */
  val targetAction: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the pipeline.
    */
  val targetPipeline: js.UndefOr[Input[String]] = js.native
  /**
    * The CodePipeline webhook's URL. POST events to this endpoint to trigger the target.
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
    def setAuthentication(value: Input[String]): Self = this.set("authentication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthentication: Self = this.set("authentication", js.undefined)
    @scala.inline
    def setAuthenticationConfiguration(value: Input[WebhookAuthenticationConfiguration]): Self = this.set("authenticationConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticationConfiguration: Self = this.set("authenticationConfiguration", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: Input[WebhookFilter]*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: Input[js.Array[Input[WebhookFilter]]]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTargetAction(value: Input[String]): Self = this.set("targetAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetAction: Self = this.set("targetAction", js.undefined)
    @scala.inline
    def setTargetPipeline(value: Input[String]): Self = this.set("targetPipeline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetPipeline: Self = this.set("targetPipeline", js.undefined)
    @scala.inline
    def setUrl(value: Input[String]): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

