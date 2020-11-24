package typings.prompts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var onCancel: js.UndefOr[js.Function2[/* prompt */ PromptObject[String], /* answers */ js.Any, Unit]] = js.native
  
  var onSubmit: js.UndefOr[
    js.Function3[
      /* prompt */ PromptObject[String], 
      /* answer */ js.Any, 
      /* answers */ js.Array[_], 
      Unit
    ]
  ] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setOnCancel(value: (/* prompt */ PromptObject[String], /* answers */ js.Any) => Unit): Self = this.set("onCancel", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: (/* prompt */ PromptObject[String], /* answer */ js.Any, /* answers */ js.Array[_]) => Unit): Self = this.set("onSubmit", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
  }
}
