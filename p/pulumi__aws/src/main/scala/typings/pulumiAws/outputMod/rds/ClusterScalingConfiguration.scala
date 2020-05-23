package typings.pulumiAws.outputMod.rds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterScalingConfiguration extends js.Object {
  /**
    * Whether to enable automatic pause. A DB cluster can be paused only when it's idle (it has no connections). If a DB cluster is paused for more than seven days, the DB cluster might be backed up with a snapshot. In this case, the DB cluster is restored when there is a request to connect to it. Defaults to `true`.
    */
  var autoPause: js.UndefOr[Boolean] = js.native
  /**
    * The maximum capacity. The maximum capacity must be greater than or equal to the minimum capacity. Valid capacity values are `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, and `256`. Defaults to `16`.
    */
  var maxCapacity: js.UndefOr[Double] = js.native
  /**
    * The minimum capacity. The minimum capacity must be lesser than or equal to the maximum capacity. Valid capacity values are `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, and `256`. Defaults to `2`.
    */
  var minCapacity: js.UndefOr[Double] = js.native
  /**
    * The time, in seconds, before an Aurora DB cluster in serverless mode is paused. Valid values are `300` through `86400`. Defaults to `300`.
    */
  var secondsUntilAutoPause: js.UndefOr[Double] = js.native
  /**
    * The action to take when the timeout is reached. Valid values: `ForceApplyCapacityChange`, `RollbackCapacityChange`. Defaults to `RollbackCapacityChange`. See [documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.timeout-action).
    */
  var timeoutAction: js.UndefOr[String] = js.native
}

object ClusterScalingConfiguration {
  @scala.inline
  def apply(
    autoPause: js.UndefOr[Boolean] = js.undefined,
    maxCapacity: js.UndefOr[Double] = js.undefined,
    minCapacity: js.UndefOr[Double] = js.undefined,
    secondsUntilAutoPause: js.UndefOr[Double] = js.undefined,
    timeoutAction: String = null
  ): ClusterScalingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPause)) __obj.updateDynamic("autoPause")(autoPause.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxCapacity)) __obj.updateDynamic("maxCapacity")(maxCapacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minCapacity)) __obj.updateDynamic("minCapacity")(minCapacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(secondsUntilAutoPause)) __obj.updateDynamic("secondsUntilAutoPause")(secondsUntilAutoPause.get.asInstanceOf[js.Any])
    if (timeoutAction != null) __obj.updateDynamic("timeoutAction")(timeoutAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterScalingConfiguration]
  }
}

