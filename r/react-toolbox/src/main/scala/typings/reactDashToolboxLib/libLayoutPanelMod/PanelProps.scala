package typings
package reactDashToolboxLib.libLayoutPanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
    * You can set it to true in case you are using a pinned Sidebar so it takes an scrolled `div` instead of using the document scroll.
    */
  var bodyScroll: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[PanelTheme] = js.undefined
}

