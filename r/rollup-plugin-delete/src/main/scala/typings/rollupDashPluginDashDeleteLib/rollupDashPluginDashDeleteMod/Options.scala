package typings
package rollupDashPluginDashDeleteLib.rollupDashPluginDashDeleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends delLib.delMod.delNs.Options {
  /**
    * Patterns of files and folders to be deleted.
    * @default []
    */
  val targets: js.Array[java.lang.String] | java.lang.String
  /**
    * Outputs removed files and folders to console.
    * @default false
    */
  val verbose: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    targets: js.Array[java.lang.String] | java.lang.String,
    concurrency: scala.Int | scala.Double = null,
    dryRun: js.UndefOr[scala.Boolean] = js.undefined,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    verbose: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[Options]
  }
}

