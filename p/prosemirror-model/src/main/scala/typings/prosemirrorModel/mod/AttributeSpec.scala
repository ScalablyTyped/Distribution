package typings.prosemirrorModel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeSpec extends js.Object {
  
  /**
    * The default value for this attribute, to use when no explicit
    * value is provided. Attributes that have no default must be
    * provided whenever a node or mark of a type that has them is
    * created.
    */
  var default: js.UndefOr[js.Any] = js.native
}
object AttributeSpec {
  
  @scala.inline
  def apply(): AttributeSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeSpec]
  }
  
  @scala.inline
  implicit class AttributeSpecOps[Self <: AttributeSpec] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
  }
}
