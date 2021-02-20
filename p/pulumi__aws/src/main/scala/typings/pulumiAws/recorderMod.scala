package typings.pulumiAws

import typings.pulumiAws.outputMod.cfg.RecorderRecordingGroup
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recorderMod {
  
  @JSImport("@pulumi/aws/cfg/recorder", "Recorder")
  @js.native
  class Recorder protected () extends CustomResource {
    /**
      * Create a Recorder resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RecorderArgs) = this()
    def this(name: String, args: RecorderArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name of the recorder. Defaults to `default`. Changing it recreates the resource.
      */
    val name: Output_[String] = js.native
    
    /**
      * Recording group - see below.
      */
    val recordingGroup: Output_[RecorderRecordingGroup] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the IAM role. Used to make read or write requests to the delivery channel and to describe the AWS resources associated with the account. See [AWS Docs](http://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html) for more details.
      */
    val roleArn: Output_[String] = js.native
  }
  /* static members */
  object Recorder {
    
    /**
      * Get an existing Recorder resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cfg/recorder", "Recorder.get")
    @js.native
    def get(name: String, id: Input[ID]): Recorder = js.native
    @JSImport("@pulumi/aws/cfg/recorder", "Recorder.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Recorder = js.native
    @JSImport("@pulumi/aws/cfg/recorder", "Recorder.get")
    @js.native
    def get(name: String, id: Input[ID], state: RecorderState): Recorder = js.native
    @JSImport("@pulumi/aws/cfg/recorder", "Recorder.get")
    @js.native
    def get(name: String, id: Input[ID], state: RecorderState, opts: CustomResourceOptions): Recorder = js.native
    
    /**
      * Returns true if the given object is an instance of Recorder.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cfg/recorder", "Recorder.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/recorder.Recorder */ Boolean = js.native
  }
  
  @js.native
  trait RecorderArgs extends StObject {
    
    /**
      * The name of the recorder. Defaults to `default`. Changing it recreates the resource.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Recording group - see below.
      */
    val recordingGroup: js.UndefOr[Input[typings.pulumiAws.inputMod.cfg.RecorderRecordingGroup]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the IAM role. Used to make read or write requests to the delivery channel and to describe the AWS resources associated with the account. See [AWS Docs](http://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html) for more details.
      */
    val roleArn: Input[String] = js.native
  }
  object RecorderArgs {
    
    @scala.inline
    def apply(roleArn: Input[String]): RecorderArgs = {
      val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecorderArgs]
    }
    
    @scala.inline
    implicit class RecorderArgsMutableBuilder[Self <: RecorderArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRecordingGroup(value: Input[typings.pulumiAws.inputMod.cfg.RecorderRecordingGroup]): Self = StObject.set(x, "recordingGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordingGroupUndefined: Self = StObject.set(x, "recordingGroup", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RecorderState extends StObject {
    
    /**
      * The name of the recorder. Defaults to `default`. Changing it recreates the resource.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Recording group - see below.
      */
    val recordingGroup: js.UndefOr[Input[typings.pulumiAws.inputMod.cfg.RecorderRecordingGroup]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the IAM role. Used to make read or write requests to the delivery channel and to describe the AWS resources associated with the account. See [AWS Docs](http://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html) for more details.
      */
    val roleArn: js.UndefOr[Input[String]] = js.native
  }
  object RecorderState {
    
    @scala.inline
    def apply(): RecorderState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecorderState]
    }
    
    @scala.inline
    implicit class RecorderStateMutableBuilder[Self <: RecorderState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRecordingGroup(value: Input[typings.pulumiAws.inputMod.cfg.RecorderRecordingGroup]): Self = StObject.set(x, "recordingGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordingGroupUndefined: Self = StObject.set(x, "recordingGroup", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    }
  }
}
