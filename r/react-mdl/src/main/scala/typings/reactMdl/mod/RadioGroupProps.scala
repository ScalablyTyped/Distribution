package typings.reactMdl.mod

import typings.react.mod.DOMAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadioGroupProps
  extends MDLHTMLAttributes
     with DOMAttributes[RadioGroup] {
  
  var childContainer: js.UndefOr[String] = js.native
  
  var container: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var value: String | Double = js.native
}
object RadioGroupProps {
  
  @scala.inline
  def apply(name: String, value: String | Double): RadioGroupProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioGroupProps]
  }
  
  @scala.inline
  implicit class RadioGroupPropsOps[Self <: RadioGroupProps] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildContainer(value: String): Self = this.set("childContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildContainer: Self = this.set("childContainer", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
}
