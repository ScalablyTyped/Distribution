package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.apigatewayv2.DomainNameDomainNameConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domainNameMod {
  
  @JSImport("@pulumi/aws/apigatewayv2/domainName", "DomainName")
  @js.native
  class DomainName protected () extends CustomResource {
    /**
      * Create a DomainName resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainNameArgs) = this()
    def this(name: String, args: DomainNameArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The [API mapping selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-mapping-selection-expressions) for the domain name.
      */
    val apiMappingSelectionExpression: Output_[String] = js.native
    
    /**
      * The ARN of the domain name.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The domain name. Must be between 1 and 512 characters in length.
      */
    val domainName: Output_[String] = js.native
    
    /**
      * The domain name configuration.
      */
    val domainNameConfiguration: Output_[DomainNameDomainNameConfiguration] = js.native
    
    /**
      * A map of tags to assign to the domain name.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object DomainName {
    
    @JSImport("@pulumi/aws/apigatewayv2/domainName", "DomainName")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DomainName resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): DomainName = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[DomainName]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): DomainName = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DomainName]
    @scala.inline
    def get(name: String, id: Input[ID], state: DomainNameState): DomainName = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[DomainName]
    @scala.inline
    def get(name: String, id: Input[ID], state: DomainNameState, opts: CustomResourceOptions): DomainName = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DomainName]
    
    /**
      * Returns true if the given object is an instance of DomainName.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/domainName.DomainName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigatewayv2/domainName.DomainName */ Boolean]
  }
  
  trait DomainNameArgs extends StObject {
    
    /**
      * The domain name. Must be between 1 and 512 characters in length.
      */
    val domainName: Input[String]
    
    /**
      * The domain name configuration.
      */
    val domainNameConfiguration: Input[typings.pulumiAws.inputMod.apigatewayv2.DomainNameDomainNameConfiguration]
    
    /**
      * A map of tags to assign to the domain name.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object DomainNameArgs {
    
    @scala.inline
    def apply(
      domainName: Input[String],
      domainNameConfiguration: Input[typings.pulumiAws.inputMod.apigatewayv2.DomainNameDomainNameConfiguration]
    ): DomainNameArgs = {
      val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], domainNameConfiguration = domainNameConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainNameArgs]
    }
    
    @scala.inline
    implicit class DomainNameArgsMutableBuilder[Self <: DomainNameArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNameConfiguration(value: Input[typings.pulumiAws.inputMod.apigatewayv2.DomainNameDomainNameConfiguration]): Self = StObject.set(x, "domainNameConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait DomainNameState extends StObject {
    
    /**
      * The [API mapping selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-mapping-selection-expressions) for the domain name.
      */
    val apiMappingSelectionExpression: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the domain name.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The domain name. Must be between 1 and 512 characters in length.
      */
    val domainName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The domain name configuration.
      */
    val domainNameConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.apigatewayv2.DomainNameDomainNameConfiguration]] = js.undefined
    
    /**
      * A map of tags to assign to the domain name.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object DomainNameState {
    
    @scala.inline
    def apply(): DomainNameState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainNameState]
    }
    
    @scala.inline
    implicit class DomainNameStateMutableBuilder[Self <: DomainNameState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiMappingSelectionExpression(value: Input[String]): Self = StObject.set(x, "apiMappingSelectionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiMappingSelectionExpressionUndefined: Self = StObject.set(x, "apiMappingSelectionExpression", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNameConfiguration(value: Input[typings.pulumiAws.inputMod.apigatewayv2.DomainNameDomainNameConfiguration]): Self = StObject.set(x, "domainNameConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNameConfigurationUndefined: Self = StObject.set(x, "domainNameConfiguration", js.undefined)
      
      @scala.inline
      def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
