package typings.storybookTheming.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Definitions by: Junyoung Clare Jang <https://github.com/Ailrun>
trait StylisElement extends StObject {
  
  var children: js.Array[StylisElement] | String
  
  var column: Double
  
  var length: Double
  
  var line: Double
  
  var parent: StylisElement | Null
  
  var props: js.Array[String] | String
  
  var `return`: String
  
  var root: StylisElement | Null
  
  var `type`: String
  
  var value: String
}
object StylisElement {
  
  inline def apply(
    children: js.Array[StylisElement] | String,
    column: Double,
    length: Double,
    line: Double,
    props: js.Array[String] | String,
    `return`: String,
    `type`: String,
    value: String
  ): StylisElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], parent = null, root = null)
    __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylisElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StylisElement] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[StylisElement] | String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: StylisElement*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setParent(value: StylisElement): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setProps(value: js.Array[String] | String): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsVarargs(value: String*): Self = StObject.set(x, "props", js.Array(value*))
    
    inline def setReturn(value: String): Self = StObject.set(x, "return", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: StylisElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
