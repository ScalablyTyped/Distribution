package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rdsDbInstanceMod {
  
  @JSImport("@pulumi/aws/opsworks/rdsDbInstance", "RdsDbInstance")
  @js.native
  class RdsDbInstance protected () extends CustomResource {
    /**
      * Create a RdsDbInstance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RdsDbInstanceArgs) = this()
    def this(name: String, args: RdsDbInstanceArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A db password
      */
    val dbPassword: Output_[String] = js.native
    
    /**
      * A db username
      */
    val dbUser: Output_[String] = js.native
    
    /**
      * The db instance to register for this stack. Changing this will force a new resource.
      */
    val rdsDbInstanceArn: Output_[String] = js.native
    
    /**
      * The stack to register a db instance for. Changing this will force a new resource.
      */
    val stackId: Output_[String] = js.native
  }
  /* static members */
  object RdsDbInstance {
    
    @JSImport("@pulumi/aws/opsworks/rdsDbInstance", "RdsDbInstance")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RdsDbInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): RdsDbInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[RdsDbInstance]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): RdsDbInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RdsDbInstance]
    inline def get(name: String, id: Input[ID], state: RdsDbInstanceState): RdsDbInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[RdsDbInstance]
    inline def get(name: String, id: Input[ID], state: RdsDbInstanceState, opts: CustomResourceOptions): RdsDbInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RdsDbInstance]
    
    /**
      * Returns true if the given object is an instance of RdsDbInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/rdsDbInstance.RdsDbInstance */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/opsworks/rdsDbInstance.RdsDbInstance */ Boolean]
  }
  
  trait RdsDbInstanceArgs extends StObject {
    
    /**
      * A db password
      */
    val dbPassword: Input[String]
    
    /**
      * A db username
      */
    val dbUser: Input[String]
    
    /**
      * The db instance to register for this stack. Changing this will force a new resource.
      */
    val rdsDbInstanceArn: Input[String]
    
    /**
      * The stack to register a db instance for. Changing this will force a new resource.
      */
    val stackId: Input[String]
  }
  object RdsDbInstanceArgs {
    
    inline def apply(
      dbPassword: Input[String],
      dbUser: Input[String],
      rdsDbInstanceArn: Input[String],
      stackId: Input[String]
    ): RdsDbInstanceArgs = {
      val __obj = js.Dynamic.literal(dbPassword = dbPassword.asInstanceOf[js.Any], dbUser = dbUser.asInstanceOf[js.Any], rdsDbInstanceArn = rdsDbInstanceArn.asInstanceOf[js.Any], stackId = stackId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RdsDbInstanceArgs]
    }
    
    extension [Self <: RdsDbInstanceArgs](x: Self) {
      
      inline def setDbPassword(value: Input[String]): Self = StObject.set(x, "dbPassword", value.asInstanceOf[js.Any])
      
      inline def setDbUser(value: Input[String]): Self = StObject.set(x, "dbUser", value.asInstanceOf[js.Any])
      
      inline def setRdsDbInstanceArn(value: Input[String]): Self = StObject.set(x, "rdsDbInstanceArn", value.asInstanceOf[js.Any])
      
      inline def setStackId(value: Input[String]): Self = StObject.set(x, "stackId", value.asInstanceOf[js.Any])
    }
  }
  
  trait RdsDbInstanceState extends StObject {
    
    /**
      * A db password
      */
    val dbPassword: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A db username
      */
    val dbUser: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The db instance to register for this stack. Changing this will force a new resource.
      */
    val rdsDbInstanceArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The stack to register a db instance for. Changing this will force a new resource.
      */
    val stackId: js.UndefOr[Input[String]] = js.undefined
  }
  object RdsDbInstanceState {
    
    inline def apply(): RdsDbInstanceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RdsDbInstanceState]
    }
    
    extension [Self <: RdsDbInstanceState](x: Self) {
      
      inline def setDbPassword(value: Input[String]): Self = StObject.set(x, "dbPassword", value.asInstanceOf[js.Any])
      
      inline def setDbPasswordUndefined: Self = StObject.set(x, "dbPassword", js.undefined)
      
      inline def setDbUser(value: Input[String]): Self = StObject.set(x, "dbUser", value.asInstanceOf[js.Any])
      
      inline def setDbUserUndefined: Self = StObject.set(x, "dbUser", js.undefined)
      
      inline def setRdsDbInstanceArn(value: Input[String]): Self = StObject.set(x, "rdsDbInstanceArn", value.asInstanceOf[js.Any])
      
      inline def setRdsDbInstanceArnUndefined: Self = StObject.set(x, "rdsDbInstanceArn", js.undefined)
      
      inline def setStackId(value: Input[String]): Self = StObject.set(x, "stackId", value.asInstanceOf[js.Any])
      
      inline def setStackIdUndefined: Self = StObject.set(x, "stackId", js.undefined)
    }
  }
}
