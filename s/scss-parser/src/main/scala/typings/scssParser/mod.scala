package typings.scssParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scss-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(css: String): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(css.asInstanceOf[js.Any]).asInstanceOf[Node]
  
  inline def stringify(node: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait InputStreamPosition extends StObject {
    
    var column: Double
    
    var cursor: Double
    
    var line: Double
  }
  object InputStreamPosition {
    
    inline def apply(column: Double, cursor: Double, line: Double): InputStreamPosition = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputStreamPosition]
    }
    
    extension [Self <: InputStreamPosition](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setCursor(value: Double): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait Node extends StObject {
    
    var end: js.UndefOr[InputStreamPosition] = js.undefined
    
    var start: js.UndefOr[InputStreamPosition] = js.undefined
    
    var `type`: String
    
    var value: String | js.Array[Node]
  }
  object Node {
    
    inline def apply(`type`: String, value: String | js.Array[Node]): Node = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setEnd(value: InputStreamPosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: InputStreamPosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | js.Array[Node]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: Node*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
