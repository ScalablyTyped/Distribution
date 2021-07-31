package typings.pulumiAws.inputMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sagemaker {
  
  trait CodeRepositoryGitConfig extends StObject {
    
    var branch: js.UndefOr[Input[String]] = js.undefined
    
    var repositoryUrl: Input[String]
    
    var secretArn: js.UndefOr[Input[String]] = js.undefined
  }
  object CodeRepositoryGitConfig {
    
    @scala.inline
    def apply(repositoryUrl: Input[String]): CodeRepositoryGitConfig = {
      val __obj = js.Dynamic.literal(repositoryUrl = repositoryUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeRepositoryGitConfig]
    }
    
    @scala.inline
    implicit class CodeRepositoryGitConfigMutableBuilder[Self <: CodeRepositoryGitConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBranch(value: Input[String]): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      @scala.inline
      def setRepositoryUrl(value: Input[String]): Self = StObject.set(x, "repositoryUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretArn(value: Input[String]): Self = StObject.set(x, "secretArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretArnUndefined: Self = StObject.set(x, "secretArn", js.undefined)
    }
  }
  
  trait EndpointConfigurationDataCaptureConfig extends StObject {
    
    /**
      * The content type headers to capture. Fields are documented below.
      */
    var captureContentTypeHeader: js.UndefOr[Input[EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader]] = js.undefined
    
    /**
      * Specifies what data to capture. Fields are documented below.
      */
    var captureOptions: Input[js.Array[Input[EndpointConfigurationDataCaptureConfigCaptureOption]]]
    
    /**
      * The URL for S3 location where the captured data is stored.
      */
    var destinationS3Uri: Input[String]
    
    /**
      * Flag to enable data capture. Defaults to `false`.
      */
    var enableCapture: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Portion of data to capture. Should be between 0 and 100.
      */
    var initialSamplingPercentage: Input[Double]
    
    /**
      * Amazon Resource Name (ARN) of a AWS Key Management Service key that Amazon SageMaker uses to encrypt the captured data on Amazon S3.
      */
    var kmsKeyId: js.UndefOr[Input[String]] = js.undefined
  }
  object EndpointConfigurationDataCaptureConfig {
    
    @scala.inline
    def apply(
      captureOptions: Input[js.Array[Input[EndpointConfigurationDataCaptureConfigCaptureOption]]],
      destinationS3Uri: Input[String],
      initialSamplingPercentage: Input[Double]
    ): EndpointConfigurationDataCaptureConfig = {
      val __obj = js.Dynamic.literal(captureOptions = captureOptions.asInstanceOf[js.Any], destinationS3Uri = destinationS3Uri.asInstanceOf[js.Any], initialSamplingPercentage = initialSamplingPercentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointConfigurationDataCaptureConfig]
    }
    
    @scala.inline
    implicit class EndpointConfigurationDataCaptureConfigMutableBuilder[Self <: EndpointConfigurationDataCaptureConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaptureContentTypeHeader(value: Input[EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader]): Self = StObject.set(x, "captureContentTypeHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureContentTypeHeaderUndefined: Self = StObject.set(x, "captureContentTypeHeader", js.undefined)
      
      @scala.inline
      def setCaptureOptions(value: Input[js.Array[Input[EndpointConfigurationDataCaptureConfigCaptureOption]]]): Self = StObject.set(x, "captureOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureOptionsVarargs(value: Input[EndpointConfigurationDataCaptureConfigCaptureOption]*): Self = StObject.set(x, "captureOptions", js.Array(value :_*))
      
      @scala.inline
      def setDestinationS3Uri(value: Input[String]): Self = StObject.set(x, "destinationS3Uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCapture(value: Input[Boolean]): Self = StObject.set(x, "enableCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCaptureUndefined: Self = StObject.set(x, "enableCapture", js.undefined)
      
      @scala.inline
      def setInitialSamplingPercentage(value: Input[Double]): Self = StObject.set(x, "initialSamplingPercentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    }
  }
  
  trait EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader extends StObject {
    
    /**
      * The CSV content type headers to capture.
      */
    var csvContentTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The JSON content type headers to capture.
      */
    var jsonContentTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
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
      def setCsvContentTypes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "csvContentTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsvContentTypesUndefined: Self = StObject.set(x, "csvContentTypes", js.undefined)
      
      @scala.inline
      def setCsvContentTypesVarargs(value: Input[String]*): Self = StObject.set(x, "csvContentTypes", js.Array(value :_*))
      
      @scala.inline
      def setJsonContentTypes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "jsonContentTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonContentTypesUndefined: Self = StObject.set(x, "jsonContentTypes", js.undefined)
      
      @scala.inline
      def setJsonContentTypesVarargs(value: Input[String]*): Self = StObject.set(x, "jsonContentTypes", js.Array(value :_*))
    }
  }
  
  trait EndpointConfigurationDataCaptureConfigCaptureOption extends StObject {
    
    /**
      * Specifies the data to be captured. Should be one of `Input` or `Output`.
      */
    var captureMode: Input[String]
  }
  object EndpointConfigurationDataCaptureConfigCaptureOption {
    
    @scala.inline
    def apply(captureMode: Input[String]): EndpointConfigurationDataCaptureConfigCaptureOption = {
      val __obj = js.Dynamic.literal(captureMode = captureMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointConfigurationDataCaptureConfigCaptureOption]
    }
    
    @scala.inline
    implicit class EndpointConfigurationDataCaptureConfigCaptureOptionMutableBuilder[Self <: EndpointConfigurationDataCaptureConfigCaptureOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaptureMode(value: Input[String]): Self = StObject.set(x, "captureMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndpointConfigurationProductionVariant extends StObject {
    
    /**
      * The size of the Elastic Inference (EI) instance to use for the production variant.
      */
    var acceleratorType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Initial number of instances used for auto-scaling.
      */
    var initialInstanceCount: Input[Double]
    
    /**
      * Determines initial traffic distribution among all of the models that you specify in the endpoint configuration. If unspecified, it defaults to 1.0.
      */
    var initialVariantWeight: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The type of instance to start.
      */
    var instanceType: Input[String]
    
    /**
      * The name of the model to use.
      */
    var modelName: Input[String]
    
    /**
      * The name of the variant. If omitted, this provider will assign a random, unique name.
      */
    var variantName: js.UndefOr[Input[String]] = js.undefined
  }
  object EndpointConfigurationProductionVariant {
    
    @scala.inline
    def apply(initialInstanceCount: Input[Double], instanceType: Input[String], modelName: Input[String]): EndpointConfigurationProductionVariant = {
      val __obj = js.Dynamic.literal(initialInstanceCount = initialInstanceCount.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointConfigurationProductionVariant]
    }
    
    @scala.inline
    implicit class EndpointConfigurationProductionVariantMutableBuilder[Self <: EndpointConfigurationProductionVariant] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceleratorType(value: Input[String]): Self = StObject.set(x, "acceleratorType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceleratorTypeUndefined: Self = StObject.set(x, "acceleratorType", js.undefined)
      
      @scala.inline
      def setInitialInstanceCount(value: Input[Double]): Self = StObject.set(x, "initialInstanceCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialVariantWeight(value: Input[Double]): Self = StObject.set(x, "initialVariantWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialVariantWeightUndefined: Self = StObject.set(x, "initialVariantWeight", js.undefined)
      
      @scala.inline
      def setInstanceType(value: Input[String]): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelName(value: Input[String]): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantName(value: Input[String]): Self = StObject.set(x, "variantName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantNameUndefined: Self = StObject.set(x, "variantName", js.undefined)
    }
  }
  
  trait ModelContainer extends StObject {
    
    /**
      * The DNS host name for the container.
      */
    var containerHostname: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Environment variables for the Docker container.
      * A list of key value pairs.
      */
    var environment: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The registry path where the inference code image is stored in Amazon ECR.
      */
    var image: Input[String]
    
    /**
      * Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). For more information see [Using a Private Docker Registry for Real-Time Inference Containers](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-containers-inference-private.html). see Image Config.
      */
    var imageConfig: js.UndefOr[Input[ModelContainerImageConfig]] = js.undefined
    
    /**
      * The container hosts value `SingleModel/MultiModel`. The default value is `SingleModel`.
      */
    var mode: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The URL for the S3 location where model artifacts are stored.
      */
    var modelDataUrl: js.UndefOr[Input[String]] = js.undefined
  }
  object ModelContainer {
    
    @scala.inline
    def apply(image: Input[String]): ModelContainer = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelContainer]
    }
    
    @scala.inline
    implicit class ModelContainerMutableBuilder[Self <: ModelContainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerHostname(value: Input[String]): Self = StObject.set(x, "containerHostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerHostnameUndefined: Self = StObject.set(x, "containerHostname", js.undefined)
      
      @scala.inline
      def setEnvironment(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      @scala.inline
      def setImage(value: Input[String]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageConfig(value: Input[ModelContainerImageConfig]): Self = StObject.set(x, "imageConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageConfigUndefined: Self = StObject.set(x, "imageConfig", js.undefined)
      
      @scala.inline
      def setMode(value: Input[String]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setModelDataUrl(value: Input[String]): Self = StObject.set(x, "modelDataUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelDataUrlUndefined: Self = StObject.set(x, "modelDataUrl", js.undefined)
    }
  }
  
  trait ModelContainerImageConfig extends StObject {
    
    /**
      * Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). Allowed values are: `Platform` and `Vpc`.
      */
    var repositoryAccessMode: Input[String]
  }
  object ModelContainerImageConfig {
    
    @scala.inline
    def apply(repositoryAccessMode: Input[String]): ModelContainerImageConfig = {
      val __obj = js.Dynamic.literal(repositoryAccessMode = repositoryAccessMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelContainerImageConfig]
    }
    
    @scala.inline
    implicit class ModelContainerImageConfigMutableBuilder[Self <: ModelContainerImageConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRepositoryAccessMode(value: Input[String]): Self = StObject.set(x, "repositoryAccessMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModelPrimaryContainer extends StObject {
    
    /**
      * The DNS host name for the container.
      */
    var containerHostname: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Environment variables for the Docker container.
      * A list of key value pairs.
      */
    var environment: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The registry path where the inference code image is stored in Amazon ECR.
      */
    var image: Input[String]
    
    /**
      * Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). For more information see [Using a Private Docker Registry for Real-Time Inference Containers](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-containers-inference-private.html). see Image Config.
      */
    var imageConfig: js.UndefOr[Input[ModelPrimaryContainerImageConfig]] = js.undefined
    
    /**
      * The container hosts value `SingleModel/MultiModel`. The default value is `SingleModel`.
      */
    var mode: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The URL for the S3 location where model artifacts are stored.
      */
    var modelDataUrl: js.UndefOr[Input[String]] = js.undefined
  }
  object ModelPrimaryContainer {
    
    @scala.inline
    def apply(image: Input[String]): ModelPrimaryContainer = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelPrimaryContainer]
    }
    
    @scala.inline
    implicit class ModelPrimaryContainerMutableBuilder[Self <: ModelPrimaryContainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerHostname(value: Input[String]): Self = StObject.set(x, "containerHostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerHostnameUndefined: Self = StObject.set(x, "containerHostname", js.undefined)
      
      @scala.inline
      def setEnvironment(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      @scala.inline
      def setImage(value: Input[String]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageConfig(value: Input[ModelPrimaryContainerImageConfig]): Self = StObject.set(x, "imageConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageConfigUndefined: Self = StObject.set(x, "imageConfig", js.undefined)
      
      @scala.inline
      def setMode(value: Input[String]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setModelDataUrl(value: Input[String]): Self = StObject.set(x, "modelDataUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelDataUrlUndefined: Self = StObject.set(x, "modelDataUrl", js.undefined)
    }
  }
  
  trait ModelPrimaryContainerImageConfig extends StObject {
    
    /**
      * Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). Allowed values are: `Platform` and `Vpc`.
      */
    var repositoryAccessMode: Input[String]
  }
  object ModelPrimaryContainerImageConfig {
    
    @scala.inline
    def apply(repositoryAccessMode: Input[String]): ModelPrimaryContainerImageConfig = {
      val __obj = js.Dynamic.literal(repositoryAccessMode = repositoryAccessMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelPrimaryContainerImageConfig]
    }
    
    @scala.inline
    implicit class ModelPrimaryContainerImageConfigMutableBuilder[Self <: ModelPrimaryContainerImageConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRepositoryAccessMode(value: Input[String]): Self = StObject.set(x, "repositoryAccessMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModelVpcConfig extends StObject {
    
    var securityGroupIds: Input[js.Array[Input[String]]]
    
    var subnets: Input[js.Array[Input[String]]]
  }
  object ModelVpcConfig {
    
    @scala.inline
    def apply(securityGroupIds: Input[js.Array[Input[String]]], subnets: Input[js.Array[Input[String]]]): ModelVpcConfig = {
      val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelVpcConfig]
    }
    
    @scala.inline
    implicit class ModelVpcConfigMutableBuilder[Self <: ModelVpcConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setSubnets(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetsVarargs(value: Input[String]*): Self = StObject.set(x, "subnets", js.Array(value :_*))
    }
  }
}
