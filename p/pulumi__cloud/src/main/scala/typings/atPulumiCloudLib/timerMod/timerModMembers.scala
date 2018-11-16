package typings
package atPulumiCloudLib.timerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/cloud/timer", JSImport.Namespace)
@js.native
object timerModMembers extends js.Object {
  def cron(name: java.lang.String, cronTab: java.lang.String, handler: Action): scala.Unit = js.native
  def cron(
    name: java.lang.String,
    cronTab: java.lang.String,
    handler: Action,
    opts: atPulumiPulumiLib.resourceMod.ResourceOptions
  ): scala.Unit = js.native
  def daily(name: java.lang.String, handler: Action): scala.Unit = js.native
  def daily(name: java.lang.String, handler: Action, opts: atPulumiPulumiLib.resourceMod.ResourceOptions): scala.Unit = js.native
  def daily(name: java.lang.String, schedule: DailySchedule, handler: Action): scala.Unit = js.native
  def daily(
    name: java.lang.String,
    schedule: DailySchedule,
    handler: Action,
    opts: atPulumiPulumiLib.resourceMod.ResourceOptions
  ): scala.Unit = js.native
  def hourly(name: java.lang.String, handler: Action): scala.Unit = js.native
  def hourly(name: java.lang.String, handler: Action, opts: atPulumiPulumiLib.resourceMod.ResourceOptions): scala.Unit = js.native
  def hourly(name: java.lang.String, schedule: HourlySchedule, handler: Action): scala.Unit = js.native
  def hourly(
    name: java.lang.String,
    schedule: HourlySchedule,
    handler: Action,
    opts: atPulumiPulumiLib.resourceMod.ResourceOptions
  ): scala.Unit = js.native
  def interval(name: java.lang.String, options: IntervalRate, handler: Action): scala.Unit = js.native
  def interval(
    name: java.lang.String,
    options: IntervalRate,
    handler: Action,
    opts: atPulumiPulumiLib.resourceMod.ResourceOptions
  ): scala.Unit = js.native
}

