package typings.pulumiAws.lifecyclePolicyDocumentMod

import typings.pulumiAws.pulumiAwsStrings.any
import typings.pulumiAws.pulumiAwsStrings.imageCountMoreThan
import typings.pulumiAws.pulumiAwsStrings.sinceImagePushed
import typings.pulumiAws.pulumiAwsStrings.tagged
import typings.pulumiAws.pulumiAwsStrings.untagged
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    tagStatus: Input[tagged | untagged | any]
  ): Selection = {
    val __obj = js.Dynamic.literal(countNumber = countNumber.asInstanceOf[js.Any], countType = countType.asInstanceOf[js.Any], tagStatus = tagStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
  
  @scala.inline
  implicit class SelectionOps[Self <: Selection] (val x: Self) extends AnyVal {
    
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
    def setCountNumber(value: Input[Double]): Self = this.set("countNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountType(value: Input[imageCountMoreThan | sinceImagePushed]): Self = this.set("countType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagStatus(value: Input[tagged | untagged | any]): Self = this.set("tagStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUnit(value: Input[String]): Self = this.set("countUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountUnit: Self = this.set("countUnit", js.undefined)
    
    @scala.inline
    def setTagPrefixListVarargs(value: Input[String]*): Self = this.set("tagPrefixList", js.Array(value :_*))
    
    @scala.inline
    def setTagPrefixList(value: Input[String] | js.Array[Input[String]]): Self = this.set("tagPrefixList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagPrefixList: Self = this.set("tagPrefixList", js.undefined)
  }
}
