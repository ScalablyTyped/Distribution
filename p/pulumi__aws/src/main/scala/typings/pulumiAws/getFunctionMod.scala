package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.lambda.GetFunctionDeadLetterConfig
import typings.pulumiAws.outputMod.lambda.GetFunctionEnvironment
import typings.pulumiAws.outputMod.lambda.GetFunctionFileSystemConfig
import typings.pulumiAws.outputMod.lambda.GetFunctionTracingConfig
import typings.pulumiAws.outputMod.lambda.GetFunctionVpcConfig
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getFunctionMod {
  
  @JSImport("@pulumi/aws/lambda/getFunction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getFunction(args: GetFunctionArgs): js.Promise[GetFunctionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunction")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetFunctionResult]]
  @scala.inline
  def getFunction(args: GetFunctionArgs, opts: InvokeOptions): js.Promise[GetFunctionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunction")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetFunctionResult]]
  
  trait GetFunctionArgs extends StObject {
    
    /**
      * Name of the lambda function.
      */
    val functionName: String
    
    /**
      * Alias name or version number of the lambda function. e.g. `$LATEST`, `my-alias`, or `1`
      */
    val qualifier: js.UndefOr[String] = js.undefined
    
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetFunctionArgs {
    
    @scala.inline
    def apply(functionName: String): GetFunctionArgs = {
      val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetFunctionArgs]
    }
    
    @scala.inline
    implicit class GetFunctionArgsMutableBuilder[Self <: GetFunctionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualifier(value: String): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualifierUndefined: Self = StObject.set(x, "qualifier", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetFunctionResult extends StObject {
    
    /**
      * Unqualified (no `:QUALIFIER` or `:VERSION` suffix) Amazon Resource Name (ARN) identifying your Lambda Function. See also `qualifiedArn`.
      */
    val arn: String
    
    /**
      * Configure the function's *dead letter queue*.
      */
    val deadLetterConfig: GetFunctionDeadLetterConfig
    
    /**
      * Description of what your Lambda Function does.
      */
    val description: String
    
    /**
      * The Lambda environment's configuration settings.
      */
    val environment: GetFunctionEnvironment
    
    /**
      * The connection settings for an Amazon EFS file system.
      */
    val fileSystemConfigs: js.Array[GetFunctionFileSystemConfig]
    
    val functionName: String
    
    /**
      * The function entrypoint in your code.
      */
    val handler: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The ARN to be used for invoking Lambda Function from API Gateway.
      */
    val invokeArn: String
    
    /**
      * The ARN for the KMS encryption key.
      */
    val kmsKeyArn: String
    
    /**
      * The date this resource was last modified.
      */
    val lastModified: String
    
    /**
      * A list of Lambda Layer ARNs attached to your Lambda Function.
      */
    val layers: js.Array[String]
    
    /**
      * Amount of memory in MB your Lambda Function can use at runtime.
      */
    val memorySize: Double
    
    /**
      * Qualified (`:QUALIFIER` or `:VERSION` suffix) Amazon Resource Name (ARN) identifying your Lambda Function. See also `arn`.
      */
    val qualifiedArn: String
    
    val qualifier: js.UndefOr[String] = js.undefined
    
    /**
      * The amount of reserved concurrent executions for this lambda function or `-1` if unreserved.
      */
    val reservedConcurrentExecutions: Double
    
    /**
      * IAM role attached to the Lambda Function.
      */
    val role: String
    
    /**
      * The runtime environment for the Lambda function..
      */
    val runtime: String
    
    /**
      * Base64-encoded representation of raw SHA-256 sum of the zip file.
      */
    val sourceCodeHash: String
    
    /**
      * The size in bytes of the function .zip file.
      */
    val sourceCodeSize: Double
    
    val tags: StringDictionary[String]
    
    /**
      * The function execution time at which Lambda should terminate the function.
      */
    val timeout: Double
    
    /**
      * Tracing settings of the function.
      */
    val tracingConfig: GetFunctionTracingConfig
    
    /**
      * The version of the Lambda function.
      */
    val version: String
    
    /**
      * VPC configuration associated with your Lambda function.
      */
    val vpcConfig: GetFunctionVpcConfig
  }
  object GetFunctionResult {
    
    @scala.inline
    def apply(
      arn: String,
      deadLetterConfig: GetFunctionDeadLetterConfig,
      description: String,
      environment: GetFunctionEnvironment,
      fileSystemConfigs: js.Array[GetFunctionFileSystemConfig],
      functionName: String,
      handler: String,
      id: String,
      invokeArn: String,
      kmsKeyArn: String,
      lastModified: String,
      layers: js.Array[String],
      memorySize: Double,
      qualifiedArn: String,
      reservedConcurrentExecutions: Double,
      role: String,
      runtime: String,
      sourceCodeHash: String,
      sourceCodeSize: Double,
      tags: StringDictionary[String],
      timeout: Double,
      tracingConfig: GetFunctionTracingConfig,
      version: String,
      vpcConfig: GetFunctionVpcConfig
    ): GetFunctionResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], deadLetterConfig = deadLetterConfig.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], fileSystemConfigs = fileSystemConfigs.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invokeArn = invokeArn.asInstanceOf[js.Any], kmsKeyArn = kmsKeyArn.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], memorySize = memorySize.asInstanceOf[js.Any], qualifiedArn = qualifiedArn.asInstanceOf[js.Any], reservedConcurrentExecutions = reservedConcurrentExecutions.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], sourceCodeHash = sourceCodeHash.asInstanceOf[js.Any], sourceCodeSize = sourceCodeSize.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], tracingConfig = tracingConfig.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], vpcConfig = vpcConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetFunctionResult]
    }
    
    @scala.inline
    implicit class GetFunctionResultMutableBuilder[Self <: GetFunctionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeadLetterConfig(value: GetFunctionDeadLetterConfig): Self = StObject.set(x, "deadLetterConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironment(value: GetFunctionEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSystemConfigs(value: js.Array[GetFunctionFileSystemConfig]): Self = StObject.set(x, "fileSystemConfigs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSystemConfigsVarargs(value: GetFunctionFileSystemConfig*): Self = StObject.set(x, "fileSystemConfigs", js.Array(value :_*))
      
      @scala.inline
      def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandler(value: String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvokeArn(value: String): Self = StObject.set(x, "invokeArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyArn(value: String): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value :_*))
      
      @scala.inline
      def setMemorySize(value: Double): Self = StObject.set(x, "memorySize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualifiedArn(value: String): Self = StObject.set(x, "qualifiedArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualifier(value: String): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualifierUndefined: Self = StObject.set(x, "qualifier", js.undefined)
      
      @scala.inline
      def setReservedConcurrentExecutions(value: Double): Self = StObject.set(x, "reservedConcurrentExecutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCodeHash(value: String): Self = StObject.set(x, "sourceCodeHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCodeSize(value: Double): Self = StObject.set(x, "sourceCodeSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTracingConfig(value: GetFunctionTracingConfig): Self = StObject.set(x, "tracingConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcConfig(value: GetFunctionVpcConfig): Self = StObject.set(x, "vpcConfig", value.asInstanceOf[js.Any])
    }
  }
}
