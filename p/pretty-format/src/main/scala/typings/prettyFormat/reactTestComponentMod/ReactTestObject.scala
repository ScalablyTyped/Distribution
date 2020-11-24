package typings.prettyFormat.reactTestComponentMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactTestObject extends js.Object {
  
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol = js.native
  
  var children: js.UndefOr[Null | js.Array[ReactTestChild]] = js.native
  
  var props: js.UndefOr[Record[String, _]] = js.native
  
  var `type`: String = js.native
}
object ReactTestObject {
  
  @scala.inline
  def apply(DollarDollartypeof: js.Symbol, `type`: String): ReactTestObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactTestObject]
  }
  
  @scala.inline
  implicit class ReactTestObjectOps[Self <: ReactTestObject] (val x: Self) extends AnyVal {
    
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
    def setDollarDollartypeof(value: js.Symbol): Self = this.set("$$typeof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: ReactTestChild*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[ReactTestChild]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setChildrenNull: Self = this.set("children", null)
    
    @scala.inline
    def setProps(value: Record[String, _]): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
  }
}
