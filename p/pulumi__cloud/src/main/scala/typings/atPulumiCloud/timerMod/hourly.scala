package typings.atPulumiCloud.timerMod

import typings.atPulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/cloud/timer", "hourly")
@js.native
object hourly extends js.Object {
  def apply(name: String, handler: Action): Unit = js.native
  def apply(name: String, handler: Action, opts: ResourceOptions): Unit = js.native
  def apply(name: String, schedule: HourlySchedule, handler: Action): Unit = js.native
  def apply(name: String, schedule: HourlySchedule, handler: Action, opts: ResourceOptions): Unit = js.native
}

