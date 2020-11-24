package typings.rxLiteTesting.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Recorded extends js.Object {
  
  def equals(other: Recorded): Boolean = js.native
  
  var time: Double = js.native
  
  var value: js.Any = js.native
}
object Recorded {
  
  @scala.inline
  def apply(equals: Recorded => Boolean, time: Double, value: js.Any): Recorded = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), time = time.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recorded]
  }
  
  @scala.inline
  implicit class RecordedOps[Self <: Recorded] (val x: Self) extends AnyVal {
    
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
    def setEquals(value: Recorded => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
