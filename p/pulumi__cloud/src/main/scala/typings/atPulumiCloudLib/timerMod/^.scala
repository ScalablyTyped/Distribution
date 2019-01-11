package typings
package atPulumiCloudLib.timerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/cloud/timer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def cron(name: java.lang.String, cronTab: java.lang.String, handler: atPulumiCloudLib.timerMod.Action): scala.Unit = js.native
  def cron(
    name: java.lang.String,
    cronTab: java.lang.String,
    handler: atPulumiCloudLib.timerMod.Action,
    opts: atPulumiPulumiLib.resourceMod.ResourceOptions
  ): scala.Unit = js.native
  def daily(name: java.lang.String, handler: atPulumiCloudLib.timerMod.Action): scala.Unit = js.native
  def daily(
    name: java.lang.String,
    handler: atPulumiCloudLib.timerMod.Action,
    opts: atPulumiPulumiLib.resourceMod.ResourceOptions
  ): scala.Unit = js.native
  def daily(
    name: java.lang.String,
    schedule: atPulumiCloudLib.timerMod.DailySchedule,
    handler: atPulumiCloudLib.timerMod.Action
  ): scala.Unit = js.native
  def daily(
    name: java.lang.String,
    schedule: atPulumiCloudLib.timerMod.DailySchedule,
    handler: atPulumiCloudLib.timerMod.Action,
    opts: atPulumiPulumiLib.resourceMod.ResourceOptions
  ): scala.Unit = js.native
  def hourly(name: java.lang.String, handler: atPulumiCloudLib.timerMod.Action): scala.Unit = js.native
  def hourly(
    name: java.lang.String,
    handler: atPulumiCloudLib.timerMod.Action,
    opts: atPulumiPulumiLib.resourceMod.ResourceOptions
  ): scala.Unit = js.native
  def hourly(
    name: java.lang.String,
    schedule: atPulumiCloudLib.timerMod.HourlySchedule,
    handler: atPulumiCloudLib.timerMod.Action
  ): scala.Unit = js.native
  def hourly(
    name: java.lang.String,
    schedule: atPulumiCloudLib.timerMod.HourlySchedule,
    handler: atPulumiCloudLib.timerMod.Action,
    opts: atPulumiPulumiLib.resourceMod.ResourceOptions
  ): scala.Unit = js.native
  def interval(
    name: java.lang.String,
    options: atPulumiCloudLib.timerMod.IntervalRate,
    handler: atPulumiCloudLib.timerMod.Action
  ): scala.Unit = js.native
  def interval(
    name: java.lang.String,
    options: atPulumiCloudLib.timerMod.IntervalRate,
    handler: atPulumiCloudLib.timerMod.Action,
    opts: atPulumiPulumiLib.resourceMod.ResourceOptions
  ): scala.Unit = js.native
}

