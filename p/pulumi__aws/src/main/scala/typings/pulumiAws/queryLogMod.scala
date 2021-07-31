package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryLogMod {
  
  @JSImport("@pulumi/aws/route53/queryLog", "QueryLog")
  @js.native
  class QueryLog protected () extends CustomResource {
    /**
      * Create a QueryLog resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: QueryLogArgs) = this()
    def this(name: String, args: QueryLogArgs, opts: CustomResourceOptions) = this()
    
    /**
      * CloudWatch log group ARN to send query logs.
      */
    val cloudwatchLogGroupArn: Output_[String] = js.native
    
    /**
      * Route53 hosted zone ID to enable query logs.
      */
    val zoneId: Output_[String] = js.native
  }
  /* static members */
  object QueryLog {
    
    @JSImport("@pulumi/aws/route53/queryLog", "QueryLog")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing QueryLog resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): QueryLog = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[QueryLog]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): QueryLog = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[QueryLog]
    @scala.inline
    def get(name: String, id: Input[ID], state: QueryLogState): QueryLog = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[QueryLog]
    @scala.inline
    def get(name: String, id: Input[ID], state: QueryLogState, opts: CustomResourceOptions): QueryLog = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[QueryLog]
    
    /**
      * Returns true if the given object is an instance of QueryLog.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/queryLog.QueryLog */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/route53/queryLog.QueryLog */ Boolean]
  }
  
  trait QueryLogArgs extends StObject {
    
    /**
      * CloudWatch log group ARN to send query logs.
      */
    val cloudwatchLogGroupArn: Input[String]
    
    /**
      * Route53 hosted zone ID to enable query logs.
      */
    val zoneId: Input[String]
  }
  object QueryLogArgs {
    
    @scala.inline
    def apply(cloudwatchLogGroupArn: Input[String], zoneId: Input[String]): QueryLogArgs = {
      val __obj = js.Dynamic.literal(cloudwatchLogGroupArn = cloudwatchLogGroupArn.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryLogArgs]
    }
    
    @scala.inline
    implicit class QueryLogArgsMutableBuilder[Self <: QueryLogArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloudwatchLogGroupArn(value: Input[String]): Self = StObject.set(x, "cloudwatchLogGroupArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoneId(value: Input[String]): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryLogState extends StObject {
    
    /**
      * CloudWatch log group ARN to send query logs.
      */
    val cloudwatchLogGroupArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Route53 hosted zone ID to enable query logs.
      */
    val zoneId: js.UndefOr[Input[String]] = js.undefined
  }
  object QueryLogState {
    
    @scala.inline
    def apply(): QueryLogState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryLogState]
    }
    
    @scala.inline
    implicit class QueryLogStateMutableBuilder[Self <: QueryLogState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloudwatchLogGroupArn(value: Input[String]): Self = StObject.set(x, "cloudwatchLogGroupArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudwatchLogGroupArnUndefined: Self = StObject.set(x, "cloudwatchLogGroupArn", js.undefined)
      
      @scala.inline
      def setZoneId(value: Input[String]): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoneIdUndefined: Self = StObject.set(x, "zoneId", js.undefined)
    }
  }
}
