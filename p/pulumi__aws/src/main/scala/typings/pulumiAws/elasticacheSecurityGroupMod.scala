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

object elasticacheSecurityGroupMod {
  
  @JSImport("@pulumi/aws/elasticache/securityGroup", "SecurityGroup")
  @js.native
  class SecurityGroup protected () extends CustomResource {
    /**
      * Create a SecurityGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SecurityGroupArgs) = this()
    def this(name: String, args: SecurityGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * description for the cache security group. Defaults to "Managed by Pulumi".
      */
    val description: Output_[String] = js.native
    
    /**
      * Name for the cache security group. This value is stored as a lowercase string.
      */
    val name: Output_[String] = js.native
    
    /**
      * List of EC2 security group names to be
      * authorized for ingress to the cache security group
      */
    val securityGroupNames: Output_[js.Array[String]] = js.native
  }
  /* static members */
  object SecurityGroup {
    
    /**
      * Get an existing SecurityGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elasticache/securityGroup", "SecurityGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): SecurityGroup = js.native
    @JSImport("@pulumi/aws/elasticache/securityGroup", "SecurityGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SecurityGroup = js.native
    @JSImport("@pulumi/aws/elasticache/securityGroup", "SecurityGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SecurityGroupState): SecurityGroup = js.native
    @JSImport("@pulumi/aws/elasticache/securityGroup", "SecurityGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SecurityGroupState, opts: CustomResourceOptions): SecurityGroup = js.native
    
    /**
      * Returns true if the given object is an instance of SecurityGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elasticache/securityGroup", "SecurityGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticache/securityGroup.SecurityGroup */ Boolean = js.native
  }
  
  @js.native
  trait SecurityGroupArgs extends StObject {
    
    /**
      * description for the cache security group. Defaults to "Managed by Pulumi".
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name for the cache security group. This value is stored as a lowercase string.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * List of EC2 security group names to be
      * authorized for ingress to the cache security group
      */
    val securityGroupNames: Input[js.Array[Input[String]]] = js.native
  }
  object SecurityGroupArgs {
    
    @scala.inline
    def apply(securityGroupNames: Input[js.Array[Input[String]]]): SecurityGroupArgs = {
      val __obj = js.Dynamic.literal(securityGroupNames = securityGroupNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecurityGroupArgs]
    }
    
    @scala.inline
    implicit class SecurityGroupArgsMutableBuilder[Self <: SecurityGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSecurityGroupNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupNamesVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupNames", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SecurityGroupState extends StObject {
    
    /**
      * description for the cache security group. Defaults to "Managed by Pulumi".
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name for the cache security group. This value is stored as a lowercase string.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * List of EC2 security group names to be
      * authorized for ingress to the cache security group
      */
    val securityGroupNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  }
  object SecurityGroupState {
    
    @scala.inline
    def apply(): SecurityGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SecurityGroupState]
    }
    
    @scala.inline
    implicit class SecurityGroupStateMutableBuilder[Self <: SecurityGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSecurityGroupNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupNamesUndefined: Self = StObject.set(x, "securityGroupNames", js.undefined)
      
      @scala.inline
      def setSecurityGroupNamesVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupNames", js.Array(value :_*))
    }
  }
}
