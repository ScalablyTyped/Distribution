package typings
package atPulumiAwsLib.codepipelineWebhookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookArgs extends js.Object {
  /**
    * The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
    */
  val authentication: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
    */
  val authenticationConfiguration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AllowedIpRangeSecretToken]] = js.undefined
  /**
    * One or more `filter` blocks. Filter blocks are documented below.
    */
  val filters: atPulumiPulumiLib.outputMod.Input[
    js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_JsonPathMatchEquals]]
  ]
  /**
    * The name of the webhook.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
    */
  val targetAction: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name of the pipeline.
    */
  val targetPipeline: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object WebhookArgs {
  @scala.inline
  def apply(
    authentication: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    filters: atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_JsonPathMatchEquals]]
    ],
    targetAction: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    targetPipeline: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    authenticationConfiguration: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AllowedIpRangeSecretToken] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): WebhookArgs = {
    val __obj = js.Dynamic.literal(authentication = authentication.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], targetAction = targetAction.asInstanceOf[js.Any], targetPipeline = targetPipeline.asInstanceOf[js.Any])
    if (authenticationConfiguration != null) __obj.updateDynamic("authenticationConfiguration")(authenticationConfiguration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookArgs]
  }
}

