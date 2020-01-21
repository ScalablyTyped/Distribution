package typings.pulumiAws.ecrRepositoryMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ecr.RepositoryImageScanningConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryState extends js.Object {
  /**
    * Full ARN of the repository.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block that defines image scanning configuration for the repository. By default, image scanning must be manually triggered. See the [ECR User Guide](https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-scanning.html) for more information about image scanning.
    */
  val imageScanningConfiguration: js.UndefOr[Input[RepositoryImageScanningConfiguration]] = js.native
  /**
    * The tag mutability setting for the repository. Must be one of: `MUTABLE` or `IMMUTABLE`. Defaults to `MUTABLE`.
    */
  val imageTagMutability: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the repository.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The registry ID where the repository was created.
    */
  val registryId: js.UndefOr[Input[String]] = js.native
  /**
    * The URL of the repository (in the form `aws_account_id.dkr.ecr.region.amazonaws.com/repositoryName`
    */
  val repositoryUrl: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object RepositoryState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    imageScanningConfiguration: Input[RepositoryImageScanningConfiguration] = null,
    imageTagMutability: Input[String] = null,
    name: Input[String] = null,
    registryId: Input[String] = null,
    repositoryUrl: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): RepositoryState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (imageScanningConfiguration != null) __obj.updateDynamic("imageScanningConfiguration")(imageScanningConfiguration.asInstanceOf[js.Any])
    if (imageTagMutability != null) __obj.updateDynamic("imageTagMutability")(imageTagMutability.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    if (repositoryUrl != null) __obj.updateDynamic("repositoryUrl")(repositoryUrl.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryState]
  }
}

