package typings.atPulumiCloud.timerMod

import typings.atPulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/cloud/timer", "cron")
@js.native
object cron extends js.Object {
  def apply(name: String, cronTab: String, handler: Action): Unit = js.native
  def apply(name: String, cronTab: String, handler: Action, opts: ResourceOptions): Unit = js.native
}

