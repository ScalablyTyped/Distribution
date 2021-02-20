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
    
    /**
      * Get an existing LogService resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/directoryservice/logService", "LogService.get")
    @js.native
    def get(name: String, id: Input[ID]): LogService = js.native
    @JSImport("@pulumi/aws/directoryservice/logService", "LogService.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LogService = js.native
    @JSImport("@pulumi/aws/directoryservice/logService", "LogService.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogServiceState): LogService = js.native
    @JSImport("@pulumi/aws/directoryservice/logService", "LogService.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogServiceState, opts: CustomResourceOptions): LogService = js.native
    
    /**
      * Returns true if the given object is an instance of LogService.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/directoryservice/logService", "LogService.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directoryservice/logService.LogService */ Boolean = js.native
  }
  
  @js.native
  trait LogServiceArgs extends StObject {
    
    /**
      * The id of directory.
      */
    val directoryId: Input[String] = js.native
    
    /**
      * Name of the cloudwatch log group to which the logs should be published. The log group should be already created and the directory service principal should be provided with required permission to create stream and publish logs. Changing this value would delete the current subscription and create a new one. A directory can only have one log subscription at a time.
      */
    val logGroupName: Input[String] = js.native
  }
  object LogServiceArgs {
    
    @scala.inline
    def apply(directoryId: Input[String], logGroupName: Input[String]): LogServiceArgs = {
      val __obj = js.Dynamic.literal(directoryId = directoryId.asInstanceOf[js.Any], logGroupName = logGroupName.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogServiceArgs]
    }
    
    @scala.inline
    implicit class LogServiceArgsMutableBuilder[Self <: LogServiceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectoryId(value: Input[String]): Self = StObject.set(x, "directoryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogGroupName(value: Input[String]): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LogServiceState extends StObject {
    
    /**
      * The id of directory.
      */
    val directoryId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the cloudwatch log group to which the logs should be published. The log group should be already created and the directory service principal should be provided with required permission to create stream and publish logs. Changing this value would delete the current subscription and create a new one. A directory can only have one log subscription at a time.
      */
    val logGroupName: js.UndefOr[Input[String]] = js.native
  }
  object LogServiceState {
    
    @scala.inline
    def apply(): LogServiceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogServiceState]
    }
    
    @scala.inline
    implicit class LogServiceStateMutableBuilder[Self <: LogServiceState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectoryId(value: Input[String]): Self = StObject.set(x, "directoryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryIdUndefined: Self = StObject.set(x, "directoryId", js.undefined)
      
      @scala.inline
      def setLogGroupName(value: Input[String]): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
    }
  }
}
