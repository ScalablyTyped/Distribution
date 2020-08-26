package typings.pulumiAws.dashboardMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashboardState extends js.Object {
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
  implicit class DashboardStateOps[Self <: DashboardState] (val x: Self) extends AnyVal {
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
    def setDashboardArn(value: Input[String]): Self = this.set("dashboardArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashboardArn: Self = this.set("dashboardArn", js.undefined)
    @scala.inline
    def setDashboardBody(value: Input[String]): Self = this.set("dashboardBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashboardBody: Self = this.set("dashboardBody", js.undefined)
    @scala.inline
    def setDashboardName(value: Input[String]): Self = this.set("dashboardName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashboardName: Self = this.set("dashboardName", js.undefined)
  }
  
}

