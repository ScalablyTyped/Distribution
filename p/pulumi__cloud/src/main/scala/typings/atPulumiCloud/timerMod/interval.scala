package typings.atPulumiCloud.timerMod

import typings.atPulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/cloud/timer", "interval")
@js.native
object interval extends js.Object {
  def apply(name: String, options: IntervalRate, handler: Action): Unit = js.native
  def apply(name: String, options: IntervalRate, handler: Action, opts: ResourceOptions): Unit = js.native
}

