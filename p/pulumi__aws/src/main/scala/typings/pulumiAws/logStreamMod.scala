package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logStreamMod {
  
  @JSImport("@pulumi/aws/cloudwatch/logStream", "LogStream")
  @js.native
  class LogStream protected () extends CustomResource {
    /**
      * Create a LogStream resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LogStreamArgs) = this()
    def this(name: String, args: LogStreamArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) specifying the log stream.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The name of the log group under which the log stream is to be created.
      */
    val logGroupName: Output_[String] = js.native
    
    /**
      * The name of the log stream. Must not be longer than 512 characters and must not contain `:`
      */
    val name: Output_[String] = js.native
  }
  /* static members */
  object LogStream {
    
    @JSImport("@pulumi/aws/cloudwatch/logStream", "LogStream")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LogStream resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): LogStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[LogStream]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): LogStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LogStream]
    inline def get(name: String, id: Input[ID], state: LogStreamState): LogStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[LogStream]
    inline def get(name: String, id: Input[ID], state: LogStreamState, opts: CustomResourceOptions): LogStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LogStream]
    
    /**
      * Returns true if the given object is an instance of LogStream.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logStream.LogStream */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cloudwatch/logStream.LogStream */ Boolean]
  }
  
  trait LogStreamArgs extends StObject {
    
    /**
      * The name of the log group under which the log stream is to be created.
      */
    val logGroupName: Input[String]
    
    /**
      * The name of the log stream. Must not be longer than 512 characters and must not contain `:`
      */
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object LogStreamArgs {
    
    inline def apply(logGroupName: Input[String]): LogStreamArgs = {
      val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogStreamArgs]
    }
    
    extension [Self <: LogStreamArgs](x: Self) {
      
      inline def setLogGroupName(value: Input[String]): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait LogStreamState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) specifying the log stream.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the log group under which the log stream is to be created.
      */
    val logGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the log stream. Must not be longer than 512 characters and must not contain `:`
      */
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object LogStreamState {
    
    inline def apply(): LogStreamState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogStreamState]
    }
    
    extension [Self <: LogStreamState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setLogGroupName(value: Input[String]): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
      
      inline def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
