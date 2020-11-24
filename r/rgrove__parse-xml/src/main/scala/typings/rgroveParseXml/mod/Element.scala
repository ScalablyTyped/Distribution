package typings.rgroveParseXml.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rgroveParseXml.rgroveParseXmlStrings.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Element
  extends NodeBase
     with Node {
  
  var attributes: StringDictionary[String] = js.native
  
  var children: js.Array[NodeBase] = js.native
  
  var name: String = js.native
  
  var preserveWhitespace: js.UndefOr[String] = js.native
  
  @JSName("type")
  var type_Element: element = js.native
}
object Element {
  
  @scala.inline
  def apply(attributes: StringDictionary[String], children: js.Array[NodeBase], name: String, `type`: element): Element = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: StringDictionary[String]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: NodeBase*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[NodeBase]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: element): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveWhitespace(value: String): Self = this.set("preserveWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveWhitespace: Self = this.set("preserveWhitespace", js.undefined)
  }
}
