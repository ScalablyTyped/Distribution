package typings
package rellaxLib.rellaxMod.RellaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RellaxInstance extends js.Object {
  /**
    * Rellax elements
    */
  var elms: stdLib.NodeListOf[stdLib.Element] | js.Array[stdLib.Element]
  /**
    * Options
    */
  var options: RellaxOptions
  /**
    * End Rellax and reset parallax elements to their original positions
    */
  def destroy(): scala.Unit
  /**
    * Destroy and create again parallax with previous settings
    */
  def refresh(): scala.Unit
}

object RellaxInstance {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    elms: stdLib.NodeListOf[stdLib.Element] | js.Array[stdLib.Element],
    options: RellaxOptions,
    refresh: js.Function0[scala.Unit]
  ): RellaxInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("elms")(elms.asInstanceOf[js.Any])
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("refresh")(refresh)
    __obj.asInstanceOf[RellaxInstance]
  }
}

