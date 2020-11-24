package typings.recharts.mod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipProps extends Animatable {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var allowEscapeViewBox: js.UndefOr[AllowEscapeViewBox] = js.native
  
  var content: js.UndefOr[ReactElement | StatelessComponent[_] | ContentRenderer[TooltipProps]] = js.native
  
  var contentStyle: js.UndefOr[js.Object] = js.native
  
  var coordinate: js.UndefOr[Coordinate] = js.native
  
  var cursor: js.UndefOr[Boolean | js.Object | ReactElement | StatelessComponent[_]] = js.native
  
  var filterNull: js.UndefOr[Boolean] = js.native
  
  var formatter: js.UndefOr[TooltipFormatter] = js.native
  
  var itemSorter: js.UndefOr[ItemSorter[TooltipPayload]] = js.native
  
  var itemStyle: js.UndefOr[js.Object] = js.native
  
  var label: js.UndefOr[String | Double] = js.native
  
  var labelFormatter: js.UndefOr[LabelFormatter] = js.native
  
  var labelStyle: js.UndefOr[js.Object] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var payload: js.UndefOr[js.Array[TooltipPayload]] = js.native
  
  var position: js.UndefOr[Coordinate] = js.native
  
  var separator: js.UndefOr[String] = js.native
  
  var useTranslate3d: js.UndefOr[Boolean] = js.native
  
  var viewBox: js.UndefOr[ViewBox] = js.native
  
  var wrapperStyle: js.UndefOr[js.Object] = js.native
}
object TooltipProps {
  
  @scala.inline
  def apply(): TooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipProps]
  }
  
  @scala.inline
  implicit class TooltipPropsOps[Self <: TooltipProps] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setAllowEscapeViewBox(value: AllowEscapeViewBox): Self = this.set("allowEscapeViewBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEscapeViewBox: Self = this.set("allowEscapeViewBox", js.undefined)
    
    @scala.inline
    def setContentFunction1(value: TooltipProps => ReactNode): Self = this.set("content", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContent(value: ReactElement | StatelessComponent[_] | ContentRenderer[TooltipProps]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContentStyle(value: js.Object): Self = this.set("contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentStyle: Self = this.set("contentStyle", js.undefined)
    
    @scala.inline
    def setCoordinate(value: Coordinate): Self = this.set("coordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoordinate: Self = this.set("coordinate", js.undefined)
    
    @scala.inline
    def setCursor(value: Boolean | js.Object | ReactElement | StatelessComponent[_]): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setFilterNull(value: Boolean): Self = this.set("filterNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterNull: Self = this.set("filterNull", js.undefined)
    
    @scala.inline
    def setFormatter(
      value: (/* value */ String | Double | (js.Array[String | Double]), /* name */ String, /* entry */ TooltipPayload, /* index */ Double) => ReactNode
    ): Self = this.set("formatter", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setItemSorter(value: (TooltipPayload, TooltipPayload) => Double): Self = this.set("itemSorter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteItemSorter: Self = this.set("itemSorter", js.undefined)
    
    @scala.inline
    def setItemStyle(value: js.Object): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: String | Double): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelFormatter(value: /* label */ String | Double => ReactNode): Self = this.set("labelFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLabelFormatter: Self = this.set("labelFormatter", js.undefined)
    
    @scala.inline
    def setLabelStyle(value: js.Object): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPayloadVarargs(value: TooltipPayload*): Self = this.set("payload", js.Array(value :_*))
    
    @scala.inline
    def setPayload(value: js.Array[TooltipPayload]): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setPosition(value: Coordinate): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setUseTranslate3d(value: Boolean): Self = this.set("useTranslate3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseTranslate3d: Self = this.set("useTranslate3d", js.undefined)
    
    @scala.inline
    def setViewBox(value: ViewBox): Self = this.set("viewBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewBox: Self = this.set("viewBox", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: js.Object): Self = this.set("wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperStyle: Self = this.set("wrapperStyle", js.undefined)
  }
}
