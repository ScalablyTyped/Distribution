package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getImageMod {
  
  @JSImport("@pulumi/aws/ecr/getImage", "getImage")
  @js.native
  def getImage(args: GetImageArgs): js.Promise[GetImageResult] = js.native
  @JSImport("@pulumi/aws/ecr/getImage", "getImage")
  @js.native
  def getImage(args: GetImageArgs, opts: InvokeOptions): js.Promise[GetImageResult] = js.native
  
  @js.native
  trait GetImageArgs extends StObject {
    
    /**
      * The sha256 digest of the image manifest. At least one of `imageDigest` or `imageTag` must be specified.
      */
    val imageDigest: js.UndefOr[String] = js.native
    
    /**
      * The tag associated with this image. At least one of `imageDigest` or `imageTag` must be specified.
      */
    val imageTag: js.UndefOr[String] = js.native
    
    /**
      * The ID of the Registry where the repository resides.
      */
    val registryId: js.UndefOr[String] = js.native
    
    /**
      * The name of the ECR Repository.
      */
    val repositoryName: String = js.native
  }
  object GetImageArgs {
    
    @scala.inline
    def apply(repositoryName: String): GetImageArgs = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetImageArgs]
    }
    
    @scala.inline
    implicit class GetImageArgsMutableBuilder[Self <: GetImageArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageDigest(value: String): Self = StObject.set(x, "imageDigest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageDigestUndefined: Self = StObject.set(x, "imageDigest", js.undefined)
      
      @scala.inline
      def setImageTag(value: String): Self = StObject.set(x, "imageTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageTagUndefined: Self = StObject.set(x, "imageTag", js.undefined)
      
      @scala.inline
      def setRegistryId(value: String): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
      
      @scala.inline
      def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetImageResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val imageDigest: String = js.native
    
    /**
      * The date and time, expressed as a unix timestamp, at which the current image was pushed to the repository.
      */
    val imagePushedAt: Double = js.native
    
    /**
      * The size, in bytes, of the image in the repository.
      */
    val imageSizeInBytes: Double = js.native
    
    val imageTag: js.UndefOr[String] = js.native
    
    /**
      * The list of tags associated with this image.
      */
    val imageTags: js.Array[String] = js.native
    
    val registryId: String = js.native
    
    val repositoryName: String = js.native
  }
  object GetImageResult {
    
    @scala.inline
    def apply(
      id: String,
      imageDigest: String,
      imagePushedAt: Double,
      imageSizeInBytes: Double,
      imageTags: js.Array[String],
      registryId: String,
      repositoryName: String
    ): GetImageResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], imageDigest = imageDigest.asInstanceOf[js.Any], imagePushedAt = imagePushedAt.asInstanceOf[js.Any], imageSizeInBytes = imageSizeInBytes.asInstanceOf[js.Any], imageTags = imageTags.asInstanceOf[js.Any], registryId = registryId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetImageResult]
    }
    
    @scala.inline
    implicit class GetImageResultMutableBuilder[Self <: GetImageResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageDigest(value: String): Self = StObject.set(x, "imageDigest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagePushedAt(value: Double): Self = StObject.set(x, "imagePushedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSizeInBytes(value: Double): Self = StObject.set(x, "imageSizeInBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageTag(value: String): Self = StObject.set(x, "imageTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageTagUndefined: Self = StObject.set(x, "imageTag", js.undefined)
      
      @scala.inline
      def setImageTags(value: js.Array[String]): Self = StObject.set(x, "imageTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageTagsVarargs(value: String*): Self = StObject.set(x, "imageTags", js.Array(value :_*))
      
      @scala.inline
      def setRegistryId(value: String): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    }
  }
}
