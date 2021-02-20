package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object environmentEC2Mod {
  
  @JSImport("@pulumi/aws/cloud9/environmentEC2", "EnvironmentEC2")
  @js.native
  class EnvironmentEC2 protected () extends CustomResource {
    /**
      * Create a EnvironmentEC2 resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EnvironmentEC2Args) = this()
    def this(name: String, args: EnvironmentEC2Args, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the environment.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The number of minutes until the running instance is shut down after the environment has last been used.
      */
    val automaticStopTimeMinutes: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The description of the environment.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The type of instance to connect to the environment, e.g. `t2.micro`.
      */
    val instanceType: Output_[String] = js.native
    
    /**
      * The name of the environment.
      */
    val name: Output_[String] = js.native
    
    /**
      * The ARN of the environment owner. This can be ARN of any AWS IAM principal. Defaults to the environment's creator.
      */
    val ownerArn: Output_[String] = js.native
    
    /**
      * The ID of the subnet in Amazon VPC that AWS Cloud9 will use to communicate with the Amazon EC2 instance.
      */
    val subnetId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The type of the environment (e.g. `ssh` or `ec2`)
      */
    val `type`: Output_[String] = js.native
  }
  /* static members */
  object EnvironmentEC2 {
    
    /**
      * Get an existing EnvironmentEC2 resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloud9/environmentEC2", "EnvironmentEC2.get")
    @js.native
    def get(name: String, id: Input[ID]): EnvironmentEC2 = js.native
    @JSImport("@pulumi/aws/cloud9/environmentEC2", "EnvironmentEC2.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): EnvironmentEC2 = js.native
    @JSImport("@pulumi/aws/cloud9/environmentEC2", "EnvironmentEC2.get")
    @js.native
    def get(name: String, id: Input[ID], state: EnvironmentEC2State): EnvironmentEC2 = js.native
    @JSImport("@pulumi/aws/cloud9/environmentEC2", "EnvironmentEC2.get")
    @js.native
    def get(name: String, id: Input[ID], state: EnvironmentEC2State, opts: CustomResourceOptions): EnvironmentEC2 = js.native
    
    /**
      * Returns true if the given object is an instance of EnvironmentEC2.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloud9/environmentEC2", "EnvironmentEC2.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloud9/environmentEC2.EnvironmentEC2 */ Boolean = js.native
  }
  
  @js.native
  trait EnvironmentEC2Args extends StObject {
    
    /**
      * The number of minutes until the running instance is shut down after the environment has last been used.
      */
    val automaticStopTimeMinutes: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The description of the environment.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of instance to connect to the environment, e.g. `t2.micro`.
      */
    val instanceType: Input[String] = js.native
    
    /**
      * The name of the environment.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the environment owner. This can be ARN of any AWS IAM principal. Defaults to the environment's creator.
      */
    val ownerArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the subnet in Amazon VPC that AWS Cloud9 will use to communicate with the Amazon EC2 instance.
      */
    val subnetId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object EnvironmentEC2Args {
    
    @scala.inline
    def apply(instanceType: Input[String]): EnvironmentEC2Args = {
      val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentEC2Args]
    }
    
    @scala.inline
    implicit class EnvironmentEC2ArgsMutableBuilder[Self <: EnvironmentEC2Args] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutomaticStopTimeMinutes(value: Input[Double]): Self = StObject.set(x, "automaticStopTimeMinutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutomaticStopTimeMinutesUndefined: Self = StObject.set(x, "automaticStopTimeMinutes", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setInstanceType(value: Input[String]): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOwnerArn(value: Input[String]): Self = StObject.set(x, "ownerArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerArnUndefined: Self = StObject.set(x, "ownerArn", js.undefined)
      
      @scala.inline
      def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait EnvironmentEC2State extends StObject {
    
    /**
      * The ARN of the environment.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The number of minutes until the running instance is shut down after the environment has last been used.
      */
    val automaticStopTimeMinutes: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The description of the environment.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of instance to connect to the environment, e.g. `t2.micro`.
      */
    val instanceType: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the environment.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the environment owner. This can be ARN of any AWS IAM principal. Defaults to the environment's creator.
      */
    val ownerArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the subnet in Amazon VPC that AWS Cloud9 will use to communicate with the Amazon EC2 instance.
      */
    val subnetId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The type of the environment (e.g. `ssh` or `ec2`)
      */
    val `type`: js.UndefOr[Input[String]] = js.native
  }
  object EnvironmentEC2State {
    
    @scala.inline
    def apply(): EnvironmentEC2State = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnvironmentEC2State]
    }
    
    @scala.inline
    implicit class EnvironmentEC2StateMutableBuilder[Self <: EnvironmentEC2State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAutomaticStopTimeMinutes(value: Input[Double]): Self = StObject.set(x, "automaticStopTimeMinutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutomaticStopTimeMinutesUndefined: Self = StObject.set(x, "automaticStopTimeMinutes", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setInstanceType(value: Input[String]): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOwnerArn(value: Input[String]): Self = StObject.set(x, "ownerArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerArnUndefined: Self = StObject.set(x, "ownerArn", js.undefined)
      
      @scala.inline
      def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
