package typings.reactRelay.profilerContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfilerContextType extends js.Object {
  
  def wrapPrepareQueryResource[T](cb: js.Function0[T]): T = js.native
}
object ProfilerContextType {
  
  @scala.inline
  def apply(wrapPrepareQueryResource: js.Function0[js.Any] => js.Any): ProfilerContextType = {
    val __obj = js.Dynamic.literal(wrapPrepareQueryResource = js.Any.fromFunction1(wrapPrepareQueryResource))
    __obj.asInstanceOf[ProfilerContextType]
  }
  
  @scala.inline
  implicit class ProfilerContextTypeOps[Self <: ProfilerContextType] (val x: Self) extends AnyVal {
    
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
    def setWrapPrepareQueryResource(value: js.Function0[js.Any] => js.Any): Self = this.set("wrapPrepareQueryResource", js.Any.fromFunction1(value))
  }
}
