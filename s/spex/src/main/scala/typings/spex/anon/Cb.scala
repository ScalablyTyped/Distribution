package typings.spex.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cb extends js.Object {
  
  var cb: js.UndefOr[
    js.Function4[/* index */ Double, /* success */ Boolean, /* result */ js.Any, /* delay */ Double, _]
  ] = js.native
}
object Cb {
  
  @scala.inline
  def apply(): Cb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cb]
  }
  
  @scala.inline
  implicit class CbOps[Self <: Cb] (val x: Self) extends AnyVal {
    
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
    def setCb(value: (/* index */ Double, /* success */ Boolean, /* result */ js.Any, /* delay */ Double) => _): Self = this.set("cb", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteCb: Self = this.set("cb", js.undefined)
  }
}
