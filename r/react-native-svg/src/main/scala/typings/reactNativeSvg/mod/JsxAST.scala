package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsxAST extends AST {
  
  @JSName("children")
  var children_JsxAST: js.Array[Element | String] = js.native
}
object JsxAST {
  
  @scala.inline
  def apply(
    Tag: ComponentType[js.Object],
    children: js.Array[Element | String],
    props: StringDictionary[js.UndefOr[Styles | String]],
    tag: String
  ): JsxAST = {
    val __obj = js.Dynamic.literal(Tag = Tag.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsxAST]
  }
  
  @scala.inline
  implicit class JsxASTMutableBuilder[Self <: JsxAST] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[Element | String]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: (Element | String)*): Self = StObject.set(x, "children", js.Array(value :_*))
  }
}
