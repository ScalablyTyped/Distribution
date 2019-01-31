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

