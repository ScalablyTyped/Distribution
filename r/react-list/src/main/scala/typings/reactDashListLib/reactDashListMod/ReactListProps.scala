package typings
package reactDashListLib.reactDashListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactListProps
  extends reactLib.reactMod.ReactNs.Props[ReactList] {
  var axis: js.UndefOr[
    reactDashListLib.reactDashListLibStrings.x | reactDashListLib.reactDashListLibStrings.y
  ] = js.undefined
  var initialIndex: js.UndefOr[scala.Double] = js.undefined
  var itemRenderer: js.UndefOr[reactDashListLib.ItemRenderer] = js.undefined
  var itemSizeEstimator: js.UndefOr[reactDashListLib.ItemSizeEstimator] = js.undefined
  var itemSizeGetter: js.UndefOr[reactDashListLib.ItemSizeGetter] = js.undefined
  var itemsRenderer: js.UndefOr[reactDashListLib.ItemsRenderer] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
  var minSize: js.UndefOr[scala.Double] = js.undefined
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  var scrollParentGetter: js.UndefOr[reactDashListLib.ScrollParentGetter] = js.undefined
  var threshold: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var useStaticSize: js.UndefOr[scala.Boolean] = js.undefined
  var useTranslate3d: js.UndefOr[scala.Boolean] = js.undefined
}

