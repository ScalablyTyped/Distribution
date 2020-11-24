package typings.semanticRelease.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error extends js.Object {
  
  def error(message: String, vars: js.Any*): Unit = js.native
  
  def log(message: String, vars: js.Any*): Unit = js.native
}
object Error {
  
  @scala.inline
  def apply(error: (String, /* repeated */ js.Any) => Unit, log: (String, /* repeated */ js.Any) => Unit): Error = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction2(error), log = js.Any.fromFunction2(log))
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
    
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
    def setError(value: (String, /* repeated */ js.Any) => Unit): Self = this.set("error", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLog(value: (String, /* repeated */ js.Any) => Unit): Self = this.set("log", js.Any.fromFunction2(value))
  }
}
