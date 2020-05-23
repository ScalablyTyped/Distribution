package typings.reactSvgMap.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGMapProps extends BaseMapProps {
  var isLocationSelected: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var locationRole: js.UndefOr[String] = js.undefined
  var locationTabIndex: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  var onLocationClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onLocationKeyDown: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var role: js.UndefOr[String] = js.undefined
}

object SVGMapProps {
  @scala.inline
  def apply(
    map: Map,
    childrenAfter: ReactElement = null,
    childrenBefore: ReactElement = null,
    className: String = null,
    isLocationSelected: /* repeated */ js.Any => _ = null,
    locationClassName: String | (js.Function1[/* repeated */ js.Any, _]) = null,
    locationRole: String = null,
    locationTabIndex: String | (js.Function1[/* repeated */ js.Any, _]) = null,
    onLocationBlur: /* repeated */ js.Any => _ = null,
    onLocationClick: /* repeated */ js.Any => _ = null,
    onLocationFocus: /* repeated */ js.Any => _ = null,
    onLocationKeyDown: /* repeated */ js.Any => _ = null,
    onLocationMouseMove: /* repeated */ js.Any => _ = null,
    onLocationMouseOut: /* repeated */ js.Any => _ = null,
    onLocationMouseOver: /* repeated */ js.Any => _ = null,
    role: String = null
  ): SVGMapProps = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    if (childrenAfter != null) __obj.updateDynamic("childrenAfter")(childrenAfter.asInstanceOf[js.Any])
    if (childrenBefore != null) __obj.updateDynamic("childrenBefore")(childrenBefore.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (isLocationSelected != null) __obj.updateDynamic("isLocationSelected")(js.Any.fromFunction1(isLocationSelected))
    if (locationClassName != null) __obj.updateDynamic("locationClassName")(locationClassName.asInstanceOf[js.Any])
    if (locationRole != null) __obj.updateDynamic("locationRole")(locationRole.asInstanceOf[js.Any])
    if (locationTabIndex != null) __obj.updateDynamic("locationTabIndex")(locationTabIndex.asInstanceOf[js.Any])
    if (onLocationBlur != null) __obj.updateDynamic("onLocationBlur")(js.Any.fromFunction1(onLocationBlur))
    if (onLocationClick != null) __obj.updateDynamic("onLocationClick")(js.Any.fromFunction1(onLocationClick))
    if (onLocationFocus != null) __obj.updateDynamic("onLocationFocus")(js.Any.fromFunction1(onLocationFocus))
    if (onLocationKeyDown != null) __obj.updateDynamic("onLocationKeyDown")(js.Any.fromFunction1(onLocationKeyDown))
    if (onLocationMouseMove != null) __obj.updateDynamic("onLocationMouseMove")(js.Any.fromFunction1(onLocationMouseMove))
    if (onLocationMouseOut != null) __obj.updateDynamic("onLocationMouseOut")(js.Any.fromFunction1(onLocationMouseOut))
    if (onLocationMouseOver != null) __obj.updateDynamic("onLocationMouseOver")(js.Any.fromFunction1(onLocationMouseOver))
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGMapProps]
  }
}

