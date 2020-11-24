package typings.pulumiCloud.timerMod

import typings.pulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/cloud/timer", "cron")
@js.native
object cron extends js.Object {
  
  def apply(name: String, cronTab: String, handler: Action): Unit = js.native
  def apply(name: String, cronTab: String, handler: Action, opts: ResourceOptions): Unit = js.native
}
