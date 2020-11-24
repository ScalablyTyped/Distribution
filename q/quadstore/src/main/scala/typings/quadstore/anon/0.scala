package typings.quadstore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0`[CK /* <: String */] extends js.Object {
  
  var contextKey: js.UndefOr[CK] = js.native
}
object `0` {
  
  @scala.inline
  def apply[CK /* <: String */](): `0`[CK] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[CK]]
  }
  
  @scala.inline
  implicit class `0Ops`[Self <: `0`[_], CK /* <: String */] (val x: Self with `0`[CK]) extends AnyVal {
    
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
    def setContextKey(value: CK): Self = this.set("contextKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextKey: Self = this.set("contextKey", js.undefined)
  }
}
