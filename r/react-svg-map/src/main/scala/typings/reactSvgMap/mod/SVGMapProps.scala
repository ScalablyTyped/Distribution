package typings.reactSvgMap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGMapProps extends BaseMapProps {
  var isLocationSelected: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var locationRole: js.UndefOr[String] = js.native
  var locationTabIndex: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, _])] = js.native
  var onLocationClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var onLocationKeyDown: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var role: js.UndefOr[String] = js.native
}

object SVGMapProps {
  @scala.inline
  def apply(map: Map): SVGMapProps = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGMapProps]
  }
  @scala.inline
  implicit class SVGMapPropsOps[Self <: SVGMapProps] (val x: Self) extends AnyVal {
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
    def setIsLocationSelected(value: /* repeated */ js.Any => _): Self = this.set("isLocationSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsLocationSelected: Self = this.set("isLocationSelected", js.undefined)
    @scala.inline
    def setLocationRole(value: String): Self = this.set("locationRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationRole: Self = this.set("locationRole", js.undefined)
    @scala.inline
    def setLocationTabIndexFunction1(value: /* repeated */ js.Any => _): Self = this.set("locationTabIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setLocationTabIndex(value: String | (js.Function1[/* repeated */ js.Any, _])): Self = this.set("locationTabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationTabIndex: Self = this.set("locationTabIndex", js.undefined)
    @scala.inline
    def setOnLocationClick(value: /* repeated */ js.Any => _): Self = this.set("onLocationClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLocationClick: Self = this.set("onLocationClick", js.undefined)
    @scala.inline
    def setOnLocationKeyDown(value: /* repeated */ js.Any => _): Self = this.set("onLocationKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLocationKeyDown: Self = this.set("onLocationKeyDown", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
  
}

