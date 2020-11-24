package typings.storybookClientLogger.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Debug extends js.Object {
  
  def debug(message: js.Any, rest: js.Any*): Unit = js.native
  
  def error(message: js.Any, rest: js.Any*): Unit = js.native
  
  def info(message: js.Any, rest: js.Any*): Unit = js.native
  
  def log(message: js.Any, rest: js.Any*): Unit = js.native
  
  def trace(message: js.Any, rest: js.Any*): Unit = js.native
  
  def warn(message: js.Any, rest: js.Any*): Unit = js.native
}
object Debug {
  
  @scala.inline
  def apply(
    debug: (js.Any, /* repeated */ js.Any) => Unit,
    error: (js.Any, /* repeated */ js.Any) => Unit,
    info: (js.Any, /* repeated */ js.Any) => Unit,
    log: (js.Any, /* repeated */ js.Any) => Unit,
    trace: (js.Any, /* repeated */ js.Any) => Unit,
    warn: (js.Any, /* repeated */ js.Any) => Unit
  ): Debug = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction2(debug), error = js.Any.fromFunction2(error), info = js.Any.fromFunction2(info), log = js.Any.fromFunction2(log), trace = js.Any.fromFunction2(trace), warn = js.Any.fromFunction2(warn))
    __obj.asInstanceOf[Debug]
  }
  
  @scala.inline
  implicit class DebugOps[Self <: Debug] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: (js.Any, /* repeated */ js.Any) => Unit): Self = this.set("debug", js.Any.fromFunction2(value))
    
    @scala.inline
    def setError(value: (js.Any, /* repeated */ js.Any) => Unit): Self = this.set("error", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInfo(value: (js.Any, /* repeated */ js.Any) => Unit): Self = this.set("info", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLog(value: (js.Any, /* repeated */ js.Any) => Unit): Self = this.set("log", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTrace(value: (js.Any, /* repeated */ js.Any) => Unit): Self = this.set("trace", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWarn(value: (js.Any, /* repeated */ js.Any) => Unit): Self = this.set("warn", js.Any.fromFunction2(value))
  }
}
