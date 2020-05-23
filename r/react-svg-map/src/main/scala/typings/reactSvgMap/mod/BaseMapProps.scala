package typings.reactSvgMap.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseMapProps extends js.Object {
  var childrenAfter: js.UndefOr[ReactElement] = js.undefined
  var childrenBefore: js.UndefOr[ReactElement] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var locationClassName: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  var map: Map
  var onLocationBlur: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onLocationFocus: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onLocationMouseMove: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onLocationMouseOut: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onLocationMouseOver: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object BaseMapProps {
  @scala.inline
  def apply(
    map: Map,
    childrenAfter: ReactElement = null,
    childrenBefore: ReactElement = null,
    className: String = null,
    locationClassName: String | (js.Function1[/* repeated */ js.Any, _]) = null,
    onLocationBlur: /* repeated */ js.Any => _ = null,
    onLocationFocus: /* repeated */ js.Any => _ = null,
    onLocationMouseMove: /* repeated */ js.Any => _ = null,
    onLocationMouseOut: /* repeated */ js.Any => _ = null,
    onLocationMouseOver: /* repeated */ js.Any => _ = null
  ): BaseMapProps = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    if (childrenAfter != null) __obj.updateDynamic("childrenAfter")(childrenAfter.asInstanceOf[js.Any])
    if (childrenBefore != null) __obj.updateDynamic("childrenBefore")(childrenBefore.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (locationClassName != null) __obj.updateDynamic("locationClassName")(locationClassName.asInstanceOf[js.Any])
    if (onLocationBlur != null) __obj.updateDynamic("onLocationBlur")(js.Any.fromFunction1(onLocationBlur))
    if (onLocationFocus != null) __obj.updateDynamic("onLocationFocus")(js.Any.fromFunction1(onLocationFocus))
    if (onLocationMouseMove != null) __obj.updateDynamic("onLocationMouseMove")(js.Any.fromFunction1(onLocationMouseMove))
    if (onLocationMouseOut != null) __obj.updateDynamic("onLocationMouseOut")(js.Any.fromFunction1(onLocationMouseOut))
    if (onLocationMouseOver != null) __obj.updateDynamic("onLocationMouseOver")(js.Any.fromFunction1(onLocationMouseOver))
    __obj.asInstanceOf[BaseMapProps]
  }
}

