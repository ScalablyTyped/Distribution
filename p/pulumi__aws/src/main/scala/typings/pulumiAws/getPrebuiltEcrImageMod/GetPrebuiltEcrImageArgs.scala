package typings.pulumiAws.getPrebuiltEcrImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPrebuiltEcrImageArgs extends js.Object {
  
  /**
    * The DNS suffix to use in the registry path. If not specified, the AWS provider sets it to the DNS suffix for the current region.
    */
  val dnsSuffix: js.UndefOr[String] = js.native
  
  /**
    * The image tag for the Docker image. If not specified, the AWS provider sets the value to `1`, which for many repositories indicates the latest version. Some repositories, such as XGBoost, do not support `1` or `latest` and specific version must be used.
    */
  val imageTag: js.UndefOr[String] = js.native
  
  /**
    * The region to use in the registry path. If not specified, the AWS provider sets it to the current region.
    */
  val region: js.UndefOr[String] = js.native
  
  /**
    * The name of the repository, which is generally the algorithm or library. Values include `blazingtext`, `factorization-machines`, `forecasting-deepar`, `image-classification`, `ipinsights`, `kmeans`, `knn`, `lda`, `linear-learner`, `mxnet-inference-eia`, `mxnet-inference`, `mxnet-training`, `ntm`, `object-detection`, `object2vec`, `pca`, `pytorch-inference-eia`, `pytorch-inference`, `pytorch-training`, `randomcutforest`, `sagemaker-scikit-learn`, `sagemaker-sparkml-serving`, `sagemaker-xgboost`, `semantic-segmentation`, `seq2seq`, `tensorflow-inference-eia`, `tensorflow-inference`, and `tensorflow-training`.
    */
  val repositoryName: String = js.native
}
object GetPrebuiltEcrImageArgs {
  
  @scala.inline
  def apply(repositoryName: String): GetPrebuiltEcrImageArgs = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPrebuiltEcrImageArgs]
  }
  
  @scala.inline
  implicit class GetPrebuiltEcrImageArgsOps[Self <: GetPrebuiltEcrImageArgs] (val x: Self) extends AnyVal {
    
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
    def setRepositoryName(value: String): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsSuffix(value: String): Self = this.set("dnsSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsSuffix: Self = this.set("dnsSuffix", js.undefined)
    
    @scala.inline
    def setImageTag(value: String): Self = this.set("imageTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageTag: Self = this.set("imageTag", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
}
