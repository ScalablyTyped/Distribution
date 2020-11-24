package typings.qlikVisualizationextensions.TableAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQMeasureCell extends js.Object {
  
  /**
    * Gets the value of this cell as a percentage of the total.
    * Might be more than 100% if this is an average.
    */
  def getPercent(): Double = js.native
  
  /**
    * Gets the value of this cell as a percentage of the maximum.
    */
  def getPercentOfMax(): Double = js.native
  
  /**
    * Optional. Cell numeric value, if cell is numeric.
    */
  var qNum: js.UndefOr[Double] = js.native
  
  /**
    * Cell value formatted as set up in properties.
    */
  var qText: String = js.native
}
object IQMeasureCell {
  
  @scala.inline
  def apply(getPercent: () => Double, getPercentOfMax: () => Double, qText: String): IQMeasureCell = {
    val __obj = js.Dynamic.literal(getPercent = js.Any.fromFunction0(getPercent), getPercentOfMax = js.Any.fromFunction0(getPercentOfMax), qText = qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQMeasureCell]
  }
  
  @scala.inline
  implicit class IQMeasureCellOps[Self <: IQMeasureCell] (val x: Self) extends AnyVal {
    
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
    def setGetPercent(value: () => Double): Self = this.set("getPercent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPercentOfMax(value: () => Double): Self = this.set("getPercentOfMax", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQText(value: String): Self = this.set("qText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNum(value: Double): Self = this.set("qNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQNum: Self = this.set("qNum", js.undefined)
  }
}
