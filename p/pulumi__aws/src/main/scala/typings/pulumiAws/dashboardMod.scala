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

object dashboardMod {
  
  @JSImport("@pulumi/aws/cloudwatch/dashboard", "Dashboard")
  @js.native
  class Dashboard protected () extends CustomResource {
    /**
      * Create a Dashboard resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DashboardArgs) = this()
    def this(name: String, args: DashboardArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) of the dashboard.
      */
    val dashboardArn: Output_[String] = js.native
    
    /**
      * The detailed information about the dashboard, including what widgets are included and their location on the dashboard. You can read more about the body structure in the [documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html).
      */
    val dashboardBody: Output_[String] = js.native
    
    /**
      * The name of the dashboard.
      */
    val dashboardName: Output_[String] = js.native
  }
  /* static members */
  object Dashboard {
    
    /**
      * Get an existing Dashboard resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch/dashboard", "Dashboard.get")
    @js.native
    def get(name: String, id: Input[ID]): Dashboard = js.native
    @JSImport("@pulumi/aws/cloudwatch/dashboard", "Dashboard.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Dashboard = js.native
    @JSImport("@pulumi/aws/cloudwatch/dashboard", "Dashboard.get")
    @js.native
    def get(name: String, id: Input[ID], state: DashboardState): Dashboard = js.native
    @JSImport("@pulumi/aws/cloudwatch/dashboard", "Dashboard.get")
    @js.native
    def get(name: String, id: Input[ID], state: DashboardState, opts: CustomResourceOptions): Dashboard = js.native
    
    /**
      * Returns true if the given object is an instance of Dashboard.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch/dashboard", "Dashboard.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/dashboard.Dashboard */ Boolean = js.native
  }
  
  @js.native
  trait DashboardArgs extends StObject {
    
    /**
      * The detailed information about the dashboard, including what widgets are included and their location on the dashboard. You can read more about the body structure in the [documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html).
      */
    val dashboardBody: Input[String] = js.native
    
    /**
      * The name of the dashboard.
      */
    val dashboardName: Input[String] = js.native
  }
  object DashboardArgs {
    
    @scala.inline
    def apply(dashboardBody: Input[String], dashboardName: Input[String]): DashboardArgs = {
      val __obj = js.Dynamic.literal(dashboardBody = dashboardBody.asInstanceOf[js.Any], dashboardName = dashboardName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DashboardArgs]
    }
    
    @scala.inline
    implicit class DashboardArgsMutableBuilder[Self <: DashboardArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDashboardBody(value: Input[String]): Self = StObject.set(x, "dashboardBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashboardName(value: Input[String]): Self = StObject.set(x, "dashboardName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DashboardState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the dashboard.
      */
    val dashboardArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The detailed information about the dashboard, including what widgets are included and their location on the dashboard. You can read more about the body structure in the [documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html).
      */
    val dashboardBody: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the dashboard.
      */
    val dashboardName: js.UndefOr[Input[String]] = js.native
  }
  object DashboardState {
    
    @scala.inline
    def apply(): DashboardState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DashboardState]
    }
    
    @scala.inline
    implicit class DashboardStateMutableBuilder[Self <: DashboardState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDashboardArn(value: Input[String]): Self = StObject.set(x, "dashboardArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashboardArnUndefined: Self = StObject.set(x, "dashboardArn", js.undefined)
      
      @scala.inline
      def setDashboardBody(value: Input[String]): Self = StObject.set(x, "dashboardBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashboardBodyUndefined: Self = StObject.set(x, "dashboardBody", js.undefined)
      
      @scala.inline
      def setDashboardName(value: Input[String]): Self = StObject.set(x, "dashboardName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashboardNameUndefined: Self = StObject.set(x, "dashboardName", js.undefined)
    }
  }
}
