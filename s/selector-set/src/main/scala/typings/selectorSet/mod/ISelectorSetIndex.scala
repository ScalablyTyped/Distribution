package typings.selectorSet.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISelectorSetIndex extends js.Object {
  
  def element(el: Element): js.Array[String] | Unit = js.native
  
  var name: String = js.native
  
  def selector(selector: String): String | Unit = js.native
}
object ISelectorSetIndex {
  
  @scala.inline
  def apply(element: Element => js.Array[String] | Unit, name: String, selector: String => String | Unit): ISelectorSetIndex = {
    val __obj = js.Dynamic.literal(element = js.Any.fromFunction1(element), name = name.asInstanceOf[js.Any], selector = js.Any.fromFunction1(selector))
    __obj.asInstanceOf[ISelectorSetIndex]
  }
  
  @scala.inline
  implicit class ISelectorSetIndexOps[Self <: ISelectorSetIndex] (val x: Self) extends AnyVal {
    
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
    def setElement(value: Element => js.Array[String] | Unit): Self = this.set("element", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: String => String | Unit): Self = this.set("selector", js.Any.fromFunction1(value))
  }
}
