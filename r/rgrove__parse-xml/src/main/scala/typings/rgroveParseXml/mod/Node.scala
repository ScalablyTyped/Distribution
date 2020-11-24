package typings.rgroveParseXml.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rgroveParseXml.rgroveParseXmlStrings.cdata
import typings.rgroveParseXml.rgroveParseXmlStrings.comment
import typings.rgroveParseXml.rgroveParseXmlStrings.element
import typings.rgroveParseXml.rgroveParseXmlStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.rgroveParseXml.mod.CData
  - typings.rgroveParseXml.mod.Comment
  - typings.rgroveParseXml.mod.Element
  - typings.rgroveParseXml.mod.Text
*/
trait Node extends js.Object
object Node {
  
  @scala.inline
  def CData(text: String, `type`: cdata): Node = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def Comment(content: String, `type`: comment): Node = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def Element(attributes: StringDictionary[String], children: js.Array[NodeBase], name: String, `type`: element): Node = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def Text(text: String, `type`: text): Node = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}
