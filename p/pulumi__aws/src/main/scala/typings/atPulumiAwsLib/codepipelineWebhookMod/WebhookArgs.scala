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
    * The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
    */
  val targetAction: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name of the pipeline.
    */
  val targetPipeline: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

