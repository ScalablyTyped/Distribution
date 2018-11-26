package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NavigationControlProps extends BaseControlProps {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var showCompass: js.UndefOr[scala.Boolean] = js.undefined
  var showZoom: js.UndefOr[scala.Boolean] = js.undefined
  def onViewStateChange(info: ViewStateChangeInfo): scala.Unit
  def onViewportChange(viewport: ViewState): scala.Unit
}

