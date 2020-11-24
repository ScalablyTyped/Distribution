package typings.saywhen.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Proxy[T /* <: Func */] extends js.Object {
  
  def `then`(fn: T): Proxy[T] = js.native
  
  def thenReturn(`val`: js.Any): Proxy[T] = js.native
  
  def thenThrow(err: Error): Proxy[T] = js.native
}
object Proxy {
  
  @scala.inline
  def apply[T /* <: Func */](`then`: T => Proxy[T], thenReturn: js.Any => Proxy[T], thenThrow: Error => Proxy[T]): Proxy[T] = {
    val __obj = js.Dynamic.literal(thenReturn = js.Any.fromFunction1(thenReturn), thenThrow = js.Any.fromFunction1(thenThrow))
    __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
    __obj.asInstanceOf[Proxy[T]]
  }
  
  @scala.inline
  implicit class ProxyOps[Self <: Proxy[_], T /* <: Func */] (val x: Self with Proxy[T]) extends AnyVal {
    
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
    def setThen(value: T => Proxy[T]): Self = this.set("then", js.Any.fromFunction1(value))
    
    @scala.inline
    def setThenReturn(value: js.Any => Proxy[T]): Self = this.set("thenReturn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setThenThrow(value: Error => Proxy[T]): Self = this.set("thenThrow", js.Any.fromFunction1(value))
  }
}
