package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLayerVersionMod {
  
  @JSImport("@pulumi/aws/lambda/getLayerVersion", "getLayerVersion")
  @js.native
  def getLayerVersion(args: GetLayerVersionArgs): js.Promise[GetLayerVersionResult] = js.native
  @JSImport("@pulumi/aws/lambda/getLayerVersion", "getLayerVersion")
  @js.native
  def getLayerVersion(args: GetLayerVersionArgs, opts: InvokeOptions): js.Promise[GetLayerVersionResult] = js.native
  
  @js.native
  trait GetLayerVersionArgs extends StObject {
    
    /**
      * Specific runtime the layer version must support. Conflicts with `version`. If specified, the latest available layer version supporting the provided runtime will be used.
      */
    val compatibleRuntime: js.UndefOr[String] = js.native
    
    /**
      * Name of the lambda layer.
      */
    val layerName: String = js.native
    
    /**
      * Specific layer version. Conflicts with `compatibleRuntime`. If omitted, the latest available layer version will be used.
      */
    val version: js.UndefOr[Double] = js.native
  }
  object GetLayerVersionArgs {
    
    @scala.inline
    def apply(layerName: String): GetLayerVersionArgs = {
      val __obj = js.Dynamic.literal(layerName = layerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLayerVersionArgs]
    }
    
    @scala.inline
    implicit class GetLayerVersionArgsMutableBuilder[Self <: GetLayerVersionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompatibleRuntime(value: String): Self = StObject.set(x, "compatibleRuntime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompatibleRuntimeUndefined: Self = StObject.set(x, "compatibleRuntime", js.undefined)
      
      @scala.inline
      def setLayerName(value: String): Self = StObject.set(x, "layerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait GetLayerVersionResult extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the Lambda Layer with version.
      */
    val arn: String = js.native
    
    val compatibleRuntime: js.UndefOr[String] = js.native
    
    /**
      * A list of [Runtimes](https://docs.aws.amazon.com/lambda/latest/dg/API_GetLayerVersion.html#SSS-GetLayerVersion-response-CompatibleRuntimes) the specific Lambda Layer version is compatible with.
      */
    val compatibleRuntimes: js.Array[String] = js.native
    
    /**
      * The date this resource was created.
      */
    val createdDate: String = js.native
    
    /**
      * Description of the specific Lambda Layer version.
      */
    val description: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the Lambda Layer without version.
      */
    val layerArn: String = js.native
    
    val layerName: String = js.native
    
    /**
      * License info associated with the specific Lambda Layer version.
      */
    val licenseInfo: String = js.native
    
    /**
      * Base64-encoded representation of raw SHA-256 sum of the zip file.
      */
    val sourceCodeHash: String = js.native
    
    /**
      * The size in bytes of the function .zip file.
      */
    val sourceCodeSize: Double = js.native
    
    /**
      * This Lamba Layer version.
      */
    val version: Double = js.native
  }
  object GetLayerVersionResult {
    
    @scala.inline
    def apply(
      arn: String,
      compatibleRuntimes: js.Array[String],
      createdDate: String,
      description: String,
      id: String,
      layerArn: String,
      layerName: String,
      licenseInfo: String,
      sourceCodeHash: String,
      sourceCodeSize: Double,
      version: Double
    ): GetLayerVersionResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], compatibleRuntimes = compatibleRuntimes.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], layerArn = layerArn.asInstanceOf[js.Any], layerName = layerName.asInstanceOf[js.Any], licenseInfo = licenseInfo.asInstanceOf[js.Any], sourceCodeHash = sourceCodeHash.asInstanceOf[js.Any], sourceCodeSize = sourceCodeSize.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLayerVersionResult]
    }
    
    @scala.inline
    implicit class GetLayerVersionResultMutableBuilder[Self <: GetLayerVersionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompatibleRuntime(value: String): Self = StObject.set(x, "compatibleRuntime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompatibleRuntimeUndefined: Self = StObject.set(x, "compatibleRuntime", js.undefined)
      
      @scala.inline
      def setCompatibleRuntimes(value: js.Array[String]): Self = StObject.set(x, "compatibleRuntimes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompatibleRuntimesVarargs(value: String*): Self = StObject.set(x, "compatibleRuntimes", js.Array(value :_*))
      
      @scala.inline
      def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayerArn(value: String): Self = StObject.set(x, "layerArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayerName(value: String): Self = StObject.set(x, "layerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseInfo(value: String): Self = StObject.set(x, "licenseInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCodeHash(value: String): Self = StObject.set(x, "sourceCodeHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCodeSize(value: Double): Self = StObject.set(x, "sourceCodeSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
