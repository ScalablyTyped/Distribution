package typings.pulumiAws.codepipelineWebhookMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.codepipeline.WebhookAuthenticationConfiguration
import typings.pulumiAws.inputMod.codepipeline.WebhookFilter
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebhookArgs extends js.Object {
  
  /**
    * The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
    */
  val authentication: Input[String] = js.native
  
  /**
    * An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
    */
  val authenticationConfiguration: js.UndefOr[Input[WebhookAuthenticationConfiguration]] = js.native
  
  /**
    * One or more `filter` blocks. Filter blocks are documented below.
    */
  val filters: Input[js.Array[Input[WebhookFilter]]] = js.native
  
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
  val targetAction: Input[String] = js.native
  
  /**
    * The name of the pipeline.
    */
  val targetPipeline: Input[String] = js.native
}
object WebhookArgs {
  
  @scala.inline
  def apply(
    authentication: Input[String],
    filters: Input[js.Array[Input[WebhookFilter]]],
    targetAction: Input[String],
    targetPipeline: Input[String]
  ): WebhookArgs = {
    val __obj = js.Dynamic.literal(authentication = authentication.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], targetAction = targetAction.asInstanceOf[js.Any], targetPipeline = targetPipeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookArgs]
  }
  
  @scala.inline
  implicit class WebhookArgsOps[Self <: WebhookArgs] (val x: Self) extends AnyVal {
    
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
    def setFiltersVarargs(value: Input[WebhookFilter]*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: Input[js.Array[Input[WebhookFilter]]]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetAction(value: Input[String]): Self = this.set("targetAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPipeline(value: Input[String]): Self = this.set("targetPipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationConfiguration(value: Input[WebhookAuthenticationConfiguration]): Self = this.set("authenticationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationConfiguration: Self = this.set("authenticationConfiguration", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
