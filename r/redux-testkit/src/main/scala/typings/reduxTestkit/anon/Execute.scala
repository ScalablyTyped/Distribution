package typings.reduxTestkit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Execute extends js.Object {
  
  def execute(state: js.Any, args: js.Any*): js.Any = js.native
  
  def expect(state: js.Any, args: js.Any*): ToReturn = js.native
}
object Execute {
  
  @scala.inline
  def apply(
    execute: (js.Any, /* repeated */ js.Any) => js.Any,
    expect: (js.Any, /* repeated */ js.Any) => ToReturn
  ): Execute = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute), expect = js.Any.fromFunction2(expect))
    __obj.asInstanceOf[Execute]
  }
  
  @scala.inline
  implicit class ExecuteOps[Self <: Execute] (val x: Self) extends AnyVal {
    
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
    def setExecute(value: (js.Any, /* repeated */ js.Any) => js.Any): Self = this.set("execute", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExpect(value: (js.Any, /* repeated */ js.Any) => ToReturn): Self = this.set("expect", js.Any.fromFunction2(value))
  }
}
