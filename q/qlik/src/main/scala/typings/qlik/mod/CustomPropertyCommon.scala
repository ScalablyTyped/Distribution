package typings.qlik.mod

import typings.qlik.qlikStrings.array
import typings.qlik.qlikStrings.boolean
import typings.qlik.qlikStrings.integer
import typings.qlik.qlikStrings.items
import typings.qlik.qlikStrings.number
import typings.qlik.qlikStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomPropertyCommon extends js.Object {
  
  var label: js.UndefOr[String] = js.native
  
  var ref: js.UndefOr[String] = js.native
  
  var show: js.UndefOr[Boolean | ShowFunction] = js.native
  
  var `type`: js.UndefOr[string | integer | number | array | boolean | items] = js.native
}
object CustomPropertyCommon {
  
  @scala.inline
  def apply(): CustomPropertyCommon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPropertyCommon]
  }
  
  @scala.inline
  implicit class CustomPropertyCommonOps[Self <: CustomPropertyCommon] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setShowFunction3(
      value: (/* layout */ Layout, /* cls */ js.Any, /* obj */ js.Any) => Boolean | (js.Function1[/* measure */ NxMeasure, Boolean])
    ): Self = this.set("show", js.Any.fromFunction3(value))
    
    @scala.inline
    def setShow(value: Boolean | ShowFunction): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setType(value: string | integer | number | array | boolean | items): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
