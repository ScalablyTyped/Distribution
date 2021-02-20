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
    
    /**
      * Get an existing RdsDbInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/opsworks/rdsDbInstance", "RdsDbInstance.get")
    @js.native
    def get(name: String, id: Input[ID]): RdsDbInstance = js.native
    @JSImport("@pulumi/aws/opsworks/rdsDbInstance", "RdsDbInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RdsDbInstance = js.native
    @JSImport("@pulumi/aws/opsworks/rdsDbInstance", "RdsDbInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: RdsDbInstanceState): RdsDbInstance = js.native
    @JSImport("@pulumi/aws/opsworks/rdsDbInstance", "RdsDbInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: RdsDbInstanceState, opts: CustomResourceOptions): RdsDbInstance = js.native
    
    /**
      * Returns true if the given object is an instance of RdsDbInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/opsworks/rdsDbInstance", "RdsDbInstance.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/rdsDbInstance.RdsDbInstance */ Boolean = js.native
  }
  
  @js.native
  trait RdsDbInstanceArgs extends StObject {
    
    /**
      * A db password
      */
    val dbPassword: Input[String] = js.native
    
    /**
      * A db username
      */
    val dbUser: Input[String] = js.native
    
    /**
      * The db instance to register for this stack. Changing this will force a new resource.
      */
    val rdsDbInstanceArn: Input[String] = js.native
    
    /**
      * The stack to register a db instance for. Changing this will force a new resource.
      */
    val stackId: Input[String] = js.native
  }
  object RdsDbInstanceArgs {
    
    @scala.inline
    def apply(
      dbPassword: Input[String],
      dbUser: Input[String],
      rdsDbInstanceArn: Input[String],
      stackId: Input[String]
    ): RdsDbInstanceArgs = {
      val __obj = js.Dynamic.literal(dbPassword = dbPassword.asInstanceOf[js.Any], dbUser = dbUser.asInstanceOf[js.Any], rdsDbInstanceArn = rdsDbInstanceArn.asInstanceOf[js.Any], stackId = stackId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RdsDbInstanceArgs]
    }
    
    @scala.inline
    implicit class RdsDbInstanceArgsMutableBuilder[Self <: RdsDbInstanceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDbPassword(value: Input[String]): Self = StObject.set(x, "dbPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbUser(value: Input[String]): Self = StObject.set(x, "dbUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRdsDbInstanceArn(value: Input[String]): Self = StObject.set(x, "rdsDbInstanceArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackId(value: Input[String]): Self = StObject.set(x, "stackId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RdsDbInstanceState extends StObject {
    
    /**
      * A db password
      */
    val dbPassword: js.UndefOr[Input[String]] = js.native
    
    /**
      * A db username
      */
    val dbUser: js.UndefOr[Input[String]] = js.native
    
    /**
      * The db instance to register for this stack. Changing this will force a new resource.
      */
    val rdsDbInstanceArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The stack to register a db instance for. Changing this will force a new resource.
      */
    val stackId: js.UndefOr[Input[String]] = js.native
  }
  object RdsDbInstanceState {
    
    @scala.inline
    def apply(): RdsDbInstanceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RdsDbInstanceState]
    }
    
    @scala.inline
    implicit class RdsDbInstanceStateMutableBuilder[Self <: RdsDbInstanceState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDbPassword(value: Input[String]): Self = StObject.set(x, "dbPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbPasswordUndefined: Self = StObject.set(x, "dbPassword", js.undefined)
      
      @scala.inline
      def setDbUser(value: Input[String]): Self = StObject.set(x, "dbUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbUserUndefined: Self = StObject.set(x, "dbUser", js.undefined)
      
      @scala.inline
      def setRdsDbInstanceArn(value: Input[String]): Self = StObject.set(x, "rdsDbInstanceArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRdsDbInstanceArnUndefined: Self = StObject.set(x, "rdsDbInstanceArn", js.undefined)
      
      @scala.inline
      def setStackId(value: Input[String]): Self = StObject.set(x, "stackId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackIdUndefined: Self = StObject.set(x, "stackId", js.undefined)
    }
  }
}
