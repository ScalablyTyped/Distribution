package typings.pulumiCloud.timerMod

import typings.pulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/cloud/timer", "daily")
@js.native
object daily extends js.Object {
  def apply(name: String, handler: Action): Unit = js.native
  def apply(name: String, handler: Action, opts: ResourceOptions): Unit = js.native
  def apply(name: String, schedule: DailySchedule, handler: Action): Unit = js.native
  def apply(name: String, schedule: DailySchedule, handler: Action, opts: ResourceOptions): Unit = js.native
}

