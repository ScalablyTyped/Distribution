package typings.pulumiAws.route53Mod

import typings.pulumiAws.getZoneMod.GetZoneArgs
import typings.pulumiAws.getZoneMod.GetZoneResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/route53", "getZone")
@js.native
object getZone extends js.Object {
  
  def apply(): js.Promise[GetZoneResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetZoneResult] = js.native
  def apply(args: GetZoneArgs): js.Promise[GetZoneResult] = js.native
  def apply(args: GetZoneArgs, opts: InvokeOptions): js.Promise[GetZoneResult] = js.native
}
