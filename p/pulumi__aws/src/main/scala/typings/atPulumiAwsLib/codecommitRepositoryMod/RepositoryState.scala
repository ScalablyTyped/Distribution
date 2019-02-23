package typings
package atPulumiAwsLib.codecommitRepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryState extends js.Object {
  /**
    * The ARN of the repository
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The URL to use for cloning the repository over HTTPS.
    */
  val cloneUrlHttp: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The URL to use for cloning the repository over SSH.
    */
  val cloneUrlSsh: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The default branch of the repository. The branch specified here needs to exist.
    */
  val defaultBranch: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The description of the repository. This needs to be less than 1000 characters
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the repository
    */
  val repositoryId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name for the repository. This needs to be less than 100 characters.
    */
  val repositoryName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

