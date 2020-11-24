package typings.reactSlider.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Index extends js.Object {
  
  var index: Double = js.native
  
  var value: Double | js.Array[Double] = js.native
  
  var valueNow: Double = js.native
}
object Index {
  
  @scala.inline
  def apply(index: Double, value: Double | js.Array[Double], valueNow: Double): Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueNow = valueNow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  
  @scala.inline
  implicit class IndexOps[Self <: Index] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: Double*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: Double | js.Array[Double]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNow(value: Double): Self = this.set("valueNow", value.asInstanceOf[js.Any])
  }
}
