package typings.reactRanger.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPercentageForValue extends js.Object {
  
  def getPercentageForValue(`val`: Double, min: Double, max: Double): Double = js.native
  
  def getValueForClientX(clientX: Double, trackDims: js.Object, min: Double, max: Double): Double = js.native
}
object GetPercentageForValue {
  
  @scala.inline
  def apply(
    getPercentageForValue: (Double, Double, Double) => Double,
    getValueForClientX: (Double, js.Object, Double, Double) => Double
  ): GetPercentageForValue = {
    val __obj = js.Dynamic.literal(getPercentageForValue = js.Any.fromFunction3(getPercentageForValue), getValueForClientX = js.Any.fromFunction4(getValueForClientX))
    __obj.asInstanceOf[GetPercentageForValue]
  }
  
  @scala.inline
  implicit class GetPercentageForValueOps[Self <: GetPercentageForValue] (val x: Self) extends AnyVal {
    
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
    def setGetPercentageForValue(value: (Double, Double, Double) => Double): Self = this.set("getPercentageForValue", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetValueForClientX(value: (Double, js.Object, Double, Double) => Double): Self = this.set("getValueForClientX", js.Any.fromFunction4(value))
  }
}
