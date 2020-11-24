package typings.prosemirrorModel.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.prosemirrorModelNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMOutputSpecArray extends js.Object {
  
  var `0`: String = js.native
  
  var `1`: js.UndefOr[DOMOutputSpec | `0` | (StringDictionary[js.UndefOr[String | Null]])] = js.native
  
  var `2`: js.UndefOr[DOMOutputSpec | `0`] = js.native
  
  var `3`: js.UndefOr[DOMOutputSpec | `0`] = js.native
  
  var `4`: js.UndefOr[DOMOutputSpec | `0`] = js.native
  
  var `5`: js.UndefOr[DOMOutputSpec | `0`] = js.native
  
  var `6`: js.UndefOr[DOMOutputSpec | `0`] = js.native
  
  var `7`: js.UndefOr[DOMOutputSpec | `0`] = js.native
  
  var `8`: js.UndefOr[DOMOutputSpec | `0`] = js.native
  
  var `9`: js.UndefOr[DOMOutputSpec | `0`] = js.native
}
object DOMOutputSpecArray {
  
  @scala.inline
  def apply(`0`: String): DOMOutputSpecArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMOutputSpecArray]
  }
  
  @scala.inline
  implicit class DOMOutputSpecArrayOps[Self <: DOMOutputSpecArray] (val x: Self) extends AnyVal {
    
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
    def set0(value: String): Self = this.set("0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set1(value: DOMOutputSpec | `0` | (StringDictionary[js.UndefOr[String | Null]])): Self = this.set("1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete1: Self = this.set("1", js.undefined)
    
    @scala.inline
    def set2(value: DOMOutputSpec | `0`): Self = this.set("2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete2: Self = this.set("2", js.undefined)
    
    @scala.inline
    def set3(value: DOMOutputSpec | `0`): Self = this.set("3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete3: Self = this.set("3", js.undefined)
    
    @scala.inline
    def set4(value: DOMOutputSpec | `0`): Self = this.set("4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete4: Self = this.set("4", js.undefined)
    
    @scala.inline
    def set5(value: DOMOutputSpec | `0`): Self = this.set("5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete5: Self = this.set("5", js.undefined)
    
    @scala.inline
    def set6(value: DOMOutputSpec | `0`): Self = this.set("6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete6: Self = this.set("6", js.undefined)
    
    @scala.inline
    def set7(value: DOMOutputSpec | `0`): Self = this.set("7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete7: Self = this.set("7", js.undefined)
    
    @scala.inline
    def set8(value: DOMOutputSpec | `0`): Self = this.set("8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete8: Self = this.set("8", js.undefined)
    
    @scala.inline
    def set9(value: DOMOutputSpec | `0`): Self = this.set("9", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete9: Self = this.set("9", js.undefined)
  }
}
