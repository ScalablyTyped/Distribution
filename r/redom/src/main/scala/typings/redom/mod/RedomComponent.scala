package typings.redom.mod

import typings.std.HTMLElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedomComponent extends js.Object {
  
  var el: HTMLElement | SVGElement | RedomComponent = js.native
  
  var onmount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onremount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onunmount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var update: js.UndefOr[
    js.Function4[
      /* item */ js.Any, 
      /* index */ Double, 
      /* data */ js.Any, 
      /* context */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}
object RedomComponent {
  
  @scala.inline
  def apply(el: HTMLElement | SVGElement | RedomComponent): RedomComponent = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedomComponent]
  }
  
  @scala.inline
  implicit class RedomComponentOps[Self <: RedomComponent] (val x: Self) extends AnyVal {
    
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
    def setEl(value: HTMLElement | SVGElement | RedomComponent): Self = this.set("el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnmount(value: () => Unit): Self = this.set("onmount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnmount: Self = this.set("onmount", js.undefined)
    
    @scala.inline
    def setOnremount(value: () => Unit): Self = this.set("onremount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnremount: Self = this.set("onremount", js.undefined)
    
    @scala.inline
    def setOnunmount(value: () => Unit): Self = this.set("onunmount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnunmount: Self = this.set("onunmount", js.undefined)
    
    @scala.inline
    def setUpdate(
      value: (/* item */ js.Any, /* index */ Double, /* data */ js.Any, /* context */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("update", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
}
