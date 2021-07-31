package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.sagemaker.EndpointConfigurationDataCaptureConfig
import typings.pulumiAws.outputMod.sagemaker.EndpointConfigurationProductionVariant
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endpointConfigurationMod {
  
  @JSImport("@pulumi/aws/sagemaker/endpointConfiguration", "EndpointConfiguration")
  @js.native
  class EndpointConfiguration protected () extends CustomResource {
    /**
      * Create a EndpointConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EndpointConfigurationArgs) = this()
    def this(name: String, args: EndpointConfigurationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) assigned by AWS to this endpoint configuration.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Specifies the parameters to capture input/output of Sagemaker models endpoints. Fields are documented below.
      */
    val dataCaptureConfig: Output_[js.UndefOr[EndpointConfigurationDataCaptureConfig]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of a AWS Key Management Service key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint.
      */
    val kmsKeyArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the endpoint configuration. If omitted, this provider will assign a random, unique name.
      */
    val name: Output_[String] = js.native
    
    /**
      * Fields are documented below.
      */
    val productionVariants: Output_[js.Array[EndpointConfigurationProductionVariant]] = js.native
    
    /**
      * A mapping of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object EndpointConfiguration {
    
    @JSImport("@pulumi/aws/sagemaker/endpointConfiguration", "EndpointConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing EndpointConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): EndpointConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[EndpointConfiguration]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): EndpointConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EndpointConfiguration]
    @scala.inline
    def get(name: String, id: Input[ID], state: EndpointConfigurationState): EndpointConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[EndpointConfiguration]
    @scala.inline
    def get(name: String, id: Input[ID], state: EndpointConfigurationState, opts: CustomResourceOptions): EndpointConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EndpointConfiguration]
    
    /**
      * Returns true if the given object is an instance of EndpointConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/endpointConfiguration.EndpointConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/sagemaker/endpointConfiguration.EndpointConfiguration */ Boolean]
  }
  
  trait EndpointConfigurationArgs extends StObject {
    
    /**
      * Specifies the parameters to capture input/output of Sagemaker models endpoints. Fields are documented below.
      */
    val dataCaptureConfig: js.UndefOr[
        Input[typings.pulumiAws.inputMod.sagemaker.EndpointConfigurationDataCaptureConfig]
      ] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of a AWS Key Management Service key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint.
      */
    val kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the endpoint configuration. If omitted, this provider will assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Fields are documented below.
      */
    val productionVariants: Input[
        js.Array[
          Input[typings.pulumiAws.inputMod.sagemaker.EndpointConfigurationProductionVariant]
        ]
      ]
    
    /**
      * A mapping of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object EndpointConfigurationArgs {
    
    @scala.inline
    def apply(
      productionVariants: Input[
          js.Array[
            Input[typings.pulumiAws.inputMod.sagemaker.EndpointConfigurationProductionVariant]
          ]
        ]
    ): EndpointConfigurationArgs = {
      val __obj = js.Dynamic.literal(productionVariants = productionVariants.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointConfigurationArgs]
    }
    
    @scala.inline
    implicit class EndpointConfigurationArgsMutableBuilder[Self <: EndpointConfigurationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataCaptureConfig(value: Input[typings.pulumiAws.inputMod.sagemaker.EndpointConfigurationDataCaptureConfig]): Self = StObject.set(x, "dataCaptureConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataCaptureConfigUndefined: Self = StObject.set(x, "dataCaptureConfig", js.undefined)
      
      @scala.inline
      def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProductionVariants(
        value: Input[
              js.Array[
                Input[typings.pulumiAws.inputMod.sagemaker.EndpointConfigurationProductionVariant]
              ]
            ]
      ): Self = StObject.set(x, "productionVariants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductionVariantsVarargs(value: Input[typings.pulumiAws.inputMod.sagemaker.EndpointConfigurationProductionVariant]*): Self = StObject.set(x, "productionVariants", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait EndpointConfigurationState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) assigned by AWS to this endpoint configuration.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the parameters to capture input/output of Sagemaker models endpoints. Fields are documented below.
      */
    val dataCaptureConfig: js.UndefOr[
        Input[typings.pulumiAws.inputMod.sagemaker.EndpointConfigurationDataCaptureConfig]
      ] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of a AWS Key Management Service key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint.
      */
    val kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the endpoint configuration. If omitted, this provider will assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Fields are documented below.
      */
    val productionVariants: js.UndefOr[
        Input[
          js.Array[
            Input[typings.pulumiAws.inputMod.sagemaker.EndpointConfigurationProductionVariant]
          ]
        ]
      ] = js.undefined
    
    /**
      * A mapping of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object EndpointConfigurationState {
    
    @scala.inline
    def apply(): EndpointConfigurationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointConfigurationState]
    }
    
    @scala.inline
    implicit class EndpointConfigurationStateMutableBuilder[Self <: EndpointConfigurationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDataCaptureConfig(value: Input[typings.pulumiAws.inputMod.sagemaker.EndpointConfigurationDataCaptureConfig]): Self = StObject.set(x, "dataCaptureConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataCaptureConfigUndefined: Self = StObject.set(x, "dataCaptureConfig", js.undefined)
      
      @scala.inline
      def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProductionVariants(
        value: Input[
              js.Array[
                Input[typings.pulumiAws.inputMod.sagemaker.EndpointConfigurationProductionVariant]
              ]
            ]
      ): Self = StObject.set(x, "productionVariants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductionVariantsUndefined: Self = StObject.set(x, "productionVariants", js.undefined)
      
      @scala.inline
      def setProductionVariantsVarargs(value: Input[typings.pulumiAws.inputMod.sagemaker.EndpointConfigurationProductionVariant]*): Self = StObject.set(x, "productionVariants", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
