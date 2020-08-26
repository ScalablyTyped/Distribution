package typings.pulumiAws.rdsMod

import typings.pulumiAws.getEventCategoriesMod.GetEventCategoriesArgs
import typings.pulumiAws.getEventCategoriesMod.GetEventCategoriesResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds", "getEventCategories")
@js.native
object getEventCategories extends js.Object {
  def apply(): js.Promise[GetEventCategoriesResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetEventCategoriesResult] = js.native
  def apply(args: GetEventCategoriesArgs): js.Promise[GetEventCategoriesResult] = js.native
  def apply(args: GetEventCategoriesArgs, opts: InvokeOptions): js.Promise[GetEventCategoriesResult] = js.native
}

