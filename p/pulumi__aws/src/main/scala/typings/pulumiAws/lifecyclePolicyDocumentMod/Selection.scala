package typings.pulumiAws.lifecyclePolicyDocumentMod

import typings.pulumiAws.pulumiAwsStrings.any
import typings.pulumiAws.pulumiAwsStrings.imageCountMoreThan
import typings.pulumiAws.pulumiAwsStrings.sinceImagePushed
import typings.pulumiAws.pulumiAwsStrings.tagged
import typings.pulumiAws.pulumiAwsStrings.untagged
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Selection extends js.Object {
  /**
    * The maximum number of images or the max age for which to apply the image selection.
    */
  var countNumber: Input[Double] = js.native
  /**
    * Indicate whether to evaluate the rule based on `imageCountMoreThan` or `sinceImagePushed`.
    */
  var countType: Input[imageCountMoreThan | sinceImagePushed] = js.native
  /**
    * The unit of time e.g. days for which to apply the selection.
    */
  var countUnit: js.UndefOr[Input[String]] = js.native
  /**
    * Specify one or more image tag prefixes for selection.
    */
  var tagPrefixList: js.UndefOr[Input[String] | js.Array[Input[String]]] = js.native
  /**
    * Indicate whether to select `tagged`, `untagged` or `any` images in the repository.
    */
  var tagStatus: Input[tagged | untagged | any] = js.native
}

object Selection {
  @scala.inline
  def apply(
    countNumber: Input[Double],
    countType: Input[imageCountMoreThan | sinceImagePushed],
    tagStatus: Input[tagged | untagged | any],
    countUnit: Input[String] = null,
    tagPrefixList: Input[String] | js.Array[Input[String]] = null
  ): Selection = {
    val __obj = js.Dynamic.literal(countNumber = countNumber.asInstanceOf[js.Any], countType = countType.asInstanceOf[js.Any], tagStatus = tagStatus.asInstanceOf[js.Any])
    if (countUnit != null) __obj.updateDynamic("countUnit")(countUnit.asInstanceOf[js.Any])
    if (tagPrefixList != null) __obj.updateDynamic("tagPrefixList")(tagPrefixList.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
}

