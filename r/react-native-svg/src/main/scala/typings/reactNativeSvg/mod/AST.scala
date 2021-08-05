package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AST extends StObject {
  
  var Tag: ComponentType[js.Object]
  
  var children: js.Array[AST | Element | String]
  
  var parent: AST | Null
  
  var priority: js.UndefOr[Map[String, js.UndefOr[Boolean]]] = js.undefined
  
  var props: StringDictionary[js.UndefOr[Styles | String]]
  
  var style: js.UndefOr[Styles] = js.undefined
  
  var styles: js.UndefOr[String] = js.undefined
  
  var tag: String
}
object AST {
  
  inline def apply(
    Tag: ComponentType[js.Object],
    children: js.Array[AST | Element | String],
    props: StringDictionary[js.UndefOr[Styles | String]],
    tag: String
  ): AST = {
    val __obj = js.Dynamic.literal(Tag = Tag.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], parent = null)
    __obj.asInstanceOf[AST]
  }
  
  extension [Self <: AST](x: Self) {
    
    inline def setChildren(value: js.Array[AST | Element | String]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: (AST | Element | String)*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setParent(value: AST): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setPriority(value: Map[String, js.UndefOr[Boolean]]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setProps(value: StringDictionary[js.UndefOr[Styles | String]]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Styles): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyles(value: String): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setTag(value: ComponentType[js.Object]): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
  }
}
