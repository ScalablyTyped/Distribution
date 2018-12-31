package typings
package reactDashOverlaysLib.libAutoAffixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoAffixProps
  extends reactDashOverlaysLib.libAffixMod.AffixNs.AffixProps {
  /**
  	 * Automatically set width when affixed
  	 */
  var autoWidth: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The logical container node or component for determining offset from bottom
  	 * of viewport, or a function that returns it
  	 */
  var container: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactInstance | js.Function0[reactLib.reactMod.ReactNs.ReactInstance]
  ] = js.undefined
}

