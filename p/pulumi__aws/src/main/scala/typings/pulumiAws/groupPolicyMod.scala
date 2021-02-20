package typings.pulumiAws

import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupPolicyMod {
  
  @JSImport("@pulumi/aws/iam/groupPolicy", "GroupPolicy")
  @js.native
  class GroupPolicy protected () extends CustomResource {
    /**
      * Create a GroupPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GroupPolicyArgs) = this()
    def this(name: String, args: GroupPolicyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The IAM group to attach to the policy.
      */
    val group: Output_[String] = js.native
    
    /**
      * The name of the policy. If omitted, this provider will
      * assign a random, unique name.
      */
    val name: Output_[String] = js.native
    
    /**
      * Creates a unique name beginning with the specified
      * prefix. Conflicts with `name`.
      */
    val namePrefix: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The policy document. This is a JSON formatted string.
      */
    val policy: Output_[String] = js.native
  }
  /* static members */
  object GroupPolicy {
    
    /**
      * Get an existing GroupPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/iam/groupPolicy", "GroupPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): GroupPolicy = js.native
    @JSImport("@pulumi/aws/iam/groupPolicy", "GroupPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): GroupPolicy = js.native
    @JSImport("@pulumi/aws/iam/groupPolicy", "GroupPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: GroupPolicyState): GroupPolicy = js.native
    @JSImport("@pulumi/aws/iam/groupPolicy", "GroupPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: GroupPolicyState, opts: CustomResourceOptions): GroupPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of GroupPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/iam/groupPolicy", "GroupPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/groupPolicy.GroupPolicy */ Boolean = js.native
  }
  
  @js.native
  trait GroupPolicyArgs extends StObject {
    
    /**
      * The IAM group to attach to the policy.
      */
    val group: Input[String] = js.native
    
    /**
      * The name of the policy. If omitted, this provider will
      * assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique name beginning with the specified
      * prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * The policy document. This is a JSON formatted string.
      */
    val policy: Input[String | PolicyDocument] = js.native
  }
  object GroupPolicyArgs {
    
    @scala.inline
    def apply(group: Input[String], policy: Input[String | PolicyDocument]): GroupPolicyArgs = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupPolicyArgs]
    }
    
    @scala.inline
    implicit class GroupPolicyArgsMutableBuilder[Self <: GroupPolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroup(value: Input[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String | PolicyDocument]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GroupPolicyState extends StObject {
    
    /**
      * The IAM group to attach to the policy.
      */
    val group: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the policy. If omitted, this provider will
      * assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique name beginning with the specified
      * prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * The policy document. This is a JSON formatted string.
      */
    val policy: js.UndefOr[Input[String | PolicyDocument]] = js.native
  }
  object GroupPolicyState {
    
    @scala.inline
    def apply(): GroupPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupPolicyState]
    }
    
    @scala.inline
    implicit class GroupPolicyStateMutableBuilder[Self <: GroupPolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroup(value: Input[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String | PolicyDocument]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    }
  }
}
