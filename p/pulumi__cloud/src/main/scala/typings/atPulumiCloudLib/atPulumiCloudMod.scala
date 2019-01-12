package typings
package atPulumiCloudLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/cloud", JSImport.Namespace)
@js.native
object atPulumiCloudMod extends js.Object {
  var API: atPulumiCloudLib.apiMod.APIConstructor = js.native
  var Bucket: atPulumiCloudLib.bucketMod.BucketConstructor = js.native
  var HostPathVolume: atPulumiCloudLib.serviceMod.HostPathVolumeConstructor = js.native
  var HttpEndpoint: atPulumiCloudLib.apiMod.APIConstructor = js.native
  var HttpServer: atPulumiCloudLib.httpServerMod.HttpServerConstructor = js.native
  var Service: atPulumiCloudLib.serviceMod.ServiceConstructor = js.native
  var SharedVolume: atPulumiCloudLib.serviceMod.SharedVolumeConstructor = js.native
  var Table: atPulumiCloudLib.tableMod.TableConstructor = js.native
  var Task: atPulumiCloudLib.serviceMod.TaskConstructor = js.native
  var Topic: atPulumiCloudLib.topicMod.TopicConstructor = js.native
  @JSName("timer")
  @js.native
  object timerNs extends js.Object {
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
  
}

