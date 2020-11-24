package typings.reactLazylog.anon

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-lazylog.react-lazylog/build/Line.LineProps> */
@js.native
trait PartialLineProps extends js.Object {
  
  var data: js.UndefOr[js.Array[Text]] = js.native
  
  var formatPart: js.UndefOr[js.Function1[/* text */ String, ReactNode]] = js.native
  
  var highlight: js.UndefOr[Boolean] = js.native
  
  var number: js.UndefOr[Double] = js.native
  
  var onLineNumberClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.native
  
  var onRowClick: js.UndefOr[js.Function0[_]] = js.native
  
  var rowHeight: js.UndefOr[Double] = js.native
  
  var selectable: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object PartialLineProps {
  
  @scala.inline
  def apply(): PartialLineProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLineProps]
  }
  
  @scala.inline
  implicit class PartialLinePropsOps[Self <: PartialLineProps] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: Text*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[Text]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setFormatPart(value: /* text */ String => ReactNode): Self = this.set("formatPart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormatPart: Self = this.set("formatPart", js.undefined)
    
    @scala.inline
    def setHighlight(value: Boolean): Self = this.set("highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    
    @scala.inline
    def setOnLineNumberClick(value: MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit): Self = this.set("onLineNumberClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLineNumberClick: Self = this.set("onLineNumberClick", js.undefined)
    
    @scala.inline
    def setOnRowClick(value: () => _): Self = this.set("onRowClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRowClick: Self = this.set("onRowClick", js.undefined)
    
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
