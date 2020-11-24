package typings.pulumiAws.dashboardMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashboardArgs extends js.Object {
  
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
  implicit class DashboardArgsOps[Self <: DashboardArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDashboardBody(value: Input[String]): Self = this.set("dashboardBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardName(value: Input[String]): Self = this.set("dashboardName", value.asInstanceOf[js.Any])
  }
}
