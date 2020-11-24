package typings.sendmail.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Debug extends js.Object {
  
  var debug: js.UndefOr[js.Function0[Unit]] = js.native
  
  var error: js.UndefOr[js.Function0[Unit]] = js.native
  
  var info: js.UndefOr[js.Function0[Unit]] = js.native
  
  var warn: js.UndefOr[js.Function0[Unit]] = js.native
}
object Debug {
  
  @scala.inline
  def apply(): Debug = {
    val __obj = js.Dynamic.literal()
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
    def setDebug(value: () => Unit): Self = this.set("debug", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setError(value: () => Unit): Self = this.set("error", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setInfo(value: () => Unit): Self = this.set("info", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    
    @scala.inline
    def setWarn(value: () => Unit): Self = this.set("warn", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteWarn: Self = this.set("warn", js.undefined)
  }
}
