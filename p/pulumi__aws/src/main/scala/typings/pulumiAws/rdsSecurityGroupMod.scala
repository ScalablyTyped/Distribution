package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.rds.SecurityGroupIngress
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rdsSecurityGroupMod {
  
  @JSImport("@pulumi/aws/rds/securityGroup", "SecurityGroup")
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
      * The arn of the DB security group.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The description of the DB security group. Defaults to "Managed by Pulumi".
      */
    val description: Output_[String] = js.native
    
    /**
      * A list of ingress rules.
      */
    val ingress: Output_[js.Array[SecurityGroupIngress]] = js.native
    
    /**
      * The name of the DB security group.
      */
    val name: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object SecurityGroup {
    
    @JSImport("@pulumi/aws/rds/securityGroup", "SecurityGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SecurityGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): SecurityGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[SecurityGroup]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): SecurityGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SecurityGroup]
    inline def get(name: String, id: Input[ID], state: SecurityGroupState): SecurityGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[SecurityGroup]
    inline def get(name: String, id: Input[ID], state: SecurityGroupState, opts: CustomResourceOptions): SecurityGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SecurityGroup]
    
    /**
      * Returns true if the given object is an instance of SecurityGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/securityGroup.SecurityGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/rds/securityGroup.SecurityGroup */ Boolean]
  }
  
  trait SecurityGroupArgs extends StObject {
    
    /**
      * The description of the DB security group. Defaults to "Managed by Pulumi".
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of ingress rules.
      */
    val ingress: Input[js.Array[Input[typings.pulumiAws.inputMod.rds.SecurityGroupIngress]]]
    
    /**
      * The name of the DB security group.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object SecurityGroupArgs {
    
    inline def apply(ingress: Input[js.Array[Input[typings.pulumiAws.inputMod.rds.SecurityGroupIngress]]]): SecurityGroupArgs = {
      val __obj = js.Dynamic.literal(ingress = ingress.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecurityGroupArgs]
    }
    
    extension [Self <: SecurityGroupArgs](x: Self) {
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIngress(value: Input[js.Array[Input[typings.pulumiAws.inputMod.rds.SecurityGroupIngress]]]): Self = StObject.set(x, "ingress", value.asInstanceOf[js.Any])
      
      inline def setIngressVarargs(value: Input[typings.pulumiAws.inputMod.rds.SecurityGroupIngress]*): Self = StObject.set(x, "ingress", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait SecurityGroupState extends StObject {
    
    /**
      * The arn of the DB security group.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The description of the DB security group. Defaults to "Managed by Pulumi".
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of ingress rules.
      */
    val ingress: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.rds.SecurityGroupIngress]]]] = js.undefined
    
    /**
      * The name of the DB security group.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object SecurityGroupState {
    
    inline def apply(): SecurityGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SecurityGroupState]
    }
    
    extension [Self <: SecurityGroupState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIngress(value: Input[js.Array[Input[typings.pulumiAws.inputMod.rds.SecurityGroupIngress]]]): Self = StObject.set(x, "ingress", value.asInstanceOf[js.Any])
      
      inline def setIngressUndefined: Self = StObject.set(x, "ingress", js.undefined)
      
      inline def setIngressVarargs(value: Input[typings.pulumiAws.inputMod.rds.SecurityGroupIngress]*): Self = StObject.set(x, "ingress", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
