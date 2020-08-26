package typings.reactSvgMap.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseMapProps extends js.Object {
  var childrenAfter: js.UndefOr[ReactElement] = js.native
  var childrenBefore: js.UndefOr[ReactElement] = js.native
  var className: js.UndefOr[String] = js.native
  var locationClassName: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, _])] = js.native
  var map: Map = js.native
  var onLocationBlur: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var onLocationFocus: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var onLocationMouseMove: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var onLocationMouseOut: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var onLocationMouseOver: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}

object BaseMapProps {
  @scala.inline
  def apply(map: Map): BaseMapProps = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseMapProps]
  }
  @scala.inline
  implicit class BaseMapPropsOps[Self <: BaseMapProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMap(value: Map): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenAfter(value: ReactElement): Self = this.set("childrenAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildrenAfter: Self = this.set("childrenAfter", js.undefined)
    @scala.inline
    def setChildrenBefore(value: ReactElement): Self = this.set("childrenBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildrenBefore: Self = this.set("childrenBefore", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setLocationClassNameFunction1(value: /* repeated */ js.Any => _): Self = this.set("locationClassName", js.Any.fromFunction1(value))
    @scala.inline
    def setLocationClassName(value: String | (js.Function1[/* repeated */ js.Any, _])): Self = this.set("locationClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationClassName: Self = this.set("locationClassName", js.undefined)
    @scala.inline
    def setOnLocationBlur(value: /* repeated */ js.Any => _): Self = this.set("onLocationBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLocationBlur: Self = this.set("onLocationBlur", js.undefined)
    @scala.inline
    def setOnLocationFocus(value: /* repeated */ js.Any => _): Self = this.set("onLocationFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLocationFocus: Self = this.set("onLocationFocus", js.undefined)
    @scala.inline
    def setOnLocationMouseMove(value: /* repeated */ js.Any => _): Self = this.set("onLocationMouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLocationMouseMove: Self = this.set("onLocationMouseMove", js.undefined)
    @scala.inline
    def setOnLocationMouseOut(value: /* repeated */ js.Any => _): Self = this.set("onLocationMouseOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLocationMouseOut: Self = this.set("onLocationMouseOut", js.undefined)
    @scala.inline
    def setOnLocationMouseOver(value: /* repeated */ js.Any => _): Self = this.set("onLocationMouseOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLocationMouseOver: Self = this.set("onLocationMouseOver", js.undefined)
  }
  
}

