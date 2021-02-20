package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workspacesGetImageMod {
  
  @JSImport("@pulumi/aws/workspaces/getImage", "getImage")
  @js.native
  def getImage(args: GetImageArgs): js.Promise[GetImageResult] = js.native
  @JSImport("@pulumi/aws/workspaces/getImage", "getImage")
  @js.native
  def getImage(args: GetImageArgs, opts: InvokeOptions): js.Promise[GetImageResult] = js.native
  
  @js.native
  trait GetImageArgs extends StObject {
    
    /**
      * The ID of the image.
      */
    val imageId: String = js.native
  }
  object GetImageArgs {
    
    @scala.inline
    def apply(imageId: String): GetImageArgs = {
      val __obj = js.Dynamic.literal(imageId = imageId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetImageArgs]
    }
    
    @scala.inline
    implicit class GetImageArgsMutableBuilder[Self <: GetImageArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageId(value: String): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetImageResult extends StObject {
    
    /**
      * The description of the image.
      */
    val description: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val imageId: String = js.native
    
    /**
      * The name of the image.
      */
    val name: String = js.native
    
    val operatingSystemType: String = js.native
    
    /**
      * Specifies whether the image is running on dedicated hardware. When Bring Your Own License (BYOL) is enabled, this value is set to DEDICATED. For more information, see [Bring Your Own Windows Desktop Images](https://docs.aws.amazon.com/workspaces/latest/adminguide/byol-windows-images.html).
      */
    val requiredTenancy: String = js.native
    
    /**
      * The status of the image.
      */
    val state: String = js.native
  }
  object GetImageResult {
    
    @scala.inline
    def apply(
      description: String,
      id: String,
      imageId: String,
      name: String,
      operatingSystemType: String,
      requiredTenancy: String,
      state: String
    ): GetImageResult = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imageId = imageId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operatingSystemType = operatingSystemType.asInstanceOf[js.Any], requiredTenancy = requiredTenancy.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetImageResult]
    }
    
    @scala.inline
    implicit class GetImageResultMutableBuilder[Self <: GetImageResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageId(value: String): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperatingSystemType(value: String): Self = StObject.set(x, "operatingSystemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredTenancy(value: String): Self = StObject.set(x, "requiredTenancy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
