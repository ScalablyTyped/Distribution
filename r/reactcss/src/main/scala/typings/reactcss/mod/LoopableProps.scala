package typings.reactcss.mod

import typings.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoopableProps
  extends Props[js.Any] {
  
  var even: js.UndefOr[Boolean] = js.native
  
  var `first-child`: js.UndefOr[Boolean] = js.native
  
  var `last-child`: js.UndefOr[Boolean] = js.native
  
  var `nth-child`: Double = js.native
  
  var odd: js.UndefOr[Boolean] = js.native
}
object LoopableProps {
  
  @scala.inline
  def apply(`nth-child`: Double): LoopableProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nth-child")(`nth-child`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoopableProps]
  }
  
  @scala.inline
  implicit class LoopablePropsOps[Self <: LoopableProps] (val x: Self) extends AnyVal {
    
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
    def `setNth-child`(value: Double): Self = this.set("nth-child", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEven(value: Boolean): Self = this.set("even", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEven: Self = this.set("even", js.undefined)
    
    @scala.inline
    def `setFirst-child`(value: Boolean): Self = this.set("first-child", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFirst-child`: Self = this.set("first-child", js.undefined)
    
    @scala.inline
    def `setLast-child`(value: Boolean): Self = this.set("last-child", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLast-child`: Self = this.set("last-child", js.undefined)
    
    @scala.inline
    def setOdd(value: Boolean): Self = this.set("odd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOdd: Self = this.set("odd", js.undefined)
  }
}
