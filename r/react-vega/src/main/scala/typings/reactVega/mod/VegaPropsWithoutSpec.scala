package typings.reactVega.mod

import typings.react.mod.CSSProperties
import typings.reactVega.anon.Bottom
import typings.std.Error
import typings.std.MouseEvent
import typings.std.Record
import typings.vegaTypings.mod.View
import typings.vegaTypings.runtimeMod.Item
import typings.vegaTypings.runtimeMod.TooltipHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VegaPropsWithoutSpec extends js.Object {
  
  var background: js.UndefOr[String] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var data: js.UndefOr[Record[String, js.Array[_]]] = js.native
  
  var enableHover: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var logLevel: js.UndefOr[Double] = js.native
  
  var onNewView: js.UndefOr[js.Function1[/* view */ View, Unit]] = js.native
  
  var onParseError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
  
  var padding: js.UndefOr[Double | Bottom] = js.native
  
  var renderer: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var tooltip: js.UndefOr[TooltipHandler] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object VegaPropsWithoutSpec {
  
  @scala.inline
  def apply(): VegaPropsWithoutSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VegaPropsWithoutSpec]
  }
  
  @scala.inline
  implicit class VegaPropsWithoutSpecOps[Self <: VegaPropsWithoutSpec] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setData(value: Record[String, js.Array[_]]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setEnableHover(value: Boolean): Self = this.set("enableHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableHover: Self = this.set("enableHover", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLogLevel(value: Double): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setOnNewView(value: /* view */ View => Unit): Self = this.set("onNewView", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnNewView: Self = this.set("onNewView", js.undefined)
    
    @scala.inline
    def setOnParseError(value: /* error */ Error => Unit): Self = this.set("onParseError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnParseError: Self = this.set("onParseError", js.undefined)
    
    @scala.inline
    def setPadding(value: Double | Bottom): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setRenderer(value: String): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTooltip(
      value: (/* handler */ js.Any, /* event */ MouseEvent, /* item */ Item[js.Any], /* value */ js.Any) => Unit
    ): Self = this.set("tooltip", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
