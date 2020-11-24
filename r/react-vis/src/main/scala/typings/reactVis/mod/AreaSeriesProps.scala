package typings.reactVis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AreaSeriesProps extends AbstractSeriesProps[AreaSeriesPoint] {
  
  var getNull: js.UndefOr[RVGetNull[AreaSeriesPoint]] = js.native
}
object AreaSeriesProps {
  
  @scala.inline
  def apply(): AreaSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaSeriesProps]
  }
  
  @scala.inline
  implicit class AreaSeriesPropsOps[Self <: AreaSeriesProps] (val x: Self) extends AnyVal {
    
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
    def setGetNull(value: AreaSeriesPoint => js.Any): Self = this.set("getNull", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetNull: Self = this.set("getNull", js.undefined)
  }
}
