package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLayerVersionMod {
  
  @JSImport("@pulumi/aws/lambda/getLayerVersion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLayerVersion(args: GetLayerVersionArgs): js.Promise[GetLayerVersionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLayerVersion")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetLayerVersionResult]]
  inline def getLayerVersion(args: GetLayerVersionArgs, opts: InvokeOptions): js.Promise[GetLayerVersionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLayerVersion")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetLayerVersionResult]]
  
  trait GetLayerVersionArgs extends StObject {
    
    /**
      * Specific runtime the layer version must support. Conflicts with `version`. If specified, the latest available layer version supporting the provided runtime will be used.
      */
    val compatibleRuntime: js.UndefOr[String] = js.undefined
    
    /**
      * Name of the lambda layer.
      */
    val layerName: String
    
    /**
      * Specific layer version. Conflicts with `compatibleRuntime`. If omitted, the latest available layer version will be used.
      */
    val version: js.UndefOr[Double] = js.undefined
  }
  object GetLayerVersionArgs {
    
    inline def apply(layerName: String): GetLayerVersionArgs = {
      val __obj = js.Dynamic.literal(layerName = layerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLayerVersionArgs]
    }
    
    extension [Self <: GetLayerVersionArgs](x: Self) {
      
      inline def setCompatibleRuntime(value: String): Self = StObject.set(x, "compatibleRuntime", value.asInstanceOf[js.Any])
      
      inline def setCompatibleRuntimeUndefined: Self = StObject.set(x, "compatibleRuntime", js.undefined)
      
      inline def setLayerName(value: String): Self = StObject.set(x, "layerName", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait GetLayerVersionResult extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the Lambda Layer with version.
      */
    val arn: String
    
    val compatibleRuntime: js.UndefOr[String] = js.undefined
    
    /**
      * A list of [Runtimes](https://docs.aws.amazon.com/lambda/latest/dg/API_GetLayerVersion.html#SSS-GetLayerVersion-response-CompatibleRuntimes) the specific Lambda Layer version is compatible with.
      */
    val compatibleRuntimes: js.Array[String]
    
    /**
      * The date this resource was created.
      */
    val createdDate: String
    
    /**
      * Description of the specific Lambda Layer version.
      */
    val description: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The Amazon Resource Name (ARN) of the Lambda Layer without version.
      */
    val layerArn: String
    
    val layerName: String
    
    /**
      * License info associated with the specific Lambda Layer version.
      */
    val licenseInfo: String
    
    /**
      * Base64-encoded representation of raw SHA-256 sum of the zip file.
      */
    val sourceCodeHash: String
    
    /**
      * The size in bytes of the function .zip file.
      */
    val sourceCodeSize: Double
    
    /**
      * This Lamba Layer version.
      */
    val version: Double
  }
  object GetLayerVersionResult {
    
    inline def apply(
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
    
    extension [Self <: GetLayerVersionResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setCompatibleRuntime(value: String): Self = StObject.set(x, "compatibleRuntime", value.asInstanceOf[js.Any])
      
      inline def setCompatibleRuntimeUndefined: Self = StObject.set(x, "compatibleRuntime", js.undefined)
      
      inline def setCompatibleRuntimes(value: js.Array[String]): Self = StObject.set(x, "compatibleRuntimes", value.asInstanceOf[js.Any])
      
      inline def setCompatibleRuntimesVarargs(value: String*): Self = StObject.set(x, "compatibleRuntimes", js.Array(value :_*))
      
      inline def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLayerArn(value: String): Self = StObject.set(x, "layerArn", value.asInstanceOf[js.Any])
      
      inline def setLayerName(value: String): Self = StObject.set(x, "layerName", value.asInstanceOf[js.Any])
      
      inline def setLicenseInfo(value: String): Self = StObject.set(x, "licenseInfo", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeHash(value: String): Self = StObject.set(x, "sourceCodeHash", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeSize(value: Double): Self = StObject.set(x, "sourceCodeSize", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
