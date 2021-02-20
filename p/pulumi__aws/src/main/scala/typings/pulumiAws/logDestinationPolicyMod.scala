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

object logDestinationPolicyMod {
  
  @JSImport("@pulumi/aws/cloudwatch/logDestinationPolicy", "LogDestinationPolicy")
  @js.native
  class LogDestinationPolicy protected () extends CustomResource {
    /**
      * Create a LogDestinationPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LogDestinationPolicyArgs) = this()
    def this(name: String, args: LogDestinationPolicyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The policy document. This is a JSON formatted string.
      */
    val accessPolicy: Output_[String] = js.native
    
    /**
      * A name for the subscription filter
      */
    val destinationName: Output_[String] = js.native
  }
  /* static members */
  object LogDestinationPolicy {
    
    /**
      * Get an existing LogDestinationPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch/logDestinationPolicy", "LogDestinationPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): LogDestinationPolicy = js.native
    @JSImport("@pulumi/aws/cloudwatch/logDestinationPolicy", "LogDestinationPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LogDestinationPolicy = js.native
    @JSImport("@pulumi/aws/cloudwatch/logDestinationPolicy", "LogDestinationPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogDestinationPolicyState): LogDestinationPolicy = js.native
    @JSImport("@pulumi/aws/cloudwatch/logDestinationPolicy", "LogDestinationPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogDestinationPolicyState, opts: CustomResourceOptions): LogDestinationPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of LogDestinationPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch/logDestinationPolicy", "LogDestinationPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logDestinationPolicy.LogDestinationPolicy */ Boolean = js.native
  }
  
  @js.native
  trait LogDestinationPolicyArgs extends StObject {
    
    /**
      * The policy document. This is a JSON formatted string.
      */
    val accessPolicy: Input[String] = js.native
    
    /**
      * A name for the subscription filter
      */
    val destinationName: Input[String] = js.native
  }
  object LogDestinationPolicyArgs {
    
    @scala.inline
    def apply(accessPolicy: Input[String], destinationName: Input[String]): LogDestinationPolicyArgs = {
      val __obj = js.Dynamic.literal(accessPolicy = accessPolicy.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogDestinationPolicyArgs]
    }
    
    @scala.inline
    implicit class LogDestinationPolicyArgsMutableBuilder[Self <: LogDestinationPolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessPolicy(value: Input[String]): Self = StObject.set(x, "accessPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationName(value: Input[String]): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LogDestinationPolicyState extends StObject {
    
    /**
      * The policy document. This is a JSON formatted string.
      */
    val accessPolicy: js.UndefOr[Input[String]] = js.native
    
    /**
      * A name for the subscription filter
      */
    val destinationName: js.UndefOr[Input[String]] = js.native
  }
  object LogDestinationPolicyState {
    
    @scala.inline
    def apply(): LogDestinationPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogDestinationPolicyState]
    }
    
    @scala.inline
    implicit class LogDestinationPolicyStateMutableBuilder[Self <: LogDestinationPolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessPolicy(value: Input[String]): Self = StObject.set(x, "accessPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessPolicyUndefined: Self = StObject.set(x, "accessPolicy", js.undefined)
      
      @scala.inline
      def setDestinationName(value: Input[String]): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationNameUndefined: Self = StObject.set(x, "destinationName", js.undefined)
    }
  }
}
