package typings
package atPulumiAwsLib.cloudwatchDashboardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardArgs extends js.Object {
  /**
    * The detailed information about the dashboard, including what widgets are included and their location on the dashboard. You can read more about the body structure in the [documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html).
    */
  val dashboardBody: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name of the dashboard.
    */
  val dashboardName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object DashboardArgs {
  @scala.inline
  def apply(
    dashboardBody: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    dashboardName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): DashboardArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dashboardBody")(dashboardBody.asInstanceOf[js.Any])
    __obj.updateDynamic("dashboardName")(dashboardName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardArgs]
  }
}

