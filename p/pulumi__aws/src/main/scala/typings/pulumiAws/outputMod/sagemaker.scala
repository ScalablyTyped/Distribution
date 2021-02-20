package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sagemaker {
  
  @js.native
  trait CodeRepositoryGitConfig extends StObject {
    
    var branch: js.UndefOr[String] = js.native
    
    var repositoryUrl: String = js.native
    
    var secretArn: js.UndefOr[String] = js.native
  }
  object CodeRepositoryGitConfig {
    
    @scala.inline
    def apply(repositoryUrl: String): CodeRepositoryGitConfig = {
      val __obj = js.Dynamic.literal(repositoryUrl = repositoryUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeRepositoryGitConfig]
    }
    
    @scala.inline
    implicit class CodeRepositoryGitConfigMutableBuilder[Self <: CodeRepositoryGitConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      @scala.inline
      def setRepositoryUrl(value: String): Self = StObject.set(x, "repositoryUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretArn(value: String): Self = StObject.set(x, "secretArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretArnUndefined: Self = StObject.set(x, "secretArn", js.undefined)
    }
  }
  
  @js.native
  trait EndpointConfigurationDataCaptureConfig extends StObject {
    
    /**
      * The content type headers to capture. Fields are documented below.
      */
    var captureContentTypeHeader: js.UndefOr[EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader] = js.native
    
    /**
      * Specifies what data to capture. Fields are documented below.
      */
    var captureOptions: js.Array[EndpointConfigurationDataCaptureConfigCaptureOption] = js.native
    
    /**
      * The URL for S3 location where the captured data is stored.
      */
    var destinationS3Uri: String = js.native
    
    /**
      * Flag to enable data capture. Defaults to `false`.
      */
    var enableCapture: js.UndefOr[Boolean] = js.native
    
    /**
      * Portion of data to capture. Should be between 0 and 100.
      */
    var initialSamplingPercentage: Double = js.native
    
    /**
      * Amazon Resource Name (ARN) of a AWS Key Management Service key that Amazon SageMaker uses to encrypt the captured data on Amazon S3.
      */
    var kmsKeyId: js.UndefOr[String] = js.native
  }
  object EndpointConfigurationDataCaptureConfig {
    
    @scala.inline
    def apply(
      captureOptions: js.Array[EndpointConfigurationDataCaptureConfigCaptureOption],
      destinationS3Uri: String,
      initialSamplingPercentage: Double
    ): EndpointConfigurationDataCaptureConfig = {
      val __obj = js.Dynamic.literal(captureOptions = captureOptions.asInstanceOf[js.Any], destinationS3Uri = destinationS3Uri.asInstanceOf[js.Any], initialSamplingPercentage = initialSamplingPercentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointConfigurationDataCaptureConfig]
    }
    
    @scala.inline
    implicit class EndpointConfigurationDataCaptureConfigMutableBuilder[Self <: EndpointConfigurationDataCaptureConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaptureContentTypeHeader(value: EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader): Self = StObject.set(x, "captureContentTypeHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureContentTypeHeaderUndefined: Self = StObject.set(x, "captureContentTypeHeader", js.undefined)
      
      @scala.inline
      def setCaptureOptions(value: js.Array[EndpointConfigurationDataCaptureConfigCaptureOption]): Self = StObject.set(x, "captureOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureOptionsVarargs(value: EndpointConfigurationDataCaptureConfigCaptureOption*): Self = StObject.set(x, "captureOptions", js.Array(value :_*))
      
      @scala.inline
      def setDestinationS3Uri(value: String): Self = StObject.set(x, "destinationS3Uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCapture(value: Boolean): Self = StObject.set(x, "enableCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCaptureUndefined: Self = StObject.set(x, "enableCapture", js.undefined)
      
      @scala.inline
      def setInitialSamplingPercentage(value: Double): Self = StObject.set(x, "initialSamplingPercentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    }
  }
  
  @js.native
  trait EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader extends StObject {
    
    /**
      * The CSV content type headers to capture.
      */
    var csvContentTypes: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The JSON content type headers to capture.
      */
    var jsonContentTypes: js.UndefOr[js.Array[String]] = js.native
  }
  object EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader {
    
    @scala.inline
    def apply(): EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader]
    }
    
    @scala.inline
    implicit class EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderMutableBuilder[Self <: EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCsvContentTypes(value: js.Array[String]): Self = StObject.set(x, "csvContentTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsvContentTypesUndefined: Self = StObject.set(x, "csvContentTypes", js.undefined)
      
      @scala.inline
      def setCsvContentTypesVarargs(value: String*): Self = StObject.set(x, "csvContentTypes", js.Array(value :_*))
      
      @scala.inline
      def setJsonContentTypes(value: js.Array[String]): Self = StObject.set(x, "jsonContentTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonContentTypesUndefined: Self = StObject.set(x, "jsonContentTypes", js.undefined)
      
      @scala.inline
      def setJsonContentTypesVarargs(value: String*): Self = StObject.set(x, "jsonContentTypes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait EndpointConfigurationDataCaptureConfigCaptureOption extends StObject {
    
    /**
      * Specifies the data to be captured. Should be one of `Input` or `Output`.
      */
    var captureMode: String = js.native
  }
  object EndpointConfigurationDataCaptureConfigCaptureOption {
    
    @scala.inline
    def apply(captureMode: String): EndpointConfigurationDataCaptureConfigCaptureOption = {
      val __obj = js.Dynamic.literal(captureMode = captureMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointConfigurationDataCaptureConfigCaptureOption]
    }
    
    @scala.inline
    implicit class EndpointConfigurationDataCaptureConfigCaptureOptionMutableBuilder[Self <: EndpointConfigurationDataCaptureConfigCaptureOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaptureMode(value: String): Self = StObject.set(x, "captureMode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EndpointConfigurationProductionVariant extends StObject {
    
    /**
      * The size of the Elastic Inference (EI) instance to use for the production variant.
      */
    var acceleratorType: js.UndefOr[String] = js.native
    
    /**
      * Initial number of instances used for auto-scaling.
      */
    var initialInstanceCount: Double = js.native
    
    /**
      * Determines initial traffic distribution among all of the models that you specify in the endpoint configuration. If unspecified, it defaults to 1.0.
      */
    var initialVariantWeight: js.UndefOr[Double] = js.native
    
    /**
      * The type of instance to start.
      */
    var instanceType: String = js.native
    
    /**
      * The name of the model to use.
      */
    var modelName: String = js.native
    
    /**
      * The name of the variant. If omitted, this provider will assign a random, unique name.
      */
    var variantName: String = js.native
  }
  object EndpointConfigurationProductionVariant {
    
    @scala.inline
    def apply(initialInstanceCount: Double, instanceType: String, modelName: String, variantName: String): EndpointConfigurationProductionVariant = {
      val __obj = js.Dynamic.literal(initialInstanceCount = initialInstanceCount.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], variantName = variantName.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointConfigurationProductionVariant]
    }
    
    @scala.inline
    implicit class EndpointConfigurationProductionVariantMutableBuilder[Self <: EndpointConfigurationProductionVariant] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceleratorType(value: String): Self = StObject.set(x, "acceleratorType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceleratorTypeUndefined: Self = StObject.set(x, "acceleratorType", js.undefined)
      
      @scala.inline
      def setInitialInstanceCount(value: Double): Self = StObject.set(x, "initialInstanceCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialVariantWeight(value: Double): Self = StObject.set(x, "initialVariantWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialVariantWeightUndefined: Self = StObject.set(x, "initialVariantWeight", js.undefined)
      
      @scala.inline
      def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantName(value: String): Self = StObject.set(x, "variantName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ModelContainer extends StObject {
    
    /**
      * The DNS host name for the container.
      */
    var containerHostname: js.UndefOr[String] = js.native
    
    /**
      * Environment variables for the Docker container.
      * A list of key value pairs.
      */
    var environment: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * The registry path where the inference code image is stored in Amazon ECR.
      */
    var image: String = js.native
    
    /**
      * Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). For more information see [Using a Private Docker Registry for Real-Time Inference Containers](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-containers-inference-private.html). see Image Config.
      */
    var imageConfig: js.UndefOr[ModelContainerImageConfig] = js.native
    
    /**
      * The container hosts value `SingleModel/MultiModel`. The default value is `SingleModel`.
      */
    var mode: js.UndefOr[String] = js.native
    
    /**
      * The URL for the S3 location where model artifacts are stored.
      */
    var modelDataUrl: js.UndefOr[String] = js.native
  }
  object ModelContainer {
    
    @scala.inline
    def apply(image: String): ModelContainer = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelContainer]
    }
    
    @scala.inline
    implicit class ModelContainerMutableBuilder[Self <: ModelContainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerHostname(value: String): Self = StObject.set(x, "containerHostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerHostnameUndefined: Self = StObject.set(x, "containerHostname", js.undefined)
      
      @scala.inline
      def setEnvironment(value: StringDictionary[String]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageConfig(value: ModelContainerImageConfig): Self = StObject.set(x, "imageConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageConfigUndefined: Self = StObject.set(x, "imageConfig", js.undefined)
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setModelDataUrl(value: String): Self = StObject.set(x, "modelDataUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelDataUrlUndefined: Self = StObject.set(x, "modelDataUrl", js.undefined)
    }
  }
  
  @js.native
  trait ModelContainerImageConfig extends StObject {
    
    /**
      * Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). Allowed values are: `Platform` and `Vpc`.
      */
    var repositoryAccessMode: String = js.native
  }
  object ModelContainerImageConfig {
    
    @scala.inline
    def apply(repositoryAccessMode: String): ModelContainerImageConfig = {
      val __obj = js.Dynamic.literal(repositoryAccessMode = repositoryAccessMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelContainerImageConfig]
    }
    
    @scala.inline
    implicit class ModelContainerImageConfigMutableBuilder[Self <: ModelContainerImageConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRepositoryAccessMode(value: String): Self = StObject.set(x, "repositoryAccessMode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ModelPrimaryContainer extends StObject {
    
    /**
      * The DNS host name for the container.
      */
    var containerHostname: js.UndefOr[String] = js.native
    
    /**
      * Environment variables for the Docker container.
      * A list of key value pairs.
      */
    var environment: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * The registry path where the inference code image is stored in Amazon ECR.
      */
    var image: String = js.native
    
    /**
      * Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). For more information see [Using a Private Docker Registry for Real-Time Inference Containers](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-containers-inference-private.html). see Image Config.
      */
    var imageConfig: js.UndefOr[ModelPrimaryContainerImageConfig] = js.native
    
    /**
      * The container hosts value `SingleModel/MultiModel`. The default value is `SingleModel`.
      */
    var mode: js.UndefOr[String] = js.native
    
    /**
      * The URL for the S3 location where model artifacts are stored.
      */
    var modelDataUrl: js.UndefOr[String] = js.native
  }
  object ModelPrimaryContainer {
    
    @scala.inline
    def apply(image: String): ModelPrimaryContainer = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelPrimaryContainer]
    }
    
    @scala.inline
    implicit class ModelPrimaryContainerMutableBuilder[Self <: ModelPrimaryContainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerHostname(value: String): Self = StObject.set(x, "containerHostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerHostnameUndefined: Self = StObject.set(x, "containerHostname", js.undefined)
      
      @scala.inline
      def setEnvironment(value: StringDictionary[String]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageConfig(value: ModelPrimaryContainerImageConfig): Self = StObject.set(x, "imageConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageConfigUndefined: Self = StObject.set(x, "imageConfig", js.undefined)
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setModelDataUrl(value: String): Self = StObject.set(x, "modelDataUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelDataUrlUndefined: Self = StObject.set(x, "modelDataUrl", js.undefined)
    }
  }
  
  @js.native
  trait ModelPrimaryContainerImageConfig extends StObject {
    
    /**
      * Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). Allowed values are: `Platform` and `Vpc`.
      */
    var repositoryAccessMode: String = js.native
  }
  object ModelPrimaryContainerImageConfig {
    
    @scala.inline
    def apply(repositoryAccessMode: String): ModelPrimaryContainerImageConfig = {
      val __obj = js.Dynamic.literal(repositoryAccessMode = repositoryAccessMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelPrimaryContainerImageConfig]
    }
    
    @scala.inline
    implicit class ModelPrimaryContainerImageConfigMutableBuilder[Self <: ModelPrimaryContainerImageConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRepositoryAccessMode(value: String): Self = StObject.set(x, "repositoryAccessMode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ModelVpcConfig extends StObject {
    
    var securityGroupIds: js.Array[String] = js.native
    
    var subnets: js.Array[String] = js.native
  }
  object ModelVpcConfig {
    
    @scala.inline
    def apply(securityGroupIds: js.Array[String], subnets: js.Array[String]): ModelVpcConfig = {
      val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelVpcConfig]
    }
    
    @scala.inline
    implicit class ModelVpcConfigMutableBuilder[Self <: ModelVpcConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setSubnets(value: js.Array[String]): Self = StObject.set(x, "subnets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetsVarargs(value: String*): Self = StObject.set(x, "subnets", js.Array(value :_*))
    }
  }
}
