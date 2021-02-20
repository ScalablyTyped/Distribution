package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPrebuiltEcrImageMod {
  
  @JSImport("@pulumi/aws/sagemaker/getPrebuiltEcrImage", "getPrebuiltEcrImage")
  @js.native
  def getPrebuiltEcrImage(args: GetPrebuiltEcrImageArgs): js.Promise[GetPrebuiltEcrImageResult] = js.native
  @JSImport("@pulumi/aws/sagemaker/getPrebuiltEcrImage", "getPrebuiltEcrImage")
  @js.native
  def getPrebuiltEcrImage(args: GetPrebuiltEcrImageArgs, opts: InvokeOptions): js.Promise[GetPrebuiltEcrImageResult] = js.native
  
  @js.native
  trait GetPrebuiltEcrImageArgs extends StObject {
    
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
    implicit class GetPrebuiltEcrImageArgsMutableBuilder[Self <: GetPrebuiltEcrImageArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDnsSuffix(value: String): Self = StObject.set(x, "dnsSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsSuffixUndefined: Self = StObject.set(x, "dnsSuffix", js.undefined)
      
      @scala.inline
      def setImageTag(value: String): Self = StObject.set(x, "imageTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageTagUndefined: Self = StObject.set(x, "imageTag", js.undefined)
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetPrebuiltEcrImageResult extends StObject {
    
    val dnsSuffix: js.UndefOr[String] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val imageTag: js.UndefOr[String] = js.native
    
    val region: js.UndefOr[String] = js.native
    
    /**
      * The account ID containing the image. For example, `469771592824`.
      */
    val registryId: String = js.native
    
    /**
      * The Docker image URL. For example, `341280168497.dkr.ecr.ca-central-1.amazonaws.com/sagemaker-sparkml-serving:2.4`.
      */
    val registryPath: String = js.native
    
    val repositoryName: String = js.native
  }
  object GetPrebuiltEcrImageResult {
    
    @scala.inline
    def apply(id: String, registryId: String, registryPath: String, repositoryName: String): GetPrebuiltEcrImageResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], registryId = registryId.asInstanceOf[js.Any], registryPath = registryPath.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPrebuiltEcrImageResult]
    }
    
    @scala.inline
    implicit class GetPrebuiltEcrImageResultMutableBuilder[Self <: GetPrebuiltEcrImageResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDnsSuffix(value: String): Self = StObject.set(x, "dnsSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsSuffixUndefined: Self = StObject.set(x, "dnsSuffix", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageTag(value: String): Self = StObject.set(x, "imageTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageTagUndefined: Self = StObject.set(x, "imageTag", js.undefined)
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setRegistryId(value: String): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistryPath(value: String): Self = StObject.set(x, "registryPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    }
  }
}
