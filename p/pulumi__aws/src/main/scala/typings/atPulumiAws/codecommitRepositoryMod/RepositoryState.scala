package typings.atPulumiAws.codecommitRepositoryMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryState extends js.Object {
  /**
    * The ARN of the repository
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The URL to use for cloning the repository over HTTPS.
    */
  val cloneUrlHttp: js.UndefOr[Input[String]] = js.native
  /**
    * The URL to use for cloning the repository over SSH.
    */
  val cloneUrlSsh: js.UndefOr[Input[String]] = js.native
  /**
    * The default branch of the repository. The branch specified here needs to exist.
    */
  val defaultBranch: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the repository. This needs to be less than 1000 characters
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the repository
    */
  val repositoryId: js.UndefOr[Input[String]] = js.native
  /**
    * The name for the repository. This needs to be less than 100 characters.
    */
  val repositoryName: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object RepositoryState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    cloneUrlHttp: Input[String] = null,
    cloneUrlSsh: Input[String] = null,
    defaultBranch: Input[String] = null,
    description: Input[String] = null,
    repositoryId: Input[String] = null,
    repositoryName: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): RepositoryState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (cloneUrlHttp != null) __obj.updateDynamic("cloneUrlHttp")(cloneUrlHttp.asInstanceOf[js.Any])
    if (cloneUrlSsh != null) __obj.updateDynamic("cloneUrlSsh")(cloneUrlSsh.asInstanceOf[js.Any])
    if (defaultBranch != null) __obj.updateDynamic("defaultBranch")(defaultBranch.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (repositoryId != null) __obj.updateDynamic("repositoryId")(repositoryId.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryState]
  }
}

