package typings.stringStripHtml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagAttribute extends js.Object {
  
  var equalsAt: Double = js.native
  
  var name: String = js.native
  
  var nameEnds: Double = js.native
  
  var nameStarts: Double = js.native
  
  var value: String = js.native
  
  var valueEnds: Double = js.native
  
  var valueStarts: Double = js.native
}
object TagAttribute {
  
  @scala.inline
  def apply(
    equalsAt: Double,
    name: String,
    nameEnds: Double,
    nameStarts: Double,
    value: String,
    valueEnds: Double,
    valueStarts: Double
  ): TagAttribute = {
    val __obj = js.Dynamic.literal(equalsAt = equalsAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameEnds = nameEnds.asInstanceOf[js.Any], nameStarts = nameStarts.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueEnds = valueEnds.asInstanceOf[js.Any], valueStarts = valueStarts.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagAttribute]
  }
  
  @scala.inline
  implicit class TagAttributeOps[Self <: TagAttribute] (val x: Self) extends AnyVal {
    
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
    def setEqualsAt(value: Double): Self = this.set("equalsAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameEnds(value: Double): Self = this.set("nameEnds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameStarts(value: Double): Self = this.set("nameStarts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueEnds(value: Double): Self = this.set("valueEnds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueStarts(value: Double): Self = this.set("valueStarts", value.asInstanceOf[js.Any])
  }
}
