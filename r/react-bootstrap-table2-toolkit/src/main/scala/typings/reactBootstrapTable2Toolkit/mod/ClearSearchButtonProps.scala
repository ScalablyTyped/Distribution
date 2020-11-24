package typings.reactBootstrapTable2Toolkit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearSearchButtonProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var onClear: js.UndefOr[js.Function0[Unit]] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object ClearSearchButtonProps {
  
  @scala.inline
  def apply(): ClearSearchButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearSearchButtonProps]
  }
  
  @scala.inline
  implicit class ClearSearchButtonPropsOps[Self <: ClearSearchButtonProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setOnClear(value: () => Unit): Self = this.set("onClear", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClear: Self = this.set("onClear", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
