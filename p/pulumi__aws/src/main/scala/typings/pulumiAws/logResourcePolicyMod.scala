package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logResourcePolicyMod {
  
  @JSImport("@pulumi/aws/cloudwatch/logResourcePolicy", "LogResourcePolicy")
  @js.native
  class LogResourcePolicy protected () extends CustomResource {
    /**
      * Create a LogResourcePolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LogResourcePolicyArgs) = this()
    def this(name: String, args: LogResourcePolicyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Details of the resource policy, including the identity of the principal that is enabled to put logs to this account. This is formatted as a JSON string. Maximum length of 5120 characters.
      */
    val policyDocument: Output_[String] = js.native
    
    /**
      * Name of the resource policy.
      */
    val policyName: Output_[String] = js.native
  }
  /* static members */
  object LogResourcePolicy {
    
    /**
      * Get an existing LogResourcePolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch/logResourcePolicy", "LogResourcePolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): LogResourcePolicy = js.native
    @JSImport("@pulumi/aws/cloudwatch/logResourcePolicy", "LogResourcePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LogResourcePolicy = js.native
    @JSImport("@pulumi/aws/cloudwatch/logResourcePolicy", "LogResourcePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogResourcePolicyState): LogResourcePolicy = js.native
    @JSImport("@pulumi/aws/cloudwatch/logResourcePolicy", "LogResourcePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogResourcePolicyState, opts: CustomResourceOptions): LogResourcePolicy = js.native
    
    /**
      * Returns true if the given object is an instance of LogResourcePolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch/logResourcePolicy", "LogResourcePolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logResourcePolicy.LogResourcePolicy */ Boolean = js.native
  }
  
  @js.native
  trait LogResourcePolicyArgs extends StObject {
    
    /**
      * Details of the resource policy, including the identity of the principal that is enabled to put logs to this account. This is formatted as a JSON string. Maximum length of 5120 characters.
      */
    val policyDocument: Input[String] = js.native
    
    /**
      * Name of the resource policy.
      */
    val policyName: Input[String] = js.native
  }
  object LogResourcePolicyArgs {
    
    @scala.inline
    def apply(policyDocument: Input[String], policyName: Input[String]): LogResourcePolicyArgs = {
      val __obj = js.Dynamic.literal(policyDocument = policyDocument.asInstanceOf[js.Any], policyName = policyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogResourcePolicyArgs]
    }
    
    @scala.inline
    implicit class LogResourcePolicyArgsMutableBuilder[Self <: LogResourcePolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicyDocument(value: Input[String]): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyName(value: Input[String]): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LogResourcePolicyState extends StObject {
    
    /**
      * Details of the resource policy, including the identity of the principal that is enabled to put logs to this account. This is formatted as a JSON string. Maximum length of 5120 characters.
      */
    val policyDocument: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the resource policy.
      */
    val policyName: js.UndefOr[Input[String]] = js.native
  }
  object LogResourcePolicyState {
    
    @scala.inline
    def apply(): LogResourcePolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogResourcePolicyState]
    }
    
    @scala.inline
    implicit class LogResourcePolicyStateMutableBuilder[Self <: LogResourcePolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicyDocument(value: Input[String]): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyDocumentUndefined: Self = StObject.set(x, "policyDocument", js.undefined)
      
      @scala.inline
      def setPolicyName(value: Input[String]): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyNameUndefined: Self = StObject.set(x, "policyName", js.undefined)
    }
  }
}
