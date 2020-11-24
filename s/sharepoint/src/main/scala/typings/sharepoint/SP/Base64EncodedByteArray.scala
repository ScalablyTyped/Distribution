package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base64EncodedByteArray extends js.Object {
  
  def append(b: js.Any): Unit = js.native
  
  def getByteAt(index: Double): js.Any = js.native
  
  def get_length(): Double = js.native
  
  def setByteAt(index: Double, b: js.Any): Unit = js.native
  
  def toBase64String(): String = js.native
}
object Base64EncodedByteArray {
  
  @scala.inline
  def apply(
    append: js.Any => Unit,
    getByteAt: Double => js.Any,
    get_length: () => Double,
    setByteAt: (Double, js.Any) => Unit,
    toBase64String: () => String
  ): Base64EncodedByteArray = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), getByteAt = js.Any.fromFunction1(getByteAt), get_length = js.Any.fromFunction0(get_length), setByteAt = js.Any.fromFunction2(setByteAt), toBase64String = js.Any.fromFunction0(toBase64String))
    __obj.asInstanceOf[Base64EncodedByteArray]
  }
  
  @scala.inline
  implicit class Base64EncodedByteArrayOps[Self <: Base64EncodedByteArray] (val x: Self) extends AnyVal {
    
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
    def setAppend(value: js.Any => Unit): Self = this.set("append", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetByteAt(value: Double => js.Any): Self = this.set("getByteAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet_length(value: () => Double): Self = this.set("get_length", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetByteAt(value: (Double, js.Any) => Unit): Self = this.set("setByteAt", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToBase64String(value: () => String): Self = this.set("toBase64String", js.Any.fromFunction0(value))
  }
}
