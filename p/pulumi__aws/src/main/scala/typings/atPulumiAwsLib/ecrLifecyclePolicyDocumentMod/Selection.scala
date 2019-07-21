package typings
package atPulumiAwsLib.ecrLifecyclePolicyDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selection extends js.Object {
  /**
    * The maximum number of images or the max age for which to apply the image selection.
    */
  var countNumber: atPulumiPulumiLib.outputMod.Input[scala.Double]
  /**
    * Indicate whether to evaluate the rule based on `imageCountMoreThan` or `sinceImagePushed`.
    */
  var countType: atPulumiPulumiLib.outputMod.Input[
    atPulumiAwsLib.atPulumiAwsLibStrings.imageCountMoreThan | atPulumiAwsLib.atPulumiAwsLibStrings.sinceImagePushed
  ]
  /**
    * The unit of time e.g. days for which to apply the selection.
    */
  var countUnit: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specify one or more image tag prefixes for selection.
    */
  var tagPrefixList: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[java.lang.String] | js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
  ] = js.undefined
  /**
    * Indicate whether to select `tagged`, `untagged` or `any` images in the repository.
    */
  var tagStatus: atPulumiPulumiLib.outputMod.Input[
    atPulumiAwsLib.atPulumiAwsLibStrings.tagged | atPulumiAwsLib.atPulumiAwsLibStrings.untagged | atPulumiAwsLib.atPulumiAwsLibStrings.any
  ]
}

object Selection {
  @scala.inline
  def apply(
    countNumber: atPulumiPulumiLib.outputMod.Input[scala.Double],
    countType: atPulumiPulumiLib.outputMod.Input[
      atPulumiAwsLib.atPulumiAwsLibStrings.imageCountMoreThan | atPulumiAwsLib.atPulumiAwsLibStrings.sinceImagePushed
    ],
    tagStatus: atPulumiPulumiLib.outputMod.Input[
      atPulumiAwsLib.atPulumiAwsLibStrings.tagged | atPulumiAwsLib.atPulumiAwsLibStrings.untagged | atPulumiAwsLib.atPulumiAwsLibStrings.any
    ],
    countUnit: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tagPrefixList: atPulumiPulumiLib.outputMod.Input[java.lang.String] | js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = null
  ): Selection = {
    val __obj = js.Dynamic.literal(countNumber = countNumber.asInstanceOf[js.Any], countType = countType.asInstanceOf[js.Any], tagStatus = tagStatus.asInstanceOf[js.Any])
    if (countUnit != null) __obj.updateDynamic("countUnit")(countUnit.asInstanceOf[js.Any])
    if (tagPrefixList != null) __obj.updateDynamic("tagPrefixList")(tagPrefixList.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
}

