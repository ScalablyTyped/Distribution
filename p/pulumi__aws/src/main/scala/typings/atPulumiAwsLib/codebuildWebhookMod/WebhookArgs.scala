package typings
package atPulumiAwsLib.codebuildWebhookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookArgs extends js.Object {
  /**
    * A regular expression used to determine which branches get built. Default is all branches are built.
    */
  val branchFilter: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the build project.
    */
  val projectName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

