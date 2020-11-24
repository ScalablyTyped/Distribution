package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlAST extends AST {
  
  @JSName("children")
  var children_XmlAST: js.Array[XmlAST | String] = js.native
  
  @JSName("parent")
  var parent_XmlAST: XmlAST | Null = js.native
}
object XmlAST {
  
  @scala.inline
  def apply(
    Tag: ComponentType[js.Object],
    children: js.Array[XmlAST | String],
    props: StringDictionary[js.UndefOr[Styles | String]],
    tag: String
  ): XmlAST = {
    val __obj = js.Dynamic.literal(Tag = Tag.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlAST]
  }
  
  @scala.inline
  implicit class XmlASTOps[Self <: XmlAST] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: (XmlAST | String)*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[XmlAST | String]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: XmlAST): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
  }
}
