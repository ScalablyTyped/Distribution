package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCredentialMod {
  
  @JSImport("@pulumi/aws/codebuild/sourceCredential", "SourceCredential")
  @js.native
  class SourceCredential protected () extends CustomResource {
    /**
      * Create a SourceCredential resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SourceCredentialArgs) = this()
    def this(name: String, args: SourceCredentialArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of Source Credential.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The type of authentication used to connect to a GitHub, GitHub Enterprise, or Bitbucket repository. An OAUTH connection is not supported by the API.
      */
    val authType: Output_[String] = js.native
    
    /**
      * The source provider used for this project.
      */
    val serverType: Output_[String] = js.native
    
    /**
      * For `GitHub` or `GitHub Enterprise`, this is the personal access token. For `Bitbucket`, this is the app password.
      */
    val token: Output_[String] = js.native
    
    /**
      * The Bitbucket username when the authType is `BASIC_AUTH`. This parameter is not valid for other types of source providers or connections.
      */
    val userName: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object SourceCredential {
    
    @JSImport("@pulumi/aws/codebuild/sourceCredential", "SourceCredential")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SourceCredential resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): SourceCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[SourceCredential]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): SourceCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SourceCredential]
    @scala.inline
    def get(name: String, id: Input[ID], state: SourceCredentialState): SourceCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[SourceCredential]
    @scala.inline
    def get(name: String, id: Input[ID], state: SourceCredentialState, opts: CustomResourceOptions): SourceCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SourceCredential]
    
    /**
      * Returns true if the given object is an instance of SourceCredential.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codebuild/sourceCredential.SourceCredential */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/codebuild/sourceCredential.SourceCredential */ Boolean]
  }
  
  trait SourceCredentialArgs extends StObject {
    
    /**
      * The type of authentication used to connect to a GitHub, GitHub Enterprise, or Bitbucket repository. An OAUTH connection is not supported by the API.
      */
    val authType: Input[String]
    
    /**
      * The source provider used for this project.
      */
    val serverType: Input[String]
    
    /**
      * For `GitHub` or `GitHub Enterprise`, this is the personal access token. For `Bitbucket`, this is the app password.
      */
    val token: Input[String]
    
    /**
      * The Bitbucket username when the authType is `BASIC_AUTH`. This parameter is not valid for other types of source providers or connections.
      */
    val userName: js.UndefOr[Input[String]] = js.undefined
  }
  object SourceCredentialArgs {
    
    @scala.inline
    def apply(authType: Input[String], serverType: Input[String], token: Input[String]): SourceCredentialArgs = {
      val __obj = js.Dynamic.literal(authType = authType.asInstanceOf[js.Any], serverType = serverType.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceCredentialArgs]
    }
    
    @scala.inline
    implicit class SourceCredentialArgsMutableBuilder[Self <: SourceCredentialArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthType(value: Input[String]): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerType(value: Input[String]): Self = StObject.set(x, "serverType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: Input[String]): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserName(value: Input[String]): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    }
  }
  
  trait SourceCredentialState extends StObject {
    
    /**
      * The ARN of Source Credential.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of authentication used to connect to a GitHub, GitHub Enterprise, or Bitbucket repository. An OAUTH connection is not supported by the API.
      */
    val authType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The source provider used for this project.
      */
    val serverType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * For `GitHub` or `GitHub Enterprise`, this is the personal access token. For `Bitbucket`, this is the app password.
      */
    val token: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Bitbucket username when the authType is `BASIC_AUTH`. This parameter is not valid for other types of source providers or connections.
      */
    val userName: js.UndefOr[Input[String]] = js.undefined
  }
  object SourceCredentialState {
    
    @scala.inline
    def apply(): SourceCredentialState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceCredentialState]
    }
    
    @scala.inline
    implicit class SourceCredentialStateMutableBuilder[Self <: SourceCredentialState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAuthType(value: Input[String]): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthTypeUndefined: Self = StObject.set(x, "authType", js.undefined)
      
      @scala.inline
      def setServerType(value: Input[String]): Self = StObject.set(x, "serverType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerTypeUndefined: Self = StObject.set(x, "serverType", js.undefined)
      
      @scala.inline
      def setToken(value: Input[String]): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      @scala.inline
      def setUserName(value: Input[String]): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    }
  }
}
