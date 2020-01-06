package typings.atPulumiAws.ecrRepositoryMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ecr.RepositoryImageScanningConfiguration
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryArgs extends js.Object {
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
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object RepositoryArgs {
  @scala.inline
  def apply(
    imageScanningConfiguration: Input[RepositoryImageScanningConfiguration] = null,
    imageTagMutability: Input[String] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): RepositoryArgs = {
    val __obj = js.Dynamic.literal()
    if (imageScanningConfiguration != null) __obj.updateDynamic("imageScanningConfiguration")(imageScanningConfiguration.asInstanceOf[js.Any])
    if (imageTagMutability != null) __obj.updateDynamic("imageTagMutability")(imageTagMutability.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryArgs]
  }
}

