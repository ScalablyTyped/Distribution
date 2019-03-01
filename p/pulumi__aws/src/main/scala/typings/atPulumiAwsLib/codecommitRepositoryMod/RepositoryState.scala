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

object RepositoryState {
  @scala.inline
  def apply(
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    cloneUrlHttp: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    cloneUrlSsh: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    defaultBranch: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    repositoryId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    repositoryName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): RepositoryState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (cloneUrlHttp != null) __obj.updateDynamic("cloneUrlHttp")(cloneUrlHttp.asInstanceOf[js.Any])
    if (cloneUrlSsh != null) __obj.updateDynamic("cloneUrlSsh")(cloneUrlSsh.asInstanceOf[js.Any])
    if (defaultBranch != null) __obj.updateDynamic("defaultBranch")(defaultBranch.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (repositoryId != null) __obj.updateDynamic("repositoryId")(repositoryId.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryState]
  }
}

