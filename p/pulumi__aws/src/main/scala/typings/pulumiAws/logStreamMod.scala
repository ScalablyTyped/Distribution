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
    
    /**
      * Get an existing LogStream resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch/logStream", "LogStream.get")
    @js.native
    def get(name: String, id: Input[ID]): LogStream = js.native
    @JSImport("@pulumi/aws/cloudwatch/logStream", "LogStream.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LogStream = js.native
    @JSImport("@pulumi/aws/cloudwatch/logStream", "LogStream.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogStreamState): LogStream = js.native
    @JSImport("@pulumi/aws/cloudwatch/logStream", "LogStream.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogStreamState, opts: CustomResourceOptions): LogStream = js.native
    
    /**
      * Returns true if the given object is an instance of LogStream.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch/logStream", "LogStream.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logStream.LogStream */ Boolean = js.native
  }
  
  @js.native
  trait LogStreamArgs extends StObject {
    
    /**
      * The name of the log group under which the log stream is to be created.
      */
    val logGroupName: Input[String] = js.native
    
    /**
      * The name of the log stream. Must not be longer than 512 characters and must not contain `:`
      */
    val name: js.UndefOr[Input[String]] = js.native
  }
  object LogStreamArgs {
    
    @scala.inline
    def apply(logGroupName: Input[String]): LogStreamArgs = {
      val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogStreamArgs]
    }
    
    @scala.inline
    implicit class LogStreamArgsMutableBuilder[Self <: LogStreamArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogGroupName(value: Input[String]): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait LogStreamState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) specifying the log stream.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the log group under which the log stream is to be created.
      */
    val logGroupName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the log stream. Must not be longer than 512 characters and must not contain `:`
      */
    val name: js.UndefOr[Input[String]] = js.native
  }
  object LogStreamState {
    
    @scala.inline
    def apply(): LogStreamState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogStreamState]
    }
    
    @scala.inline
    implicit class LogStreamStateMutableBuilder[Self <: LogStreamState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setLogGroupName(value: Input[String]): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
