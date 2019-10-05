package typings.atPulumiCloud.atPulumiCloudMod

import typings.atPulumiCloud.timerMod.Action
import typings.atPulumiCloud.timerMod.DailySchedule
import typings.atPulumiCloud.timerMod.HourlySchedule
import typings.atPulumiCloud.timerMod.IntervalRate
import typings.atPulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/cloud", "timer")
@js.native
object timer extends js.Object {
  def cron(name: String, cronTab: String, handler: Action): Unit = js.native
  def cron(name: String, cronTab: String, handler: Action, opts: ResourceOptions): Unit = js.native
  def daily(name: String, handler: Action): Unit = js.native
  def daily(name: String, handler: Action, opts: ResourceOptions): Unit = js.native
  def daily(name: String, schedule: DailySchedule, handler: Action): Unit = js.native
  def daily(name: String, schedule: DailySchedule, handler: Action, opts: ResourceOptions): Unit = js.native
  def hourly(name: String, handler: Action): Unit = js.native
  def hourly(name: String, handler: Action, opts: ResourceOptions): Unit = js.native
  def hourly(name: String, schedule: HourlySchedule, handler: Action): Unit = js.native
  def hourly(name: String, schedule: HourlySchedule, handler: Action, opts: ResourceOptions): Unit = js.native
  def interval(name: String, options: IntervalRate, handler: Action): Unit = js.native
  def interval(name: String, options: IntervalRate, handler: Action, opts: ResourceOptions): Unit = js.native
}

