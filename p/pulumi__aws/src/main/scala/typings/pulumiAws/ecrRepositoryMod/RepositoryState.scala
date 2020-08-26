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
    * The URL of the repository (in the form `aws_account_id.dkr.ecr.region.amazonaws.com/repositoryName`).
    */
  val repositoryUrl: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object RepositoryState {
  @scala.inline
  def apply(): RepositoryState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryState]
  }
  @scala.inline
  implicit class RepositoryStateOps[Self <: RepositoryState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setImageScanningConfiguration(value: Input[RepositoryImageScanningConfiguration]): Self = this.set("imageScanningConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageScanningConfiguration: Self = this.set("imageScanningConfiguration", js.undefined)
    @scala.inline
    def setImageTagMutability(value: Input[String]): Self = this.set("imageTagMutability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageTagMutability: Self = this.set("imageTagMutability", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRegistryId(value: Input[String]): Self = this.set("registryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistryId: Self = this.set("registryId", js.undefined)
    @scala.inline
    def setRepositoryUrl(value: Input[String]): Self = this.set("repositoryUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepositoryUrl: Self = this.set("repositoryUrl", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

