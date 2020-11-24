package typings.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlideTime extends js.Object {
  
  def getByFormat(format: String): String = js.native
  
  def getDisplayValue(): String = js.native
  
  def getDisplayValueinternal(): String = js.native
  
  def getValue(): String = js.native
  
  def setDisplayValue(asDisplayed: String): Unit = js.native
  
  def setValue(o: String): Unit = js.native
  
  def subtract(start: GlideTime, end: GlideTime): GlideDuration = js.native
}
object GlideTime {
  
  @scala.inline
  def apply(
    getByFormat: String => String,
    getDisplayValue: () => String,
    getDisplayValueinternal: () => String,
    getValue: () => String,
    setDisplayValue: String => Unit,
    setValue: String => Unit,
    subtract: (GlideTime, GlideTime) => GlideDuration
  ): GlideTime = {
    val __obj = js.Dynamic.literal(getByFormat = js.Any.fromFunction1(getByFormat), getDisplayValue = js.Any.fromFunction0(getDisplayValue), getDisplayValueinternal = js.Any.fromFunction0(getDisplayValueinternal), getValue = js.Any.fromFunction0(getValue), setDisplayValue = js.Any.fromFunction1(setDisplayValue), setValue = js.Any.fromFunction1(setValue), subtract = js.Any.fromFunction2(subtract))
    __obj.asInstanceOf[GlideTime]
  }
  
  @scala.inline
  implicit class GlideTimeOps[Self <: GlideTime] (val x: Self) extends AnyVal {
    
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
    def setGetByFormat(value: String => String): Self = this.set("getByFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDisplayValue(value: () => String): Self = this.set("getDisplayValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDisplayValueinternal(value: () => String): Self = this.set("getDisplayValueinternal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: () => String): Self = this.set("getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDisplayValue(value: String => Unit): Self = this.set("setDisplayValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValue(value: String => Unit): Self = this.set("setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubtract(value: (GlideTime, GlideTime) => GlideDuration): Self = this.set("subtract", js.Any.fromFunction2(value))
  }
}
