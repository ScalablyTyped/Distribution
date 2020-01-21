package typings.pulumiAws.repositoryMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryArgs extends js.Object {
  /**
    * The default branch of the repository. The branch specified here needs to exist.
    */
  val defaultBranch: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the repository. This needs to be less than 1000 characters
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The name for the repository. This needs to be less than 100 characters.
    */
  val repositoryName: Input[String] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object RepositoryArgs {
  @scala.inline
  def apply(
    repositoryName: Input[String],
    defaultBranch: Input[String] = null,
    description: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): RepositoryArgs = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    if (defaultBranch != null) __obj.updateDynamic("defaultBranch")(defaultBranch.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryArgs]
  }
}

