package typings.reactSparklines.mod

import typings.react.mod.CSSProperties
import typings.reactSparklines.reactSparklinesStrings.click
import typings.reactSparklines.reactSparklinesStrings.enter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparklinesLineProps extends js.Object {
  
  var color: js.UndefOr[String] = js.native
  
  var onMouseMove: js.UndefOr[
    js.Function3[/* event */ enter | click, /* value */ Double, /* point */ Point, Unit]
  ] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object SparklinesLineProps {
  
  @scala.inline
  def apply(): SparklinesLineProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklinesLineProps]
  }
  
  @scala.inline
  implicit class SparklinesLinePropsOps[Self <: SparklinesLineProps] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: (/* event */ enter | click, /* value */ Double, /* point */ Point) => Unit): Self = this.set("onMouseMove", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
