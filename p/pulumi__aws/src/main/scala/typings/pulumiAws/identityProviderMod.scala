package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identityProviderMod {
  
  @JSImport("@pulumi/aws/cognito/identityProvider", "IdentityProvider")
  @js.native
  class IdentityProvider protected () extends CustomResource {
    /**
      * Create a IdentityProvider resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IdentityProviderArgs) = this()
    def this(name: String, args: IdentityProviderArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The map of attribute mapping of user pool attributes. [AttributeMapping in AWS API documentation](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-AttributeMapping)
      */
    val attributeMapping: Output_[StringDictionary[String]] = js.native
    
    /**
      * The list of identity providers.
      */
    val idpIdentifiers: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The map of identity details, such as access token
      */
    val providerDetails: Output_[StringDictionary[String]] = js.native
    
    /**
      * The provider name
      */
    val providerName: Output_[String] = js.native
    
    /**
      * The provider type.  [See AWS API for valid values](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-ProviderType)
      */
    val providerType: Output_[String] = js.native
    
    /**
      * The user pool id
      */
    val userPoolId: Output_[String] = js.native
  }
  /* static members */
  object IdentityProvider {
    
    @JSImport("@pulumi/aws/cognito/identityProvider", "IdentityProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing IdentityProvider resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): IdentityProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[IdentityProvider]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): IdentityProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IdentityProvider]
    @scala.inline
    def get(name: String, id: Input[ID], state: IdentityProviderState): IdentityProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[IdentityProvider]
    @scala.inline
    def get(name: String, id: Input[ID], state: IdentityProviderState, opts: CustomResourceOptions): IdentityProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IdentityProvider]
    
    /**
      * Returns true if the given object is an instance of IdentityProvider.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/identityProvider.IdentityProvider */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cognito/identityProvider.IdentityProvider */ Boolean]
  }
  
  trait IdentityProviderArgs extends StObject {
    
    /**
      * The map of attribute mapping of user pool attributes. [AttributeMapping in AWS API documentation](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-AttributeMapping)
      */
    val attributeMapping: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The list of identity providers.
      */
    val idpIdentifiers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The map of identity details, such as access token
      */
    val providerDetails: Input[StringDictionary[Input[String]]]
    
    /**
      * The provider name
      */
    val providerName: Input[String]
    
    /**
      * The provider type.  [See AWS API for valid values](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-ProviderType)
      */
    val providerType: Input[String]
    
    /**
      * The user pool id
      */
    val userPoolId: Input[String]
  }
  object IdentityProviderArgs {
    
    @scala.inline
    def apply(
      providerDetails: Input[StringDictionary[Input[String]]],
      providerName: Input[String],
      providerType: Input[String],
      userPoolId: Input[String]
    ): IdentityProviderArgs = {
      val __obj = js.Dynamic.literal(providerDetails = providerDetails.asInstanceOf[js.Any], providerName = providerName.asInstanceOf[js.Any], providerType = providerType.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentityProviderArgs]
    }
    
    @scala.inline
    implicit class IdentityProviderArgsMutableBuilder[Self <: IdentityProviderArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeMapping(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "attributeMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeMappingUndefined: Self = StObject.set(x, "attributeMapping", js.undefined)
      
      @scala.inline
      def setIdpIdentifiers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "idpIdentifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdpIdentifiersUndefined: Self = StObject.set(x, "idpIdentifiers", js.undefined)
      
      @scala.inline
      def setIdpIdentifiersVarargs(value: Input[String]*): Self = StObject.set(x, "idpIdentifiers", js.Array(value :_*))
      
      @scala.inline
      def setProviderDetails(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "providerDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderName(value: Input[String]): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderType(value: Input[String]): Self = StObject.set(x, "providerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPoolId(value: Input[String]): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
    }
  }
  
  trait IdentityProviderState extends StObject {
    
    /**
      * The map of attribute mapping of user pool attributes. [AttributeMapping in AWS API documentation](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-AttributeMapping)
      */
    val attributeMapping: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The list of identity providers.
      */
    val idpIdentifiers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The map of identity details, such as access token
      */
    val providerDetails: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The provider name
      */
    val providerName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The provider type.  [See AWS API for valid values](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-ProviderType)
      */
    val providerType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The user pool id
      */
    val userPoolId: js.UndefOr[Input[String]] = js.undefined
  }
  object IdentityProviderState {
    
    @scala.inline
    def apply(): IdentityProviderState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IdentityProviderState]
    }
    
    @scala.inline
    implicit class IdentityProviderStateMutableBuilder[Self <: IdentityProviderState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeMapping(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "attributeMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeMappingUndefined: Self = StObject.set(x, "attributeMapping", js.undefined)
      
      @scala.inline
      def setIdpIdentifiers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "idpIdentifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdpIdentifiersUndefined: Self = StObject.set(x, "idpIdentifiers", js.undefined)
      
      @scala.inline
      def setIdpIdentifiersVarargs(value: Input[String]*): Self = StObject.set(x, "idpIdentifiers", js.Array(value :_*))
      
      @scala.inline
      def setProviderDetails(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "providerDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderDetailsUndefined: Self = StObject.set(x, "providerDetails", js.undefined)
      
      @scala.inline
      def setProviderName(value: Input[String]): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderNameUndefined: Self = StObject.set(x, "providerName", js.undefined)
      
      @scala.inline
      def setProviderType(value: Input[String]): Self = StObject.set(x, "providerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderTypeUndefined: Self = StObject.set(x, "providerType", js.undefined)
      
      @scala.inline
      def setUserPoolId(value: Input[String]): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPoolIdUndefined: Self = StObject.set(x, "userPoolId", js.undefined)
    }
  }
}
