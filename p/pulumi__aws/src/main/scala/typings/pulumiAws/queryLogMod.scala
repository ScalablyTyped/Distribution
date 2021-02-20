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
    
    /**
      * Get an existing QueryLog resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/route53/queryLog", "QueryLog.get")
    @js.native
    def get(name: String, id: Input[ID]): QueryLog = js.native
    @JSImport("@pulumi/aws/route53/queryLog", "QueryLog.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): QueryLog = js.native
    @JSImport("@pulumi/aws/route53/queryLog", "QueryLog.get")
    @js.native
    def get(name: String, id: Input[ID], state: QueryLogState): QueryLog = js.native
    @JSImport("@pulumi/aws/route53/queryLog", "QueryLog.get")
    @js.native
    def get(name: String, id: Input[ID], state: QueryLogState, opts: CustomResourceOptions): QueryLog = js.native
    
    /**
      * Returns true if the given object is an instance of QueryLog.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/route53/queryLog", "QueryLog.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/queryLog.QueryLog */ Boolean = js.native
  }
  
  @js.native
  trait QueryLogArgs extends StObject {
    
    /**
      * CloudWatch log group ARN to send query logs.
      */
    val cloudwatchLogGroupArn: Input[String] = js.native
    
    /**
      * Route53 hosted zone ID to enable query logs.
      */
    val zoneId: Input[String] = js.native
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
  
  @js.native
  trait QueryLogState extends StObject {
    
    /**
      * CloudWatch log group ARN to send query logs.
      */
    val cloudwatchLogGroupArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Route53 hosted zone ID to enable query logs.
      */
    val zoneId: js.UndefOr[Input[String]] = js.native
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
