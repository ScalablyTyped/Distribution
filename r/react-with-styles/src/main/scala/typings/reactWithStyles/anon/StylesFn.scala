package typings.reactWithStyles.anon

import typings.reactWithStyles.mod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StylesFn[TStyles /* <: Styles */] extends js.Object {
  
  def stylesFn(args: js.Any*): TStyles = js.native
}
object StylesFn {
  
  @scala.inline
  def apply[TStyles /* <: Styles */](stylesFn: /* repeated */ js.Any => TStyles): StylesFn[TStyles] = {
    val __obj = js.Dynamic.literal(stylesFn = js.Any.fromFunction1(stylesFn))
    __obj.asInstanceOf[StylesFn[TStyles]]
  }
  
  @scala.inline
  implicit class StylesFnOps[Self <: StylesFn[_], TStyles /* <: Styles */] (val x: Self with StylesFn[TStyles]) extends AnyVal {
    
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
    def setStylesFn(value: /* repeated */ js.Any => TStyles): Self = this.set("stylesFn", js.Any.fromFunction1(value))
  }
}
