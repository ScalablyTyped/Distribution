package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logServiceMod {
  
  @JSImport("@pulumi/aws/directoryservice/logService", "LogService")
  @js.native
  class LogService protected () extends CustomResource {
    /**
      * Create a LogService resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LogServiceArgs) = this()
    def this(name: String, args: LogServiceArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The id of directory.
      */
    val directoryId: Output_[String] = js.native
    
    /**
      * Name of the cloudwatch log group to which the logs should be published. The log group should be already created and the directory service principal should be provided with required permission to create stream and publish logs. Changing this value would delete the current subscription and create a new one. A directory can only have one log subscription at a time.
      */
    val logGroupName: Output_[String] = js.native
  }
  /* static members */
  object LogService {
    
    @JSImport("@pulumi/aws/directoryservice/logService", "LogService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LogService resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): LogService = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[LogService]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): LogService = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LogService]
    inline def get(name: String, id: Input[ID], state: LogServiceState): LogService = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[LogService]
    inline def get(name: String, id: Input[ID], state: LogServiceState, opts: CustomResourceOptions): LogService = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LogService]
    
    /**
      * Returns true if the given object is an instance of LogService.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directoryservice/logService.LogService */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/directoryservice/logService.LogService */ Boolean]
  }
  
  trait LogServiceArgs extends StObject {
    
    /**
      * The id of directory.
      */
    val directoryId: Input[String]
    
    /**
      * Name of the cloudwatch log group to which the logs should be published. The log group should be already created and the directory service principal should be provided with required permission to create stream and publish logs. Changing this value would delete the current subscription and create a new one. A directory can only have one log subscription at a time.
      */
    val logGroupName: Input[String]
  }
  object LogServiceArgs {
    
    inline def apply(directoryId: Input[String], logGroupName: Input[String]): LogServiceArgs = {
      val __obj = js.Dynamic.literal(directoryId = directoryId.asInstanceOf[js.Any], logGroupName = logGroupName.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogServiceArgs]
    }
    
    extension [Self <: LogServiceArgs](x: Self) {
      
      inline def setDirectoryId(value: Input[String]): Self = StObject.set(x, "directoryId", value.asInstanceOf[js.Any])
      
      inline def setLogGroupName(value: Input[String]): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogServiceState extends StObject {
    
    /**
      * The id of directory.
      */
    val directoryId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the cloudwatch log group to which the logs should be published. The log group should be already created and the directory service principal should be provided with required permission to create stream and publish logs. Changing this value would delete the current subscription and create a new one. A directory can only have one log subscription at a time.
      */
    val logGroupName: js.UndefOr[Input[String]] = js.undefined
  }
  object LogServiceState {
    
    inline def apply(): LogServiceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogServiceState]
    }
    
    extension [Self <: LogServiceState](x: Self) {
      
      inline def setDirectoryId(value: Input[String]): Self = StObject.set(x, "directoryId", value.asInstanceOf[js.Any])
      
      inline def setDirectoryIdUndefined: Self = StObject.set(x, "directoryId", js.undefined)
      
      inline def setLogGroupName(value: Input[String]): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
      
      inline def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
    }
  }
}
