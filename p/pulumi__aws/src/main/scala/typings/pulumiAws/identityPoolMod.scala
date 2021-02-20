package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.cognito.IdentityPoolCognitoIdentityProvider
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identityPoolMod {
  
  @JSImport("@pulumi/aws/cognito/identityPool", "IdentityPool")
  @js.native
  class IdentityPool protected () extends CustomResource {
    /**
      * Create a IdentityPool resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IdentityPoolArgs) = this()
    def this(name: String, args: IdentityPoolArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Whether the identity pool supports unauthenticated logins or not.
      */
    val allowUnauthenticatedIdentities: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The ARN of the identity pool.
      */
    val arn: Output_[String] = js.native
    
    /**
      * An array of Amazon Cognito Identity user pools and their client IDs.
      */
    val cognitoIdentityProviders: Output_[js.UndefOr[js.Array[IdentityPoolCognitoIdentityProvider]]] = js.native
    
    /**
      * The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your
      * backend and the Cognito service to communicate about the developer provider.
      */
    val developerProviderName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The Cognito Identity Pool name.
      */
    val identityPoolName: Output_[String] = js.native
    
    /**
      * Set of OpendID Connect provider ARNs.
      */
    val openidConnectProviderArns: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * An array of Amazon Resource Names (ARNs) of the SAML provider for your identity.
      */
    val samlProviderArns: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Key-Value pairs mapping provider names to provider app IDs.
      */
    val supportedLoginProviders: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * A map of tags to assign to the Identity Pool.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object IdentityPool {
    
    /**
      * Get an existing IdentityPool resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cognito/identityPool", "IdentityPool.get")
    @js.native
    def get(name: String, id: Input[ID]): IdentityPool = js.native
    @JSImport("@pulumi/aws/cognito/identityPool", "IdentityPool.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): IdentityPool = js.native
    @JSImport("@pulumi/aws/cognito/identityPool", "IdentityPool.get")
    @js.native
    def get(name: String, id: Input[ID], state: IdentityPoolState): IdentityPool = js.native
    @JSImport("@pulumi/aws/cognito/identityPool", "IdentityPool.get")
    @js.native
    def get(name: String, id: Input[ID], state: IdentityPoolState, opts: CustomResourceOptions): IdentityPool = js.native
    
    /**
      * Returns true if the given object is an instance of IdentityPool.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cognito/identityPool", "IdentityPool.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/identityPool.IdentityPool */ Boolean = js.native
  }
  
  @js.native
  trait IdentityPoolArgs extends StObject {
    
    /**
      * Whether the identity pool supports unauthenticated logins or not.
      */
    val allowUnauthenticatedIdentities: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * An array of Amazon Cognito Identity user pools and their client IDs.
      */
    val cognitoIdentityProviders: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.cognito.IdentityPoolCognitoIdentityProvider]]
        ]
      ] = js.native
    
    /**
      * The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your
      * backend and the Cognito service to communicate about the developer provider.
      */
    val developerProviderName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Cognito Identity Pool name.
      */
    val identityPoolName: Input[String] = js.native
    
    /**
      * Set of OpendID Connect provider ARNs.
      */
    val openidConnectProviderArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * An array of Amazon Resource Names (ARNs) of the SAML provider for your identity.
      */
    val samlProviderArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Key-Value pairs mapping provider names to provider app IDs.
      */
    val supportedLoginProviders: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * A map of tags to assign to the Identity Pool.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object IdentityPoolArgs {
    
    @scala.inline
    def apply(identityPoolName: Input[String]): IdentityPoolArgs = {
      val __obj = js.Dynamic.literal(identityPoolName = identityPoolName.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentityPoolArgs]
    }
    
    @scala.inline
    implicit class IdentityPoolArgsMutableBuilder[Self <: IdentityPoolArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowUnauthenticatedIdentities(value: Input[Boolean]): Self = StObject.set(x, "allowUnauthenticatedIdentities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUnauthenticatedIdentitiesUndefined: Self = StObject.set(x, "allowUnauthenticatedIdentities", js.undefined)
      
      @scala.inline
      def setCognitoIdentityProviders(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.cognito.IdentityPoolCognitoIdentityProvider]]
            ]
      ): Self = StObject.set(x, "cognitoIdentityProviders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCognitoIdentityProvidersUndefined: Self = StObject.set(x, "cognitoIdentityProviders", js.undefined)
      
      @scala.inline
      def setCognitoIdentityProvidersVarargs(value: Input[typings.pulumiAws.inputMod.cognito.IdentityPoolCognitoIdentityProvider]*): Self = StObject.set(x, "cognitoIdentityProviders", js.Array(value :_*))
      
      @scala.inline
      def setDeveloperProviderName(value: Input[String]): Self = StObject.set(x, "developerProviderName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeveloperProviderNameUndefined: Self = StObject.set(x, "developerProviderName", js.undefined)
      
      @scala.inline
      def setIdentityPoolName(value: Input[String]): Self = StObject.set(x, "identityPoolName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenidConnectProviderArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "openidConnectProviderArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenidConnectProviderArnsUndefined: Self = StObject.set(x, "openidConnectProviderArns", js.undefined)
      
      @scala.inline
      def setOpenidConnectProviderArnsVarargs(value: Input[String]*): Self = StObject.set(x, "openidConnectProviderArns", js.Array(value :_*))
      
      @scala.inline
      def setSamlProviderArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "samlProviderArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSamlProviderArnsUndefined: Self = StObject.set(x, "samlProviderArns", js.undefined)
      
      @scala.inline
      def setSamlProviderArnsVarargs(value: Input[String]*): Self = StObject.set(x, "samlProviderArns", js.Array(value :_*))
      
      @scala.inline
      def setSupportedLoginProviders(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "supportedLoginProviders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedLoginProvidersUndefined: Self = StObject.set(x, "supportedLoginProviders", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait IdentityPoolState extends StObject {
    
    /**
      * Whether the identity pool supports unauthenticated logins or not.
      */
    val allowUnauthenticatedIdentities: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The ARN of the identity pool.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * An array of Amazon Cognito Identity user pools and their client IDs.
      */
    val cognitoIdentityProviders: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.cognito.IdentityPoolCognitoIdentityProvider]]
        ]
      ] = js.native
    
    /**
      * The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your
      * backend and the Cognito service to communicate about the developer provider.
      */
    val developerProviderName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Cognito Identity Pool name.
      */
    val identityPoolName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Set of OpendID Connect provider ARNs.
      */
    val openidConnectProviderArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * An array of Amazon Resource Names (ARNs) of the SAML provider for your identity.
      */
    val samlProviderArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Key-Value pairs mapping provider names to provider app IDs.
      */
    val supportedLoginProviders: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * A map of tags to assign to the Identity Pool.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object IdentityPoolState {
    
    @scala.inline
    def apply(): IdentityPoolState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IdentityPoolState]
    }
    
    @scala.inline
    implicit class IdentityPoolStateMutableBuilder[Self <: IdentityPoolState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowUnauthenticatedIdentities(value: Input[Boolean]): Self = StObject.set(x, "allowUnauthenticatedIdentities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUnauthenticatedIdentitiesUndefined: Self = StObject.set(x, "allowUnauthenticatedIdentities", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCognitoIdentityProviders(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.cognito.IdentityPoolCognitoIdentityProvider]]
            ]
      ): Self = StObject.set(x, "cognitoIdentityProviders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCognitoIdentityProvidersUndefined: Self = StObject.set(x, "cognitoIdentityProviders", js.undefined)
      
      @scala.inline
      def setCognitoIdentityProvidersVarargs(value: Input[typings.pulumiAws.inputMod.cognito.IdentityPoolCognitoIdentityProvider]*): Self = StObject.set(x, "cognitoIdentityProviders", js.Array(value :_*))
      
      @scala.inline
      def setDeveloperProviderName(value: Input[String]): Self = StObject.set(x, "developerProviderName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeveloperProviderNameUndefined: Self = StObject.set(x, "developerProviderName", js.undefined)
      
      @scala.inline
      def setIdentityPoolName(value: Input[String]): Self = StObject.set(x, "identityPoolName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityPoolNameUndefined: Self = StObject.set(x, "identityPoolName", js.undefined)
      
      @scala.inline
      def setOpenidConnectProviderArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "openidConnectProviderArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenidConnectProviderArnsUndefined: Self = StObject.set(x, "openidConnectProviderArns", js.undefined)
      
      @scala.inline
      def setOpenidConnectProviderArnsVarargs(value: Input[String]*): Self = StObject.set(x, "openidConnectProviderArns", js.Array(value :_*))
      
      @scala.inline
      def setSamlProviderArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "samlProviderArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSamlProviderArnsUndefined: Self = StObject.set(x, "samlProviderArns", js.undefined)
      
      @scala.inline
      def setSamlProviderArnsVarargs(value: Input[String]*): Self = StObject.set(x, "samlProviderArns", js.Array(value :_*))
      
      @scala.inline
      def setSupportedLoginProviders(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "supportedLoginProviders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedLoginProvidersUndefined: Self = StObject.set(x, "supportedLoginProviders", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
