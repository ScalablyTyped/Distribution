package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getImageMod {
  
  @JSImport("@pulumi/aws/ecr/getImage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getImage(args: GetImageArgs): js.Promise[GetImageResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getImage")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetImageResult]]
  inline def getImage(args: GetImageArgs, opts: InvokeOptions): js.Promise[GetImageResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImage")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetImageResult]]
  
  trait GetImageArgs extends StObject {
    
    /**
      * The sha256 digest of the image manifest. At least one of `imageDigest` or `imageTag` must be specified.
      */
    val imageDigest: js.UndefOr[String] = js.undefined
    
    /**
      * The tag associated with this image. At least one of `imageDigest` or `imageTag` must be specified.
      */
    val imageTag: js.UndefOr[String] = js.undefined
    
    /**
      * The ID of the Registry where the repository resides.
      */
    val registryId: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the ECR Repository.
      */
    val repositoryName: String
  }
  object GetImageArgs {
    
    inline def apply(repositoryName: String): GetImageArgs = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetImageArgs]
    }
    
    extension [Self <: GetImageArgs](x: Self) {
      
      inline def setImageDigest(value: String): Self = StObject.set(x, "imageDigest", value.asInstanceOf[js.Any])
      
      inline def setImageDigestUndefined: Self = StObject.set(x, "imageDigest", js.undefined)
      
      inline def setImageTag(value: String): Self = StObject.set(x, "imageTag", value.asInstanceOf[js.Any])
      
      inline def setImageTagUndefined: Self = StObject.set(x, "imageTag", js.undefined)
      
      inline def setRegistryId(value: String): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
      
      inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
      
      inline def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetImageResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val imageDigest: String
    
    /**
      * The date and time, expressed as a unix timestamp, at which the current image was pushed to the repository.
      */
    val imagePushedAt: Double
    
    /**
      * The size, in bytes, of the image in the repository.
      */
    val imageSizeInBytes: Double
    
    val imageTag: js.UndefOr[String] = js.undefined
    
    /**
      * The list of tags associated with this image.
      */
    val imageTags: js.Array[String]
    
    val registryId: String
    
    val repositoryName: String
  }
  object GetImageResult {
    
    inline def apply(
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
    
    extension [Self <: GetImageResult](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImageDigest(value: String): Self = StObject.set(x, "imageDigest", value.asInstanceOf[js.Any])
      
      inline def setImagePushedAt(value: Double): Self = StObject.set(x, "imagePushedAt", value.asInstanceOf[js.Any])
      
      inline def setImageSizeInBytes(value: Double): Self = StObject.set(x, "imageSizeInBytes", value.asInstanceOf[js.Any])
      
      inline def setImageTag(value: String): Self = StObject.set(x, "imageTag", value.asInstanceOf[js.Any])
      
      inline def setImageTagUndefined: Self = StObject.set(x, "imageTag", js.undefined)
      
      inline def setImageTags(value: js.Array[String]): Self = StObject.set(x, "imageTags", value.asInstanceOf[js.Any])
      
      inline def setImageTagsVarargs(value: String*): Self = StObject.set(x, "imageTags", js.Array(value :_*))
      
      inline def setRegistryId(value: String): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
      
      inline def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    }
  }
}
