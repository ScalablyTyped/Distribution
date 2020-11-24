package typings.reactVirtualized.esCellMeasurerMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellMeasurerChildProps extends js.Object {
  
  def measure(): Unit = js.native
  
  var registerChild: js.UndefOr[js.Function1[/* element */ Element, Unit]] = js.native
}
object CellMeasurerChildProps {
  
  @scala.inline
  def apply(measure: () => Unit): CellMeasurerChildProps = {
    val __obj = js.Dynamic.literal(measure = js.Any.fromFunction0(measure))
    __obj.asInstanceOf[CellMeasurerChildProps]
  }
  
  @scala.inline
  implicit class CellMeasurerChildPropsOps[Self <: CellMeasurerChildProps] (val x: Self) extends AnyVal {
    
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
    def setMeasure(value: () => Unit): Self = this.set("measure", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegisterChild(value: /* element */ Element => Unit): Self = this.set("registerChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRegisterChild: Self = this.set("registerChild", js.undefined)
  }
}
