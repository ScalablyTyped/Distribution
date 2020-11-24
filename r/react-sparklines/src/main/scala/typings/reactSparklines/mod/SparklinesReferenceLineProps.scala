package typings.reactSparklines.mod

import typings.react.mod.CSSProperties
import typings.reactSparklines.reactSparklinesStrings.avg
import typings.reactSparklines.reactSparklinesStrings.custom
import typings.reactSparklines.reactSparklinesStrings.max
import typings.reactSparklines.reactSparklinesStrings.mean
import typings.reactSparklines.reactSparklinesStrings.median
import typings.reactSparklines.reactSparklinesStrings.min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparklinesReferenceLineProps extends js.Object {
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var `type`: js.UndefOr[max | min | mean | avg | median | custom] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object SparklinesReferenceLineProps {
  
  @scala.inline
  def apply(): SparklinesReferenceLineProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklinesReferenceLineProps]
  }
  
  @scala.inline
  implicit class SparklinesReferenceLinePropsOps[Self <: SparklinesReferenceLineProps] (val x: Self) extends AnyVal {
    
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
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setType(value: max | min | mean | avg | median | custom): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
