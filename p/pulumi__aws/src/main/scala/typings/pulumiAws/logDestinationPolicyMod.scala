package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/cloudwatch/logDestinationPolicy", "LogDestinationPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LogDestinationPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): LogDestinationPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[LogDestinationPolicy]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): LogDestinationPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LogDestinationPolicy]
    inline def get(name: String, id: Input[ID], state: LogDestinationPolicyState): LogDestinationPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[LogDestinationPolicy]
    inline def get(name: String, id: Input[ID], state: LogDestinationPolicyState, opts: CustomResourceOptions): LogDestinationPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LogDestinationPolicy]
    
    /**
      * Returns true if the given object is an instance of LogDestinationPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logDestinationPolicy.LogDestinationPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cloudwatch/logDestinationPolicy.LogDestinationPolicy */ Boolean]
  }
  
  trait LogDestinationPolicyArgs extends StObject {
    
    /**
      * The policy document. This is a JSON formatted string.
      */
    val accessPolicy: Input[String]
    
    /**
      * A name for the subscription filter
      */
    val destinationName: Input[String]
  }
  object LogDestinationPolicyArgs {
    
    inline def apply(accessPolicy: Input[String], destinationName: Input[String]): LogDestinationPolicyArgs = {
      val __obj = js.Dynamic.literal(accessPolicy = accessPolicy.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogDestinationPolicyArgs]
    }
    
    extension [Self <: LogDestinationPolicyArgs](x: Self) {
      
      inline def setAccessPolicy(value: Input[String]): Self = StObject.set(x, "accessPolicy", value.asInstanceOf[js.Any])
      
      inline def setDestinationName(value: Input[String]): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogDestinationPolicyState extends StObject {
    
    /**
      * The policy document. This is a JSON formatted string.
      */
    val accessPolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A name for the subscription filter
      */
    val destinationName: js.UndefOr[Input[String]] = js.undefined
  }
  object LogDestinationPolicyState {
    
    inline def apply(): LogDestinationPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogDestinationPolicyState]
    }
    
    extension [Self <: LogDestinationPolicyState](x: Self) {
      
      inline def setAccessPolicy(value: Input[String]): Self = StObject.set(x, "accessPolicy", value.asInstanceOf[js.Any])
      
      inline def setAccessPolicyUndefined: Self = StObject.set(x, "accessPolicy", js.undefined)
      
      inline def setDestinationName(value: Input[String]): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
      
      inline def setDestinationNameUndefined: Self = StObject.set(x, "destinationName", js.undefined)
    }
  }
}
